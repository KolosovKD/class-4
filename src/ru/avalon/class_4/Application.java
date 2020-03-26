package ru.avalon.class_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        //int factorial = recursion(3);
        //System.out.println(factorial);

        //ifSwitch();
        //loops();

        //touchMethods();

        sorting();

    }

    public static void ifSwitch() {
        System.out.println("Hello world!");
        String name = "Petr";
        String surname = "Ivanov";
        System.out.println(name + " " + surname);

        boolean clause = false;
        int number = 10;

        if (clause) {
            System.out.println("first if");
        } else if (number > 0) {
            System.out.println("second if");
        } else if ((10 + 3) == 14) {

        } else if (name.isEmpty()) {

        } else if (true) {

        } else if (name.isEmpty() || (10 > 0)) {

        } else if (name.isEmpty() && (10 > 0)) {

        } else if (!false) {

        } else {
            System.out.println("third if");
        }

        System.out.println("---------");

        if (!name.isEmpty() || getTrue()) {
            System.out.println("|| is done");
        }

        if (!name.isEmpty() && getTrue()) {
            System.out.println("&& is done");
        }

        int value = 10;


        if (value > 0) {

        } else if (value < 100) {

        }

        switch (6) {
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            default:
                System.out.println("unexpected value");
        }

        if (!name.isEmpty()) {
            recognizeAndGreeting(name);
        }

        if (false) System.out.println("WoW");
        System.out.println("And WoW again!");

        boolean isCold = true;

        String whatToDo;

        if (isCold) whatToDo = "take a winter hat!";
        else whatToDo = "take a baseball hat!";

        System.out.println(whatToDo);

        whatToDo = isCold ? "take a winter hat!" : "take a baseball hat!";
        System.out.println("what to do 2: " + whatToDo);

    }

    public static void loops() {
        System.out.println("LOOPS");

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("---------");

        int j = 0;
        for (; ; ) {
            if (j < 10) {
                System.out.println("j = " + j);
                j++;
            } else {
                break;
            }
        }

        System.out.println("---------");

        for (int i = 0; i < 10; i = i + 2) {
            System.out.println("i = " + j);
        }

        System.out.println("---------");

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) continue;

            System.out.println("i = " + i);
        }

        System.out.println("----WHILE----");

        int counter = 10;

        while (counter < 10) {
            System.out.println(counter);
            counter++;
        }

        System.out.println("-----------");

        counter = 0;

        while (true) {
            System.out.println(counter);
            counter++;

            if (counter == 10) {
                break;
            }
        }

        System.out.println("-----------");

        counter = 10;

        do {
            System.out.println(counter);
            counter++;
        } while (counter < 10);

        System.out.println("-----FOR EACH-----");

        int[] intArray = {10, 5, 13, 22};

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("в ячейке номер " + i + " значение " + intArray[i]);
        }

        System.out.println("----------");

        for (int value : intArray) {
            System.out.println("есть значение " + value);
        }

    }

    public static void recognizeAndGreeting(String name) {
        if (name.equals("Ivan")) {
            System.out.println("hello Ivan!");
        } else if (name.equals("Petr")) {
            System.out.println("hello Petr!");
        } else {
            System.out.println("I don't know you, stranger!");
        }
    }

    public static boolean getTrue() {
        System.out.println("boolean method runs");
        return true;
    }

    public static int recursion(int value) {
        if (value <= 1) return value;

        return value * recursion(value - 1);
    }

    public static void touchMethods() {
        returnPrimitiveValue();
        returnObject();

        int primitiveFromMethod = returnPrimitiveValue();
        Person personFromMethod = returnObject();

        if(returnObject().getName().equals("Ivan")) {
            System.out.println("Hello Ivan!");
        }

        if(getClause()) {
            System.out.println("clause is true!");
        }

        changeValue(returnObject());

        changeValue(personFromMethod);
        changeValue(primitiveFromMethod);

        System.out.println("done");

    }

    private static void changeValue(int value) {
        value = 20;
    }

    private static void changeValue(Person value) {
        if(value.getName().equals("Petr")) {
            return;
        }

        //value = null;

        value.setName("Petr");
    }

    private static int returnPrimitiveValue() {

        int result = 0;

        for(int i = 0; i < 10; i ++) {
            result += i;

            if(result > 20) {
                break;
            }
        }

        result = result * 2;
        return result;
    }

    private static Person returnObject() {
        Person person = new Person("Ivan", "Ivanov");
        return person;
    }

    private static boolean getClause() {
        return true;
    }

    private static void sorting() {

        Integer[] arr1 = {10, 12, 3, 15, 7};
        Integer[] arr2 = {3, 7, 10, 12, 15};

        printArray(arr1);

        for(int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < arr1.length - 1; i++) {
                if (arr1[i] > arr1[i + 1]) {
                    int cache = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = cache;
                }
            }
        }

        // если искомое значение больше последнего элемента или меньше первого, то его в массиве нет.

        // Чтобы найти 8
        //  1) 8 < 10 - слева от центра
        //  2) 8 > 7 - справа от семерки.

        Integer[] arr3 = {10, 12, 3, 15, 7};

        Arrays.sort(arr3);

        printArray(arr3);

        Person[] persons = new Person[3];

        persons[0] = new Person("Si", "lin");
        persons[1] = new Person("Boris", "volkov");
        persons[2] = new Person("Anna", "Fedorova");

        Arrays.sort(persons);
        printArray(persons);

    }

    private static void printArray(Object[] arr) {
        for (Object obj : arr) {
            System.out.println(obj);
        }
    }


}
