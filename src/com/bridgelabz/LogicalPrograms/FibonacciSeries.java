package com.bridgelabz.LogicalPrograms;

public class FibonacciSeries {
    public static void main(String[] args){
        int a=0, b=1 ;
        System.out.print(a +""+ b);
        for(int i=1; i<=10; i++){
            int c;
            c = a+b;
            System.out.print(""+c);
            a = b;
            b = c;

        }
    }
}
