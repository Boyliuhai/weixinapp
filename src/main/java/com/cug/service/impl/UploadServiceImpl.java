package com.cug.service.impl;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.cug.model.base.DataType;
import com.cug.model.base.FilePath;
import com.cug.service.UploadService;

public class UploadServiceImpl implements UploadService{
	
	@Override
	public String saveMulipartFile(MultipartFile file, String appPath,
			String fileType, String detailInfo)throws Exception {
		// TODO Auto-generated method stub
		String originalFileName = file.getOriginalFilename();
		if (file == null || originalFileName.length() < 1) {
			return "";
		}
		//保存文件的目录文件夹
		String dirPath = "";
		
		//文件的新名称
		String fileNewName = detailInfo;
		//照片 
		if( fileType.equals(DataType.employeeSFFile))  //项身份证
		{
			dirPath = appPath + FilePath.EMPLOYEE_PICTURE_PATH;
			
			fileNewName += originalFileName.substring(originalFileName.lastIndexOf("."));	
		}
		else if(fileType.equals(DataType.employeeTXFile))  //头像
		{
			dirPath = appPath + FilePath.EMPLOYEE_PICTURE_PATH;
			
			fileNewName += originalFileName.substring(originalFileName.lastIndexOf("."));
		}
		else if(fileType.equals(DataType.employeeSPFile))  //特种工作牌
		{
			dirPath = appPath + FilePath.EMPLOYEE_PICTURE_PATH;
			
			fileNewName += originalFileName.substring(originalFileName.lastIndexOf("."));
		}
		else if(fileType.equals(DataType.employeeERFile))  //体检报告
		{
			dirPath = appPath + FilePath.EMPLOYEE_PICTURE_PATH;
			
			fileNewName += originalFileName.substring(originalFileName.lastIndexOf("."));
		}
		this.saveFileReName(file, dirPath,fileNewName);
		return dirPath + fileNewName;
	}
	/**
	 * 
	* @Title: saveFileReName
	* @Description: 判断文件保存目录是否存在，然后保存文件
	* @param 
	* @return void
	* @throws
	 */
	private void saveFileReName(MultipartFile file,String dirPath , String fileName) 
			throws IllegalStateException, IOException {
		
		File dir = new File(dirPath);

		if (!dir.exists()) {
			dir.mkdirs();
		}
		
		File newFile = new File(dirPath+fileName);
		
		file.transferTo(newFile);
	}
	
	/**
	 * 
	* @Title: saveFile
	* @Description: 将文件保存到磁盘
	* @param 文件的保存路径
	* @return String
	* @throws
	 */
	private String saveFile(MultipartFile file,String appPath , String fileType) {
		
		if (file == null) {
			return "";
		}
		
		//得到项目的绝对地址
		String originalFileName = file.getOriginalFilename();
		
		//文件夹不存在新建
		String dirPath = appPath + fileType;
		
		//重命名文件
		File dir = new File(dirPath);
		
		if (!dir.exists()) {
			dir.mkdirs();
		}
		
		String newName = dirPath + originalFileName;
		
		File newFile = new File(newName);
		
		//将内存中的文件写入磁盘中
		try {
			file.transferTo(newFile);
		}catch (Exception e) {
			e.printStackTrace();
			return "";
		}
		return newName ;
	}
	
}
