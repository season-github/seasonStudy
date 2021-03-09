package com.season.seasonStudy.pattern.iterator;
 
import java.util.Iterator;
 
 
public class Main {
 
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 1; i <= 11; i++) {
			arrayList.add(i);
		}
		System.out.println("arrayList size:" + arrayList.size());
		for (Integer i : arrayList) {
			System.out.println(i);
		}

		System.out.println("----------------------------------------------");

		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (int i = 1; i <= 11; i++) {
			hashSet.add(i);
		}
		System.out.println("hashSet size:" + hashSet.size());
		for (Integer i : hashSet) {
			System.out.println(i);
		}

		System.out.println("----------------------------------------------");

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		for (int i = 1; i <= 11; i++) {
			linkedList.add(i);
		}
		System.out.println("linkedList size:" + linkedList.size());
		for (Integer i : linkedList) {
			System.out.println(i);
		}
	}
}