package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if( num <= 0 ) {
			System.out.println("양수만 입력해주세요.");
		}else if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
	}

	public void practice2() {

		
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		
		int sum = korean + math + english;
		double avg = sum / 3.0;
		
		
		if(avg >= 60 && korean >= 40 && math >=40 && english >= 40) {
			
			System.out.println("국어 : " + korean );
			System.out.println("수학 : " + math );
			System.out.println("영어 : " + english);
			System.out.println("합계 : " + sum);
			System.out.printf("평균 : %.1f" , avg);
			System.out.println();
			System.out.println("축하합니다, 합격입니다!");
			
		}else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice3() {
		
		System.out.print("달을 입력하세요 (1~12 사이의 정수 입력) : ");
		int month = sc.nextInt();
		
		switch(month) {
		
		case 1 ,3 ,5 ,7, 8, 10, 12 :
			
			System.out.printf("%d월은 31일까지 있습니다.", month); break;
			
		case 4, 6, 9, 11 :
			
			System.out.printf("%d월은 30일까지 있습니다.", month); break;
			
		case 2 :
			
			System.out.printf("%d월은 28일까지 있습니다.", month); break;
			
		default : 
			
			System.out.printf("%d월은 잘못 입력된 달입니다.", month); break;
		}
	}
	
	public void practice4() {
		
		System.out.print("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)을 입력해주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / ( height * height );
		
		System.out.println("BMI 지수 : " + bmi);
		
		
		if ( bmi < 18.5 ) {
			System.out.println("저체중");
		}else if ( bmi >= 30 ) {
			System.out.println("고도비만");
		}else if (bmi >= 18.5 && bmi <23) {
			System.out.println("정상체중");
		}else {
			System.out.println("과체중");
		}
		
		
	}
	
	public void practice5() {
		System.out.print("중간 고사 점수 : ");
		int midterm = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int finalterm = sc.nextInt();
		System.out.print("과제 점수 : ");
		int homework = sc.nextInt();
	    System.out.print("출석 횟수 (/20): ");
	    double check = sc.nextDouble();
	    
	    double midscore = midterm * 0.2 ;
	    double finalscore = finalterm * 0.3 ;
	    double hwscore = homework * 0.3 ;
	    double total = midscore + finalscore + hwscore + check;
	   
	    String result;
	    
	    System.out.println("========== 결과 ==========");
	    
	    if(check > 20 || check < 0) {
	    	result = "출석 횟수를 잘못 입력하였습니다.";
	    }else if(20 - check >= 20 * 0.3){
	    	System.out.printf("출석 횟수 부족(%d/20)", check);
	    }else {
	    	System.out.printf("중간 고사 점수(20) : %.2f" );
	    	System.out.printf("기말 고사 점수(20) : %.2f");
	    	System.out.printf("과제 점수(20) : %.2f");
	    	System.out.printf("출석 점수(20) : %.2f");
	    	System.out.printf("총점 : ");
	    	if(total < 70) {
	    		
	  
	    	}
	    	
	    }
	    
	    
				
	}
}

