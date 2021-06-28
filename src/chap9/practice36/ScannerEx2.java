package chap9.practice36;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class ScannerEx2 {

	public static void main(String[] args) throws FileNotFoundException {
		File a = new File("data2.txt");
		Scanner sc = new Scanner(a);
		int sum = 0;
		int cnt = 0;
		
		while(sc.hasNextInt()) {
			sum += sc.nextInt();
			cnt++;
		}
		
		System.out.println("sum="+sum);
		System.out.println("average="+(double)sum/cnt);
	}

}
