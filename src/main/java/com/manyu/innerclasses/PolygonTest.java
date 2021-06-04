package com.manyu.innerclasses;

public class PolygonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rhombus r = new Rhombus();
		r.printMe();
	}
	
	public void printMe() {
		System.out.println("Polygon");
	}
	
	public class Square extends PolygonTest{
		
		@Override
		public void printMe() {
			System.out.println("Square");
		}
		
	}
	
	public static class Rhombus{
		public void printMe() {
			System.out.println("Rhombus");
		}
	}

}
