package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		if(input<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i=1;i<=input;i++) {
				System.out.print(i+"  ");
			}
			System.out.println();
		}
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		if(input<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i=input;i>=1;i--) {
				System.out.print(i+"  ");
			}
			System.out.println();
		}
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요. : ");
		int input = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=input;i++) {
			sum += i;
			if(i==input) {
				System.out.print(i+" ");
			} else System.out.print(i + " + ");
		}
		System.out.println("= "+sum);
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		if(num1<1 || num2<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			if(num1<=num2) {
				for(int i=num1;i<=num2;i++) {
					System.out.print(i+" ");
				} 
			} else {
				for(int i=num2;i<=num1;i++) {
					System.out.print(i+" ");
				}
			}
			System.out.println("\nfor문 한 번 쓰는 법 : 변수를 추가 생성 or temp");
			int start=num1;
			int end=num2;
			if(num1>num2) {
				start=num2;
				end=num1;
			}
			for(int i=num1;i<=num2;i++) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		System.out.println("====== "+num+"단 ======");
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n",num,i,(num*i));
		}
	} 
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		if(num<2 || num>9) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
			for(int i=num;i<=9;i++) {
				System.out.println("====== "+i+"단 ======");
				for(int j=1;j<=9;j++) {
					System.out.printf("%d * %d = %d\n",i,j,(i*j));
				}
			}
		}
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int i=input;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int i=1;i<=input;i++) {
			for(int j=input-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
	public void practice9v2() { //if문 이용
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=input;j++) {
				if(j<=input-i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int i=1;i<=input*2-1;i++) {
			if(i<=input) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");	
				}
			} else {
				for(int j=input-1;j>=i-input;j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int i=1;i<=input;i++) {
			for(int j=input-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
	public void practice11v2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=input*2-1;j++) {
				if(input-i>=j || input+i<=j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int i=1;i<=input;i++) {
			if(i==1 || i==input) {
					for(int j=1;j<=input;j++) {
						System.out.print("*");
					}
			} else {
				System.out.print("*");
				for(int j=1;j<=input-2;j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice12v2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=input;j++) {
				if(i==1 || i==input || j==1 || j==input) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		int count = 0;
		for(int i=1;i<=input;i++) {
			
			if(i%2==0 || i%3==0) {
				System.out.print(i+" ");
				if(i%2==0 && i%3==0) {
					count++;	
				}
			}
		}
		System.out.println("\ncount : "+count);
	} 

}
