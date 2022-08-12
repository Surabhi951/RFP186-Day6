package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrimeNumber primeNo = new PrimeNumber();
        primeNo.prime(num);

    }

    void prime(int num){
        int count = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.print("Number is prime");
        }
        else{
            System.out.print("Number is not prime");
        }
    }
}
