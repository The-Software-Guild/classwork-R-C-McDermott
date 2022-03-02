
package com.rcmcdermott.classplay;


public class ClassPlay {
    public static void main(String[] args) {
        System.out.println("First class");
    }
}

class SecondPlay {
    public static void main(String args[]) {
        
        for (String s : args) {
            System.out.println(s);
        }
        System.out.println("Second class");
    }
}