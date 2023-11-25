package Coding_Quiz;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		String answer = "";
		
		while(number > 0) {
			char a = 65;
			
			int printChar = number % 26;
			number /= 26;
			
			answer += (char)(a + (printChar-1)); //65~90이 A~Z 이때 위의 계산은 A는 1부터 시작하기때문에
                                                 //1을 빼줘서 문자를 맞춘다!
		}
		
		for(int i = answer.length()-1; i>=0; i--) {
			char a = answer.charAt(i);
			System.out.print(a);
		}
	}
}