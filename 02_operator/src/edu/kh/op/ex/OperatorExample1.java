package edu.kh.op.ex;

import java.util.Scanner;

public class OperatorExample1 {
	public static void main(String[] args) {
		System.out.println("두 정수를 입력 받아 산술 연산 출력하기");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 1 : ");
		int input1 = sc.nextInt();
		System.out.print("정수 입력 2 : ");
		int input2 = sc.nextInt();
		
		System.out.println(input1 + " + " +input2 + " = " + (input1 + input2));
		
		System.out.printf("%d - %d = %d\n", input1, input2, (input1-input2));
		
		System.out.printf("%d / %d = %d\n", input1, input2, (input1/input2));
		
		System.out.printf("%d %% %d = %d\n", input1, input2, (input1%input2));
		//cf. % 연산 사용 시 %% 
	}

}
