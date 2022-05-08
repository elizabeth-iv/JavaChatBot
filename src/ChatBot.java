import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        greeting();
        age();
        count();
        test();

    }
    public static void greeting(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey ya! I'm JAVACHATBOT Andre 3001");
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("I can't hear you\n" +
                "I say what's, what's your name? ");
        String name2 = scanner.nextLine();
        System.out.println("Nice to virtually meet you " + name2);
    }

    public static void age(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let me guess your age, enter the year you were born:");
        int year = Integer.valueOf(scanner.nextLine());
        System.out.println("Are you " + (2022 - year) + " years old");
        String confirm = scanner.nextLine();
        if (confirm.equalsIgnoreCase("yes")){
            System.out.println("Alright, alright, alright, alright, alright\n" +
                    "Alright, alright, alright, alright, alright\n" +
                    "Alright, alright, alright, alright");
        }else {
            System.out.println("Dang, I'm not very good at this");

        }
    }

    public static void count(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("You know, I'm really smart and can count. Enter a number you want me to count to: ");
        int number = scanner.nextInt();
        System.out.println("Here we go");
        for (int i = 0; i <= number; i++){
            System.out.println(i);
        }

    }

    public static void test(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Time to test your smarts. Answer the following question correctly and I'll let you live when robots take over as a treat.");
        System.out.println("What is Java?\nA)One of the Greater Sunda Islands in Indonesia\nB)A drink that contains drug that stimulates the central nervous system, causing increased alertness \nC)An object-oriented high-level programming language\nD)A village on Sao Tome Island in the nation of Sao Tome and Principe");
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("C")){
                System.out.println("CORRECT\n You've proved yourself worthy to live");
                break;
            } else {
                System.out.println("WRONG\n Lucky for you I am a humane robot and will allow you to try again");
            }
        }
    }
}
