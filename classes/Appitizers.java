package classes;


import java.lang.*;

public class Appitizers extends FoodItem
{
    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void showInfo() {
        System.out.println("Food ID: " + fid);
        System.out.println("Food Name: " + name);
        System.out.println("Available Quantity: " + availableQuantity);
        System.out.println("Food Price: " + price);
       
        System.out.println("Size: " + size);
    }
}