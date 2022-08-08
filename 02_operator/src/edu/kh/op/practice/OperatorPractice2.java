package edu.kh.op.practice;
import java.util.Scanner;

public class OperatorPractice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년(정수) : ");
		int a = sc.nextInt();
		System.out.print("반(정수) : ");
		int b = sc.nextInt();
		System.out.print("번호(정수) : ");
		int c = sc.nextInt();
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.next();
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double d = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.",a,b,c,name,gender,d);
		
	}

}
