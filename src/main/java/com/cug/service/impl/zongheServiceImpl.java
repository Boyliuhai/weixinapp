package com.cug.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cug.mapper.TempprojectemployeeMapper;
import com.cug.model.zongtimo;
import com.cug.service.zongheService;

public class zongheServiceImpl implements zongheService{

	@Autowired
	private TempprojectemployeeMapper Tempprojectemployee;
	
	@Override
	public int addData(zongtimo request) {
		if(request == null)
		{
			return 1;
		}
		int code = Tempprojectemployee.insert(request.mapToDB());
		// TODO Auto-generated method stub
		if(code == 0){
			return 2;
		}
		return 0;
	}
	

	
}
