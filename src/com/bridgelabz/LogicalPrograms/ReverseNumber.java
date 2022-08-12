package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        int n, rem ,rev = 0;
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n != 0){
            rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        System.out.print(rev);
    }
}
