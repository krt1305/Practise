package Data_structures;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //no duplicates , sorting order maintained
        Set<Integer> nameList=new TreeSet<>();
        nameList.add(1000);
        nameList.add(100);nameList.add(1);

        for(Integer j:nameList)
        {
            System.out.println(j);
        }
        Set<Emp> emps=new TreeSet<>();
        emps.add(new Emp(1,"d"));
        emps.add(new Emp(2,"a"));
        Iterator <Emp> it=emps.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }


}

class Emp
{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
