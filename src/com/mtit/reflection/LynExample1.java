package com.mtit.reflection;

import com.mtit.test_classes.Book;

import java.lang.reflect.Constructor;


/***
 * Class representing an LynExample1.
 */
public class LynExample1 {

    public static void main(String args[]) {
        Book book = new Book();
        Class<?> clazz = book.getClass();

        System.out.println(clazz); // class com.mtit.test_classes.Book
        System.out.println(clazz.getName()); // com.mtit.test_classes.Book
        System.out.println(clazz.getSimpleName()); // Book
        System.out.println(clazz.getCanonicalName()); // com.mtit.test_classes.Book

        // Using Constructor
        Constructor<?>[] constructors = clazz.getConstructors();
        System.out.println(constructors.length);

        // Get constructor reference
        Constructor<?> con = constructors[1];

        // Create an instance
        Object obj = null;

        try {
            obj = con.newInstance(12);
            System.out.println(obj);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
