package array.bingo;

import java.util.Scanner;

public class bingoGame {
	public void bingo() {
		Scanner sc = new Scanner(System.in);
		//빙고판 만들기
		System.out.print("빙고판 크기 지정 : ");
		int input=sc.nextInt();
		String arr1[] = new String[input*input];
		String arr2[][] = new String[input][input];
		int num=0;
		for(int i=0;i<arr1.length;i++) {
			int ran = (int)(Math.random()*(input*input)+1);
			arr1[i]=""+ran;
			for(int j=0;j<i;j++) {
				if(arr1[j].equals(arr1[i])) {
					i--;
					break;
				}
			}
		}
		if(num<(input*input)) {
			for(int row=0;row<input;row++) {
				for(int col=0;col<input;col++) {
					arr2[row][col]=arr1[num];
					num++;
				}
			}
		}
		for(int row=0;row<arr2.length;row++) {
			for(int col=0;col<arr2[row].length;col++) {
				System.out.printf("%4s",arr2[row][col]);
			}
			System.out.println();
		}
		
		//번호 입력
		int cnt=0;
		System.out.println("======= 빙고게임 시작 =======");
		System.out.print("정수를 입력하시오 : ");
		String star=sc.next();
		for(int row=0;row<arr2.length;row++) {
			for(int col=0;col<arr2[row].length;col++) {
				if(arr2[row][col].equals(star)) {
					arr2[row][col]="★";
				}
			}
		}
		for(int row=0;row<arr2.length;row++) {
			for(int col=0;col<arr2[row].length;col++) {
				System.out.printf("%4s",arr2[row][col]);
			}
			System.out.println();
		}
		System.out.printf("현재 %d빙고\n\n\n",cnt);
		boolean flag=true;
		while(true) {
			String arr3[][]=new String[arr2.length][arr2[0].length];
			arr3=arr2;
			System.out.print("정수를 입력하시오 : ");
			star=sc.next();
			for(int row=0;row<arr3.length;row++) {
				for(int col=0;col<arr3[row].length;col++) {
					if(arr3[row][col].equals(star)) {
						arr3[row][col]="★";
					}
				}
			}
			for(int row=0;row<arr3.length;row++) {
				for(int col=0;col<arr3[row].length;col++) {
					System.out.printf("%4s",arr3[row][col]);
				}
				System.out.println();
			}
			//행
			for(int row=0;row<arr3.length;row++) {
				int starInt=0;
				for(int col=0;col<arr3[row].length;col++) {
					if(arr3[row][col].equals("★")) {
						starInt++;
						}
				}
				if(starInt==input) {
					cnt++;
				}
			}
			//열
			for(int row=0;row<arr3.length;row++) {
				int starInt=0;
				for(int col=0;col<arr3[row].length;col++) {
					if(arr3[col][row].equals("★")) {
						starInt++;
						}
				}
				if(starInt==input) {
					cnt++;
				}
			}
			//대각선(왼-오)
			int starInt=0;
			for(int i=0;i<arr3.length;i++) {
				if(arr3[i][i].equals("★")) {
					starInt++;
					}
			}
			if(starInt==input) {
				cnt++;
			}
			
			//대각선(오-왼)
			starInt=0;
			for(int i=0;i<arr3.length;i++) {
				if(arr3[i][input-1-i].equals("★")) {
					starInt++;
					}
			}
			if(starInt==input) {
				cnt++;
			}
			
			System.out.printf("현재 %d빙고\n\n\n",cnt);
		}
		
		
		
		
		
		
		
		
	}
}
