package com.company;
import java.util.*;
public class Main {
    //I             1
    //V             5
    //X             10
    //L             50
    //C             100
    //D             500
    //M             1000
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(romanToInt(sc.next()));
    }
    private static int romanToInt(String s) {
        //given roman numeral up to 3999, return int
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    total++;
                    break;
                case 'V':
                    if (i > 0) {
                        if (s.charAt(i - 1) == 'I') {
                            total += 3;
                            break;
                        }
                    }
                    total += 5;
                    break;
                case 'X':
                    if (i > 0) {
                        if (s.charAt(i - 1) == 'I') {
                            total += 8;
                            break;
                        }
                    }
                    total += 10;
                    break;
                case 'L':
                    if (i > 0) {
                        if (s.charAt(i - 1) == 'X') {
                            total += 30;
                            break;
                        }
                    }
                    total += 50;
                    break;
                case 'C':
                    if (i > 0) {
                        if (s.charAt(i - 1) == 'X') {
                            total += 80;
                            break;
                        }
                    }
                    total += 100;
                    break;
                case 'D':
                    if (i > 0) {
                        if (s.charAt(i - 1) == 'C') {
                            total += 300;
                            break;
                        }
                    }
                    total += 500;
                    break;
                case 'M':
                    if (i > 0) {
                        if (s.charAt(i - 1) == 'C') {
                            total += 800;
                            break;
                        }
                    }
                    total += 1000;
                    break;
            }
        }
        return total;
    }
}
