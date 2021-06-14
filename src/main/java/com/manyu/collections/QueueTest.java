package com.manyu.collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue<String> q = new ArrayDeque<String>();
		
		q.add("first");
		q.offer("second");
		
		
//		System.out.println(q.element());
//		
//		System.out.println(q.poll());
//		
//		System.out.println(q.poll());
		
		
		//push , peek, pop
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.push("First");
		ad.push("second");
		
		
//		System.out.println(ad.pop());
		
		
		q = new LinkedList<String>();
		
		
		q.offer("abc");
		
		q.poll();
		
		
		Queue<Integer> q1 = new PriorityQueue<Integer>();
		
		q1.offer(10);
		q1.offer(5);
		q1.offer(19);
		
		
		System.out.println(q1.poll());
		System.out.println(q1.poll());
		
		
		
	}

}
