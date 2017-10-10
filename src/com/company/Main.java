package com.company;

import com.company.Adapters.IteratorToEnumeration;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> al = new ArrayList<String>();


        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        System.out.print("Original contents of al: ");
        IteratorToEnumeration<String> iterToEnum = new IteratorToEnumeration<>(al.iterator());

        while (iterToEnum.hasMoreElements()) {
            String element = iterToEnum.nextElement();
            System.out.print(element + " ");
        }

        System.out.println();
    }
}
