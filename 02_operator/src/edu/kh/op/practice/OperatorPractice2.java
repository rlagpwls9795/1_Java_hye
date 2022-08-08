package edu.kh.op.practice;
import java.util.Scanner;

public class OperatorPractice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년(정수) : ");
		int a = sc.nextInt();
		System.out.print("반(정수) : ");
		int b = sc.nextInt();
		System.out.print("번호(정수) : ");
		int c = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.nextLine();
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double d = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.",a,b,c,name,gender,d);
		
		//nextLine()은 신중히 사용. 버퍼 맨 앞에 \n가 남아있을 시 더 이상 입력받지 못하고 넘어간다. 
		//\n 이 남는 경우 : next(), nextInt(), nextDouble() 등 (nextLine() 제외 거의 모두)
		//==> 사이에 sc.nextLine(); 작성하면 해결. (입력 버퍼 청소하기)
		
	}

}
