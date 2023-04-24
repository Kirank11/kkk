package com.app.command;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadForm {

	/*
	 * //can be used to hold the upload file private MultipartFile file;
	 * 
	 * 
	 * public MultipartFile getfile() { return file; }
	 * 
	 * public void setfile(MultipartFile file) { this.file=file; }
	 */
	// can be used to hold the uploaded file
	private MultipartFile file;

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

}
