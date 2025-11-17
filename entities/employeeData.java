package entities;

import java.util.List;

public class employeeData {

	private Integer id;
	private String name;
	private Double salary;

	public employeeData() {
	}

	public employeeData(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void increaseSalary(double percentage) {
		salary += (salary * percentage / 100);
	}

	public Integer searchId(List<employeeData> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public Integer testId(List<employeeData> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", R$" + String.format("%.2f", salary);
	}

}