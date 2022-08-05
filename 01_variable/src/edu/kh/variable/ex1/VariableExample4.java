package edu.kh.variable.ex1;

public class VariableExample4 {
	public static void main(String[] args) {
		
		/* 형 변환(Casting) : 값의 자료형을 변환하는 것
		 * 형 변환은 왜 필요한가?
		 * ->컴퓨터의 값 처리 원칙을 위배하는 경우 이를 해결하기 위해
		 * 
		 * 자동 형 변환
		 * - 자료형의 [값의 범위]가 서로 다른 두 값의 연산 시
		 * [컴파일러(번역기)]가 자동으로 [값의 범위]가 작은 자료형을 큰 자료형으로 변환 
		 */
		
		//자동 형 변환 확인
		//1)
		int num1=10;
		long num2=100L;
		System.out.println("num1+num2="+(num1+num2)); 
		
		//2)
		int num3=300;
		double num4=1.1;
//		int result=num3+num4; //Type mismatch: cannot convert from double to int : 변환 불가
		// int = int + double 
		// int = double 
		
		double result=num3+num4;
	
		System.out.println("num3+num4="+result); 
		
		//3) char->int
		int num5='a'; //대입도 연산임
		//int = char
		System.out.println("num5="+num5); //num5=97
		
		char ch =97; //예외 (큰->작은 쪽으로 자동 형 변환)
		System.out.println("ch="+ch); //ch=a
		
		char ch2='백';
		int result2 = ch2;
		System.out.println(ch2+" Unicode Number : "+result2);
		
		System.out.println("-------------------------");
		
		//강제 형 변환 확인
		System.out.println("*** 강제 형 변환 ***");
		
		//1)
		double temp = 3.14;
//		int result3 = temp; //값의 범위가 큰 double -> int 형 변환 ==>자동 불가
		int result3 = (int)temp; //강제
		System.out.println("result3="+result3); //3 (소수점 버림 처리)
		
		//2)
		int temp2=290;
		byte result4=(byte)temp2;
		System.out.println("result4="+result4); //34 (앞의 자료 손실)
		
		//강제 형 변환의 다른 사용 예시
		//**강제 형 변환은 값의 범위 관계 없이 원하는 자료형으로 변환 가능**
		int iNum1=1;
		int iNum2=2;
		System.out.println(iNum1/iNum2); //int / int = int  ==> 0
		//강제 형 변환과 자동 형 변환 동시에 이용
		System.out.println((double)iNum1/iNum2); //==> 0.5
		
		System.out.println((char)65); //A
		System.out.println((int)'A'); //65
		
	}

}
