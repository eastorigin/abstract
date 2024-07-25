package com.ktdsuniversity.edu.abstractclass;

/**
 * 파일의 확장자를 체크하는 기능
 */
public class CheckFileType extends AbstractFileTypeChecker{
	
	public CheckFileType(String fileName) {
		super(fileName);
	}
	
	@Override
	public boolean compareType() {
		return this.fileName.toLowerCase().endsWith(".jpg");
	}
}
