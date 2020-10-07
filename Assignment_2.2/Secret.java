import java.util.Scanner;

class Secret {

    public static void main (String[] args) {
        Scanner i = new Scanner(System.in);
        String answer   = " ";
        System.out.print("Whats the password?");
        answer = i.nextLine();
        if("dragon".equals (answer))
        System.out.println("Correct! My secret is: I am Darth Veder.");
    else
        System.out.println("Incorrect ! My secret is still safe.");
    }
}