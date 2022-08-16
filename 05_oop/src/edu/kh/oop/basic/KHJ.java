package edu.kh.oop.basic;

//클래스 : 객체가 되었을 때 가지고 있을 속성, 기능을 정의(작성)한 문서
public class KHJ {
	
	//객체가 가지고 있는 속성
	String name="김혜진";
	int age=26;
	String birthday="1997-09-05";
	private String password="1234";
	//private : 해당 클래스 내부에서만 접근 가능하다.
	
	//객체가 가지고 있는 기능
	public void study() {
		System.out.println("자바 공부");
	}
	public void eat() {
		System.out.println("밥 먹기");
	}
	public void plus(int num1, int num2) {
		System.out.println("합 : "+(num1+num2));
	}
	//public : 같은 프로젝트 내부 누구든, 어디서든 접근 가능
	public void showPassword() {
		System.out.println("비밀번호 : ***"+password+"***");
	}
}
