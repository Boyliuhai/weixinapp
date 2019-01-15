package com.cug.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cug.mapper.LoginuserinfoMapper;
import com.cug.mapper.NowprojectMapper;
import com.cug.mapper.ProjectprovidertempMapper;
import com.cug.mapper.ProvidercompanytempMapper;
import com.cug.model.GetOtherProject;
import com.cug.model.GetloginuserInfo;
import com.cug.model.ProjectMessage;
import com.cug.model.Proprovider;
import com.cug.model.getproject;
import com.cug.po.Loginuserinfo;
import com.cug.po.LoginuserinfoExample;
import com.cug.po.Nowproject;
import com.cug.po.NowprojectExample;
import com.cug.po.Projectprovidertemp;
import com.cug.po.ProjectprovidertempExample;
import com.cug.po.Providercompanytemp;
import com.cug.po.ProvidercompanytempExample;
import com.cug.service.SelectProjectService;

public class SelectProjectServiceImpl implements SelectProjectService{
	@Autowired
	private LoginuserinfoMapper loginuserinfoMapper;
	@Autowired
	private NowprojectMapper nowprojectMapper;
	@Autowired
	private ProjectprovidertempMapper projectprovidertempMapper;
	@Autowired
	private ProvidercompanytempMapper providercompanytempMapper;
	
	@Override
	public List<ProjectMessage> addnowproject(String request) {
		List<ProjectMessage> returnList = new ArrayList<ProjectMessage>();
		ProjectMessage projectmessage = new ProjectMessage();
		System.out.println(request);
		//查询Providercompanytemp这个表来查询甲方联系人和在场服务人员
		List<Providercompanytemp> providercompanytemps = selectByContID(request);
		for(int i=0;i<providercompanytemps.size();i++)
		{		
			
			projectmessage.ProMessageFromDB(providercompanytemps.get(i));
			returnList.add(projectmessage);
		}
		for(int i=0;i<returnList.size();i++)
		{
			System.out.println("这里是测试甲方联系人和在场服务人员");
			System.out.println(returnList.get(i).toString());
		}
		System.out.println("此时的returnList1是多少");
		System.out.println(returnList.toString());
		
		
		//查询Projectprovidertemp这个表来查询公司名称公司负责人以及电话
		List<Proprovider> pproproviders = new ArrayList<Proprovider>();	
		List<Projectprovidertemp> projectprovidertemps = selectByProviderID(request);
		for(int j=0;j<projectprovidertemps.size();j++){
			Proprovider proprovider = new Proprovider();
			proprovider.saveProviderFromDB(projectprovidertemps.get(j));
			pproproviders.add(proprovider);
		}	
		for(int i=0;i<pproproviders.size();i++)
		{
			System.out.println("来查询公司名称公司负责人以及电话");
			System.out.println(pproproviders.get(i).toString());
		}	
		projectmessage.setProproviders(pproproviders);
		returnList.add(projectmessage);
		System.out.println("此时的returnList2是多少");
		System.out.println(returnList.toString());
		//查询Nowproject这个表来查询项目名称以及项目内容
		List<GetOtherProject> getOtherProject = new ArrayList<GetOtherProject>();
		List<Nowproject> coNowprojects=selectByConID(request);
		for(int k=0;k<coNowprojects.size();k++)
		{
			GetOtherProject getOtherProject2=new GetOtherProject();
			getOtherProject2.saveNowproject(coNowprojects.get(k));
			getOtherProject.add(getOtherProject2);
		}
		for(int i=0;i<getOtherProject.size();i++)
		{
			System.out.println("这个表来查询项目名称以及项目内容");
			System.out.println(getOtherProject.get(i).toString());
		}	
		projectmessage.setOtherproject(getOtherProject);
		returnList.add(projectmessage);
		System.out.println("此时的returnList3是多少");
		System.out.println(returnList.toString());
		return returnList;
		
	}
	
	//根据ID查询出公司现有工作人数，总人数
	@Override
	public List<Providercompanytemp> selectByContID(String id) {
		// TODO Auto-generated method stub
		ProvidercompanytempExample example = new ProvidercompanytempExample();
		ProvidercompanytempExample.Criteria criteria=example.createCriteria();
		criteria.andContractidEqualTo(id);
		return providercompanytempMapper.selectByExample(example);
	}
	
	//根据ID查询出公司负责人，联系方式
		@Override
		public List<Projectprovidertemp> selectByProviderID(String id) {
			// TODO Auto-generated method stub
			ProjectprovidertempExample example = new ProjectprovidertempExample();
			ProjectprovidertempExample.Criteria criteria=example.createCriteria();
			criteria.andContractidEqualTo(id);
			return projectprovidertempMapper.selectByExample(example);
		}
	//根据ID查询出公司
		@Override
		public List<Nowproject> selectByConID(String id) {
			// TODO Auto-generated method stub
			NowprojectExample example = new NowprojectExample();
			NowprojectExample.Criteria criteria=example.createCriteria();
			criteria.andContractidEqualTo(id);
			return nowprojectMapper.selectByExample(example);
		}

		@Override
		public List<getproject> addProject(String request) {
			// TODO SAuto-generated method stub
			List<getproject> LIST = new ArrayList<getproject>();
			System.out.println(request);
			System.out.println("进入这个函数了");
			List<GetloginuserInfo> list = new ArrayList<GetloginuserInfo>();
			List<Loginuserinfo> loginuserinfos = selectByUseName(request);
			
			for(int i = 0;i<loginuserinfos.size();i++){
				GetloginuserInfo getloginuserInfo = new GetloginuserInfo();
				getloginuserInfo.saveLoginuSerInfoFromDB(loginuserinfos.get(i));
				list.add(getloginuserInfo);
			}
			for(int i = 0;i < list.size();i++){
		    System.out.println(list.get(i).toString());
			}
			System.out.println(list.get(0).getUserType());
			
			if(list.get(0).getUserType()==1){
				List<getproject> returnListT = new ArrayList<getproject>();
				//这里找出这个人所属的公司是什么
				List<Proprovider> Prolist = new ArrayList<>();
				System.out.println(list.get(0).getDigitalId());
				List<Projectprovidertemp> projectprovidertemps =selectById(list.get(0).getDigitalId()); 
				System.out.println(projectprovidertemps);
				for(int j=0;j<projectprovidertemps.size();j++){
					Proprovider proprovider = new Proprovider();
					proprovider.saveProviderFromDB(projectprovidertemps.get(j));
					Prolist.add(proprovider);
				}
				System.out.println("这里打印出Prolist");
				for(int i=0;i<Prolist.size();i++)
				{
					System.out.println(Prolist.get(i).toString());
				}
				//两个List需要 一个List里面的部分数据添加的另外一个List里面需要做这样的变换建立对象
				getproject getproject = new getproject();
				for(int i=0;i<Prolist.size();i++)
				{
				getproject.setContractld(Prolist.get(i).getContractId());
				getproject.setProjectName(Prolist.get(i).getCompanyName());
				}
				
				returnListT.add(getproject);
				System.out.println("反问1");
				System.out.println(returnListT);
				
				LIST=returnListT;
			}
			else{
				
				List<getproject> returnListT = new ArrayList<getproject>();
				List<Nowproject> coNowprojects = selectAllproject();
		    	for(int i=0;i<coNowprojects.size();i++)
		    	{
		    		getproject gettproject= new getproject();
		    		gettproject.saveNowproject(coNowprojects.get(i));
		    		returnListT.add(gettproject);
		    	}
		    	System.out.println("反问2");
		    	LIST=returnListT;
			}
		System.out.println(LIST);
			return LIST;
			
		}

		
		@Override
		public List<Loginuserinfo> selectByUseName(String id3) {
			LoginuserinfoExample example = new LoginuserinfoExample();
			LoginuserinfoExample.Criteria criteria=example.createCriteria();
			criteria.andUsernameEqualTo(id3);
			return loginuserinfoMapper.selectByExample(example);
		}
		//查出所有合同
	    @Override
		public List<Nowproject> selectAllproject() {
			// TODO Auto-generated method stub
			NowprojectExample example = new NowprojectExample();
			NowprojectExample.Criteria criteria=example.createCriteria();
			criteria.andContractidLike("%");
			return nowprojectMapper.selectByExample(example);
		}
	    //身份证一样从而查询公司名称
		@Override
		public List<Projectprovidertemp> selectById(String id4) {
			// TODO Auto-generated method stub
			ProjectprovidertempExample example = new ProjectprovidertempExample();
			ProjectprovidertempExample.Criteria criteria=example.createCriteria();
			criteria.andIdcardEqualTo(id4);
			return projectprovidertempMapper.selectByExample(example);
		}

}



