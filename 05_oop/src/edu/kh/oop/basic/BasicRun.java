package edu.kh.oop.basic;

public class BasicRun {
	public static void main(String[] args) {
		KHJ 김혜진 = new KHJ();
		//heap 영역에 KHJ 클래스에 정의된 내용을 이용하여 KHJ 객체 생성(할당)
		
		//객체가 가지고 있는 속성 출력
		System.out.println("이름 : "+김혜진.name);
		System.out.println("나이 : "+김혜진.age);
		System.out.println("생년원일 : "+김혜진.birthday);
//		System.out.println("비밀번호 : "+김혜진.password);
		
		//비밀번호를 볼 수 있는 기능을 호출 => 간접 접근 방법
		김혜진.showPassword();
		
		//객체가 가지고 있는 기능 수행
		김혜진.eat();
		김혜진.study();
		김혜진.plus(50, 100);
		
	}

}
