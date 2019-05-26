package OverrideEqualHashCode;

import java.util.HashSet;
import java.util.Objects;

public class EMployee {

    private String name;
    private int empId;

    public EMployee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EMployee eMployee = (EMployee) o;
        return empId == eMployee.empId &&
                Objects.equals(name, eMployee.name);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

class empTest
{
    public static void main(String[] args) {

        EMployee emp1=new EMployee("emp1",1);
        EMployee emp2=new EMployee("emp1",1);

        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());


    }
}
