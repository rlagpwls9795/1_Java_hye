package edu.kh.op.ex;
import java.util.Scanner;

public class OperatorExample5 {
	public static void main(String[] args) {
		//복합 대입 연산자 : +=, -=, *=, /=, %=
		int a=10;
		a++;
		System.out.println("a를 1 증가 : "+a); //11
		a+=4;
		System.out.println("a를 4 증가 : "+a); //15
		a-=10;
		System.out.println("a를 10 감소 : "+a); //5
		a*=3;
		System.out.println("a를 3배 증가 : "+a); //15
		a/=6;
		System.out.println("a를 6으로 나누었을 때 몫 : "+a); //2
		a%=2;
		System.out.println("a를 2로 나누었을 때 나머지 : "+a); //0
		
		System.out.println("-------------------------------");
		
		//삼항연산자(조건식? 식1:식2) : 조건식의 결과값에 따라 참이면 식1 실행, 거짓이면 식2 실행
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String result= input%2==0? "짝수입니다." : "홀수입니다.";
		System.out.println(result);
		
		
	}

}
