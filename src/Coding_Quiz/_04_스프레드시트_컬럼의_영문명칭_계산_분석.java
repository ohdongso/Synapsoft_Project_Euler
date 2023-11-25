package Coding_Quiz;

import java.io.BufferedReader;  
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _04_���������Ʈ_�÷���_������Ī_���_�м� {
	/*
		
	*/
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		int input = Integer.parseInt(br.readLine()); // �Է� �� ==> 100000000
		char[] alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray(); // ���ĺ� �迭
		int restIndex = 0; // ������ �ε���
		String output = ""; // ��� ��
		
		while(input > 0) { // 26���� �Է°��� �������� �� 0�̸� ���� ���ڸ� index���� ������ٴ°� �ǹ�		
			input--;
			
			restIndex = (input % 26);
			input /= 26; // �Է°��� 26���� ������ �� 0�̸� ���� ���ڸ� index���� ���Ѱ��̰�, 0�� �ƴϸ� ���ڸ� index�� �ٽ� �����ؾ��Ѵ�.
			output += alphabets[restIndex];
		} // while�� ��.
		
		StringBuffer sb = new StringBuffer(output);
		bw.write(sb.reverse().toString());
		
		bw.flush();
		bw.close();
		br.close();
	}
}