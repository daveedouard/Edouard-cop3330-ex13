/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex13;

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();
        System.out.print("Enter the number of years: ");
        double years = input.nextDouble();
        System.out.print("Enter the number of times interest is compunded per year: ");
        double compyears = input.nextDouble();

        double precompinterest = Math.pow((1+((rate/100)/compyears)),(compyears*years));
        double compinterest = principal*precompinterest;

        System.out.print("$"+String.format("%.0f",principal)+" invested at "+rate+"% for "+String.format("%.0f",years)+" years compounded "+String.format("%.0f",compyears)+" times per year is $"+String.format("%.2f",compinterest));
    }
}
