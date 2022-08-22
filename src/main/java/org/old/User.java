package org.old;

public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public static User of(String s, int i) {
       return new User(s, i);

    }
}
