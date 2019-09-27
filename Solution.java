package com.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Sorting bytes

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> bytes = new ArrayList<Integer>();

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fileName = rd.readLine();
        rd.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            if (!bytes.contains(data)) {
                bytes.add(data);
            }
        }
        fileInputStream.close();

        // sorting ascending
        Collections.sort(bytes);

        for (Integer b : bytes) {
            System.out.print(b + " ");
        }
    }
}
