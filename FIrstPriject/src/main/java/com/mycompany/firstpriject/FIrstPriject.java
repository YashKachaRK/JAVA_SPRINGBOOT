/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.firstpriject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FIrstPriject {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);

        list.add(2);
        list.add(3);

//        list.clear(); // list ne empty kari nakhe 
//        list.remove(1);
//        list.remove(Integer.valueOf(10));
//        System.out.println(list.isEmpty());
//      list.set(0, 200);
//      int a = list.indexOf(120); // index ape
//      boolean  = list.contains(1200); //  data hoi to true nakar false
//      int  = list.size(); // list ni size ape
//        List<Integer> list2 = new ArrayList<>();
//
//        list2.add(1);
//        list2.add(2);
//        System.out.println("list 1" + list);
//        System.out.println("List 2" + list2);
//
//        list.addAll(list2);
//        System.out.println(list);
        // matching element remove karva che list1 mathi
//        list.removeAll(list2);
//        
//        System.out.println(list); // 1 chhe nikadi jase comman element chhe
//        list.retainAll(list2);
//        System.out.println(list); // list2 ma j nai hoi te remove 
//        Object a[] = list.toArray();
//        System.out.println(a);
//        
//        for (Object e : a){
//            System.out.println(e);
//        }
//        System.out.println(list);
//        list.add(1,5);
        System.out.println(list);
        Iterator<Integer> num = list.iterator();
        while(num.hasNext()){
            System.out.println(num.next());
        }
    }
}
