package com.yash.exceptions_1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		StudentResult sr = new StudentResult();
		System.out.println("WEL-COME TO EXAM PORTAL");
		System.out.println();
		System.out.println("Enter Student Roll NO :");
		s.setRollno(sc.nextInt());
		System.out.println("Enter Student Name :");
		s.setSname(sc.next());
		System.out.println("Enter Studnet Address :");
		s.setSaddress(sc.next());
		System.out.println("Enter Your Math marks :");
		int mathMarks = sc.nextInt();
		try {
			if (mathMarks < 0) {
				throw new ResultException("Negative marks Not Allowed....");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// sr.setMathMarks(sc.nextInt());
		System.out.println("Enter Your Physics marks :");
		int phyMarks = sc.nextInt();
		try {
			if (phyMarks < 0) {
				throw new ResultException("Negative marks Not Allowed....");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Enter Your Chemistry marks :");
		sr.setChemistryMarks(sc.nextInt());
		
		try {
			if(sr.getMathMarks()<40 || sr.getChemistryMarks()<40 || sr.getPhysicsMarks()<40) {
				throw new ResultException("Sorry you are failed in exam...!!!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		s.setSrobj(sr);

		int total = (sr.getMathMarks() + sr.getChemistryMarks() + sr.getPhysicsMarks()) * 100;
		try {
			int avg = total / 300;
			System.out.println("Avg:" + avg);
			if (avg < 40) {
				throw new ResultException("Student Failed....");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
