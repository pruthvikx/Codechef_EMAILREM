package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int totalUsers = scan.nextInt();
        int notToSendUsers = scan.nextInt();
        System.out.println(totalUsers - notToSendUsers);
    }
}
