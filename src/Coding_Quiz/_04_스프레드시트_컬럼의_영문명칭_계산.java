package Coding_Quiz;

import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _04_스프레드시트_컬럼의_영문명칭_계산 {
	/*
	 	* 문제 Coding Quiz 4(스프레드시트 컬럼의 영문명칭 계산)
		
		* 풀이이유
		사이냅소프트는 전자문서 전문기업으로 퀴즈 중 문서 개발과 가장 관련 깊은 4번 문제를 선택했습니다.
		나머지 9개의 문제도 해결해 보겠습니다. 감사합니다.
	*/
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		int input = Integer.parseInt(br.readLine()); // 입력 값 ==> 100000000
		char[] alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray(); // 알파벳 배열
		int restIndex = 0; // 나머지 인덱스
		String output = ""; // 출력 값
		
		while(input > 0) {
			restIndex = (input % 26) - 1;
			input /= 26;
			output += alphabets[restIndex];
		} // while문 끝.
		
		StringBuffer sb = new StringBuffer(output);
		bw.write(sb.reverse().toString());
		
		bw.flush();
		bw.close();
		br.close();
	}
}