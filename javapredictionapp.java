import java.util.Scanner;

public class javapredictionapp {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();

        String namelastword =
                String.valueOf(name.charAt(name.length() - 1)).toLowerCase();
        switch (namelastword){
            case "a":
                System.out.println("your day is gonna be better");
                break;

            case "b":
                System.out.println("you are gonna get a new job");
                break;

            case "c":
                System.out.println("you will be rich soon");
                break;

            case "d":
                System.out.println("good news is coming your way");
                break;

            case "e":
                System.out.println("a surprise opportunity awaits you");
                break;

            case "f":
                System.out.println("you will make a new friend soon");
                break;

            case "g":
                System.out.println("success is closer than you think");
                break;

            case "h":
                System.out.println("happiness will find you today");
                break;

            case "i":
                System.out.println("an exciting adventure is ahead");
                break;

            case "j":
                System.out.println("joy will fill your day");
                break;

            case "k":
                System.out.println("kindness will be rewarded");
                break;

            case "l":
                System.out.println("luck is on your side");
                break;

            case "m":
                System.out.println("money may come unexpectedly");
                break;

            case "n":
                System.out.println("new beginnings are approaching");
                break;

            case "o":
                System.out.println("opportunities will open for you");
                break;

            case "p":
                System.out.println("positive changes are coming");
                break;

            case "q":
                System.out.println("quick progress will surprise you");
                break;

            case "r":
                System.out.println("recognition is heading your way");
                break;

            case "s":
                System.out.println("something wonderful will happen soon");
                break;

            case "t":
                System.out.println("today is a great day to start something new");
                break;

            case "u":
                System.out.println("unexpected blessings are coming");
                break;

            case "v":
                System.out.println("victory will be yours");
                break;

            case "w":
                System.out.println("wealth and happiness are approaching");
                break;

            case "x":
                System.out.println("extraordinary things are waiting for you");
                break;

            case "y":
                System.out.println("your dreams are getting closer");
                break;

            case "z":
                System.out.println("zest and energy will fill your day");
                break;

            default:
                System.out.println("please enter a letter from a to z");
                break;



        }
        System.out.println("Wish you very best for your future");



    }
}
