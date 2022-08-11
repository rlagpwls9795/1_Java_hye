package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {
	/* while문
	 * -별도의 초기식, 증감식이 존재하지 않고 반복 종료 조건만을 설정하는 반복문
	 * -반복 횟수가 정해져 있지 않지만 언젠가는 반족이 종료되는 경우에 사용
	 */
	
	//while 기초 사용법 1 
	public void ex1() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("=====================");
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}
	
	//while 기초 사용법 1 
	//입력되는 모든 정수의 합 구하기 : 0이 입력되면 반복 종료
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		int input=-1;
		//while문 내에서 입력 받은 값을 저장할 변수
		//0이 아닌 임의의 값을 이용해 초기화(while문 조건식 수행을 위해)
		int sum=0;
		while(input!=0) {
			System.out.print("정수 입력 : ");
			input=sc.nextInt();
			sum+=input;
			System.out.println("현재 누적 값 : "+sum);
		}
		System.out.println("합 : "+sum);
	}
	
	//분식집 주문 프로그램
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		String menu="";
		int input=0;
		boolean flag=false; 
		//신호로 사용하는 변수
		//false : 첫 번째 주문 / true : 첫 번째 외 주문 
		while(input!=9) {
			System.out.println("-----메뉴-----");
			System.out.println("1.떡볶이(5000원)");
			System.out.println("2.김밥(3000원)");
			System.out.println("3.라면(4000원)");
			System.out.println("4.돈까스(8000원)");
			System.out.println("9.주문 완료");
			System.out.print("메뉴 선택 >> ");
			input=sc.nextInt();
			System.out.println();
			
			if(flag && input>=1 && input<=4) {
				menu+=", ";
			} else {
				flag=true;
			}
			
			switch(input) {
			case 1:
				sum+=5000;
				menu+="떡볶이";
				
				break;
			case 2: 
				sum+=3000;
				menu+="김밥";
				
				break;
			case 3: 
				sum+=4000;
				menu+="라면";
				
				break;
			case 4: 
				sum+=8000;
				menu+="돈까스";
				
				break;
			case 9: 
				break;
			default: System.out.println("잘못 입력하셨습니다.");
			}
		}
		System.out.println(menu+"을/를 주문하셨습니다.");
		System.out.println("총 가격은 "+sum+"원입니다.");
	}
	
	/* do-while문
	 * [작성법]
	 * do {
	 * 		수행코드;
	 * 		증감식 or 분기문;
	 * }while(조건식);
	 */
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
	    int input; 
	    do{
	    	System.out.print("정수 입력 : ");
	    	input = sc.nextInt();
	    	sum += input;
	    	System.out.println("현재 누적 값 : " + sum);
	    }while( input != 0 );
	}

}

