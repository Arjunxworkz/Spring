package com.xworkz.statesofindia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StatesOfIndia {

	public static void main(String[] args) {
		Collection<String>list=new ArrayList<String>();
		list.add("Andhra Pradesh");
		list.add("Arunachal Pradesh");
		list.add("Assam");
		list.add("Bihar");
		list.add("Chhattisgarh");
		list.add("Goa");
		list.add("Gujarat");
		list.add("Haryana ");
		list.add("Jharkhand");
		list.add("Karnataka");
		list.add("Kerala");
		list.add("Madhya Pradesh");
		list.add("Maharashtra");
		list.add("Manipur");
		list.add("Meghalaya");
		list.add("Mizoram");
		list.add("Nagaland");
		list.add("Odisha");
		list.add("Punjab");
		list.add("Rajasthan");
		list.add("Sikkim");
		list.add("Tamil Nadu");
		list.add("Telangana");
		list.add("Tripura");
		list.add("Uttar Pradesh");
		list.add("Uttarakhand");
		list.add("West Bengal");
		list.forEach( (n) -> { System.out.println(n); } );
		
		System.out.println("=================");
		
		list.stream().forEach((li) -> {System.out.println(li.toUpperCase());});
		list.stream().forEach((li) -> {System.out.println(li.toLowerCase());});
		System.out.println("=================");
		list.stream().distinct().collect(Collectors.toList());

	}

}
