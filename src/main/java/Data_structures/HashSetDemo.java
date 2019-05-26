package Data_structures;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        //INSERTION order is not preserved in HashSet
        //IN linkedHashSet insertion order is maintained
        Set<Integer> nameList=new HashSet<Integer>();
        nameList.add(10);
        nameList.add(2);
        nameList.add(3);
        nameList.add(3);
        for(Integer j:nameList)
        {
            System.out.println(j);
        }


        Set<Employee> employees=new HashSet<Employee>();
        employees.add(new Employee(1,"a"));
        employees.add(new Employee(2,"b"));
        employees.add(new Employee(3,"c"));
        Iterator<Employee> it=employees.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }



}

class Employee
{
    private int id;
    private String name;

    public Employee(int id, String name) {
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