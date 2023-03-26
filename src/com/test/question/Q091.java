package com.test.question;

import java.util.Scanner;

public class Q091 {

	public static void main(String[] args) {
//		요구사항
//		연산식을 입력받아 실제 연산을 하시오.
//
//		조건..
//		산술 연산자만 구현하시오.(+, -, *, /, %)
//		연산식의 공백은 자유롭게 입력 가능합니다.
//		산술 연산자가 반드시 존재하는지 체크하시오.
//		피연산자의 갯수가 2개인지 체크하시오. //
		Scanner scan = new Scanner(System.in);
		System.out.printf("입력: ");
		String line = scan.nextLine();
		// 연산자도 escape가 필요하다.
		// 123+ 을 +으로 스플릿하면 123만 나온다.
		String[] ops = { "+", "-", "*", "/", "%" };

		// 1. 산술 연산자가 존재하는지 여부를 체크, 존재하면 그것을 반환
		// 연산자가 올바르지 않습니다.
		// 연산자가 존재하지 않습니다.
		String op = checkOperator(ops, line);
		
		if(op=="") { // 연산자가 매칭 x
			System.out.println("연산자가 올바르지 않습니다.");
			scan.close();
			return;
			
		} else {    // 연산자가 매칭
			                           //String regex에서 연산자가 들어갈 때는 //를 붙여서 escape한다.
			String[] operand = line.split("\\"+op);
			
			if( operand.length!=2 ) 
				System.out.println("피연산자가 부족합니다.");
			
			else {
				int a = Integer.parseInt(operand[0].trim());
				int b = Integer.parseInt(operand[1].trim());
				
				
				switch (op) {
					case "+":
						System.out.printf("%d + %d = %d\n", a, b, a + b);
						break;
					case "-":
						System.out.printf("%d - %d = %d\n", a, b, a - b);
						break;
					case "*":
						System.out.printf("%d * %d = %d\n", a, b, a * b);
						break;
					case "/":
						System.out.printf("%d / %d = %.1f\n", a, b, (double)a / b);
						break;
					case "%":
						System.out.printf("%d %% %d = %d\n", a, b, a % b);
						break;
				
				}
			}
		}

		scan.close();
	}

	public static String checkOperator(String[] ops, String line) {
		String op="";
		for(int i=0; i<ops.length; i++) {
			if (line.contains(ops[i])) {
				op = ops[i];
				return op;
			}
		}
		return "";
	}

}

