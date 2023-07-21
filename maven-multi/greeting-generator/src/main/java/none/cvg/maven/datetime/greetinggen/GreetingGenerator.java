package none.cvg.maven.datetime.greetinggen;

import none.cvg.maven.greeting.Greeting;

import java.util.Scanner;

public class GreetingGenerator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Add operation  enter number 1");
        int i=sc.nextInt();
        System.out.println("enter number 2");
        int j=sc.nextInt();
        Greeting greeting = new Greeting();
        System.out.println("\n" + greeting.greet());
        System.out.println("\nadded number\n" + (i+j));
    }
}
