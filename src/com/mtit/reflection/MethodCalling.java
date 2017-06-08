package com.mtit.reflection;

import com.mtit.test_classes.Book;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Class Demonstrating Reflection Method Calling
 */
public class MethodCalling {

    public static void main(String args[]){

        Book book = new Book();

        try {

            Class<?> clazz = Class.forName("com.mtit.test_classes.Book");

            Method method = clazz.getMethod("DisplayBookDetails");
            method.invoke(book);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}