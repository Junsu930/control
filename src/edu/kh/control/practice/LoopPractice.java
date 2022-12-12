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
			for(int i = num2; i<=num1; i++) {
				System.out.print(i + " ");
			} 
			
		}else {
			for(int i = num1; i<= num2; i++) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice5() {
		
		System.out.print("구구단의 단수를 입력하시오 : ");
		int dan = sc.nextInt();
		
		if( dan <= 0 ) {
			System.out.println(" 1 이상의 수를 입력하세요 ");
		}else {
			System.out.println("=====" + dan + "단 =====");
			for (int su=1; su<=9; su++) {
				
				System.out.printf("%d * %d = %d\n", dan, su, dan*su);
			}
		}
	}

	public void practice6() {
	
		System.out.print("구구단의 단수를 입력하세요 : (2~9까지)");
		int input = sc.nextInt();
		
		if(input<2 || input > 9) {
			System.out.println("2~9 사이 숫자만 입력해주세요");
		}else {
			for(int dan=input; dan<=9; dan++) {
				System.out.println("=====" + dan + "단 =====");
				for(int su=1; su<=9; su++) {
					System.out.printf("%d * %d = %d\n", dan, su, dan*su);
				}
			}
		}
	}

	public void practice7() {
		
		System.out.print("양의 정수를 입력하시오 :");
		int input = sc.nextInt();
		
		for(int i=1; i<=input; i++) {
			
			for(int j = 1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		
		System.out.print("양의 정수를 입력하시오 :");
		int input = sc.nextInt();
		
		for(int i=1; i<=input; i++){
			
			for(int j=i; j<=input; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice9() {
		
		System.out.print("자연수 하나 입력하시오 : ");
		int input = sc.nextInt();
		int num = 0;
		
		for(int i = 1; i <= input; i++) {
			if( i%2 == 0 || i%3 == 0) {
				System.out.print(i + " ");
				if( i%2 == 0 && i%3 ==0) {
				num++;
				}
			}
		}
		System.out.println();
		System.out.println("count : " + num );
	}
	
	public void practice10() {
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= input; i++) {
			for(int j = i; j < input + i ; j++) {
				if(j<input) {
					System.out.print(" ");	
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void practice11() {
		
		System.out.print("정수를 입력하시오 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input*2-1; i ++ ) {
			if( i <= input) {
				for(int j = 1; j <= i; j++){
					System.out.print("*");
				}
			} else {
				for(int k = 1; k <= input*2-i; k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void practice12() {
		
		System.out.print("정수를 입력하시오 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i<=input; i++) {
			for(int j = 1 ; j < input + i; j++) {
				if(j <= input - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	/*public void practice12() {
		
		System.out.print("정수를 입력하시오 : ");
		int input = sc.nextInt();
		for(int row =1; row <= input; row++) {		
			for(int col = 1; col <= input*2-1; col++) {
			if(input-row>=col || input+row<=col) {
				System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
		}
	}
	*/
	
	public void practice13() {
		
		System.out.print("정수를 입력하시오 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <=input; i++) {
			if(i==1 || i==input) {
				for(int j = 1; j <= input; j++) {
					System.out.print("*");
				}
			}else {
				for(int k = 1; k<=input; k++) {
					if (k == 1 || k == input) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
		
