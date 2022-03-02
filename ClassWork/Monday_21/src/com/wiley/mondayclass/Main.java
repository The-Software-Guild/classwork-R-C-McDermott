package com.wiley.mondayclass;

public class Main {

    public Main() {
        String name = "Ryan";
        System.out.println(name);
    }

    public void displayName() {
        String name = "Adam";
        System.out.println(name);
    }

    public void printMsg(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Products p = new Products();
        p.display();

        String name = "Lax";
        System.out.println(name);

        Main m = new Main();
        m.displayName();
        m.printMsg("Hello there");

    }
}
