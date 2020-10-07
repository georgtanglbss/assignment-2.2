import java.util.Scanner;

public class Magic8Ball {
    public static void main (String[] args) {
        Scanner j = new Scanner(System.in);
        int i = (int)(Math.random()*20) +1 ;
        System.out.println("Ask a question!!:");
        j.nextLine();
        if (i == 1) {
            System.out.println("As I see it, yes.");
        } else if (i == 2) {        
            System.out.println("Ask again later.");
        } else if (i == 3) {
            System.out.println("Better not tell you now.");
        } else if (i == 4) {
            System.out.println("Cannot predict now.");
        } else if (i == 5) {
            System.out.println("Concentrate and ask again.");
        } else if (i == 6) {
            System.out.println("Don’t count on it.");
        } else if (i == 7) {
            System.out.println("It is certain.");
        } else if (i == 8) {
            System.out.println("It is decidedly so.");
        } else if (i == 9) {
            System.out.println("Most likely.");
        } else if (i == 10) {
            System.out.println("My reply is no.");
        } else if (i == 11) {
            System.out.println("My sources say no.");
        } else if (i == 12) {
            System.out.println("Outlook not so good.");
        } else if (i == 13) {
            System.out.println("Outlook good.");
        } else if (i == 14) {
            System.out.println("Reply hazy, try again.");
        } else if (i == 15) {
            System.out.println("Signs point to yes.");
        } else if (i == 16) {
            System.out.println("Very doubtful.");
        } else if (i == 17) {
            System.out.println("Without a doubt.");
        } else if (i == 18) {
            System.out.println("Yes.");
        } else if (i == 19) {
            System.out.println("Yes – definitely.");
        } else if (i == 20) {
            System.out.println("You may rely on it.");
        }
    }
}