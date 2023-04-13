package day02;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 변수 : 데이터를 저장하는 공간
		 자료형 : 데이터가 어떤 값인지에 따라 사용하는 값
		 - int : 정수를 표현 : 4byte
		 - float / double : 실수를 표현 : 4byte / 8byte (보통 double로 사용)
		 - char : 문자 표현 : 2byte (= 문자 하나 값)
		 - boolean : True or False
		 기본적으로 byte, short, int, long, float, double, char, boolean가 있다
		 
		 변수 생성
		 - 자료형 변수명; 또는 자료형 변수명 = 값;
		 - 1number(x), n22u11m33(o) 숫자가 맨 앞에 올 수 없다
		 - changenumber => changeNumber, change_number 합성어에 대한 이름은 단어 맨 앞을 대문자로 사용한다
		 - 예약어는 사용할 수 없다 (system, out 등)
		 */
		
		
		int age = 50;
		float height = 150.0f;	//f: float 4byte로 사용하겠다고 선언
		double weight = 20.0;
		
		System.out.println("나의 나이는 50살입니다.");
		System.out.println("나의 나이는 " + age + "살입니다.");
		System.out.println("나의 키는 " + height + "(cm)입니다.");
		System.out.println("나의 몸무게는 " + weight + "(kg)입니다.");
	}
}
