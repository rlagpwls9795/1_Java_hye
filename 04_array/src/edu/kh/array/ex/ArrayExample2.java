package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample2 {
	
	//변수 : 값을 저장하기 위해 메모리 상의 공간을 할당
	// - 1개의 자료형, 1개의 데이터
	
	//1차원 배열 : 자료형이 같은 변수를 묶음으로 다루는 것
	// - 1개의 자료형, n개의 데이터
	
	//2차원 배열 : 자료형이 같은 1차원 배열을 묶음으로 다루는 것 (=1차원 배열 참조 변수의 묶음)
	// - 1개의 자료형, n개의 데이터
	
	public void ex1() {
		//2차원 배열 선언 및 할당
		int[][] arr = new int[2][3];
		
		//인덱스를 이용한 초기화
		arr[0][0]=7;
		arr[0][1]=15;
		arr[0][2]=20;
		arr[1][0]=30;
		arr[1][1]=41;
		arr[1][2]=45;
		
		//2차원 배열 행의 길이
		System.out.println("행 : "+arr.length); 
		//2차원 배열 열의 길이
		System.out.println("열 : "+arr[0].length);
		
		for(int i=0;i<arr.length;i++) { //행
			for(int j=0;j<arr[i].length;j++) { //열
				System.out.printf("%d열 %d행 == %d\n",i,j,arr[i][j]);
			}
		}
	}
	
	public void ex2() {
		//2차원 배열 선언과 동시에 초기화
		char[][] arr= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		Scanner sc = new Scanner(System.in);
		//1. char 입력받기
		System.out.print("검색할 알파벳을 입력해주세요 : ");
//		char input = sc.nextChar(); //Scanner는 char 자료형 입력을 지원하지 않음
		char input = sc.next().charAt(0); //String형 문자열 입력받아 0번째 문자 하나 얻어오기 
		
		boolean flag = true; //true:존재X, false:존재
		//2. 2차원 배열 내 검색
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(input==arr[row][col]) {
					System.out.printf("%c는 %d행 %d열에 존재합니다. \n",input,row,col);
					flag=false;
				} 
			}
		}
		if(flag) {
			System.out.println("일치하는 알파벳이 없습니다.");
		}
	}
	
	public void ex3() {
		int[][] arr = new int[3][3];
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr[i].length-1;j++) {
				int ran=(int)(Math.random()*10);
				arr[i][j]=ran;
				arr[i][arr[i].length-1] += ran;
				arr[arr.length-1][j] += ran;
				arr[arr.length-1][arr[i].length-1] += ran;
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void ex4() {
		//가변 배열 : 2차원 배열 할당 시 마지막 배열 차수(열)의 크기를 지정하지 않고 할당
		//          -> 할당 이후 각 행에 각각의 1차원 배열을 참조하게 만듦
		int[][] arr=new int[5][];
		arr[0]=new int[3]; 
		arr[1]=new int[4]; 
		arr[2]=new int[5]; 
		arr[3]=new int[2]; 
		arr[4]=new int[1];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
