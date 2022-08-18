package edu.kh.oop.field.model.vo;

public class Trainee {
	
	public String name; //이름
	public String phone; //전화번호
	public String email; //이메일(선택)
	public int salary; //급여(훈련수당)
	public static char classRoom; //강의실
	
	//필드 서언 시 바로 값 초기화 : 명시적 초기화
	
	//초기화 블럭 : 객체(인스턴스)필드를 초기화하는 블럭
	// -instance block : 일반 필드(static이 없는) 값 초기화 (생성 시 마다)
	// -static block :static이 있는 필드 값 초기화 (프로그램 실행 시 1회)
	
	{ //instance block
		email="없음";
		salary=116000;
	}
	static { //static block
		classRoom='A';
	}
	
}
