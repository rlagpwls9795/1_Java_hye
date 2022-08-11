package edu.kh.array.ex;

public class ArrayExample {
	/* [배열] 
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것
	 * - 묶여진 변수들은 하나의 이름(배열명)으로 불러지고 각 변수들은 index를 이용하여 구분
	 */
	public void ex1() {
		int num1=10;
		int num2=20;
		int num3=30;
		int num4=40;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		int sum=num1+num2+num3+num4;
		System.out.println("합계 : "+sum);
		
		//배열이용
		int[] arr=new int[4]; //int형 변수 4개를 묶음으로 다룰 수 있는 배열 생성
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		int sum2=0;
		for(int i=0;i<4;i++) {
			System.out.println(arr[i]);
			sum2+=arr[i];
		}
		System.out.println("합계 : "+sum2);
	}

}
