package org.college.practice2.task1;
public class Main {
    public static void main(String[] args) {
        FarmManager farmManager = FarmManager.getInstance( "Сонячна ферма");

        farmManager.setDescription("Невелике сімейне господарство, яке спеціалізується на вирощуванні органічних культур.");

        Crop wheat = Crop.create("Пшениця", 2020, "Зерно");
        Crop corn = Crop.create("Кукурудза", 2021, "Овочевий");

        farmManager.addCrop(wheat);
        farmManager.addCrop(corn);

        System.out.println("Ферма: " + farmManager.getName());
        System.out.println("Опис: " + farmManager.getDescription());
        System.out.println("Культури: " + farmManager.getCrops());
        System.out.println("Всього посівів: " + farmManager.getCropCount());

        farmManager.removeCrop(wheat);
        System.out.println("Після видалення загальні посіви: " + farmManager.getCropCount());
    }
}

