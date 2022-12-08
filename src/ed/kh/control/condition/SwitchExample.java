package ed.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {
	
	/*
	 * switch문
	 * - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문.
	 * -> 식의 결과로 얻은 값과 같은 case 구문이 실행된다. 
	 * 
	 * [작성법]
	 * 
	 * switch(식) { 
	 * 
	 *    case 결과값1 : 수행코드1; break;
	 *    case 결과값2 : 수행코드2; break;
	 *    case 결과값3 : 수행코드3: break;
	 *    ...
	 *    default : case를 모두 만족하지 않을 경우 수행하는 코드 ( == else )
	 *    
	 * }
	 * 
	 */
	
	public void ex1() {
		/* 
		 * 키보드로 정수를 입력받아
		 * 1 이면 "빨강색"
		 * 2 이면 "주황색"
		 * 3 이면 "노란색"
		 * 4 이면 "초록색"
		 * 1~4 사이 숫자가 아니면 "흰색" 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String result;
		
		/*
		if(input == 1) {
			result = "빨강";
		} else if(input == 2) {
			result = "주황";
		} else if(input == 3) {
			result = "노랑";
		} else if(input == 4) {
			result = "초록";
		} else {
			result = "흰색";	
		}
		
		System.out.println(result);
		*/
		
		switch(input) {
		
		case 1 : result = "빨강"; break;
		case 2 : result = "주황"; break;
		case 3 : result = "노랑"; break;
		case 4 : result = "초록"; break;
		default : result = "흰색";
		
		}
		
		System.out.println(result);
	}
	
	public void ex2() {
		
		//탈 입력 시 계절 판별 (switch 버전)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달을 입력하세요 : ");
		int month = sc.nextInt();
		
		String result;
		
		switch(month) {
		
		case 1 : case 2 : case 12 : result = "겨울"; break;	
		case 3 : case 4 : case 5 : result = "봄"; break;
		case 6 : case 7 : case 8 : result = "여름"; break;
		case 9 : case 10 : case 11 : result = "가을"; break;
			
		default : result = "해당하는 계절이 없습니다.";
		
		}
		
		System.out.println(result);
	
	}
	
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		
		// 정수 1, 정수2, 연산자( + - * / % )
		// 입력 받아서 결과 출력
		System.out.print("정수1을 입력하시오 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2를 입력하시오 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력하시오(+ - * / % 중 입력) : ");
		String op = sc.next();

		switch(op) {
		
		case "+" : System.out.printf("%d + %d = %d\n", num1, num2, num1+num2); break;
		case "*" : System.out.printf("%d * %d = %d\n", num1, num2, num1*num2); break;
		case "%" : if(num2 == 0) {
			
			System.out.println("분모에 0을 넣을 수 없습니다."); break;
		} else {
			System.out.printf("%d %% %d = %d\n", num1, num2, num1%num2); break;
		}
		case "-" : System.out.printf("%d - %d = %d\n", num1, num2, num1-num2); break;
		case "/" : if(num2 == 0) {
	
			System.out.println("분모에 0을 넣을 수 없습니다."); break;
		
		} else {
			System.out.printf("%d / %d = %d\n", num1, num2, num1/num2); break;
		}
		default : System.out.println("올바른 연산자를 입력하시오");
		
		}
	}

}
