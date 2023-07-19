package com.stepdefinitions;

import java.util.ArrayList;
import java.util.List;

public class Onewithoutheader {

	public static void main(String[] args) {
		
		List<String>li=new ArrayList<String>();
		li.add("java");
		li.add("selenium");
		li.add("maven");
		String string=li.get(2);
		System.out.println(string);
	}
}
