package arrayListDemo;

public class Employee implements  Comparable<Employee> {
    String name;
    int age;

    public Employee(String name, int age){
        super();
        this.age = age;
        this.name = name;
    }


    @Override
    public int compareTo(Employee o) {
        return this.age - o.age;
    }
}
