package com.bridgelabz.junitProgram;

import java.util.Scanner;

public class Util {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        dayOfWeek();
        System.out.println("enter decimal number : " );
        toBinary(sc.nextInt());
        temperatureConversion();
        monthlyPayment();
        sqrt();
    }

    static void dayOfWeek(){
 //       Scanner sc = new Scanner(System.in);
        System.out.println("Enter month");
        int m = sc.nextInt();
        System.out.println("Enter day");
        int d = sc.nextInt();
        System.out.println("Enter year");
        int y = sc.nextInt();
        System.out.println();

        int y0 = y -(14-m)/12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m+12*((14-m)/12)-2;
        int d0=(d+x+31*m0/12)%7;

        if (d0 == 0) {
            System.out.println("Sunday");
        } else if (d0 == 1) {
            System.out.println("Monday");
        } else if (d0 == 2) {
            System.out.println("Tuesday");
        } else if (d0 == 3) {
            System.out.println("Wednesday");
        } else if (d0 == 4) {
            System.out.println("Thursday");
        } else if (d0 == 5) {
            System.out.println("Friday");
        } else {
            System.out.println("Saturday");
        }

    }

    static void toBinary(int numDecimal) {
        int[] numBinary = new int[100];
        int count = 0;
        while (numDecimal > 0) {
            int rem = numDecimal % 2;
            numDecimal = numDecimal / 2;

            numBinary[count] = rem;
            count++;
        }

        int number = 0;
        for (int i = count - 1; i >= 0; i--) {
            number = number * 10 + numBinary[i];
        }
        System.out.println("binary : " + number);

        int r = number % 10000;
        int l = number / 10000;
        int binary1 = r * 10000 + l;
        System.out.println("after Swapping : " + binary1);

        int decimal = 0;
        int n = 0;
        while(true){
            if(binary1 == 0){
                break;
            } else {
                int temp = binary1%10;
                decimal += temp*Math.pow(2, n);
                binary1 = binary1/10;
                n++;
            }
        }
        System.out.println("decimal after swapping : "+decimal);
    }


    static void temperatureConversion(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Press (F or f) to covert from fahrenheit to Celsius or Press (C or c) to convert from Celsius to fahrenheit :");
        char ch = scr.next().charAt(0);

        if (ch =='f'|| ch=='F'){
            System.out.println("Enter the temperature to convert from fahrenheit to Celsius");
            double f = scr.nextDouble();
            double c = (f-32)*5/9;
            System.out.println(f + " degree fahrenheit is " +c+ " degree Celsius" );
        }
        else if (ch =='c'|| ch=='C') {
            System.out.println("Enter the temperature to convert from Celsius to fahrenheit");
            double c = scr.nextDouble();
            double f = (c*9/5)+32;
            System.out.println(c + " degree  Celsius  is " +f+ " degree fahrenheit" );
        }
    }

    static void monthlyPayment(){
        double p,y,r;
        System.out.print("Enter loan amount : ");
        p=sc.nextInt();
        System.out.print("years to pay : " );
        y=sc.nextInt();
        System.out.print("percent interest : ");
        r=sc.nextInt();

        double n=12*y;
        double r1=r/(12*100);
        double payment= p*r/(1-(Math.pow((1+r1),(-n))));

        System.out.println("monthly Payment = "+payment);
    }

    static void sqrt(){
        System.out.println("Enter the number to compute sqrt");
        int num = sc.nextInt();
        double epsilon = 1E-15;
        double t=num;
        while(Math.abs(t-num/t) > epsilon*t)
            t=(num/t+t)/2;
        System.out.println(t);

    }
}
