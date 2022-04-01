package step4_01.string;

/* 
 * # 문자열 관련 메서드( = 기능)
 * 
 * 1. 문자열.length() 							: 문자열의 길이를 반환한다. (반환타입은 int)
 * 2. 문자열.indexOf("문자열") 					: 특정문자열이 포함된 위치를 반환한다.  (반환타입은 int)
 * 3. 문자열.charAt(?번째)      				: 문자열의 ?번째에에 포함된 데이터를 반환한다. (반환 타입은 char)
 * 4. 문자열.substring(index1이상, index2미만)  : 특정문자열의 index1이상 index2미만의 문자열을 잘라서 반환한다. (반환타입은 String)
 *    문자열.substring(index1)  				: 특정문자열의 index1이상부터 끝까지의 문자열을 잘라서 반환한다. (반환타입은 String)
 * 5. 문자열.split("구분자")					: 구분자로 문자열을 잘라서 반환한다. (반환타입은 String 배열)
 * 
 */

public class StringEx03 {

	public static void main(String[] args) {
		
		String str = "megait";
		System.out.println(str);
		
		System.out.println("\n==========================");
		
		// [1] length() : 문자열의 길이
		System.out.println(str.length()); // 배열이랑 헷갈릴 수 있음. 배열은()가 없음. 
		int size = str.length();
		System.out.println(size);
		
		System.out.println("\n==========================");
		
		
		// [2] indexOf("글자") : 글자가 포함된 인덱스 확인
		System.out.println(str.indexOf("m"));
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("g"));
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("t"));
		System.out.println(str.indexOf("mega"));
		System.out.println(str.indexOf("it"));
		
		System.out.println("\n==========================");
		
		
		// [3] charAt(index) : 문자 한개 추출 (인덱싱)
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		char ch = str.charAt(2); // (중요) charAt메서드의 결과는 char 자료형이다. String 아님!
		System.out.println(ch);
		System.out.println(str.charAt(str.length() - 1)); // 6-1 = 5 5번째 글자 > t // 끝의 글자를 나타냄 
		System.out.println();
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();
		
		System.out.println("\n==========================");
		
		
		// [4] substring() : 문자 여러개 추출 (슬라이싱) > 조각 **********매우매우 중요********
		// 4-1) substring(index1이상, index2미만)
		System.out.println(str.substring(0 , 4)); // 끝에 포함하지 않음 > 0,1,2,3
		System.out.println(str.substring(4 , 6)); // > 4,5
		String substr = str.substring(2, 4); // > 2,3
		System.out.println(substr);
		System.out.println();
		
		// 4-2) substring(index1부터 끝까지)
		System.out.println(str.substring(2));
		System.out.println(str.substring(4));
		
		System.out.println("\n==========================");
		
		
		// [5] split("구분자") : 구분자로 잘라내기 
		String str1 = "hello,java"; // > ,로 자름 
		String str2 = "hello java programing";
		String str3 = "hello@java@programing@megait"; // @로 자름
		
		String[] temp = str1.split(","); // >  배열임 
		System.out.println(temp.length);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		
		temp = str2.split(" "); // >  덮어쓰기
		System.out.println(temp.length);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		
		temp = str3.split("@"); // >  @로 덮어쓰기
		System.out.println(temp.length);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		
		System.out.println("\n==========================");
		
		// 참고 ) compareTo(문자열) : 글자 비교 
		
		String data1 = "ac" ;
		String data2 = "dc" ;
		String data3 = "ac" ;
		
		System.out.println(data1.compareTo(data2));  // a < d -  왼쪽값(기준값)이 작을 경우 음수가 반환된다.
		System.out.println(data2.compareTo(data1));  // d < a +  왼쪽값(기준값)이 클 경우 양수가 반환된다.
		System.out.println(data1.compareTo(data3));  // a = a 0  양쪽값이 같을 경우 0이 반환된다.
		
	}

}
