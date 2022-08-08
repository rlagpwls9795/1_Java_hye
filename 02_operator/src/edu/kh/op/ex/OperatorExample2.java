package edu.kh.op.ex;

public class OperatorExample2 {
	public static void main(String[] args) {
		//증감 연산자 ++, -- : 피연산자를 1 증가 또는 감소 시키는 연산자
		
		//전위 연산자 ++a, --a : 1 증가/감소 후 다른 연산 실행
		
		//후위 연산자 a++, a-- : 다른 연산 모두 실행 후 1 증가/감소  
		
		int num1 = 10;
		int num2 = 10;
		
		num1++; //11
		num2--; //9
		
		System.out.println("num1++ = "+num1);
		System.out.println("num2-- = "+num2);
		
		System.out.println("-------------------------------");
		
		//전위 연산
		System.out.println("++num1 + 10 = "+(++num1+10)); //22
		System.out.println("num1 = "+num1); //12
		
		//후위 연산
		System.out.println("num2-- + 10 = "+(num2--+10)); //19
		System.out.println("num2 = "+num2); //8
		
		System.out.println("-------------------------------");
		int a=3;
		int b=5;
		int c=a++ + --b;
		System.out.println("a="+a); //4
		System.out.println("b="+b); //4
		System.out.println("c="+c); //7
		
	}

}
