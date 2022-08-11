package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	//break문 : 가장 가까운반복문을 빠져 나가는 구문
	public void ex1() {
		for(int i=1;i<10000;i++) {
			System.out.println(i);
			if(i==20) {
				break;
			}
		}
		System.out.println("======================");
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=30;col++) {
				System.out.printf("(%d, %d) ",row,col);
				if(col==3) {
					break;
				}
			}
			System.out.println();
			if(row==3) {
				break;
			}
		}
	}
	
	//0이 입력될 때까지의 입력된 정수의 합
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		while(true) {
			System.out.print("정수 입력 : ");
			int input=sc.nextInt();
			if(input==0) {
				break;
			}
			sum+=input;
		}
		System.out.println("합계 : "+sum);
	}
	
	//"exit@"가 입력될 때까지 문자열 누적
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		String str="";
		System.out.println("문자열 입력(종료 시 exit@ 입력) : ");
		while(true) {
			String input=sc.nextLine(); //한 줄 입력
			//비교연산자는 보통 기본자료형의 값만 비교 가능
			//참조자료형은 .equals()로 비교
			if(input.equals("exit@")) {
				break;
			}
			str += input+"\n";
		}
		System.out.println(str);
	}
	
	//continue : 다음 반복으로 넘어감
	//5의 배수 건너 뛰기
	public void ex4() {
		for(int i=1;i<=30;i++) {
			if(i%5==0) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	public void ex5() {
		for(int i=1;i<=100;i++) {
			if(i==40) {
				System.out.println(i);
				break;
			}
			if(i%5==0) {
				continue;
			}
			System.out.println(i);
		}
	}
	//난수 생성 : Math.random() -> 0.0 이상 1.0 미만의 난수 생성(double)
	//1~50 사이의 난수(정수로) 생성 ==> (int)(Math.random*50+1)
	
	public void upDownGame() {
		int count = 1;
		int ran = (int)(Math.random()*50+1);
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print(count+"번 입력 : ");
			int num = sc.nextInt();
			if(num<ran) {
				System.out.println("UP");
			} else if(num>ran) {				
				System.out.println("DOWN");
			} else {				
				System.out.printf("정답입니다! (총 입력 횟수 : %d회)\n",count);
				break;
			}
			count++;
		}
	}
}

