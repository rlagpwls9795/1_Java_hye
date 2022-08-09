package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {
	/* [작성방법]
	 * switch(식, 결과가 true/false가 아닌 식) {
	 * 		case 결과값1:  수행코드1  break;
	 * 		case 결과값2:  수행코드2  break;
	 * 		...
	 * 		default: 모든 case가 만족하지 않을 경우 수행하는 코드;  
	 * }
	 */
	public void ex1() {
		//키보드로 정수를 입력 받아 1:빨간색 2:주황색 3:노란색 4:초록색 아니면 흰색
		System.out.println("[switch문 예시1]");
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input=sc.nextInt();
		String color;
		switch(input) {
		case 1 : color="빨간색"; break;
		case 2 : color="주황색"; break;
		case 3 : color="노란색"; break;
		case 4 : color="초록색"; break;
		default : color="흰색";
		}
		System.out.println(color);
		System.out.println("[switch문 예시1 종료]");
	}
	public void ex2() {
		//정수를 입력 받아 나머지 1:백팀 2:청팀 3:홍팀 아니면 깍두기
		System.out.println("[switch문 예시2]");
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input=sc.nextInt();
		String result;
		switch(input%4) {
		case 1: result="백팀"; break;
		case 2: result="청팀"; break;
		case 3: result="홍팀"; break;
		default: result="깍두기";
		}
		System.out.println(result+"입니다.");
		System.out.println("[switch문 예시2 종료]");
	}
	
	public void ex3() {
		System.out.println("[switch문 예시3]");
		Scanner sc= new Scanner(System.in);
		System.out.println("김밥(3000) / 라면(4000) / 샌드위치(5000) / 짬뽕(10000)");
		System.out.print("메뉴 입력 : ");
		String input = sc.next();
		int result;
		switch(input) { //int, String만 가능
		case "김밥" : result=3000; break;
		case "라면" : result=4000; break;
		case "샌드위치" : result=5000; break;
		case "짬뽕" : result=10000; break;
		default: result=-1; //잘못 입력하면 -1 이라고 의미 부여
		}
		if(result==-1) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.printf("%s은/는 %d원입니다.",input, result);
		}
		System.out.println("[switch문 예시3 종료]");
	}
	
	public void ex4() {
		System.out.println("[switch문 예시4]");
		//산술 연산 계산기 (나누기 연산 시 0으로 나눌 수 없다)
		Scanner sc= new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1=sc.nextInt();
		System.out.print("연산자 입력 : ");
		String op=sc.next();
		System.out.print("정수2 입력 : ");
		int num2=sc.nextInt();
		int result=0;
		switch(op) {
		case "+": result=num1+num2; break;
		case "-": result=num1-num2; break;
		case "*": result=num1*num2; break;
		case "/": if(num2==0) {
					System.out.println("0으로 나눌 수 없습니다.");
					return;
				} else {
					result=num1/num2;
				}
				break;
		case "%": result=num1%num2; break;
		default: System.out.println("존재하지 않는 연산자 입니다."); return;
		}
		System.out.printf("%d %s %d = %d\n",num1,op,num2,result);
		System.out.println("[switch문 예시4 종료]");
	}
	
	public void ex5() {
		System.out.println("[switch문 예시5]");
		Scanner sc= new Scanner(System.in);
		System.out.print("달 입력 : ");
		int month=sc.nextInt();
		String season;
		switch(month) {
		case 3 : case 4 : case 5 : season="봄"; break;
		case 6 : case 7 : case 8 : season="여름"; break;		
		case 9 : case 10 : case 11 : season="가을"; break;
		case 1 : case 2 : case 12 : season="겨울"; break;
		default: season="잘못입력하셨습니다.";
		}
		System.out.println(season);
		System.out.println("[switch문 예시5 종료]");
	}
	

}
