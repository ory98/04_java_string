package step4_01.string;

import java.util.Scanner;

/*
 * 
 * # 문자열 입력
 * 
 *  next() : 공백을 기준으로 한단어만 입력받는다.
 * 
 * */

public class StringEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next(); // 띄어쓰기를 제외한 문자열을 입력받는다. 
		// String name = scan.nextLine(); // 띄어쓰기 가능하지만 버퍼문제 때문에 사용x 
		
		System.out.println("name : " + name);
		
		scan.close();
		
		
		

	}

}
