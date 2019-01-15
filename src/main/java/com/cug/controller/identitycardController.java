package com.cug.controller;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.baidu.ai.aip.utils.Base64Util;
import com.baidu.ai.aip.utils.FileUtil;
import com.baidu.ai.aip.utils.HttpUtil;
import com.cug.service.IdentityService;

import net.sf.json.JSONObject;


/**
 * 
* <p>Title: identitycard</p>  
* <p>Description: 有关身份证的url</p>  
* @author LHD  
* @date 2018年11月3日
 */

@Controller
@RequestMapping("/identitycard")
public class identitycardController {
	@Autowired
	private IdentityService identityService;

	
	List<String> list1=new ArrayList<>();
	@RequestMapping("/message")
	@ResponseBody
	public List<String> returnmessage(){
	// 身份证识别url
	
	 String idcardIdentificate = "https://aip.baidubce.com/rest/2.0/ocr/v1/idcard";
	    // 本地图片路径
	 System.out.println("进入这里");
	    String filePath = "H:\\照片\\我的照片\\2.png";
	   
	    String jsonResult;
		try {
	        byte[] imgData = FileUtil.readFileByBytes(filePath);
	        String imgStr = Base64Util.encode(imgData);
	        // 识别身份证正面id_card_side=front;识别身份证背面id_card_side=back;
	        String params = "id_card_side=front&" + URLEncoder.encode("image", "UTF-8") + "="
	                + URLEncoder.encode(imgStr, "UTF-8");
	        /**
	         * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
	         */
	        String accessToken = "24.ddf2a1aaca38c41ffb49e46cbfc5f223.2592000.1545904623.282335-14522002";
	        jsonResult = HttpUtil.post(idcardIdentificate, accessToken, params);
	        HashMap<String, String> map = getHashMapByJson(jsonResult);
	        Collection<String> values=map.values();
	        
	        final int size = values.size();
	        List<String> valueList = new ArrayList<String>(values);
	        String[] valueArray = new String[size];
	        map.values().toArray(valueArray);
	        System.out.println("list-------------");
	        System.out.println(valueList);
	        System.out.println("string-------------");
	        System.out.println(valueArray);
	        list1=valueList;
		}
	        catch (Exception e) {
		        e.printStackTrace();   
		    }
		
		//return JSON.toJSONString(valueArray);
		System.out.println(list1);
		return list1;
}


public static HashMap<String, String> getHashMapByJson(String jsonResult) {
	
	HashMap map = new HashMap<String,String>();
	try {
		JSONObject jsonObject = JSONObject.fromObject(jsonResult);
		JSONObject words_result= jsonObject.getJSONObject("words_result");
		//获取json中的字符串对象
		Iterator<String> it = words_result.keys();
		while (it.hasNext()){
		String key = it.next();
		JSONObject result = words_result.getJSONObject(key);
		String value=result.getString("words");
		switch (key){
		case "姓名":
		map.put("name",value);
		break;
		case "民族":
		map.put("nation",value);
		break;
		case "住址":
		map.put("address",value);
		break;
		case "公民身份号码":
		map.put("IDCard",value);
		break;
		case "出生":
		map.put("Birth",value);
		break;
		case "性别":
		map.put("sex",value);
		break;
		}
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	return map;
}

@RequestMapping("/idcardload")
@ResponseBody	
public String findfileload(){
	String ss = identityService.returnIDcardPath();
	System.out.println("---------------这里输出图片地址");
	System.out.println(ss);
	System.out.println("---------------------");
	return JSON.toJSONString(ss);
	
}


@RequestMapping("/findheadfileload")
@ResponseBody	
public String findheadfileload(){
	System.out.println("你好恭喜你访问头像上传");
	
	String ss = identityService.returnheadfilePath();
	System.out.println("---------------这里输出图片地址");
	System.out.println(ss);
	System.out.println("---------------------");
	return JSON.toJSONString(ss);
	
}

@RequestMapping("/findspecialload")
@ResponseBody	
public String findspecialload(){
	String ss = identityService.returnexamReportFilePath();
	System.out.println("---------------这里输出图片地址");
	System.out.println(ss);
	System.out.println("---------------------");
	return JSON.toJSONString(ss);
}

@RequestMapping("/findhealthload")
@ResponseBody	
public String findhealthload(){
	String ss = identityService.returninsuranceFilePath();
	System.out.println("---------------这里输出图片地址");
	System.out.println(ss);
	System.out.println("---------------------");
	return JSON.toJSONString(ss);
}
}

