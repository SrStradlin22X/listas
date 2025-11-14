package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.employeeData;

public class listas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		employeeData emp = new employeeData();

		System.out.print("How many wmployees will be registered? ");
		int n = sc.nextInt();

		System.out.println();
		List<employeeData> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: R$");
			double salary = sc.nextDouble();
			System.out.println();

			emp = new employeeData(id, name, salary);

			list.add(emp);
		}

		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Integer pos = emp.searchId(list, id);

		if (pos == null) {
			System.out.println("This id does exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employee:");

		for (employeeData em : list) {
			System.out.println(em);
		}
		sc.close();
	}

}
