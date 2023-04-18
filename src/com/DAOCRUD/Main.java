package com.DAOCRUD;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {

		/* UPDATE
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		Employee employee = new Employee(3,2,"Esat","arslantaş",58);
		employeeDAO.update(employee);
		System.out.println(employee);
		 */

		/* INSERT
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		Employee employee = new Employee(0,323,"asuman","arslantaş",54);
		int result = employeeDAO.insert(employee);
		System.out.println(employee);
		 */

		/* GET
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		Employee employee = employeeDAO.get(0);
		System.out.println(employee);
		 */

		/* DELETE
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		Employee employee = employeeDAO.get(2);
		int result = employeeDAO.delete(employee);
		 */
	}

}
