package chap11;

import java.util.*;

public class test1 {

	public static void main(String[] args) {
		int list[] = new int[10];
		int index = 3;
		
		list[0] = 1;
		list[1] = 2;
		list[2] = 3;
		list[3] = 4;
		list[4] = 5;
		list[5] = 6;
		print(list);
		System.arraycopy(list, index, list, index+1, list.length-index-1);
		print(list);
	}
	
	public static void print(int[] list) {
		System.out.print("[");
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]);
		}
		System.out.println("]");
	}

}
