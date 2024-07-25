package com.ktdsuniversity.edu.abstractclass;

import java.util.Random;

public class CheckFileTypeAndMimeType extends AbstractFileTypeChecker{
	
	public CheckFileTypeAndMimeType (String fileName) {
		super(fileName);
	}
	
	@Override
	public boolean compareType() {
		return isJpegFile() && isImageMimeType();
	}
	
	private boolean isJpegFile() {
		return this.fileName.toLowerCase().endsWith(".jpg");
	}
	
	private boolean isImageMimeType() {
		
		String mimeTypeOfFile = getMimeTypeOfFile();
		
		boolean isImageFile = mimeTypeOfFile.equals("image/jpeg") || mimeTypeOfFile.equals("image/gif");
		
		System.out.println(fileName + "의 mimeType은 " + mimeTypeOfFile + "입니다.");
		
		return isImageFile;
	}
	
	private String getMimeTypeOfFile() {
		String[] mimeTypes = {"image/jpeg", "image/gif", "audio/mp3", "video/avi"};
		
		Random random = new Random();
		return mimeTypes[random.nextInt(mimeTypes.length)];
	}
}
