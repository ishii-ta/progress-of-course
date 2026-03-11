package org.example;

import java.lang.reflect.Field;

class Employee {

    private String name;
    private int age;
    private String email;

    public Employee(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}

public class ReflectionDemo {

    public static void main(String[] args) {

        try {

            Employee emp = new Employee("sumit khanna", 22, "sumitkhanna@gmail.com");

            Class<?> obj = emp.getClass();

            Field[] fields = obj.getDeclaredFields();

            for (Field field : fields) {

                field.setAccessible(true);

                System.out.println(field.getName() + " = " + field.get(emp));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}spirng