package com.uk;

import java.util.Scanner;

public class MainException {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an ammount");
        int a = sc.nextInt();
        try {
            if(a>5000) {
                throw new MyException("Greater than 5000");
            }
            else if(a<4000) {
                System.out.println("less than 5000");
            }
            else {
                System.out.println(" Thank You");
                }
    
           
            
            }
catch(MyException ce ) {
            
            System.out.println("Please enter valid amount");
        }
        
        }

	}
	

