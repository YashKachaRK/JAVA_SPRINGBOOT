package com.mycompany.pattern;

public class p11 {
    static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 5; j++) {
               if((i == 1 || i == n) && (j==1 || j==n)){
                   System.out.print(i); // 1 5
               }
               else if ((i==2 && (j==2 || j == 4))){
                   System.out.print(i);
               }else if(i == 3 && j == 3){
                   System.out.print(i);
               } else if (i == 4 && (j==4 || j ==2)) {
                   System.out.print(i);
               }
               else {
                   System.out.print("*");
               }
            }

            System.out.println();
        }
    }
}
