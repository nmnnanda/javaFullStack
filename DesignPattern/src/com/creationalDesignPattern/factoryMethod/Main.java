package com.creationalDesignPattern.factoryMethod;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the service which needs to be activated");
		String serviceName = sc.nextLine();
		NotificationManager manager = new NotificationManager();
		
		Notification notification = manager.createNotification(serviceName);
        notification.userNotification();
	}

}
