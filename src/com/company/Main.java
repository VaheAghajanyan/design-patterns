package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
    }

    public static void reverseString(String str) {
        if (str == null) {
            return;
        }

        String[] arr = str.split("");
        int startIndex = 0;
        int endIndex = str.length() - 1;

        while (startIndex < endIndex) {
            String temp = arr[endIndex];
            arr[endIndex--] = arr[startIndex];
            arr[startIndex++] = temp;
        }

        String reversed = String.join("", arr);
        System.out.println(reversed);

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        reversed = sb.toString();
        System.out.println(reversed);
    }

    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        String[] arr = s.split("");
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if ((i < arr.length-1) && (arr[i].equals("I") && (arr[i+1].equals("V") || arr[i+1].equals("X")))) {
                if (arr[i+1].equals("V")) {
                    sum += 4;
                } else {
                    sum += 9;
                }
                i++;
            } else if ((i < arr.length - 1) && (arr[i].equals("X") && (arr[i+1].equals("L") || arr[i+1].equals("C")))) {
                if (arr[i+1].equals("L")) {
                    sum += 40;
                } else {
                    sum += 90;
                }
                i++;
            } else if ((i < arr.length - 1) && (arr[i].equals("C") && (arr[i+1].equals("D") || arr[i+1].equals("M")))) {
                if (arr[i+1].equals("D")) {
                    sum += 400;
                } else {
                    sum += 900;
                }
                i++;
            } else {
                sum += map.get(arr[i]);
            }
        }

        return sum;
    }


}
