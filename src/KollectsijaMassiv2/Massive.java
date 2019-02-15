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
public class Massive {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> LinkedList = new LinkedList<>();
        for (int i=0; i< 100; i++) {
            arrayList.add(i);
        }
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(99));
//        
//        System.err.println(arrayList.get(arrayList.size()-1));
//        
//        for (int i = 0; i< arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
//        for (Integer x : arrayList) {
//            System.out.println(x);
//        }
//        arrayList.forEach((x) -> {
//            System.err.println(x);
//           
//        });

for (Integer x :arrayList) {
            LinkedList.add(x);
        }
        
        System.out.println(LinkedList);

        
        
    }
    
}
