package day3.assingment._3QuestionNumber3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import day2.liveClass.Student;

public class Demo {
	public static void main(String[] args) {
		Map<String, Student> myMap = new HashMap<>();
		myMap.put("India", new Student(10, "Abhi", 56));
		myMap.put("USA", new Student(15, "Tony", 57));
		myMap.put("UK", new Student(10, "Jackman", 58));
		myMap.put("Germany", new Student(12, "Salman", 59));
		myMap.put("China", new Student(11, "Ajay", 56));
		
		
		Demo demo = new Demo();
		Map<String, Student> answer =  demo.sortMapUsingStudentName(myMap);
		
		answer.forEach((k,v) -> {
			System.out.println(k + " : " + v);
		});
		
		
	}
	
	public Map<String, Student> sortMapUsingStudentName (Map<String, Student> originalMap){
		
		List<Map<String, Student>> mapList = new ArrayList<>();
		
		originalMap.forEach((k,v) -> {
			Map<String, Student> m = new HashMap<>();
			m.put(k, v);
			mapList.add(m);
		});
		
		
		Collections.sort(mapList,(m1,m2) -> {
			
			String s1 = m1.keySet().iterator().next();
			String s2 = m2.keySet().iterator().next();
			
			return m1.get(s1).getName().compareTo(m2.get(s2).getName());
		});
		//System.out.println(mapList);
		
		Map<String, Student> finalSortedMap = new LinkedHashMap<>();
		
		mapList.forEach( k -> {
			String s1 = k.keySet().iterator().next();
			finalSortedMap.put(s1, k.get(s1));
		});
		
		return finalSortedMap;
		
	}
}
