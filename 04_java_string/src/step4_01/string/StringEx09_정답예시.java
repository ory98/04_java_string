package step4_01.string;

import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

public class StringEx09_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		// 셔플
		for (int i=0; i<1000; i++) {
			int r = ran.nextInt(words.length);
			
			String temp = words[0]; // > 임시 배열 temp에 [0]번째 단어 넣기   
			words[0] = words[r]; // > 기존[0] 자리에 랜덤 [r] 단어을 넣기 
			words[r] = temp; // > [r]자리에 [0] 단어를 넣고  
		}
		
		int i = 0;
		while (i < words.length) {
			
			System.out.println("문제 " + "[" + (i+1) + "]" + words[i]);
			
			System.out.print("입력 : ");
			String myWord = scan.next();
			
			if (words[i].equals(myWord)) {
				i += 1; // 정답이 맞을 때 i가 하나 증가 > 문제2
			}
			
		}
		
		scan.close();

	}

}
