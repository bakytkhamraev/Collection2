package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>(5);
        listA.add(sc.nextLine());
        listA.add(sc.nextLine());
        listA.add(sc.nextLine());
        listA.add(sc.nextLine());
        listA.add(sc.nextLine());

        Iterator<String> iter = listA.iterator();
        while (iter.hasNext()) {
            String a = iter.next();
            System.out.println(listA);

        System.out.println("Список А");


            listA.ensureCapacity(10);
            ArrayList<String> listB = new ArrayList<>(10);

            listB.add(sc.nextLine());
            listB.add(sc.nextLine());
            listB.add(sc.nextLine());
            listB.add(sc.nextLine());
            listB.add(sc.nextLine());
            System.out.println("Список B");

            iter = listB.iterator();
            while (iter.hasNext()) {
                a = iter.next();
                System.out.println(listB);
            }


            ArrayList<String> listC = new ArrayList<>();

            listC.add(sc.nextLine());
            listC.add(sc.nextLine());
            listC.add(sc.nextLine());
            listC.add(sc.nextLine());
            listC.add(sc.nextLine());

            Collections.sort(listA);
            Collections.sort(listB);
            Collections.reverse(listB);
            listC.addAll(listA);
            listC.addAll(listB);

            System.out.println(listC);

            Collections.sort(listC);
            listC.toString().length();


            Iterator<String> iterator = listC.iterator();
            while (iter.hasNext()) {
                String b = iter.next();

            }


            System.out.println(listC);
        }
    }
}