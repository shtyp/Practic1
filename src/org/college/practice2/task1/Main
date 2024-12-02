package org.college.practice2.task1;
import org.college.practice2.task1.Picture;

public class Main {
    public static void main(String[] args) {

        Gallery gallery = Gallery.getInstance("Modern Art Gallery");

        Picture pic1 = new Picture("Starry Night", (short) 1889, "Vincent van Gogh");
        Picture pic2 = new Picture("Mona Lisa", (short) 1503, "Leonardo da Vinci");
        Picture pic3 = new Picture("The Persistence of Memory", (short) 1931, "Salvador Dalí");

        gallery.addPicture(pic1);
        gallery.addPicture(pic2);
        gallery.addPicture(pic3);
        System.out.println("Gallery Name: " + gallery.getName());
        System.out.println("Number of Pictures: " + gallery.getPictureCount());

        for (Picture picture : gallery.getPictures()) {
            System.out.println(gallery.describePicture(picture));
        }

        Picture retrievedPicture = gallery.getPicture("Mona Lisa");
        if (retrievedPicture != null) {
            System.out.println("Retrieved Picture: " + retrievedPicture);
        }

        gallery.removePicture(pic2);
        System.out.println("Number of Pictures after removal: " + gallery.getPictureCount());
    }
}
