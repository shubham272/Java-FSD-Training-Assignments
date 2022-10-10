package com.yash.classObjects;

import java.util.Scanner;

public class Patient {
	private String patientName;
	private double height;
	private double weight;

	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public Patient(String patientName, double height, double weight) {
		super();
		this.patientName = patientName;
		this.height = height;
		this.weight = weight;
	}

	public double computeBMI(double weight, double height) {
		return (weight / height * height);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of patient :");
		String x = sc.next();
		System.out.println("Enter weight of patient :");
		double weight = sc.nextDouble();
		System.out.println("Enter height of patient :");
		double height = sc.nextDouble();
		// double d=z*z;

		Patient p = new Patient();
		double bmi = p.computeBMI(weight, height);

		System.out.println("Calculated BMI of " + x + " is " + bmi);

	}
}
