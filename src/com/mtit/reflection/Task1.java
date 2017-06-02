package com.mtit.reflection;

import java.lang.reflect.Modifier;

/**
 * Class representing the Task1.
 */
public class Task1 {

    public static void main(String args[]) {

        try {
            Class<?> clazz = Class.forName("com.mtit.reflection.Task1");
            System.out.println(clazz.getSimpleName()); // gets the class name only
            System.out.println(clazz.getName()); // gets the class name with package name --> com.mtit.reflection.Task1
            System.out.println(clazz.getPackage()); // gets only the package name --> com.mtit.reflection
            System.out.println(clazz.getModifiers()); // gets modifier number --> 1
            System.out.println(Modifier.toString(clazz.getModifiers())); // gets the modifier name --> public
            System.out.println(clazz.getDeclaredMethod("main", String[].class)); // gets the full name of the method with package name and modifiers --> public static void com.mtit.reflection.Task1.main(java.lang.String[])
            System.out.println(Modifier.toString(clazz.getDeclaredMethod("main", String[].class).getModifiers())); // gets the modifier of the method --> public static
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
