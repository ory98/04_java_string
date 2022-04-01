package step4_01.string;

import java.util.Scanner;

public class StringEx12_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		String[] items = {"사과","바나나","딸기"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];  // 2칸짜리가 100줄 
		int count = 0;
		int identifier = -1; // > i 와 차이를 두기 위해 설정 
		
		while (true) {
			
			System.out.println("-----------------------------");
			System.out.print("상태 : ");
			if ( identifier == -1 ) 		System.out.println("로그아웃");  // > 기본설정 
			else 							System.out.println(ids[identifier] + "로그인");
			System.out.println("-----------------------------");
			
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼    핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종    료");
			
			System.out.print("메뉴 선택 : "); 
			int sel = scan.nextInt();
													// >  여기까지가 계속 반복 됨. 
			
			if(sel == 1) {
				System.out.print("ID: ");
				String myId = scan.next();
				
				System.out.print("PW : ");
				String myPw = scan.next();
				
				for ( int i = 0; i < ids.length; i ++ ) {
					if (myId.equals(ids[i]) && myPw.equals(pws[i])) { // i번째의 아이디와 비번이 같을 때,
						identifier = i; // > 로그인 
					}
				}
				
				if (identifier == -1) 	System.out.println("ID와 PW를 확인해주세요.");
				else 					System.out.println(ids[identifier] +"님, 환영합니다.");
			} // > 로그인 되며 처음 멘트가 다시 나옴 
			
			else if (sel == 2) {
				identifier = -1;
				System.out.println("로그아웃 되었습니다.");
			} // 로그아웃 되며 처음 멘트가 다시 나옴 
			
			else if (sel == 3) {
				if (identifier == -1) { // 로그인을 하지 않았을 경우 반복  
					System.out.println("로그인 후 이용 가능합니다."); 
					continue;
				}
				
				while (true) { // if의 반대 상황일 경우, true
					
					System.out.println("상품목록");
					for(int i=0; i<items.length; i++) System.out.println("[" + (i+1) + "] " + items[i]); // item 배열이 나열 됨. 
					System.out.println("[4]뒤로가기");
					
					System.out.print("상품번호를 선택하세요 : ");
					
					int choice = scan.nextInt();
					
					if ( choice == 4 ) break; // > 4번 누를 경우 반복 끝
					jang[count][0] = identifier; // > 1번째 칸 세로줄에는 회원의 인덱스 번호
					jang[count][1] = choice; 	 // > 2번째 칸 세로줄에는 상품 인덱스가 입력 
					
					count++; // 세로줄이 증가! 
											
				}
											
			}
			else if (sel == 4) {
			
				System.out.println("id : " +  identifier); // > 회원의 인덱스 번호 입력 
				int apple = 0;
				int banana = 0;
				int berry = 0;
				
				for (int i=0; i<count; i++) {
					if (jang[i][0] == identifier) {  // i번째 줄 첫번째 칸이 회원의 인덱스일 경우, 
						if		(jang[i][1] == 1) apple++; // i번째 줄 두번째 칸이 1일 경우 사과수 증가
						else if (jang[i][1] == 2) banana++; // i번째 줄 두번째 칸이 2일 경우 바나나수 증가
						else if (jang[i][1] == 3) berry++; // i번째 줄 두번째 칸이 3일 경우 딸기수 증가
					}
				}
				
				System.out.println(items[0] + " : " + apple + "개");
				System.out.println(items[1] + " : " + banana + "개");
				System.out.println(items[2] + " : " + berry + "개");
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
		scan.close();

	}

}
