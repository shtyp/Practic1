package org.college.practice2.task1;

public class Picture {

    private static Picture instance;

    private Picture() {
        System.out.println("Екземпляр Picture створено!");
    }

    public static synchronized Picture getInstance() {
        if (instance == null) {
            instance = new Picture();
        }
        return instance;
    }

    public void displayPicture() {
        System.out.println("Відображення картини!");
    }

    public static void main(String[] args) {

        Picture picture1 = Picture.getInstance();
        picture1.displayPicture();

        Picture picture2 = Picture.getInstance();

        System.out.println("picture1 == picture2: " + (picture1 == picture2));
    }
}

