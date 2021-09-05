package com.bridgelabz.commercialprocessing;

import com.bridgelabz.datastructures.LinkedList;
import com.bridgelabz.datastructures.NodeIF;

public class CustomLinkedList<T> extends LinkedList<T> {

	public NodeIF<T> search(String key) {
		NodeIF<T> temp = getHead();
		while (temp != null && !temp.getKey().equals(key)) {
			temp = temp.getNext();
		}
		if (temp == null) {
			System.err.println("Cannot find " + key);
		}
		return temp;
	}
}
