package edu.kh.control.condition;

import java.util.Scanner;

//시키는 코드를 수행하는 부분
public class ConditionExample {
	
	public void test1() {
		System.out.println("1번 기능을 수행합니다.");
	}
	public void test2() {
		System.out.println("2번 기능을 수행합니다.");
	}
	
	public void ex1() {
		System.out.println("[if문 예시1]");
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input=sc.nextInt();		
		if(input%2==0) {
			System.out.println("짝수입니다.");
		} 		
		if(input%2!=0) {
			System.out.println("홀수입니다.");
		} 		
		System.out.println("[if문 예시1 종료]");
	}
	
	public void ex2() {
		System.out.println("[if문 예시2]");		
		Scanner sc = new Scanner(System.in);		
		System.out.print("정수 입력 : ");
		int input=sc.nextInt();
		if(input%2==1) {
			System.out.println("홀수입니다.");
		} else {
			if(input==0) {
				System.out.println("0 입니다.");
			} else {
				System.out.println("짝수입니다.");
			}
		}
		System.out.println("[if문 예시2 종료]");
	}
	
	

}
