public class PrivateMainMethod {

    public static void main(String[] args) {
        System.out.println("in private main method");
        String s1="abc";
        String s2="ab";
        System.out.println(s1.equals(s2));
        Employee emp1=new Employee(1,"rabia");
        Employee emp2=new Employee(2,"rabia");
        System.out.println(emp1.equals(emp2));
        System.out.println("Emp1 hashcode "+emp1.hashCode());
        System.out.println("Emp2 hashcode "+emp2.hashCode());

    }
}

class Employee
{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
