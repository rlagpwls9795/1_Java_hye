package edu.kh.variable.ex1;

import java.util.Scanner;//자바에서 미리 만들어 둔 Scanner 얻어 오기 ==> 해당 클래스에서 사용 가능

public class VariableExample6 {
	public static void main(String[] args) {
		
		//Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게 하는 역할
		//1) class 위에 import java.util.Scanner
		
		//2) 얻어 온 Scanner 생성
		Scanner sc = new Scanner(System.in);
		
		//3) Scanner로 입력 받기
			//sc.nextInt() : 키보드로부터 정수 입력 받기
		System.out.println("입력 받은 두 정수의 합 구하기");
		System.out.print("정수 입력 1 :");
		int input1 = sc.nextInt(); //입력 받아서 input1에 대입
		System.out.print("정수 입력 2 :");
		int input2 = sc.nextInt(); //입력 받아서 input2에 대입
		System.out.printf("%d + %d = %d\n",input1, input2, input1+input2);
	
			//sc.nextDouble() : 키보드로부터 실수 입력 받기
		System.out.println("입력받은 두 실수의 합");
		System.out.print("실수 입력 1 :");
		double input3 = sc.nextDouble(); //입력 받아서 input3에 대입
		System.out.print("실수 입력 2 :");
		double input4 = sc.nextDouble(); //입력 받아서 input4에 대입
		System.out.printf("%.2f + %.2f = %.2f\n",input3, input4, input3+input4);
	
		 	//sc.next() : 키보드로부터 띄어쓰기 없는 문자열 입력 받기
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.next();
		System.out.println(name + "님 오늘 하루 고생하셨습니다.");
		
	}

}
