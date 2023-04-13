package day02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		//값을 입력받기 위해서는 이 line의 코드가 필요하다
		int n;
		double dou;
		String str;
		
		System.out.print("수 입력 : ");
		n = input.nextInt();
		System.out.println("입력한 수 : " + n);
		
		System.out.println("실수 입력 : ");
		dou = input.nextDouble();
		System.out.println("입력한 실수 : " + dou);
		
		System.out.print("문자열 입력 : ");
		str = input.next();
		System.out.println("입력한 문자열 : " + str);
	}
}
