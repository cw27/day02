package day02;

public class Ex04 {
	public static void main(String[] args) {
		/*
		 상수 : 한 번 저장하면 변경할 수 없다
		 */
		
		final int num = 100;	//final : 지정하면 값을 더이상 변경할 수 없다
		//num = 200;			//앞에서 final을 붙였기 때문에 값 변경 불가
		
		System.out.println(num);
		
		
		String name = "홍길동";
		System.out.println(name);
		
		final String KOREA = "대한민국";	//언제나 정해진 답이 있는 것, 상수화를 한다, 보편적으로 상수화하는 변수들은 대문자를 사용
		//KOREA = "미국";
		System.out.println(KOREA);
		
		boolean bool = true;
		System.out.println(bool);
		bool = false;
		System.out.println(bool);
		
		String addr;
		addr = "산골짜기";		//변수를 미리 만들어두고 나중에 값을 지정할 수도 있다
		System.out.println(addr);
		
		int n1, n2, sum;
		n1 = 10;
		n2 = 20;
		sum = n1 + n2;
		System.out.println(sum);
		System.out.println(n1 + n2);
		
		int num1 = 0, num2 = 0, sum2 = 0;	//0으로 초기화를 해주어 알 수 없는 값이 들어가지 않도록, 에러를 방지해준다
		sum2 = num1 + num2;
		System.out.println(sum2); 	//아직 sum2에 아무 값도 지정하지 않아서 알 수 없는 값이 들어가 있는 상태(더미값, 쓰레기값)
		
		String a = null;		//첫 번째 글자가 대문자면 null로, 소문자면 0으로 초기화한다
		System.out.println(a);
	}
}
