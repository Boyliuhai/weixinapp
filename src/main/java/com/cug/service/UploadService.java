package com.cug.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadService {
	public String saveMulipartFile(MultipartFile file,
			String appPath,
			String fileType,
			String detailInfo) throws Exception;
}
