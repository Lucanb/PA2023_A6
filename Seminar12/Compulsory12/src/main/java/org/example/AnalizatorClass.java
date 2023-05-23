package org.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class AnalizatorClass {

    public static void main(String[] args) throws ClassNotFoundException {
        if (args.length == 0) {
            System.out.println("Please provide the path to the .class file as an argument.");
            return;
        }

        String className = args[0];

        // Load the specified class in memory
        Class<?> clazz = Class.forName(className);

        // Identify the package of the class
        Package pkg = clazz.getPackage();
        String packageName = pkg != null ? pkg.getName() : "(default package)";
        System.out.println("Package: " + packageName);

        // Extract information about the class
        System.out.println("Class: " + clazz.getSimpleName());
        System.out.println("Modifiers: " + Modifier.toString(clazz.getModifiers()));

        // Get all methods of the class
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("\nMethod: " + method.getName());
            System.out.println("Modifiers: " + Modifier.toString(method.getModifiers()));

            // Check if the method is annotated with @Test
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.annotationType().getSimpleName().equals("Test")) {
                    // Invoke the static method with no arguments
                    if (Modifier.isStatic(method.getModifiers())) {
                        try {
                            method.setAccessible(true); // To access private methods if needed
                            method.invoke(null);
                            System.out.println("Test passed: " + method.getName());
                        } catch (Exception e) {
                            System.out.println("Test failed: " + method.getName());
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("Test skipped: " + method.getName() +
                                " - Only static methods can be invoked for testing.");
                    }
                }
            }
        }
    }
}