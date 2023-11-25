package Coding_Quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	/*
	 	문제
		1, 입력값의 행과 열을 추출해야 한다.
			-행:"R"이후인덱스부터 "C"이전인덱스까지
			-열:"C"이후인덱스부터 마지막까지
		
		조건
		1, 입력값은 RnCm형태
		2, n과m은 (1<=n<=300000000)범위 안의 숫자
		3, R0C0의 형태일 경우 이때는 출력하지 않고 프로그램을 종료한다.
	*/
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String input = br.readLine(); // 입력값
			
			
			if(Excel(input).equals("")) {
				break;			
			} else {
				bw.write(Excel(input) + "\n");	
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	} public static String Excel(String input) {
		String output = ""; // 출력값
		String n = ""; // 행번호
		int m = 0; // 열번호
		int cIndex = 0; // 문자 "C"의 인덱스
		
		cIndex = input.indexOf("C");
		n = input.substring(1, cIndex);
		m = Integer.parseInt(input.substring(cIndex + 1));

		if (n.equals("0") && m == 0) {
			return output;
		} else {
			char[] alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray(); // 알파벳 배열
			int restIndex = 0; // 나머지 인덱스
			
			while(m > 0) {
				m--;
				
				restIndex = (m % 26);
				m /= 26; // 입력값을 26으로 나눴을 때 0이면 제일 앞자리 index까지 구한것이고, 0이 아니면 뒷자리 index를 다시 추출해야한다.
				output += alphabets[restIndex];
			} // while문 끝.
			
			StringBuffer sb = new StringBuffer(output);
			
			return sb.reverse().toString() + n;
		} // else문 끝.
	}
}