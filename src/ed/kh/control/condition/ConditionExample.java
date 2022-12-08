package ed.kh.control.condition;

import java.util.Scanner;

public class ConditionExample { // 기능 정의용 클래스
	

	Scanner sc = new Scanner(System.in);
	
	
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

	    System.out.print("양의 정수 입력 : ");
	    int input = sc.nextInt();
	    
	    
	    if ( input % 2 == 0) {
	    	
	    	System.out.println("짝수입니다.");
	    	
	    } else {
	    	System.out.println("홀수입니다.");
	    } 
	    
	}
	
	public void ex3() {
		// 달(month)를 입력받아 해달 달에 맞는 계절 출력
	
		System.out.print("달 입력 : ");
		
		int month = sc.nextInt();
		
		// 사용자에게 온도를 받음
		System.out.print("온도 입력 : ");
		int temperature = sc.nextInt();
		
		String season;
		
		// 봄 : 3, 4, 5  
		// 여름 : 6, 7, 8
		// 가울 : 9, 10, 11
		// 겨율 : 12, 1, 2
		
		if (month == 3 || month == 4 || month == 5 ) {
			
			season = "봄";	
			
		}else if (month >= 6 && month <= 8) {
			
			season = "여름\n";
			
			if (temperature >=35) {
				season += "폭염경보";
			}else if (temperature >= 33) {
				season += "폭염주의보";
			}
		
		}else if (month >= 9 && month <= 11) {
			
			season = "가을";
			
		}else if (month == 12 || month == 1 || month == 2) {
			
			season = "겨울";
		}else {
			season = "해당하는 계절 없음";
		}
		
		System.out.println(season);
	}
	
	public void ex4() {
		
		// 나이를 입력받아
		// 13세 이하면 "어린이입니다."
		// 13세 초과 19세 이하면 : "청소년입니다."
		// 19세 초과시 : "성입니다." 출력
		

		System.out.print("나이를 입력하시오 : ");
		int age = sc.nextInt();
		
		if(age>=0 && age<=13) {
			System.out.println("어린이입니다.");
		} else if(age>19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("청소년입니다.");
		}
	}
	
	public void ex5() {
		
		// 점수(100점 만점) 입력받아
		// 90 이상 : A
		// 80 이상 90 미만 : B
		// 70 이상 80 미만 : C
		// 60 이상 70 미만 : D
		// 60 미만 : F
		// 0 미만 , 100 초과 : "잘못 입력하셨습니다."}
		
		System.out.print("점수를 입력하시오 (100점 만점) : ");
		int score = sc.nextInt();
		String grade;
		
		if (score > 100 || score < 0) {
			grade = "잘못 입력하셨습니다.";
		} else if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		} 
		
		System.out.println(grade);

	}
	
	public void ex6() {
		/* 놀이기구 탑승제한 검사
		 * 조건 - 나이 : 12세 이상 
		 *     - 키  : 140.0cm 이상
		 * 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력하셨습니다."
		 * 키를 0~250.0cm 사이로 입력하지 않은 경우 : " 키를 잘못 입력하셨습니다."
		 * -> 입력 되자마자 검사 진행하고 잘못된 경우 프로그램 종료
		 * 
		 * 나이 o , 키 x : "나이는 적절하나 키가 적절치 않음";
		 * 나이 x , 키 o : "키는 적절하나 나이가 적절치 않음";
		 * 나이 x , 키 x : "나이와 키 모두 적절치 않음";
		 * 나이 o , 키 o : "탑승 가능";
		 */
		
		System.out.print("나이를 입력하시오 : ");
		int age = sc.nextInt();
		
		String result; // 결과 담을 변수 언어. 초기화 X
      
		if( age < 0 || age > 100) {
			
			result = "나이를 잘못 입력하셨습니다.";   
		    
		}else {
		    System.out.print("키를 입력하시오 : ");
		    double height = sc.nextDouble();
		    
		    if( height < 0 || height > 250.0 ) {
		    	result = "키를 잘못 입력하셨습니다.";	
		    }else {
		    	//키를 잘 입력한 경우
		    	if(age < 12 && height >= 140.0 ) {
		    		result = "키는 적절하나, 나이가 적절치 않음";
		    	} else if(age >= 12 && height < 140.0) {
		    		result = "나이는 적절하나, 키는 적절치 않음";
		    	} else if (age < 12 && height < 140.0) {
		    		result = "나이와 키 모두 적절치 않음";
		    	} else {
		    		result = "탑승 가능";
		    	}
		    }
		}
		
		System.out.println(result);
	}
}
		

		    		

	
