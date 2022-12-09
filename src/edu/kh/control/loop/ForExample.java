package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	

	Scanner sc = new Scanner(System.in);

	/* for문
	 * - 끝이 정해져 있는 (횟수가 정해져있는) 반복문
	 * - 조건에 따라 한 번도 수행되지 않을 수 있음
	 * 
	 * [작성법]
	 * 
	 * for(초기식; 조건식; 증감식) {
	 *  
	 *       반복 수행할 코드
	 *       
	 * }    
	 * 
	 * - 초기식 : for문을 제어하는 용도의 변수 선언 
	 * 
	 * - 조건식 : for문의 반복 여부를 지정하는 식 ( 다음 반복 진행? )
	 *          보통 초기식에 사용된 변수를 이용하여 조건식을 작성함. 
	 *          
	 * - 증감식 : 초기식에 사용된 변수를 
	 *          for문이 끝날 때마다 증가 or 감소시켜
	 *          조건식의 결과를 변하게 하는 식
	 */
	
	public void ex1() {
		// 1~10 출력
		
		// i는 인덱스의 줄임말 
		
		for (int i = 1; i <=10; i++) { 
			//1) 초기식   2)조건식  3)증감식
			System.out.println( "i :" + i );
			// 반복 수행될 코드
		}
		
	}
	
	public void ex2() {
		// 3에서 7까지 1씩 증가하며 출력
		
		for (int i = 3; i <=7; i++) {
			
			System.out.println(i);
		}
		
	}
	
	public void ex3() {
		// 1부터 (입력받은 수)까지 1씩 증가하며 출력
		
		
		System.out.print("반복할 수를 입력하시오 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <=num; i++) {
			
			System.out.println("출력: " + i);
		}
		
	}
	
	public void ex4() {
		//1.0부터 입력받은 실수까지 0.5씩 증가하며 출력
		System.out.print("실수를 입력하시오 : ");
		
		double input = sc.nextDouble();
		
		for (double i= 1.0; i<= input; i+=0.5) {
			
			System.out.println(" 출력 : " + i);
			
		}
	}
	
	public void ex5() {
		// 영어 알파벳 A부터 Z까지 한줄로 출력
		// **char 자료형은 ? 00 코드
		
		for(int i = 'A' ; i <= 'Z'; i++) {
			
			System.out.print((char)i);
		}
		
		System.out.println("");
		
		for (char j= 'A'; j <= 'Z'; j++) {
			
			System.out.print(j);
		}
		
	}
	
	public void ex6() {
		// 응용문제!
		// 1부터 10까지 모든 정수의 합 구하기
		
		int sum = 0; // 반복되어 증가되는 i값의 합계를 저장할 변수 
				 	 // 0으로 시작되는 이유 : 아무것도 더하지 않음으로
					 // 				 정확히 결과를 도출  
		
		for (int i =1; i<=10 ; i ++) {
			
			sum += i;	
			
			// sum = sum + i;
		}
		
		System.out.println("합계 : " + sum);

	}
	
	public void ex7() {
		
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 5의 배수에 () 를 붙여서 출력
		// ex) 1 2 3 4 (5) 6 7 8 9 (10) 11 ..
		

		for (int i = 1; i <= 20; i ++) {
			
			if(i%5==0) {
				
				System.out.print("(" +  i + ") ");
				
			}else {
				
				System.out.print(i + " ");
				
			}
			
		}
	}
	

	public void ex8() { 
		//구구단 모두 출력하기
		
		for(int dan = 2; dan <= 9; dan++) { // 2 ~ 9 단까지 차례대로 증간
			
			for(int su=1; su<= 9; su ++) { // 각 단에 곱해질 수 1~9까지 차례대로 증가
			
				System.out.printf("%2d X %2d = %2d", dan, su, dan * su);
			}
			
			System.out.println(); //줄바꿈
			
		}
		
	}
	
	public void ex9() {
		// 구구단 역순 출력
		// 9단부터 2단까지 
		// 곱해지는 수는 1~9까지
		
		for (int dan = 9; dan >= 2; dan--) {
			for (int su = 1; su <= 9; su ++) {
				System.out.printf("%2d X %2d = %2d", dan, su, dan*su);
			}
			System.out.println(); // 줄바꿈
		}
	}
	
	public void ex10() {
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345
		
		for(int i =1; i <=5; i++) {  // 5바퀴 반복
			for(int j = 1; j <= 5; j++) { // 12345 한줄 출력 for문
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void ex11() {
		//54321
		//54321
		//54321
		
		for(int i =1; i <=3; i++) {
			for(int j = 5; j >=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void ex12() { 
		// 1
		// 12
		// 123
		// 1234
		// ==========
		// 4321
		// 321
		// 21
		// 1
		
		for(int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("==================");
	
		for(int k = 4; k >= 1; k--) {
			for (int l = k; l>=1; l--) {
				System.out.print(l);
			}
			 System.out.println();
			 
		}
	}
	
	public void ex13() {
		
	}
		
}

