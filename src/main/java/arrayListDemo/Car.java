package arrayListDemo;

public class Car implements Comparable<Car> {
    String brand;
    Integer year;

    public Car(String brand, Integer year){
        this.year = year;
        this.brand = brand;
    }

    @Override
    public int compareTo(Car o) {
        return this.year - o.year;
    }
}
