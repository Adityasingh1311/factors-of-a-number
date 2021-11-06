package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main f = new Main();
        f.factor();
        f.factor();
    }
    void factor(){
    Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     System.out.print("factors of "+num+":");
	for(int i=num/2; i>=2; i--){
		if(num%i==0){
			System.out.print(i+ " ");
		}

	}
    }
    }

