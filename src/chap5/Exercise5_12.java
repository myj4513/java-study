package chap5;

import java.util.*;

public class Exercise5_12 {

	public static void main(String[] args) {
		String[][] words = {
				{"chair", "����"},
				{"computer","��ǻ��"},
				{"integer","����"}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		int counter=0;
		
		for(int i=0;i<words.length;i++) {
			System.out.printf("Q%d. %s�� ����?", i+1, words[i][0]);
			String tmp = scanner.nextLine();
			
			if(tmp.trim().equals(words[i][1])) {
				System.out.println("�����Դϴ�.");
				counter++;
			}else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�.\n", words[i][1]);
			}			
		}
		System.out.printf("��ü %d���� �� %d���� ���߼̽��ϴ�.", words.length, counter);

	}

}
