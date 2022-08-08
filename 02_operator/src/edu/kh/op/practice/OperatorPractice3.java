package edu.kh.op.practice;
import java.util.Scanner;

public class OperatorPractice3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		String result = a>0? "양수입니다" : (a==0 ? "0 입니다." : "음수입니다.");
		System.out.println(result);
		
	}

}
