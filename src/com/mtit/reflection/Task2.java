package com.mtit.reflection;

import com.mtit.test_classes.Book;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Class representing s Tsk2
 */
public class Task2 {

    public static void main(String args[]) {

        // Create an instance of the object
            Book book = new Book();

        try {
            // forName is used to load the class dynamically it returns the instanceof Class class
            // It should be used if you know the fully qualified name of class. This cannot be used for primitive types.
            Class<?> clazz = Class.forName("com.mtit.test_classes.Book");

            // TODO: Check this is not working
           //  Book book = (Book) new clazz.newInstance();

            // Get the field reference and assign it to a variable
            Field field = clazz.getDeclaredField("bookName");
            // Inorder to access private variables you need to set setAccessible as true
            field.setAccessible(true);
            // Print it.
            System.out.println(field.getName()+ " = "+ field.get(book));

            field = clazz.getField("bookCount");
            System.out.println(field.getName()+" = "+field.get(book));


            // When reading values from array
            field = clazz.getField("authors");

            // Convert the array reference to an Array objects.
            Object[] arr = new Object[Array.getLength(field.get(book))];

            for(int i=0; i<arr.length; i++) {
                arr[i] = Array.get(field.get(book), i);
            }

            System.out.println(field.getName()+" = "+ Arrays.toString(arr));

            // Setting value for a private variable of a class.
            field = clazz.getDeclaredField("price");
            field.setAccessible(true);
            field.set(book, 2187.5);

            System.out.println(field.getName() + " = " + field.get(book));



        } catch (ClassNotFoundException | NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
