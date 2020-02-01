package com.knoldus;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args)
    {
        int currencyCodeOld,currencyCodeNew;
        double amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Currency Converter app");
        System.out.println("\n\nChoose currency code to be converted, from the below list");
        System.out.println("1. USD (U.S. Dollars) \n2.INR (Indian Rupee) \n3.AUD(Australian Dollar");
        currencyCodeOld=scanner.nextInt();

        System.out.println("\n\nChoose currency code to be converted INTO, from the below list");
        System.out.println("1. USD (U.S. Dollars) \n2.INR (Indian Rupee) \n3.AUD(Australian Dollar");
        currencyCodeNew=scanner.nextInt();


        if(currencyCodeOld==currencyCodeNew)
        {
            System.out.println("You chose the same currencies. Value remains the same");
        }
        else
        {
            System.out.println("\n\nEnter the amount to be converted");
            amount=scanner.nextDouble();

            switch(currencyCodeOld)
            {
                case 1: if(currencyCodeNew==2)
                {
                    System.out.println("Amount in rupees : " + amount*71.2);
                }
                else if(currencyCodeNew==3)
                {
                    System.out.println("Amount in australian dollar : " + amount*1.48);
                }
                    break;
                case 2: if(currencyCodeNew==1)
                {
                    System.out.println("Amount in US Dollars : " + amount*0.014);
                }
                else if(currencyCodeNew==3)
                {
                    System.out.println("Amount in australian dollar : " + amount*0.21);
                }
                    break;
                case 3: if(currencyCodeNew==1)
                {
                    System.out.println("Amount in US Dollars : " + amount*0.68);
                }
                else if(currencyCodeNew==2)
                {
                    System.out.println("Amount in rupees : " + amount*48.7);
                }
                    break;
                default:System.out.println("You chose the wrong currency - code - value.");
            }
        }
    }
}