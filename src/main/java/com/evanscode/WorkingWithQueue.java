package com.evanscode;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {
        Queue<Person> super_market = new LinkedList<>();
        super_market.add(new Person("Alex", 21));
        super_market.add(new Person("Mariam", 18));
        super_market.add(new Person("Ali", 40));

        System.out.println(super_market.size());
        System.out.println(super_market.peek());
        System.out.println(super_market.poll());
        System.out.println(super_market.size());
    }

    static record Person(String name, int age) {}
}
