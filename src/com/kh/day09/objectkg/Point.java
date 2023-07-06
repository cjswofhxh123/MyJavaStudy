package com.kh.day09.objectkg;

import com.kh.day06.oop.objectarray.book;

public class Point {
	private int x, y;

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x : " + this.x + ", y :" + this.y;

	}

	public boolean equals(Object Obj) {
		Point p = (Point) Obj;
		if(x == p.x && y == p.y) {
			return true;
		}else {
			return true;
		}
	}
}