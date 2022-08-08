package edu.kh.op.practice;
import java.util.Scanner;

public class OperatorPractice4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		
		int hap=kor+eng+mat;
		double avg = hap/3.0;
		String result = (kor>=40&&eng>=40&&mat>=40)||avg>=60 ? "합격" : "불합격";
		
		System.out.println("합계 : "+hap);
		System.out.printf("평균 : %.1f \n",avg);
		System.out.println(result);
		
	}

}
