package step4_01.string;

import java.util.Scanner;

/*
 * 
 * # 문자열 비교 메서드 equals();
 * 
 * - 문자열은  == 로 비교하지 않고 equals()메소드를 이용하여 비교한다.
 * 
 * */

public class StringEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "제임스고슬링";
		
		System.out.print("# 이름을 입력하세요 : ");
		String getName = scan.next();
		
		// 비교 불가 
		if (name == getName) System.out.println("(== 연산자) 이름 일치"); // > 연산식으로 비교 불가능 
		else 				 System.out.println("(== 연산자) 이름 불일치");
		
		// 비교 가능 
		if (name.equals(getName)) System.out.println("(equals 매서드) 이름 일치"); // 순서변경되어도 상관없음. name-getName
		else					  System.out.println("(equals 매서드) 이름 불일치"); // 매서드 = 기능 
		
		scan.close();

	}

}
