package com.prework.assignment;

import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome() {
		String str;
		System.out.println("Enter a string");
		str = sc.next();
		String reversedString = null;
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            reversedString = (reversedString == null) ? str.substring(i, i + 1) : reversedString + str.substring(i, i + 1);
        }
                if(reversedString.equals(str)){
                count++;
            }
        if(count==1){
            System.out.println("The given string is a palindrome");
        }
        else{
        	System.out.println("The given string is not a palindrome");
        }		
        System.out.println();
	}

	// function to printPattern

	public void printPattern() {
      int num3=0,temp=0;
      System.out.println("Enter a number");
      num3 = sc.nextInt();
      temp=num3;
      for (int l=0;l<num3; l++) {
    	  for (int m=temp;m>0;m--) {
    	  System.out.print("*");
      }
    	  temp=temp-1;
      System.out.println();
	}
	}

	// function to check no is prime or not

	public void checkPrimeNumber() {
	  int num = 0,count1=0;
      System.out.println("Enter a number");
      num = sc.nextInt();
      if(num==0||num==1) {
    	  System.out.println("The given number is not a prime number");
      }
      for(int j =2;j<=num;j++) {
    	  if(num%j==0) {
    		 count1++;
    	  }
      }
      if(count1!=1) {
    	  System.out.println("The given number is not prime number");
      }
      else {
    	  System.out.println("The given number is prime number");
      }
		System.out.println();
	}

	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		// initialize the first and second value as 0,1 respectively.

		int first = 0, second = 1, third = 0,num2=0;
		System.out.println("Enter a number");
		num2 = sc.nextInt();
		System.out.print(first+" "+second+" ");
		for(int k=0;k<num2;k++) {
			third = first+second;
			first =second;
		    second = third;
		    System.out.print(third+" ");
		}
		System.out.println();
	}

//main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;

			case 1: {

				obj.checkPalindrome();

			}

				break;

			case 2: {

				obj.printPattern();

			}

				break;

			case 3: {

				obj.checkPrimeNumber();

			}

				break;

			case 4: {

				obj.printFibonacciSeries();

			}

				break;

			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}
