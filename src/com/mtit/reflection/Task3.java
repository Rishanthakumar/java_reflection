package com.mtit.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * Class representing the Task3
 */
public class Task3 {

    public static void main(String argd[]) {

        try {
            Class<?> clazz = Class.forName("com.mtit.test_classes.Employee");

            // Get all methods of a class.
            Method[] methods = clazz.getDeclaredMethods();

            for(int i=0; i<methods.length; i++) {
                System.out.println(Modifier.toString(methods[i].getModifiers()));
                System.out.print("|| Return type => " + methods[i].getReturnType());
                System.out.print("|| Method Name => " + methods[i].getName());

                if (methods[i].getParameterCount() != 0) {
                    System.out.print("|| Method Parameter => ");

                    Parameter[] parameters = methods[i].getParameters();

                    for (int z=0;z<parameters.length;z++) {
                        System.out.print(parameters[z].getType().getSimpleName() + " ");
                    }
                }
                System.out.println();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

