package Data_structures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //Time complexity is O(1)
        Set<String> nameList=new LinkedHashSet<String>();
        nameList.add("3");
        nameList.add("2");
        nameList.add("1");
        for(String j: nameList)
        {
            System.out.println(j);
        }


        Set<Employee1> employees=new LinkedHashSet<Employee1>();
        employees.add(new Employee1(1,"a"));
        employees.add(new Employee1(2,"b"));
        employees.add(new Employee1(3,"c"));
        Iterator<Employee1> it=employees.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}

class Employee1
{
    private int id;
    private String name;

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
