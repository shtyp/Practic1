package org.college.practice2.task1;
public class Main {
    public static void main(String[] args) {

        FarmAccountManager farmManager = FarmAccountManager.getInstance();

        farmManager.addRecord("Кількість корів", "20");
        farmManager.addRecord("Кількість гектарів пшениці", "50");
        farmManager.addRecord("Кількість тракторів", "3");

        System.out.println("Кількість корів: " + farmManager.getRecord("Кількість корів"));

        farmManager.displayRecords();
    }
}

