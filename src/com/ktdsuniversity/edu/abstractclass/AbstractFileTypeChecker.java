package com.ktdsuniversity.edu.abstractclass;

public abstract class AbstractFileTypeChecker {

	protected String fileName; // 상속된 클래스에서만 사용 가능함
	
	public AbstractFileTypeChecker (String fileName) {
		this.fileName = fileName;
	}
	
	public boolean isImageFile() {
		return compareType();
	}
	
	public abstract boolean compareType(); // 중괄호를 안 연다
}
