package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//first input will be length of array and second input will be array which is to be reversed and display with a space
//between numbers, for example:
//5
//12345
//
//would be
//54321

public class Main {

    public static void main(String[] args)throws java.lang.Exception {
        //use the following code to fetch input from console
        String line;

        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        line=inp.readLine();

        int[] list;
        String[] stNew;

        stNew = line.split(" ");
        System.out.println(stNew);

        list = new int[stNew.length];
        System.out.println(list);

        for (int i = 0; i < stNew.length; i++ ){
            list[i] = Integer.parseInt(stNew[i]);

            for (int j = 0; j < list.length +1 / 2; j++) {
                int temp = list[i];
                list[i] = list[list.length - j - 1];
                list[list.length - j - 1] = temp;
            }

        }

        System.out.println(line);

    }
}
