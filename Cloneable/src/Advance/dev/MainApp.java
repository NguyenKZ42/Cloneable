package Advance.dev;

import java.util.Scanner;

public class MainApp {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        try {
	            
	            System.out.println("Nhap ten hoc sinh 1: ");
	            String name = sc.nextLine();
	            System.out.println("Nhap tuoi");
	            int age = sc.nextInt();
	            sc.nextLine();
	            System.out.println("Nhap so");
	            String phone = sc.nextLine();
	            System.out.println("Nhap dia chi");
	            String address = sc.nextLine();
	            System.out.println("Nhap diem");
	            double score = sc.nextDouble();
	            Student std1 = new Student(name , age, address, phone, score);
	            Student std2 = (Student) std1.clone();
	            sc.close();

	            System.out.println("std1: " + std1.toString());
	            System.out.println("std2: " + std2.toString());
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	    }
}
