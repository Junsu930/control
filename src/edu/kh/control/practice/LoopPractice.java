package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("1 이상의 정수를 입력하시오 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		} else {
			int i = 1;
			while (i <= num) {
				System.out.print(i + " ");
				i++;
			}
		}
	}
	
	public void practice2() {
		
		System.out.print("1 이상의 정수를 입력하시오 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		} else {
			int i = num;
			while (i >= 1) {
				System.out.print(i + " ");
				i--;
			}
		}	
	}
	
	public void practice3() {
		
		System.out.print("정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			
			sum += i;
			
		}
		System.out.println("1부터 정수까지의 합은 : " + sum);
	}

	public void practice4() {
		
		System.out.print("첫 번쨰 숫자를 입력하세요 (1이상의 수를 입력해주세요) : ");
		int num1 = sc.nextInt();
		System.out.print("두 번쨰 숫자를 입력하세요 (1이상의 수를 입력해주세요) : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		} else if(num1 >= num2) {
			
			for(int i = num1; i>=num2; i--) {
				System.out.print(i + " ");
			}
			
		}
		
	}
}
		
