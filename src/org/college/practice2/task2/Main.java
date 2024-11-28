package org.college.practice2.task2;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm.FarmBuilder()
                .setName("Сонячна ферма")
                .setLocation("Одесса, Україна")
                .setNumberOfAnimals(150)
                .setCropType("Пшениця")
                .setTotalArea(200.5)
                .setAnnualIncome(50000)
                .build();

        System.out.println(farm);
    }
}

