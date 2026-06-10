package com.mycompany.firstpriject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList_learn {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(202);


        System.out.println(list);

        list.add(1, 20); // vache add thay jase
        System.out.println(list);

        System.out.println(list.get(0));

//        list.set(0,010); // j position par hasse te position override thay jase
//        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        list.remove(Integer.valueOf(20));
        System.out.println(list);

        // Checking Element Exists
        System.out.println(list.contains(2));
        list.add(34);

        for (Integer l : list) {
            System.out.println(l);
        }

        // sort
        Collections.sort(list);
        System.out.println(list);


//        get array list size
        System.out.println("Array list size: "+ list.size());
    }
}
