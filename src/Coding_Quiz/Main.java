package Coding_Quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	/*
	 	����
		1, �Է°��� ��� ���� �����ؾ� �Ѵ�.
			-��:"R"�����ε������� "C"�����ε�������
			-��:"C"�����ε������� ����������
		
		����
		1, �Է°��� RnCm����
		2, n��m�� (1<=n<=300000000)���� ���� ����
		3, R0C0�� ������ ��� �̶��� ������� �ʰ� ���α׷��� �����Ѵ�.
	*/
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String input = br.readLine(); // �Է°�
			
			
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
		String output = ""; // ��°�
		String n = ""; // ���ȣ
		int m = 0; // ����ȣ
		int cIndex = 0; // ���� "C"�� �ε���
		
		cIndex = input.indexOf("C");
		n = input.substring(1, cIndex);
		m = Integer.parseInt(input.substring(cIndex + 1));

		if (n.equals("0") && m == 0) {
			return output;
		} else {
			char[] alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray(); // ���ĺ� �迭
			int restIndex = 0; // ������ �ε���
			
			while(m > 0) {
				m--;
				
				restIndex = (m % 26);
				m /= 26; // �Է°��� 26���� ������ �� 0�̸� ���� ���ڸ� index���� ���Ѱ��̰�, 0�� �ƴϸ� ���ڸ� index�� �ٽ� �����ؾ��Ѵ�.
				output += alphabets[restIndex];
			} // while�� ��.
			
			StringBuffer sb = new StringBuffer(output);
			
			return sb.reverse().toString() + n;
		} // else�� ��.
	}
}