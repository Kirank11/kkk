package com.app.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.app.command.FileUploadForm;

@Controller
public class FileUploadController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String displayForm(Model model) {
		return "file_upload_form";
	}

	@RequestMapping(value = "/done", method = RequestMethod.POST)
	public String upload(Model map, @ModelAttribute("uploadform") FileUploadForm cmd) {
		/*
		 * File dir = new File("D:/SpringData");
		 * 
		 * //get uploaded file MultipartFile file = cmd.getFile();
		 * 
		 * String fileName = ""; System.out.println("Out"); if(file!=null) {
		 * System.out.println("In"); fileName = file.getOriginalFilename();
		 * System.out.println("Original File Name = "+fileName);
		 * 
		 * //handle file Content InputStream inputStream = null; OutputStream
		 * outputStream ;
		 * 
		 * try { inputStream = file.getInputStream();
		 * 
		 * //if file is not present then only create a file and write the data to file
		 * if(!dir.exists()) { dir.mkdir(); }
		 * 
		 * File newFile = new File("D:/SpringData/"+fileName); outputStream = new
		 * FileOutputStream(newFile);
		 * 
		 * int bytesRead =0; byte[] buffer = new byte[1024];
		 * 
		 * while((bytesRead = inputStream.read(buffer))!=-1) {
		 * outputStream.write(buffer,0,bytesRead); } outputStream.close();
		 * inputStream.close(); }catch (Exception e) {
		 * System.out.println("Exception Occurred "+e); } }
		 * map.addAttribute("file",fileName); return "file_upload_success"; }
		 */
		File dir = new File("D:/Spring_data");

		// get upload file
		MultipartFile file = cmd.getFile();

		String fileName = "";
		if (file != null) {
			fileName = file.getOriginalFilename();
			System.out.println("Original File Name = " + fileName);

			// handle file content
			InputStream inputStream = null;
			OutputStream outputStream;

			try {
				inputStream = file.getInputStream();
				// if file is not present then only create a file and write the data to the file
				if (!dir.exists()) {
					dir.mkdir();
				}
				File newFile = new File("D:/Spring_data/" + fileName);
				outputStream = new FileOutputStream(newFile);
				int bytesRead = 0;
				byte[] buffer = new byte[1024];
				while ((bytesRead = inputStream.read(buffer)) != -1) {
					outputStream.write(buffer, 0, bytesRead);
				}
				outputStream.close();
				inputStream.close();
			} catch (Exception e) {
				System.out.println("Exception Occurres " + e);
			}
		}
		map.addAttribute("file", fileName);
		return "file_upload_success";
	}
}
