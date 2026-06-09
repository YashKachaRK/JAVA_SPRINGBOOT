/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.firstpriject;

import com.mycompany.emp.*;

class Age extends Employe {
    protected String fname  = "Kacha";
}

public class FIrstPriject {

    public static void main(String[] args) {

        Age a = new Age();
        a.name = "Yash";
        a.salary = 2500;
        System.out.println(a.fname);
        a.display();
    }

}
