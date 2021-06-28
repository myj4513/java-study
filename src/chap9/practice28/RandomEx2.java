package chap9.practice28;

import java.util.*;

public class RandomEx2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] number = new int[100];
		int[] counter = new int[10];
		
		for(int i=0;i<number.length;i++) {
			//System.out.println(number[i] = (int)(Math.random()*10));
			System.out.print(number[i] = rand.nextInt(10));
		}
		System.out.println();
		for(int i=0;i<number.length;i++) {
			counter[number[i]]++;
		}
		for(int i=0;i<counter.length;i++) {
			System.out.println(i+"ÀÇ °³¼ö"+printGraph('#',counter[i])+" "+counter[i]);
		}
	}
	
	public static String printGraph(char ch, int k) {
		String result ="";
		for(int i=0;i<k;i++) {
			result += ch;
		}
		return result;
	}

}
