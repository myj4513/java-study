package chap9.Exercise;

import java.util.*;

public class Exercise9_11 {
	public static void printGugudan(int n) {
		for(int i=1;i<=9;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
	}
	
	public static void getGugudan(int start, int end) {
		for(int i=start;i<=end;i++) {
			printGugudan(i);
			System.out.println();
		}
	}
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �ܰ� �� ��, �ΰ��� ������ �Է����ּ���.");
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		
		getGugudan(start,end);
	}
}
