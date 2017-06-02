package com.mtit.reflection;

import com.mtit.test_classes.Book;

/**
 * Class representing s Tsk2
 */
public class Task2 {

    public static void main(String args[]) {

        // Create an instance of the object
        // Book book = new Book();

        try {
            // forName is used to load the class dynamically it returns the instanceof Class class
            // It should be used if you know the fully qualified name of class. This cannot be used for primitive types.
            Class<?> clazz = Class.forName("com.mtit.test_classes.Book");

           //  Book book = (Book) new clazz.newInstance();
            System.out.println(clazz.getDeclaredField("bookName"));
        } catch (ClassNotFoundException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
