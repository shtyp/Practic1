package org.college.practice2.task1;

public class Singleton {

    private static Singleton instance;


    private Singleton() {

    }


    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    public void displayMessage() {
        System.out.println("Singleton instance is working!");
    }
}
