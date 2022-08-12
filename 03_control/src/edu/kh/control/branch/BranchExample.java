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
	// 가위 바위 보 게임
	   // 몇판? : 3
	 
	   // 1번째 게임
	   // 가위/바위/보 중 하나를 입력 해주세요 :  가위
	   // 컴퓨터는 [보]를 선택했습니다.
	   // 플레이어 승!
	   // 현재 기록 : 1승 0무 0패
	   
	   // 2번째 게임
	   // 가위/바위/보 중 하나를 입력 해주세요 :  보
	   // 컴퓨터는 [보]를 선택했습니다.
	   // 비겼습니다.
	   // 현재 기록 : 1승 1무 0패
	   
	   // 3번째 게임
	   // 가위/바위/보 중 하나를 입력 해주세요 :  가위
	   // 컴퓨터는 [바위]를 선택했습니다.
	   // 졌습니다ㅠㅠ
	   // 현재 기록 : 1승 1무 1패
	public void rpsGame() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 판? : ");
		int input=sc.nextInt();
		int cnt1=0;
		int cnt2=0;
		int cnt3=0;
		for(int i=1;i<=input;i++) {
			System.out.println("\n"+i+"번째 게임");
			System.out.print("가위/바위/보 중 하나를 입력해주세요 : ");
			String str=sc.next();
			int ran = (int)(Math.random()*3);
			String sran="";
			//String sran=null;
			if(ran==0) {
				sran="가위";
			} else if(ran==1) {
				sran="바위";
			} else {
				sran="보";
			}
//			switch(ran) {
//			case 0: sran="가위"; break;
//			case 1: sran="바위"; break;
//			case 2: sran="보"; break; 
//			}
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n",sran);
			if(str.equals("가위")) {
				if(sran.equals(str)) {
					System.out.println("비겼습니다.");
					cnt2++;
				} else if(sran.equals("바위")) {
					System.out.println("졌습니다.");
					cnt3++;
				} else {
					System.out.println("플레이어 승");
					cnt1++;
				}
			} else if(str.equals("바위")) {
				if(sran.equals(str)) {
					System.out.println("비겼습니다.");
					cnt2++;
				} else if(sran.equals("보")) {
					System.out.println("졌습니다.");
					cnt3++;
				} else {
					System.out.println("플레이어 승");
					cnt1++;
				}
			} else {
				if(sran.equals(str)) {
					System.out.println("비겼습니다.");
					cnt2++;
				} else if(sran.equals("가위")) {
					System.out.println("졌습니다.");
					cnt3++;
				} else {
					System.out.println("플레이어 승");
					cnt1++;
				}
			}
//			if(str.equals(sran)) {
//				System.out.println("비겼습니다.");
//			} else {
//				//사용자가 이기는 경우
//				boolean win1=str.equals("가위") && sran.equals("보");
//				boolean win2=str.equals("보") && sran.equals("바위");
//				boolean win3=str.equals("바위") && sran.equals("가위");
			
//				if(win1||win2||win3) {
//					System.out.println("플레이어 승");
//				} else {
//					System.out.println("졌습니다.");
//				}
//			}
			System.out.printf("현재 기록 : %d승 %d무 %d패\n\n",cnt1,cnt2,cnt3);
			
		}
		
	}
}

