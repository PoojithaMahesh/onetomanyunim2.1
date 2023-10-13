package onetomany.controller;

import java.util.ArrayList;
import java.util.List;

import onetomany.dao.CompanyDao;
import onetomany.dao.EmployeeDao;
import onetomany.dto.Company;
import onetomany.dto.Employee;

public class CompanyEmpCont {
public static void main(String[] args) {
	Company company=new Company();
	company.setId(1);
	company.setName("TYSS");
	company.setAddress("Bangalore");
	
	Employee employee1=new Employee();
	employee1.setId(101);
	employee1.setName("Poojitha");
	employee1.setSalary(20000);
	
	Employee employee2=new Employee();
	employee2.setId(102);
	employee2.setName("Rohan");
	employee2.setSalary(50000);
	
	
	Employee employee3=new Employee();
	employee3.setId(103);
	employee3.setName("Pihu");
	employee3.setSalary(60000);
	
	List<Employee> employees=new  ArrayList<Employee>();
	employees.add(employee1);
	employees.add(employee2);
	employees.add(employee3);
	
	company.setEmployees(employees);
	
	
	
	EmployeeDao employeeDao=new EmployeeDao();
	CompanyDao companyDao=new CompanyDao();
	
	
	employeeDao.saveEmployee(employee1);
	employeeDao.saveEmployee(employee2);
	employeeDao.saveEmployee(employee3);
	
	companyDao.saveCompany(company);
	
	
	
	
	
	
	
}
}
