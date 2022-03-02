package com.ryan.cd;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		CD cd1 = new CD("ZAA", "oej");
		CD cd2 = new CD("FBB", "wff");
		CD cd3 = new CD("CCC", "FGe");
		CD cd4 = new CD("CCC", "FGe");
		
		Set<CD> collection=new TreeSet<CD>(new SortBySingerName());
		
		collection.add(cd1);
		collection.add(cd2);
		collection.add(cd3);
		collection.add(cd4);
		
		System.out.println(collection);
	}

}
