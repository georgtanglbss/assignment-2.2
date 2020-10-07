import java.util.Scanner;

class GradeBot {
    public static void main (String[] args) {
        Scanner i = new Scanner(System.in);
        double outof = 0;
        double mark = 0;
        double percent = 0;
        
        System.out.print("What was the test out of? ");
        outof = i.nextDouble();
        System.out.print("What did you get? ");
        mark = i.nextDouble();
        
        if(mark > outof || outof == 0 || mark < 0){
            System.out.print("Silly human, that's not possible. Quit joking around.");
        }else{
            percent = 100 * (mark / outof);
            if (percent >= 86) {
                System.out.println("That's an A");
            } else if (percent >= 73) {
                System.out.println("That's a B");                
            } else if (percent >= 67) {
                System.out.println("That's a C+");
            } else if (percent >= 60) {
                System.out.println("That's a C");
            } else if (percent >= 50) {
                System.out.println("That's a C-");                
            } else {
                System.out.println("That's an F");
            }

        }
    }
}