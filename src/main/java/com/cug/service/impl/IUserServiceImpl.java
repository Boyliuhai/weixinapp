package com.cug.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.cug.mapper.LoginuserinfoMapper;
import com.cug.mapper.UsertokenMapper;
import com.cug.model.LoginUserRequest;
import com.cug.model.LoginUserResponse;
import com.cug.po.Loginuserinfo;
import com.cug.po.LoginuserinfoExample;
import com.cug.po.Usertoken;
import com.cug.po.UsertokenExample;
import com.cug.service.IUserService;

import net.sf.json.JSONObject;
public class IUserServiceImpl implements IUserService{

	@Autowired
	private UsertokenMapper usertokenMapper;
	@Autowired
	private LoginuserinfoMapper loginuserinfoMapper;
	
	@Override
	public LoginUserResponse userLogin(LoginUserRequest user) throws Exception {
		// TODO Auto-generated method stub
		LoginUserResponse response = new LoginUserResponse();
		
		//生成token
		String token = UUID.randomUUID().toString().replace("-", "").toLowerCase();
//		UID.randomUUID().toString()是javaJDK提供的一个自动生成主键的方法。
//		UUID(Universally Unique Identifier)全局唯一标识符,是指在一台机器上生成的数字，
//		它保证对在同一时空中的所有机器都是唯一的，是由一个十六位的数字组成,表现出来的形式。
		
//		public String replace(char oldChar,char newChar)
//		replace() 方法通过用 newChar 字符替换字符串中出现的所有 oldChar 字符，并返回替换后的新字符串。
		
		int isExistCode = this.isExist(token);
		//判断数据库中是否已经存在了---------------------为什么要判断存在了？？？？
		//判断生成的token是否是唯一的
		if(isExistCode !=0)
		{
			return response;
		}
		
		Loginuserinfo userAccount  = this.validateAccount(user.getUserName(), user.getUserPassword());
		//判断账号密码是否正确
		if(userAccount == null){
			
			return response;
		}
		
		//判断账号正常
		if(userAccount.getAccountstate() == 0)
		{
			response.setToken(token);
			response.setName(userAccount.getName());
			response.setUserName(userAccount.getUsername());
			
			Usertoken dbUsertoken = usertokenMapper.selectByPrimaryKey(userAccount.getDigitalid());
			//把digitalId存入这个usertoken表中
			
			//验证数据库中是否有用户的旧数据
			if(dbUsertoken != null)
			{
				//更新数据库中的token
				dbUsertoken.setToken(token);
				usertokenMapper.updateByPrimaryKey(dbUsertoken);
				
			}else{
				Usertoken usertoken = new Usertoken();
				//从loginuserinfo把数据拿出来存到usertoken中
				usertoken.setDigitalid(userAccount.getDigitalid());
				usertoken.setToken(token);
				usertoken.setUsername(response.getName());
				usertokenMapper.insert(usertoken);	
			}
		}
		System.out.println("----------");
		System.out.println("这里是继续测试");
		System.out.println(response.getUserName());
		//LList.add(response.getUserName());
		return response;
	}
	/**
	 * 验证用户token是否已经存在数据库中
	 * @param userToken
	 * @param session
	 * @return 0:正常 1、输入有误 2、token不存在
	 * @throws Exception
	 */
	private int isExist(String userToken) throws Exception{
		
		if(!StringUtils.isNotBlank(userToken)){
			return 1;
		}
		
		UsertokenExample example = new UsertokenExample();
		UsertokenExample.Criteria criteria= example.createCriteria();
		criteria.andTokenEqualTo(userToken);
		
		List<Usertoken> list = usertokenMapper.selectByExample(example);
		
		if(list == null){
			return 2;
		}
		return 0;
		
	}
	
	//验证用户名和密码是否正确
	private Loginuserinfo validateAccount(String userName,String userPassword)throws Exception{
		
		if(!StringUtils.isNotBlank(userName)){
			return null;
		}
		if(!StringUtils.isNotBlank(userPassword)){
			return null;
		}
		
		LoginuserinfoExample example = new LoginuserinfoExample();
		LoginuserinfoExample.Criteria criteria = example.createCriteria();
		
		criteria.andUsernameEqualTo(userName);
		criteria.andPasswordEqualTo(userPassword);
		
		//已经判定相等了？？？？？？？？？？？？
		
		//andNameEqualTo相当于在sql中拼接一个“AND name='背包'”
		//criteria.andNameEqualTo("背包");
		List<Loginuserinfo> list = loginuserinfoMapper.selectByExample(example);
		if(list == null || list.size()<1){
			
			return null;
		}
		
		return list.get(0);
		//得到用户名
	}
	@Override
	public boolean validateUserToken(String token) throws Exception {
		// TODO Auto-generated method stub
		
		if(!StringUtils.isNotBlank(token)){
		
			return false;
		}
		UsertokenExample example = new UsertokenExample();
		UsertokenExample.Criteria criteria = example.createCriteria();
		criteria.andTokenEqualTo(token);
		
		List<Usertoken> list = usertokenMapper.selectByExample(example);
		
		if(list == null || list.size()<1){
			return false;
		}
		
		return true;
	}
	@Override
	public String getViewMenu(String token) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("进入implements");
		//获取用户数据
		Usertoken userToken = this.getUserToken(token);
		System.out.println("完成getUserToken");
		if(userToken == null){
			return "";
		}
		
		LoginuserinfoExample example = new LoginuserinfoExample();
		LoginuserinfoExample.Criteria criteria = example.createCriteria();
		
		criteria.andDigitalidEqualTo(userToken.getDigitalid());
		
		List<Loginuserinfo> list = loginuserinfoMapper.selectByExample(example);
		System.out.println("通过这里1");
		System.out.println(list.get(0).getUsertype());
		System.out.println(list.get(0).getUserlevel());
		if(list ==null){
			return "";
		}
		if(list.size()!= 1){
			return "";
		}
		System.out.println("通过这里2");
		//验证账号是否有效
		if(list.get(0).getAccountstate() !=0){
			return "";
		}
		//根据用户类型和用户权限返回的菜单
		Integer userType = list.get(0).getUsertype();
		Integer userLevel= list.get(0).getUserlevel();
		System.out.println("通过这里3");
		String jsonContent = "";
		System.out.println("通过这里4");
		System.out.println(userType);
		System.out.println(userLevel);
		//超级管理员
		if(userType ==0 && userLevel ==0){
			System.out.println("进来了，并且userType ==0 userLevel ==0");
			jsonContent = this.getJSONFile("json//admin.json");
			System.out.println("调用成功");
		}
		
		//电厂
		else if(userType == 0){
			
			jsonContent = this.getJSONFile("json//host.json");
		}	
		
		//外委公司
		else if(userType ==1){
			
			jsonContent = this.getJSONFile("json//guest.json");
		}
		
		return jsonContent;
	}
	
	private Usertoken getUserToken(String userToken) throws Exception{
		//此函数是查出表中用户的token
		System.out.println("进入getUserToken");
		if(!StringUtils.isNotBlank(userToken)){
			return null;
		}
		UsertokenExample example = new UsertokenExample();
		UsertokenExample.Criteria criteria = example.createCriteria();
		criteria.andTokenEqualTo(userToken);
		
		List<Usertoken> list = usertokenMapper.selectByExample(example);
		if(list == null){
			return null;
		}
		
		if(list.size()>1){
			throw new Exception("存在多个用户");
		}
		System.out.println("-----------------");
		System.out.println(list.get(0).toString());
		System.out.println("-----------------");
		return list.get(0);
	}
	
	private String getJSONFile(String file) throws IOException{
		System.out.println("进入getJSONFile");
		String abPath = getClass().getClassLoader().getResource("").toString();
		//去掉file:/
//		if (abPath.contains(":")) {
//			abPath = abPath.replace("file:/", "");
//		}
		//windows跑的
		if (abPath.contains(":")) {
			abPath = abPath.replace("file:/", "/");
		}
		//Linux跑的
		String filePath = abPath + file;
		
		File jsonFile = new File(filePath);
		//获取的是当前的工作目录
		String content = FileUtils.readFileToString(jsonFile,"UTF-8");
		//把一个文件的内容读取到一个对应的编码的字符串中去readFileToString(File file,String encoding)
		JSONObject jsonObject = JSONObject.fromObject(content);
		//常见的java->json
		System.out.println(jsonObject.toString());
		return jsonObject.toString();
		
	}
//	@Override
//	public List<String> getArrayList() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("---刘海栋");
//		System.out.println(LList.toString());
//		System.out.println("---刘海栋");
//		return LList;
//	}
}
