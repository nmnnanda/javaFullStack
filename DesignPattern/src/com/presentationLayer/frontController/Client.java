package com.presentationLayer.frontController;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		System.out.println("Enter the request");
		Scanner sc = new Scanner(System.in);
		String request = sc.next();
		frontController.trackRequest(request);

	}

}
