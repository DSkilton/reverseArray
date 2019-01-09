package com.company;

import com.sun.deploy.util.ArrayUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

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
        int[] list;
        String[] stNew;
        stNew = line.split("");
        list = new int[stNew.length];

        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        line=inp.readLine();

        for (int i = 0; i < list.length; i++ ) {
            list[i] = Integer.parseInt(stNew[i]);
        }

        for (int i = 0; i < list.length / 2; i++) {
            int temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(list));
    }
}
