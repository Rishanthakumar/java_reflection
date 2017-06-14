package com.mtit.reflection;

import com.mtit.test_classes.Book;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Class Demonstrating Reflection Method Calling
 */
public class MethodCalling {

    public static void main(String args[]){

        Book book = new Book();

        try {

            Class<?> clazz = Class.forName("com.mtit.test_classes.Book");

            // Invoke method using reflection.
            Method method = clazz.getMethod("DisplayBookDetails");
            method.invoke(book);

            // Get the constructor parameters
            Constructor[] constructor = clazz.getConstructors();
            Parameter[] parameters = constructor[1].getParameters();

            for(int i=0; i<constructor[1].getParameterCount(); i++) {
                System.out.println(parameters[i].getType().getName()); // java.lang.String
            }

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