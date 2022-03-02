package com.company;

import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        System.out.println("Проверить задание 0-7");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 0:
                System.out.println("Введите число");
                int number0 = sc.nextInt();

                int[] array0 = new int[100];
                int l0 = array0.length;
                for (int i = 0; i < l0; i++) {
                    array0[i] = i + 1;
                }
                int pos0 = Arrays.binarySearch(array0, number0);
                if (pos0 < 100 && pos0 > 0) {
                    System.out.println("Число " + number0 + " принадлежит массиву 1-100");
                } else {
                    System.out.println("Число " + number0 + " не принадлежит массиву 1-100");
                }
                break;


            case 1:
                System.out.println("Введите конечное число массива");
                int number1 = sc.nextInt();
                int[] array1 = new int[number1];

                int l1 = array1.length;
                for (int i1 = 0; i1 < l1; i1++) {
                    array1[i1] = i1 + 1;
                }
                System.out.println(Arrays.toString(array1));

                System.out.println("Какое число следует удалить из массива?");
                int number11 = sc.nextInt();

                int[] array12 = new int[number1 - 1];
                int pos1 = Arrays.binarySearch(array1, number11);
                System.arraycopy(array1, 0, array12, 0, pos1);
                System.arraycopy(array1, pos1 + 1, array12, pos1, (array12.length - pos1));
                System.out.println(Arrays.toString(array12));
                break;


            case 2:
                System.out.println("Введите размер массива: 0 - ...");
                int user = sc.nextInt();

                int[] arr2 = new int[user];
                int l2 = arr2.length;

                for (int i2 = 0; i2 < l2; i2++) {
                    arr2[i2] = (int) (Math.random() * (user + 1));
                }
                System.out.println(Arrays.toString(arr2));
                Arrays.sort(arr2);
                int sum = 0;

                for (int i23 = 0; i23 < l2; i23++) {
                    sum += arr2[i23];
                }
                System.out.println(sum);

                int b2 = sum / user;
                System.out.println("Наименьшее значение = " + arr2[0] + "\nНаибольшее значение = " + arr2[user - 1] +
                        "\nСреднее значение = " + b2);
                break;

            case 3:
                System.out.println("Есть два массива из 5 чисел...");

                int[] arr31 = new int[5];
                int[] arr32 = new int[5];

                for (int i31 = 0; i31 < 5; i31++) {
                    arr31[i31] = (int) (Math.random() * (100 + 1));
                }

                for (int i32 = 0; i32 < 5; i32++) {
                    arr32[i32] = (int) (Math.random() * (100 + 1));
                }
                System.out.println(Arrays.toString(arr31) + "\n" + Arrays.toString(arr32));

                int sum31 = 0;
                for (int i31 = 0; i31 < 5; i31++) {
                    sum31 += (arr31[i31]);
                }
                System.out.println("Сумма 1 = " + sum31);
                int am31 = sum31 / 5;
                System.out.println("Среднее арифметичсное 1 = " + am31);

                int sum32 = 0;
                for (int i32 = 0; i32 < 5; i32++) {
                    sum32 += (arr32[i32]);
                }
                System.out.println("Сумма 2 = " + sum32);
                int am32 = sum32 / 5;
                System.out.println("Среднее арифметическое 2 = " + am32);

                if (am31 > am32) {
                    System.out.println("Первое больше второго");
                } else if (am31 < am32) {
                    System.out.println("Второе больше первого");
                } else {
                    System.out.println("Числа равны");

                }
                break;

            case 4:

                int choice4;
                do {
                    System.out.println("Задайте размер массива, который больше 5 и меньше, либо равен 10");
                    choice4 = sc.nextInt();
                } while (choice4 < 6 || choice4 > 10);
                Integer[] array4 = new Integer[choice4];
                for (int i4 = 0; i4 < array4.length; i4++) {
                    array4[i4] = (int) (Math.random() * choice4 + i4);
                }
                System.out.println(Arrays.toString(array4));

                int sum4 = 0;
                for (int i41 = 0; i41 < array4.length; i41++) {
                    if (array4[i41] % 2 == 0 && array4[i41] / 2 != 0) {
                        System.out.println(array4[i41]);
                        sum4++;
                    }
                }
                System.out.println(sum4);

                int[] array42 = new int[sum4];

                int counter = 0;
                int i4 = 0;
                while (counter < array4.length) {
                    if (array4[counter] % 2 == 0 && array4[counter] / 2 != 0) {
                        array42[i4] = array4[counter];
                        i4++;
                    }
                    counter++;
                }

                System.out.println(Arrays.toString(array42));


            case 5:

                int[] array51 = new int[10];
                for (int i = 0; i < 10; i++) {
                    array51[i] = (int) (Math.random() * 100 + 1);
                }
                System.out.println(Arrays.toString(array51));

                for (int i1 = 0; i1 <10; i1++) {
                    if (array51[i1] % 2 != 0) {
                        array51[i1] = 0;
                    }
                }
                System.out.println(Arrays.toString(array51)); break;

            case 6:

                String [] arrayN = {"Алексей", "Антон", "Илья", "Александр", "Егоар"};
                System.out.println(Arrays.toString(arrayN));
                Arrays.sort(arrayN);
                System.out.println(Arrays.toString(arrayN)); break;


        }
    }
}

