
public class FirstClass {
    public static void main(String[] args) {
        System.out.println("First class");
    }
}

class SecondClass {
    public static void main(String[] args) {
        for (String s: args) {
            System.out.println(s);
        }
        System.out.println("Second class");
    }
}

class ThirdClass {
    public static void main(String[] args) {
        System.out.println("Third class");
    }
}