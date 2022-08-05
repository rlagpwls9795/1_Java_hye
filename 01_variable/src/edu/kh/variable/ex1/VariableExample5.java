package edu.kh.variable.ex1;

public class VariableExample5 {
	public static void main(String[] args) {
		/* 출력 메서드
		 * System.out.print()
		 * ->() 안의 내용 출력 (줄 바꿈 안 함)
		 * System.out.println()
		 * ->() 안의 내용 출력 (줄 바꿈 함)
		 * System.out.printf()
		 */
		
		System.out.print("aaaaa");
		System.out.print("bbbbb");
		System.out.println("ccccc");
		System.out.println("ddddd");

		String name = "김혜진";
		int age = 26;		
		char gender = '여';
		double height = 175.1;
		boolean tf = true;
		
		//김혜진님은 26세 여성, 키는 175.1cm입니다. (true)
		System.out.println(name+"님은 "+age+"세 "+gender+"성, 키는 "+height+"cm입니다. ("+tf+")");
		System.out.printf("%s님은 %d세 %c성, 키는 %.1fcm입니다. (%b)\n" ,name,age,gender,height,tf);
		// \n : 줄바꿈을 표현하는 escape 문자
		
		System.out.println("내가 추가한 내용");
		
		/*주석 
		System.out.println();
		System.out.println();
		*/
	}

}
