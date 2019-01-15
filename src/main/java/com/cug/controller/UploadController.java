package com.cug.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.cug.model.base.ResponseType;
import com.cug.service.UploadService;

/**
 * 
* <p>Title: UploadController</p>  
* <p>Description:上传各种文件图片</p>  
* @author LHD  
* @date 2018年11月3日
 */

@Controller
@RequestMapping("/upload")
public class UploadController {
	
	@Autowired
	private UploadService uploadService;
	
	@RequestMapping("/upshenfenzheng")
	@ResponseBody
	public String upshenfenzheng(HttpServletRequest request,
			@RequestParam(value = "file",required=false) MultipartFile file){
		ResponseType<List<String>> response = new ResponseType<>();
		response.setStatus(1);
		//文件类型说明信息
		String fileType=request.getParameter("fileType").toString();
		System.out.println("fileTpye:" +fileType);
		//附加信息
		String detailInfo = request.getParameter("detail").toString();
		System.out.println("detailInfo"+detailInfo);
		String appPath=request.getSession().getServletContext().getRealPath("/");
		List<String> list = new ArrayList<>();
		String filePath = "";
		try {
			filePath = uploadService.saveMulipartFile(file, appPath, fileType, detailInfo);
			if (StringUtils.isNotBlank(filePath)) {
				response.setStatus(0);
				list.add(fileType);
				list.add(filePath);
				response.setBody(list);
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(1);
		}
		return JSON.toJSONString(response);
	}
	
	@RequestMapping("/upTouxiang")
	@ResponseBody
	public String upTouxiang(HttpServletRequest request,
			@RequestParam(value="file",required=false)MultipartFile file){
		//使用@RequestParam注解将请求参数绑定至方法参数
		ResponseType<List<String>> response = new ResponseType<>();
		response.setStatus(1);
		//文件类型说明信息
		String fileType=request.getParameter("fileType").toString();
		System.out.println("fileTpye:" +fileType);
		//附加信息
		String detailInfo = request.getParameter("detail").toString();
		System.out.println("detailInfo"+detailInfo);
		String appPath=request.getSession().getServletContext().getRealPath("/");
		List<String> list = new ArrayList<>();
		String filePath = "";
		try {
			filePath = uploadService.saveMulipartFile(file, appPath, fileType, detailInfo);
			if (StringUtils.isNotBlank(filePath)) {
				response.setStatus(0);
				list.add(fileType);
				list.add(filePath);
				response.setBody(list);
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(1);
		}
		return JSON.toJSONString(response);
	
	}
	@RequestMapping("/upTezhong")
	@ResponseBody
	public String upTezhong(HttpServletRequest request,
			@RequestParam(value="file",required=false)MultipartFile file){
		//使用@RequestParam注解将请求参数绑定至方法参数
		ResponseType<List<String>> response = new ResponseType<>();
		response.setStatus(1);
		//文件类型说明信息
		String fileType=request.getParameter("fileType").toString();
		System.out.println("fileTpye:" +fileType);
		//附加信息
		String detailInfo = request.getParameter("detail").toString();
		System.out.println("detailInfo"+detailInfo);
		String appPath=request.getSession().getServletContext().getRealPath("/");
		List<String> list = new ArrayList<>();
		String filePath = "";
		try {
			filePath = uploadService.saveMulipartFile(file, appPath, fileType, detailInfo);
			if (StringUtils.isNotBlank(filePath)) {
				response.setStatus(0);
				list.add(fileType);
				list.add(filePath);
				response.setBody(list);
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(1);
		}
		return JSON.toJSONString(response);
	
	}
	
	@RequestMapping("/upTijian")
	@ResponseBody
	public String upTijian(HttpServletRequest request,
			@RequestParam(value="file",required=false)MultipartFile file){
		//使用@RequestParam注解将请求参数绑定至方法参数
		ResponseType<List<String>> response = new ResponseType<>();
		response.setStatus(1);
		//文件类型说明信息
		String fileType=request.getParameter("fileType").toString();
		System.out.println("fileTpye:" +fileType);
		//附加信息
		String detailInfo = request.getParameter("detail").toString();
		System.out.println("detailInfo"+detailInfo);
		String appPath=request.getSession().getServletContext().getRealPath("/");
		List<String> list = new ArrayList<>();
		String filePath = "";
		try {
			filePath = uploadService.saveMulipartFile(file, appPath, fileType, detailInfo);
			if (StringUtils.isNotBlank(filePath)) {
				response.setStatus(0);
				list.add(fileType);
				list.add(filePath);
				response.setBody(list);
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(1);
		}
		return JSON.toJSONString(response);
	
	}
}
