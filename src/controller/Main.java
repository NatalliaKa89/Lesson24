package controller;

import entity.Human;
import entity.Human;


public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human("Alex", 20);

        System.out.print(human1.getInfo());
        System.out.print(human2.getInfo());
    }
}
