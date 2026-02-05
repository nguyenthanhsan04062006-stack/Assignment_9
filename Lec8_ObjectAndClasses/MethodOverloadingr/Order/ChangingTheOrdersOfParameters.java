package Lec8_ObjectAndClasses.MethodOverloadingr.Order;

public class ChangingTheOrdersOfParameters {

    public static void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void printInfo(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }

}
