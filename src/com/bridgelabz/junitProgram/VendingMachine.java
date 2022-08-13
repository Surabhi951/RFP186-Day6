package com.bridgelabz.junitProgram;

import java.util.Scanner;

public class VendingMachine {
    static int i=0;
    static int total=0;
    static int[] notes = { 1000,500,100,50,10,5,2,1};
    static int money;
    public static int calculate(int money,int[]notes ) {

        if(money==0)
        {
            return -1 ;
        }
        else {
            if(money>=notes[i]) {
                int calNotes =money/notes[i];
                money = money%notes[i];
                total += calNotes;
                System.out.println(notes[i]+   " Notes ---> " +calNotes );
            }
        }
        i++;
        return calculate(money, notes);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Change in Rs to be returned :");
        money =sc.nextInt();
        VendingMachine.calculate(money,notes);
        System.out.println("Minimum notes required :"+total);
    }

}
