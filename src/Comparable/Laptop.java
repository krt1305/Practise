package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Laptop implements Comparable<Laptop> {


    private String laptopName;
    private int price;
    private int ram;

    public Laptop(String laptopName, int price, int ram) {
        this.laptopName = laptopName;
        this.price = price;
        this.ram = ram;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public int compareTo(Laptop lap2) {

        System.out.println("This lap price "+this.getPrice());
        System.out.println("Lap price "+lap2.getPrice());
        if(this.getPrice()>lap2.getPrice()) {
            System.out.println("Returning 1");
            return 1;
        }
        else {
            System.out.println("Returning -1");
            return -1;
        }
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "laptopName='" + laptopName + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                '}';
    }
}

 class LaptopCompare
{


    public static void main(String[] args) {
        List<Laptop> laptopsList=new ArrayList<>();
        laptopsList.add(new Laptop("Lap1",10000,1));
        laptopsList.add(new Laptop("Lap2",1000,1));

        Collections.sort(laptopsList);

        for(Laptop l:laptopsList)
        {
            System.out.println(l);
        }

    }

}
