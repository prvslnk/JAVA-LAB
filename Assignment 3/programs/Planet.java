/*  Suppose we want to represent a planet in the solar system as an object of class Planet. In 
the object, it contains two fields: one called name is a String containing its name, and one 
called satellites is an array of String containing the names of all its satellites. Define the 
class, with a constructor taking a String and an array of String as argument for initializing 
the object.

Write a method print() in the class to print out the name of the planet and all the satellites. 
For example, if we have 
String[] earth_sat = { "Moon" }; 
Planet earth = new Planet("Earth", earth_sat); 
Then we want earth.print(); to print out the following: 
Earth has 1 satellite(s): 
Moon. */
class Planet {
    String name;
    String[] satellites;

    Planet(String name, String[] satellites) {
        this.name = name;
        this.satellites = satellites;
    }

    void print() {
        System.out.println(name + " has " + satellites.length + " satellite(s):");
        for (String satellite : satellites) {
            System.out.println(satellite);
        }
    }

    public static void main(String[] args) {
        String[] earthSatellites = { "Moon" };
        Planet earth = new Planet("Earth", earthSatellites);
        earth.print();
    }
}
