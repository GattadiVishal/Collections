package com.cts.Interview;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

	public static List<EmployeeDTO> getEmployeeData(){
		List<EmployeeDTO> employeeList = new ArrayList<>();
		
		employeeList.add(new EmployeeDTO(101, "Brain", 32, "Female", "Sr.Developer", 2001, 1200000));
		employeeList.add(new EmployeeDTO(102, "Charles", 28, "Female", "Jr.Developer", 2019, 1000000));
		employeeList.add(new EmployeeDTO(103, "Humpy", 25, "Female", "Engineer", 2001, 1500000));
		employeeList.add(new EmployeeDTO(104, "Sharma", 38, "Male", "Architect", 1995, 1800000));
		employeeList.add(new EmployeeDTO(105, "Kumar", 23, "Male", "Jr.Developer", 2020, 800000));
		employeeList.add(new EmployeeDTO(106, "Adi", 30, "Male", "Scientist", 1992, 2000000));
		employeeList.add(new EmployeeDTO(107, "Raj", 31, "Male", "Manager", 2001, 2500000));
		employeeList.add(new EmployeeDTO(108, "Varun", 31, "Male", "Associate", 2003, 1400000));
		employeeList.add(new EmployeeDTO(109, "Balu", 30, "Male", "Sr.Developer", 2005, 210000));
		employeeList.add(new EmployeeDTO(110, "Krishna", 29, "Female", "Developer", 2009, 1000000));
		employeeList.add(new EmployeeDTO(111, "Tom", 29, "Male", "Developer", 2010, 1200000));
		
		
		return employeeList;
	}
}
