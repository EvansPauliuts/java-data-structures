package com.evanscode;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> colorsUnmodifiable = List.of(
                "blue",
                "purple"
        );

        List<Object> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("red");
        colors.add(1);
        colors.add(new Object());

        System.out.println(colors.size());
        System.out.println(colors.contains("red"));
        System.out.println(colors.contains("pink"));
        System.out.println(colors);

        for (Object color : colors) {
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
