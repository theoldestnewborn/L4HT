package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

            public static void  main (String [] args) {
                System.out.println("Проверить задание 0-7");
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();

                switch (choice) {
                    case 0:
                        System.out.println("Введите число");
                        int number0 = sc.nextInt();

                        int[] array0 = new int [100];
                        int l0 = array0.length;
                        for (int i = 0; i<l0; i++){
                            array0[i] = i+1;
                        }
                        int pos0 = Arrays.binarySearch(array0, number0);
                        if (pos0 < 100 && pos0 > 0) {
                            System.out.println("Число " + number0 + " принадлежит массиву 1-100");
                        } else {
                            System.out.println("Число " + number0 + " не принадлежит массиву 1-100");
                        }


                    case 1:
                        System.out.println("Введите конечное число массива");
                        int number1 = sc.nextInt();
                        int [] array1 = new int [number1];

                        int l1 = array1.length;
                        for (int i1 = 0; i1 < l1; i1++) {
                            array1 [i1] = i1+1;
                        }
                        System.out.println(Arrays.toString(array1));

                        System.out.println("Какое число следует удалить из массива?");
                        int number11 = sc.nextInt();

                        int[] array12 = new int [number1];
                        int l2 = array12.length;

                        for (int i2 = 0; i2 < l2;i2++) {
                            if (i2 == number11)
                                continue;
                            array12 [i2] = i2+1;
                            System.out.println(array12[i2]);
                        }

                    case 2:

                }
            }
        }
