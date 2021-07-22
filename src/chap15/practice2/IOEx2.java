package chap15.practice2;

import java.util.Arrays;
import java.io.*;

public class IOEx2 {
    public static void main(String[] args) {
        byte[] inSrc = {1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;
        byte[] temp = new byte[10];

        ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        input.read(temp, 0, temp.length);
        output.write(temp,0,5);

        outSrc = output.toByteArray();

        System.out.println("Input Source : "+Arrays.toString(inSrc));
        System.out.println("temp : "+Arrays.toString(temp));
        System.out.println("Output Source : "+Arrays.toString(outSrc));
    }
}
