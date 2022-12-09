package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	
	public void ex1() {
		// 1부터 10까지 1씩 증가하며 출력되는 반복문 작성 (for)
		// 단, 5를 출력하면 멈춘다.
		
		for(int i = 1; i <=10; i++) {
			System.out.print(i + " ");
			if(i == 5) {	
				break; //반복 멈충
			}
		}
	}
	
	public void ex2() {
		// 0이 입력될 때까지 모든 정수 합 구하기
	
		Scanner sc = new Scanner(System.in); 
		
		int sum = 0;
		
		while(true) {
			
			System.out.print("값을 입력하세요 : (0입력시 종료)");
			int input = sc.nextInt();
			
			sum += input; 
			
			if(input == 0) {
				break;
			}
			
		}
		
		System.out.println("입력한 정수의 합계는 : " + sum);
		
		
	}

	public void ex3() {
		
		// break : 반복문을 바로 멈춤
		// continue : 다음 반복으로 넘어감
		
		// 3의 배수를 제외하고 1~10 출력
		
		for(int i = 1; i <=10; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

	public void ex4() {
		// 1~100까지 1씩 증가하며 출력하는 반복문 
		// 단, 5의 배수는 건너뛰고, 증가하는 값이 40이 되었을 때 반복 멈춤 
		
		for(int i = 1; i <= 100; i++) {
			
			System.out.println(i);
			
			if(i == 40) {
				break;
			}
			if(i % 5 == 0) {
				continue;
			}
		}
	}
}
