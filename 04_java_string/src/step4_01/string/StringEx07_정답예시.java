package step4_01.string;

import java.util.Arrays;

public class StringEx07_정답예시 {

	public static void main(String[] args) {
		
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3]; // > 배열이 3개 있음 
		int[] score = new int[3];
		
		String[] temp1 = str.split(","); // > temp1은 , 기준으로 나눈다. 
		
		for (int i = 0; i < temp1.length; i++) {
			String[] temp2 = temp1[i].split("/"); // > temp2는 temp1을  / 기준으로 나눈다.
			name[i] = temp2[0]; // > 이름 배열에 temp2의 0번째(이름)를 다 넣는다. 
			score[i] = Integer.parseInt(temp2[1]); // > 점수 배열에 temp2의 1번째(나이)를 숫자로 바꿔서 넣는다. 
		}
		
		System.out.println(Arrays.toString(name)); // > name 배열을 나열 
		System.out.println(Arrays.toString(score)); // > score 배열을 나열 
		



	}

}
