package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	/* for문
	 * : 끝이 정해져 있는 경우 사용하는 반복문
	 * for(초기식;조건식;증감식) {}
	 *  초기식 : for문을 제어하는 용도의 변수 선언
		조건식 : for문의 반복 여부를 지정하는 식
    	조건식이 true인 경우에 반복을 수행함
    	보통 초기식에 사용된 변수를 이용해서 조건식을 작성함.
		증감식 : for문이 끝날 때 마다 특정 값을 변화 시키는 식
    	보통 초기식에 사용된 변수를 증가/감소 시켜
    	조건식의 결과를 변화게 만듦.
	 */
	
	//for문 기초 사용법1 : 1~10까지 반복 출력
	public void ex1() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+"출력");
		}
	}
	
	//for문 기초 사용법2 : 5부터 12까지 1씩 증가
	public void ex2() {
		for(int i=5;i<=12;i++) {
			System.out.println(i+"출력");
		}
		System.out.println("=====================");
		//1부터 100까지의 모든 정수의 합
		int sum=0; 
		//0으로 초기화하는 이유 : 더하거나 뺄 때 아무런 영향이 없어 누적이 필요한 상황에서 기준점으로 사용하기 적합
		for(int i=1;i<=100;i++) {
			sum = sum + i;
		}
		System.out.println("1부터 100까지의 합 : "+ sum);
	}
	
	//for문 기초 사용법3 : 두 정수를 입력받아 두 정수 사이의 모든 정수의 합 출력
	//(첫 번째 입력이 두 번째 입력보다 작아야 한다)
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		int sum=0;
		for (int i=num1;i<=num2;i++) {
			sum=sum+i;
		}
		System.out.printf("%d 부터 %d 까지의 합 : %d\n",num1,num2,sum);
	}
	
	//for문 기초 사용법 4 : 1부터 100까지 3씩 증가하며 출력
	public void ex4() {
		for(int i=1;i<=100;i+=3) {
			System.out.print(i+" ");
		}
		System.out.println("\n=====================");
		//10부터 20까지 0.5씩 증가
		for(double i=10.0;i<=20.0;i+=0.5) {
			System.out.print(i+" ");
		}
		
	}
	
	//for문 + char + 형변환 응용 :A ~ Z까지 출력
		public void ex5() {
			for(int i='A';i<='Z';i++) {
				System.out.println((char)i);
			}
//			for(char i='A';i<='Z';i++) {
//				System.out.println(i);
//			}
		}
		
		//10부터 1까지 1씩 감소하면서 출력
		public void ex6() { 
			for(int i=10;i>=1;i--) {
				System.out.println(i+" 출력");
			}
		}
		
		//정수 5개를 입력 받아서 합계 구하기
		public void ex7() {
			Scanner sc= new Scanner(System.in);
			int sum=0;
			for(int i=1; i<=5 ;i++) {
				System.out.print("입력 "+i+" : ");
				sum += sc.nextInt(); //입력 버퍼에서 다음 정수를 얻어와 sum 변수에 누적
			}
			System.out.println("합계 : "+sum);
		}
		
		// 정수를 몇 번 입력 받을지 먼저 입력 받고 입력된 정수의 합계를 출력
		public void ex8() {
			Scanner sc = new Scanner(System.in);
			int sum=0;
			System.out.print("입력 받을 정수의 개수 : ");
			int num=sc.nextInt();
			for(int i=1;i<=num;i++) {
				System.out.print("입력 "+i+" : ");
				sum += sc.nextInt();
			}
			System.out.println("합계 : "+sum);
		}
		
		//1부터 20까지 1씩 증가하며 출력하면서 5의 배수에는 ()붙이기 
		public void ex9() {
			for(int i=1;i<=20;i++) {
				if(i%5==0) {
					System.out.print("("+i+") ");
				} else {
					System.out.print(i+" ");
				}
			}
		}
		
		//구구단 : 수를 입력받아 해당하는 수의 단 출력
		public void ex10() {
			Scanner sc = new Scanner(System.in);
			System.out.print("입력 : ");
			int input=sc.nextInt();
			if(input>=2 && input<=9) {
				for(int i=1;i<=9;i++) {
					System.out.printf("%d x %d = %d\n",input,i,(input*i));
				}
				System.out.println("=====================");
				//역순 출력
				for(int i=9;i>=1;i--) {
					System.out.printf("%d x %d = %d\n",input,i,(input*i));
				}
			} else {
				System.out.println("잘못 입력 하셨습니다.");
			}
			
		}
		
		//===================================================
		//[중첩반복문]
		//===================================================
		
		//12345 4번 반복
		public void ex11() {
			for(int i=1;i<=4;i++) {
				for(int j=1;j<=5;j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		
		//구구단 출력
		public void ex12() {
			for(int i=2;i<=9;i++) {
				for(int j=1;j<=9;j++) {
					System.out.printf("%d x %d = %2d   ",i,j,(i*j));
				}
				System.out.println();
			}
		}
		
		/* 1
		 * 12
		 * 123
		 * 1234
		 */
		public void ex13() {
			for(int i=1;i<=4;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		
		/* 4
		 * 43
		 * 432
		 * 4321
		 */
		public void ex14() {
			for(int i=4;i>=1;i--) {
				for(int j=4;j>=i;j--) {
					System.out.print(j);
				}
				System.out.println();
			}
			
			for(int i=1;i<=4;i++) {
				for(int j=4;j>=5-i;j--) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		
		//ex14()에 입력받기
		public void ex15() {
			Scanner sc = new Scanner(System.in);
			System.out.print("입력 : ");
			int input = sc.nextInt();
			for(int i=input;i>=1;i--) {
				for(int j=i;j>=1;j--) {
					System.out.print(j);
				}
				System.out.println();
			}
			
		}
		
		// *
		// **
		// ***
		// ****
		// *****
		public void ex16() {
			for(int i=0;i<5;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		//1부터 20까지의 3의 배수 개수 출력
		public void ex17() {
			int sum=0;
			int count = 0;
			for(int i=1;i<=20;i++) {
				if(i%3==0) {
					System.out.print(i+" ");
					count += 1;
					sum += i;
				}
			}
			System.out.println();
			System.out.println("3의 배수의 합 : "+sum);
			System.out.println("3의 배수의 개수 : "+count);
		}
		
		public void ex18() {
			int count=1;
			for(int i=1;i<=3;i++) {
				for(int j=1;j<=4;j++) {
//					count++;
//					System.out.printf("%3d",count);
					System.out.printf("%3d", count++);
				}
				System.out.println();
			}
			
//			int count1=0;
//			for(int i=1;i<=12;i++) {
//				count1++;
//				System.out.printf("%3d", i);
//				if(count1%4==0) {System.out.println();}
//			}
		}

}

























