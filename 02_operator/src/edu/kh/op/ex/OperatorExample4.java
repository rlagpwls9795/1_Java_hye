package edu.kh.op.ex;

public class OperatorExample4 {
	public static void main(String[] args) {
		//논리 연산자 : &&(AND), ||(OR)
		//&& : 둘 다 true이면 true, 나머지는 false
		int a=101;
		boolean result1= a>=100;
		boolean result2= a%2==0;
		System.out.println("a는 100이상이면서 짝수인가? "+ (result1&&result2)); //false
		
		int b=5;
		boolean result3 = b>=1;
		boolean result4 = b<=10;
		System.out.println("b는 1부터 10 사이의 정수인가? "+ (result3 && result4)); //true
		
		//|| : 둘 다 false이면 false, 나머지는 true
		int c=10;
		System.out.println("c는 홀수이거나 10을 초과한 수 인가?");
		System.out.println((c%2==1)||(c>10)); //false
		
		int d=20;
		System.out.println("d는 1 부터 100 사이의 숫자 또는 음수인가?");
		boolean result5 = ((d>=1)&&(d<=100))||(d<0);
		System.out.println(result5); //true
		
		//논리 부정 연산자 !(NOT) : 논리값을 반대로 바꾸는 연산자
		System.out.println("!result5: "+ !result5); //false
		
		int e=3;
		boolean result6=e>=1 && e<5; //true
		boolean result7= e<1 || e>=5; //false
		System.out.println(!result6 == result7); //true
	}

}
