package com.evanscode;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.asList(colors));

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        colors[2] = "red";

        System.out.println(Arrays.asList(colors));

        int[] numbers = new int[2];
        numbers[0] = 100;
        numbers[1] = 200;

        int[] numbers2 = {100, 200, 300, 400};

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        for (String color : colors) {
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(System.out::println);

    }
}
