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
		System.out.print("시작 단과 끝 단, 두개의 정수를 입력해주세요.");
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		
		getGugudan(start,end);
	}
}
