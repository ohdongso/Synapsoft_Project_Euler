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
			
			answer += (char)(a + (printChar-1)); //65~90�� A~Z �̶� ���� ����� A�� 1���� �����ϱ⶧����
                                                 //1�� ���༭ ���ڸ� �����!
		}
		
		for(int i = answer.length()-1; i>=0; i--) {
			char a = answer.charAt(i);
			System.out.print(a);
		}
	}
}