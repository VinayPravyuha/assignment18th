package none.cvg.maven.datetime.greetinggen;

import none.cvg.maven.greeting.Greeting;

import java.util.Scanner;

public class GreetingGenerator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter your name ");

        String j=sc.nextLine();
        Greeting greeting = new Greeting();
        System.out.println(j +"\n" + greeting.greet());
        System.out.print("\nEnter the message u need to hide:-");
        sc.nextLine();
        System.out.println("\nThe message has been saved ");
    }
}
