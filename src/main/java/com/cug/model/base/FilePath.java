package com.cug.model.base;

import org.springframework.context.support.StaticApplicationContext;

/**
 * 
* <p>Title: FilePath</p>  
* <p>Description: 保存各种文件的路径</p>  
* @author LZF  
* @date 2018年5月31日
 */
public class FilePath {
	
	//所有数据文件的根目录
	public static final String DATA_ROOT = "Data";
	
	//所有保存的文件的根目录
	public static final String FILE_ROOT = "Data\\Files";
	
	//保存所有合同文件的根目录
	public static final String CONTRACT_FILE_ROOT = "Data\\Files\\Contract";
	
	//保存承包商公司的文件
	public static final String COMPANY_ROOT = "Data\\Files\\Company";
	
	//所有保存的图片的根目录
	public static final String PICTURE_ROOT = "Data\\Picture";
	
	//与合同有关的文件保存路径
	public static final String CONTRACT_FILE_PATH = "Data\\Files\\Contract\\";
	public static final String CONTRACT_PICTURE_PATH = "Data\\Picture\\Contract\\";
	public static final String CONTRACT_PROJECT_FILE_TYPE = "-PMM";
	public static final String CONTRACT_FILE_TYPE = "-contract";
	
	//承包商有关的文件保存路径
	public static final String COMPANY_FILE_PATH = "Data\\Files\\Company\\";
	public static final String COMPANY_BL_TYPE = "-BL";
	public static final String COMPANY_C_TYPE = "-C";
	public static final String COMPANY_ESPL_TYPE = "-ESPL";
	public static final String COMPANY_LOA_TYPE = "-LOA";
	public static final String COMPANY_SA_TYPE = "-SA";
	public static final String COMPANY_TP_TYPE = "-TP";
	
	
	//与外委人员有关的文件保存路径
	public static final String EMPLOYEE_FILE_PATH = "Data\\Files\\Employee\\";
	public static final String EMPLOYEE_PICTURE_PATH = "Data\\Picture\\Employee\\";
	
	public static final String EMPLOYEE_CL_TYPE = "-CL";
	public static final String EMPLOYEE_ER_TYPE = "-ER";
	public static final String EMPLOYEE_I_TYPE = "-I";
	
	
	
	//与电厂人员有关的文件保存路径
	public static final String EMPLOYER_FILE_PATH = "Data\\Files\\Employer\\";
	public static final String EMPLOYER_PICTURE_PATH = "Data\\Picture\\Employer\\";
	
	//质量控制点
	public static final String QUALITY_POINT_PATH = "Data\\Files\\Point\\";
	
	//进度计划表
	public static final String PLAN_FILE_PATH = "Data\\Files\\Plan\\";
	

}
