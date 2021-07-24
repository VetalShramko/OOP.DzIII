package dz;

import java.util.Scanner;

public class ScannerStudent {

	public ScannerStudent() {
		super();
	}

	public static Student scanStud() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter student's name");
		String name = sc.nextLine();
		System.out.println("Enter students surname");
		String surname = sc.nextLine();
		System.out.println("Enter student age");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter student gender:(male or female)");
		String gender = sc.nextLine();

		System.out.println("Enter the student's number");
		long studNumber = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the name of the student group");
		String studGroup = sc.nextLine();
		Student student = new Student(name, surname, age, GenderPerson.valueOf(gender), studNumber, studGroup);
		System.out.println(student);
		return student;
	}
}
