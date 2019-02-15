/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KollectsijaMassiv2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author user1
 */
public class Massive2 {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> LinkedList = new LinkedList<>();

        measureTime(arrayList, "arrayList");
        measureTime(LinkedList, "LinkedList");

    }

    private static void measureTime(List<Integer> list, String desk) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(0, i);

        }
        long end = System.currentTimeMillis();
        System.out.println(desk + " diff " + (end - start));
        System.out.println("");

        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }
    }
}
