package com.java.list;

import java.util.LinkedList;

public class MyLinkedList {

	/**
 B:LinkedList�����й���
	* public void addFirst(E e)��addLast(E e)
	* public E getFirst()��getLast()
	* public E removeFirst()��public E removeLast()
	* public E get(int index);
	 */
	public static void main(String[] args) {
		LinkedList li = new LinkedList<>();
		
		li.add("a");
		li.add("b");
		li.add("n");
		li.addFirst("z");
		li.addFirst("p");
		li.addLast("m");
		li.add("d");
		System.out.println(li);
		
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		System.out.println(li.get(4));
		
		

	}

}
