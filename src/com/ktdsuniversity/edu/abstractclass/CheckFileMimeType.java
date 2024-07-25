package com.ktdsuniversity.edu.abstractclass;

import java.util.Random;

public class CheckFileMimeType extends AbstractFileTypeChecker{

	// private String fileName; // 추상이 된 것들은 다 지운다.
	
	public CheckFileMimeType(String fileName) {
		super(fileName);
		// this.fileName =fileName;
	}
	
	private String getMimeTypeOfFile() {
		String[] mimeTypes = {"image/jpeg", "image/gif", "audio/mp3", "video/avi"};
		
		Random random = new Random();
		return mimeTypes[random.nextInt(mimeTypes.length)];
	}
	
//	public boolean isImageFile() {
//		
//	}
	
	/**
	 * 추상 클래스에 포함 되어있는 추상 메소드는 서브 클래스에서 반드시 오버라이딩 해야한다!!!!
	 * Ctrl + space 누르면 첫 번째 선택
	 */
	@Override
	public boolean compareType() {
		String mimeTypeOfFile = getMimeTypeOfFile();
		
		boolean isImageFile = mimeTypeOfFile.equals("image/jpeg") || mimeTypeOfFile.equals("image/gif");
		
		System.out.println(fileName + "의 mimeType은 " + mimeTypeOfFile + "입니다.");
		
		return isImageFile;
	}
}
