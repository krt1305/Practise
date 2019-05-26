package OverrideHashCode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashCodeTest {

    public static void main(String[] args) {

        Employee emp1=new Employee("1","dob1");
        Employee emp2=new Employee("2","dob2");
        Employee emp3=new Employee("3","dob3");
        Employee emp4=new Employee("3","dob3");
        emp3.equals(emp4);
        System.out.println(emp3.equals(emp4));
        //WIthout overiding equals and hashcode Set will contain duplicate values
        Set<Employee> employeeSet=new HashSet<>();
        employeeSet.add(emp1);

        employeeSet.add(emp2);

        employeeSet.add(emp3);
        employeeSet.add(emp4);
        System.out.println("emp3 hashcode "+emp3.hashCode());
        System.out.println("emp4 hashcode "+emp4.hashCode());
        System.out.println(employeeSet);


    }

}


class Employee
{
    String empID;
    String dob;

    public Employee(String empID, String dob) {
        this.empID = empID;
        this.dob = dob;
    }

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(empID, employee.empID) &&
                Objects.equals(dob, employee.dob);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empID='" + empID + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }



    @Override
    public int hashCode() {
        return Objects.hash(empID, dob);
    }
}