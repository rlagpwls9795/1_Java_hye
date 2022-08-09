package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		if(input<=0) {
			System.out.println("양수만 입력해주세요.");
		} else if(input%2==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수 : ");
		int mat = sc.nextInt();
		int sum = kor+eng+mat;
		double avg = (kor+eng+mat)/3.0;
		
		if(kor>=40 && eng>=40 && mat>=40 && avg>=60) {
			System.out.println("국어 : "+kor);
			System.out.println("영어 : "+eng);
			System.out.println("수학 : "+mat);
			System.out.println("합계 : "+sum);
			System.out.println("평균 : "+avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month=sc.nextInt();
		int day;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: day=31; break;
		case 4: case 6: case 9: case 11: day=30; break;
		case 2: day=28; break;
		default: day=0;
		}
		if(day==0) {
			System.out.println(month+"월은 잘못 입력된 달입니다.");
		} else  {
			System.out.println(month+"월은 "+day+"일까지 있습니다.");
		}
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();
		double BMI = weight/(height*height);
		String result;
		if (BMI<18.5) {
			result="저체중";
		} else if(BMI<23) {
			result="정상체중";
		} else if(BMI<25) {
			result="과체중";
		} else if(BMI<30) {
			result="비만";
		} else {
			result="고도비만";
		}
		System.out.println("BMI 지수 : "+BMI);
		System.out.println(result);
		
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		double num1 = sc.nextDouble()*0.2;
		System.out.print("기말 고사 점수 : ");
		double num2 = sc.nextDouble()*0.3;
		System.out.print("과제 점수 : ");
		double num3 = sc.nextDouble()*0.3;
		System.out.print("출석 횟수 : ");
		double num4 = sc.nextDouble();
		double num5=num1+num2+num3+num4;
		System.out.println("=============결과=============");
		if (num4<=14) {
			System.out.printf("FAIL [출석 횟수 부족 (%.0f/20)]\n",num4);
		} else {
			System.out.printf("중간 고사 점수(20) : %.1f\n",num1);
			System.out.printf("기말 고사 점수(30) : %.1f\n",num2);
			System.out.printf("과제 점수    (30) : %.1f\n",num3);
			System.out.printf("출석 점수    (20) : %.1f\n",num4);
			System.out.printf("총점 : %.1f\n", num5);
			if(num5<70) {
				System.out.println("FAIL [점수 미달]");
			} else {
			System.out.println("PASS");
			}
		}
		
	}

}
