package Coding_Quiz;

import java.io.BufferedReader;  
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _04_스프레드시트_컬럼의_영문명칭_계산_분석 {
	/*
		
	*/
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		int input = Integer.parseInt(br.readLine()); // 입력 값 ==> 100000000
		char[] alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray(); // 알파벳 배열
		int restIndex = 0; // 나머지 인덱스
		String output = ""; // 출력 값
		
		while(input > 0) { // 26으로 입력값을 나누었을 때 0이면 제일 앞자리 index까지 구해줬다는걸 의미		
			input--;
			
			restIndex = (input % 26);
			input /= 26; // 입력값을 26으로 나눴을 때 0이면 제일 앞자리 index까지 구한것이고, 0이 아니면 뒷자리 index를 다시 추출해야한다.
			output += alphabets[restIndex];
		} // while문 끝.
		
		StringBuffer sb = new StringBuffer(output);
		bw.write(sb.reverse().toString());
		
		bw.flush();
		bw.close();
		br.close();
	}
}