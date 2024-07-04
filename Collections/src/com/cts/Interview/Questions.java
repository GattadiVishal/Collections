package com.cts.Interview;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Questions {
	public static void main(String[] args) {
	/*
	 * 1.Write a java8 program to find the most work experience employee using Stream Api.
	 */
	List<EmployeeDTO> employeeList = EmployeeData.getEmployeeData();
	// Most experience depends on the year of joining, so we compare date of joining using comparator.
	 
	Optional<EmployeeDTO> mostExp = employeeList.stream().sorted(Comparator.comparingInt(emp -> emp.getYearofjoining())).findFirst();
		/* Here we are using Sorted method with a comparator interface
		 * and In Comparator Interface, we use comparingInt()..which accepts the input and returns the Comparator type which is int.
		 */
	//System.out.println(mostExp);
	
	/*
	 * 2.Write a java8 program to find the second most work experience employee using Stream Api.
	 */
	Optional<EmployeeDTO> mostExp1 = employeeList.stream().sorted(Comparator.comparingInt(emp -> emp.getYearofjoining())).skip(1).findFirst();
	//Here skip() method skips the no.of elements we need to skip, here in our case , we need to skip one place to get second most experience employee
	//System.out.println(mostExp1);
	
	/*
	 * 3. Write a java8 program to print the list of employees who's age is greater than 30
	 */
	List<EmployeeDTO> findAge = employeeList.stream().filter(age -> age.getAge()>=30).collect(Collectors.toList());
	//System.out.println(findAge);
	
	
	/*
	 * 4. Write a java8 program to print the list of employees who's dept is Developer
	 */
	List<EmployeeDTO> findDept = employeeList.stream().filter(dept -> dept.getDepartment().contains("Developer")).toList();
	//System.out.println(findDept);
	
	/*
	 * 5. Write a java8 program to print the list of employees name in capital letters.
	 */
	List<String> employeeChange = employeeList.stream().map(ely -> ely.getName().toUpperCase()).toList();
	//System.out.println(employeeChange);
	
	/*
	 * 6. Write a java8 program to filter employees based on gender
	 */
	List<EmployeeDTO> genderBased = employeeList.stream().filter(gen -> gen.getGender().contains("Male")).collect(Collectors.toList());
	//System.out.println(genderBased);
	
	/*
	 * 7. Write a java8 program to filter employees based on gender using map
	 */
	
	Map<String, List<EmployeeDTO>> employeeByGender = employeeList.stream().collect(Collectors.groupingBy(EmployeeDTO::getGender));
	//employeeByGender.forEach((k,v)->System.out.println(k+" : "+v));
			
	
	String newVal = null;
	for(EmployeeDTO e: employeeList) {
		newVal = e.getGender();
	}
	System.out.println(newVal);	
			
			
	}
	
	
	
	
}