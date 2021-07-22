package chap15.practice4;

import java.io.*;
import java.util.Arrays;

public class IOEx4 {
    public static void main(String[] args) {
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;
        byte[] temp = new byte[4];

        System.out.println("Input Source : "+ Arrays.toString(inSrc));

        ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try{
            while(input.available()>0){
                int len = input.read(temp);
                output.write(temp, 0, len);

                outSrc = output.toByteArray();
                printArrays(temp, outSrc);
            }
        } catch(IOException e){}
    }

    static void printArrays(byte[] temp, byte[] outSrc){
        System.out.println("temp : "+Arrays.toString(temp));
        System.out.println("outSrc : "+Arrays.toString(outSrc));
    }
}
