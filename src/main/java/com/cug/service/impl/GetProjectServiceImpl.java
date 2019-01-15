package com.cug.service.impl;

import com.cug.mapper.NowprojectMapper;
import com.cug.model.GetOtherProject;
import com.cug.model.getproject;
import com.cug.po.Nowproject;
import com.cug.po.NowprojectExample;
import com.cug.service.GetProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

public class GetProjectServiceImpl implements GetProjectService{
	
    @Autowired
    private NowprojectMapper nowprojectMapper;
 
    //查出所有合同
    @Override
	public List<Nowproject> selectAllproject() {
		// TODO Auto-generated method stub
		NowprojectExample example = new NowprojectExample();
		NowprojectExample.Criteria criteria=example.createCriteria();
		criteria.andContractidLike("%");
		return nowprojectMapper.selectByExample(example);
	}
    //返回项目名称以及合同Id
    @Override
    public List<getproject> findproject() {
		List<getproject> returnListT = new ArrayList<getproject>();
		
		List<Nowproject> coNowprojects=selectAllproject();
    	for(int i=0;i<coNowprojects.size();i++)
    	{
    		getproject gettproject= new getproject();
    		gettproject.saveNowproject(coNowprojects.get(i));
    		returnListT.add(gettproject);
    	}
    		return returnListT;
        }
    
    
    List<GetOtherProject> returnList = new ArrayList<GetOtherProject>();
    //根据返回的Contractid查出并合同其它信息并返回给前台
	@Override
	public int addother(String request) {
		if(request == null)
		{
			return 1;
		}
		System.out.println(request);
		// TODO Auto-generated method stub
	
		List<Nowproject> coNowprojects=selectByConID(request);
		//单条查询
		for(int i=0;i<coNowprojects.size();i++)
		{
			
			GetOtherProject getOtherProject2=new GetOtherProject();
			getOtherProject2.saveNowproject(coNowprojects.get(i));
			returnList.add(getOtherProject2);
		}
		//returnList得到po一组数据
		System.out.println("-----------------------检测returnList");
		System.out.println(returnList.toString());
		System.out.println("-----------------------检测returnList");
		return 0;
		
	}
	//取出一条数据
	@Override
	public List<Nowproject> selectByConID(String id) {
		// TODO Auto-generated method stub
		NowprojectExample example = new NowprojectExample();
		NowprojectExample.Criteria criteria=example.createCriteria();
		criteria.andContractidEqualTo(id);
		return nowprojectMapper.selectByExample(example);
	}
	//返回除contractId外的其它数据
	@Override
	public List<GetOtherProject> returnproject() {
		// TODO Auto-generated method stub
		List<GetOtherProject> getOtherProjects = new ArrayList<GetOtherProject>();
		getOtherProjects=returnList;
		System.out.println("测试有没有从数据库中拉取出来");
		System.out.println("------------------");
		//测试有没有从数据库中拉取出来
		System.out.println(getOtherProjects);
		System.out.println("------------------");
		return getOtherProjects;
	}

    }

