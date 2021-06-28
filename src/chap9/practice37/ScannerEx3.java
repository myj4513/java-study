package chap9.practice37;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScannerEx3 {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("data3.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int cnt=0;
		int totalSum=0;
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(",");
			int sum = 0;
			
			while(sc2.hasNextInt()) {
				sum += sc2.nextInt();
			}
			System.out.println(line+", sum="+sum);
			totalSum += sum;
			cnt++;
		}
		System.out.println("Line:"+cnt+", Total: "+totalSum);
	}

}
