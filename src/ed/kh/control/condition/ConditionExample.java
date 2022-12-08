package ed.kh.control.condition;

import java.util.Scanner;

public class ConditionExample { // 기능 정의용 클래스
	
	public void ex1() {
		// if문
		// - 조건식이 true 일 때만 내부 코드 수행
		/*
		 * [작성법]
		 *  if(조건식) {
		 *       조건식이 true일 때 수행될 코드
		 *       
		 *  }
		 *  
		 *  if - else 문
		 *  - 조건식 결과가 true면 if문,
		 *   false면 else 구문이 수행됨.
		 *   
		 * [작성법]
		 *  if(조건식) {
		 *        조건식이 true일 때 수행될 코드
		 *  } else   {
		 *        조건식이 false일 때 수행될 코드
		 *  }
		 *   
		 * 
		 */
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 입력된 정수가 양수인지 검사 
		
		if( input > 0 ) {
			System.out.println("양수입니다.");
		} else if (input <= 0 ){
			System.out.println("양수가 아닙니다.");
		}
		
		
		/*if( input <= 0) {
			System.out.println("양수가 아닙니다.");
		}
		*/
	}
	
	public void ex2() {
		//홀짝 검사
		
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("양의 정수 입력 : ");
	    int input = sc.nextInt();
	    
	    
	    if ( input % 2 == 0) {
	    	
	    	System.out.println("짝수입니다.");
	    	
	    }else {
	    	System.out.println("홀수입니다.");
	    } 
	    
	}

}
