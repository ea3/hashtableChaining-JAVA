package dev.ea3;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 1233);
        Employee johnDoe = new Employee("John", "Doe", 4433);
        Employee marySmith = new Employee("Mary", "Smith", 1256733);
        Employee mikeWilson = new Employee("Mike", "Wilson", 2121);

        ChainedHashtable ht = new ChainedHashtable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);

        ht.printHashtable();
//        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
//        System.out.println("Retrieve key Smith: " + ht.get("Smith"));
//
//        ht.remove("Wilson");
//        ht.remove("Jones");
//        ht.printHashtable();


    }
}
