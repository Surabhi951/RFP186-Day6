package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        int n, sum = 0;
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1; i<n; i++) {
            if (n%i==0) {
                sum = sum + i;
            }
        }
        if(n == sum){
            System.out.print("Number is perfect");
        }

        else{
            System.out.print("Number is not perfect");
        }
    }
}
