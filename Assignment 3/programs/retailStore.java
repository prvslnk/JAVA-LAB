/*  Create a class named Item that holds data about an item in a retail store. The class should have the following three fields:  
    1.  name: the name field is a String object that holds the name of the item.  
    2.  price: the price field is a double variable that holds the item's retail price  
    3.  quantity: the quantity field is an int variable that holds the number of units 
currently in inventory  
Write  a  public  constructor  method  that  accepts  three  arguments,  name,  price,  & 
quantity and stores the values of the arguments passed into it in the object's instance 
fields. 
Write  four  public  methods  to  retrieve  the  values  from  the  three  fields  and  their 
current inventory value  
    1.  String getName( ) returns the item name 
    2.  double getPrice( ) returns the price of the item 
    3.  int getQuantity( ) returns the number of quantities 
    4.  double getValue( ) that returns the current inventory value (quantity * price) 
Write a separate class called Inventory with a main method that creates three Item 
objects and then produces a neatly formatted table of the store's inventory displaying 
the three items, their current inventory value, and the total inventory value for the 
store. 
Duplicate  the  format  of  the  output  exactly  shown  below.  Test  your  output  with 
different items in inventory. */
class Item {
    String name;
    double price;
    int quantity;

    public Item(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    int getQuantity() {
        return quantity;
    }

    double getValue() {
        return quantity * price;

    }

}

public class retailStore {
    public static void main(String[] args) {
        Item i1 = new Item("Rice", 30, 15);
        Item i2 = new Item("Oil", 40, 25);
        Item i3 = new Item("Dal", 47, 9);
        System.out.println("NAME\tPRICE\tQUANTITY\tVALUE");
        System.out.println("=========================================");
        System.out.println(i1.getName() + "\t" + i1.getPrice() + "\t" + i1.getQuantity() + "\t" + i1.getValue());
        System.out.println(i2.getName() + "\t" + i2.getPrice() + "\t" + i2.getQuantity() + "\t" + i2.getValue());
        System.out.println(i3.getName() + "\t" + i3.getPrice() + "\t" + i3.getQuantity() + "\t" + i3.getValue());
        System.out.println("Total Inventory is ₹" + (i1.getValue() + i2.getValue() + i3.getValue()));
    }
}
