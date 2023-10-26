package Coding_Quiz;

import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _04_���������Ʈ_�÷���_������Ī_��� {
	/*
	 	* ���� Coding Quiz 4(���������Ʈ �÷��� ������Ī ���)
		
		* Ǯ������
		���̳�����Ʈ�� ���ڹ��� ����������� ���� �� ���� ���߰� ���� ���� ���� 4�� ������ �����߽��ϴ�.
		������ 9���� ������ �ذ��� ���ڽ��ϴ�. �����մϴ�.
	*/
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		int input = Integer.parseInt(br.readLine()); // �Է� �� ==> 100000000
		char[] alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray(); // ���ĺ� �迭
		int restIndex = 0; // ������ �ε���
		String output = ""; // ��� ��
		
		while(input > 0) {
			restIndex = (input % 26) - 1;
			input /= 26;
			output += alphabets[restIndex];
		} // while�� ��.
		
		StringBuffer sb = new StringBuffer(output);
		bw.write(sb.reverse().toString());
		
		bw.flush();
		bw.close();
		br.close();
	}
}