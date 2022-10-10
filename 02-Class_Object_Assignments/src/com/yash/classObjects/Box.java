package com.yash.classObjects;

import java.util.Scanner;

public class Box {
	int height;
	int width;
	int length;
	public Box() {
		// TODO Auto-generated constructor stub
	}
	public Box(int height, int width, int length) {
		super();
		this.height = height;
		this.width = width;
		this.length = length;
	}
	 
	public int volumeOfBox() {
		return height*width*length;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of box :");
		int x = sc.nextInt();
		System.out.println("Enter width of box :");
		int y = sc.nextInt();
		System.out.println("Enter height of box :");
		int z = sc.nextInt();
		Box b=new Box(x,y,z);
		int volumeOfBox = b.volumeOfBox();
		System.out.println("Volume of Box is : "+volumeOfBox);
	}
}
