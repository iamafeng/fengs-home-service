package com.afeng.file.service;

import org.springframework.web.multipart.MultipartFile;

import com.afeng.file.model.FileInfo;

public interface FileService {

	/**
	 * 上传文件
	 *
	 * @param file
	 * @return
	 * @throws Exception
	 */
	FileInfo upload(MultipartFile file) throws Exception;

	/**
	 * 删除文件
	 *
	 * @param fileInfo
	 */
	void delete(FileInfo fileInfo);

}
