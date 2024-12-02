package org.college.practice2.task2;

import org.college.practice2.task2.UsaPictureBuilder;
public class Main {
    public static void main(String[] args) {
        PictureBuilder builder = new UkrainePictureBuilder();
        Picture picture = builder.setBasicParams("Night Sky", (short) 2021, "Ivan Ivanov")
                .setSizeParams(new Size((short) 120, (short) 80))
                .setColorParams(new String[]{"Blue", "Black"}, true, "Canvas")
                .setCategoryParams("Nature", "Landscape")
                .build();

        System.out.println(picture);
    }
}

