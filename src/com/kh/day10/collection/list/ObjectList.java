package com.kh.day10.collection.list;

import java.util.Objects;

public class ObjectList {
	Object[] objects;
	int size;

	public ObjectList() {
		objects = new Objects[3];
		size = 0;
	}

	public void add(Object input) {
		// TODO Auto-generated method stub
		objects[size]  = input;
		size++;
	}
	

	public Object get(int index) {
		return objects[index];
	}

	public int size() {
		return size;
	}
	
	public void clear() {
		objects = new Object[3];
		size = 0;
	}
}
