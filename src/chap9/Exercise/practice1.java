package chap9.Exercise;

import java.util.Arrays;

public class practice1 {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4};
		int[] arrClone = arr.clone();
		
		arr[0] = 100;
		
		System.out.println(arr==arrClone);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		
		String source = "a,b,c,d,e";
		System.out.println(source.replace(",", ""));
		System.out.println(source);
	}

}
