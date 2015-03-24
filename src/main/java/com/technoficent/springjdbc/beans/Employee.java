package com.technoficent.springjdbc.beans;

public class Employee {

	private Integer empID;
	private String empName;
	private String empDept;

	public Integer getEmpID() {

		return empID;
	}

	public void setEmpID(Integer empID) {

		this.empID = empID;
	}

	public String getEmpName() {

		return empName;
	}

	public void setEmpName(String empName) {

		this.empName = empName;
	}

	public String getEmpDept() {

		return empDept;
	}

	public void setEmpDept(String empDept) {

		this.empDept = empDept;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + ((empDept == null) ? 0 : empDept.hashCode());
		result = prime * result + ((empID == null) ? 0 : empID.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empDept == null) {
			if (other.empDept != null)
				return false;
		} else if (!empDept.equals(other.empDept))
			return false;
		if (empID == null) {
			if (other.empID != null)
				return false;
		} else if (!empID.equals(other.empID))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}

	@Override
	public String toString() {

		return "Employee [empID=" + empID + ", empName=" + empName + ", empDept=" + empDept + "]";
	}

}
