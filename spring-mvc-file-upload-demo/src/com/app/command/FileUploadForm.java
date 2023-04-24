package com.app.command;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadForm {

	//can be used to hold the uploaded file
	private MultipartFile file;
	
	public MultipartFile getFile() {
		return file;
		
	}
	public void setFile(MultipartFile file)
	{
		this.file = file;
	}
}
