package com.manyu.innerclasses;

import com.manyu.innerclasses.PolygonTest.Rhombus;
import com.manyu.innerclasses.PolygonTest.Square;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolygonTest pg = new PolygonTest();
		Square sq = pg.new Square();
		sq.printMe();
		
		pg.printMe();
		
		Rhombus r = new Rhombus();
		r.printMe();
	}

}
