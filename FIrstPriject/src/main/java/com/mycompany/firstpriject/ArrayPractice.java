package com.mycompany.firstpriject;

import java.lang.classfile.instruction.LineNumber;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayPractice {

    static void main() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(1);

        System.out.println("First Quation :- " + a);
//        int sum = 0;
//        for (int i = 0; i < a.size(); i++) {
//            sum = sum + a.get((i));
//            System.out.println(a.get(i));
//        }
//        System.out.println("Sum is: "+sum);
//
//        float avg = sum/a.size();
//        System.out.println(avg);



//        try {
//            System.out.println(Collections.max(a));
//
//        }catch (Exception e){
//            System.out.println(e);
//        }



//        try {
//            System.out.println(Collections.min(a));
//
//        }catch (Exception e){
//            System.out.println(e);
//        }

//        int count = 0 ;
//        for (int i = 0; i < a.size(); i++) {
//
//            int curent = a.get(i);
//
//            if (curent % 2 == 0){
//                count = count + 1  ;
//            }
//        }
//
//        System.out.println(count);

//        int count = 0 ;
//        for (int i = 0; i < a.size(); i++) {
//
//            int curent = a.get(i);
//
//            if (curent % 2 == 1){
//                count = count + 1  ;
//            }
//        }
//
//        System.out.println(count);

//        int targer = 30 ;
//        for (int i = 0; i<a.size(); i++){
//            if (a.get(i) == targer){
//                System.out.println(i);
//                break;
//            }
//        }
//        Collections.reverse(a);
//        System.out.println(a);

//        ArrayList<Integer> list2 = new ArrayList<>();
//
//        list2.addAll(a);
//        System.out.println(list2);


//        Collections.sort(a);
//        int secondLagest =   a.get(a.size()-2);
//        System.out.println(a.size());
//        System.out.println(secondLagest);



//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//        System.out.println(largest);
//        for (int num : a){
//           if(num > largest){
//                secondLargest = largest;
//                largest = num;
//
//           } else if(num > secondLargest && num != largest){
//               secondLargest = num;
//           }
//        }
//        System.out.println(secondLargest);



    }


}
