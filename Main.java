import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main( String args[]) {
        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();
        System.out.println("Look human, I can do tricks.\nJoking\n. . .\nOr not\n 0_o\nOk, no more jokes. Let's get started.\nBy the way..");

        //User interaction

        //Name
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name: ");
        String userName = scanner.next();
        System.out.println("Hello "+ userName);

        //Continue/Exit
        System.out.print("Continue or End?");
        String nameContinue = scanner.next();
        String lowerCaseContinue = nameContinue.toLowerCase(); //tutorialspoint.com/java_string_tolowercase.htm

        switch(lowerCaseContinue) {
            case "continue":
                break;
            case "end":
                System.out.print("Thank you for participating! Please return later to complete the survey.");
                System.exit(0); //geeksforgeeks.org/system-exit-in-java/
            default:
                System.out.print("Not sure what that was, but it wasn't 'Continue' so . . .\nGood bye.");
                System.exit(0);
        }

        //Car
        System.out.println("Do you have a red car? Yes or No");
        String redCar = scanner.next();

        //Pet Name
        System.out.println("Are you a pet owner? Yes or No");
        String petOwner = scanner.next();
        String petOwnerLowerCase = petOwner.toLowerCase();

        switch(petOwnerLowerCase) {
            case "yes":
                System.out.println("What is the name of your favorite pet?");
                String petName = scanner.next();
                if(petName.length() < 5) {
                    System.out.println("Great name!");
                }else {
                    System.out.println("Interesting . . .");
                };
                System.out.println("How old is " + petName + "?\nDon't be complicated. No decimals or fractions.");
                int petAge = scanner.nextInt();
                break;
            case "no":
                System.out.println("I'm sorry for your loss.");
        }
        

        //Lucky Number
        System.out.println("What is your lucky number?");
        int luckyNumber = scanner.nextInt();
        System.out.println("Are you sure . . .\nNevermind. Next Question.");

        //Quarterback
        System.out.println("Do you have a favorite quarterback? Yes or No");
        String favQb = scanner.next();
        String favQbLowerCase = favQb.toLowerCase();

        switch(favQbLowerCase) {
            case "yes":
                System.out.println("What is their jersey number?");                
                break;
            case "no":
                System.out.println("Not much into sports, are you? Ok, just enter any 2 digit number.");
                break;
            default:
                System.out.println("Don't understand yes or no, do you who?man . . . Ok, just enter any 2 digit number.");
        }

        int jerseyNumber = scanner.nextInt();
                if(favQbLowerCase.equals("no")){

                } else if(jerseyNumber%2 == 1){
                    System.out.println("How about those Bears?!\n. . .\nNo?\n. . .\nNever mind . . . stupid who?mans . . .");
                } else {
                    System.out.println("You've got to be joking!\n Guess there's no accounting for taste in a who?man . . .");
                }

        //Car year
        System.out.println("What is the two-digit model year of your car? Hint: If you don't have a car, lie.");
        int carYear = scanner.nextInt();

        if(carYear <13) {
            System.out.println("Time for a new car, isn't it?");
        } else if(carYear < 17) {
            System.out.println("Not new, but not bad.");
        } else {
            System.out.println("Nice!");
        }

        //Actor
        System.out.println("Who is your favorite actor or actress?");
        String favActor = scanner.next();
        System.out.println("Ok. . .");

        //Random Number
        System.out.println("Enter a random number between 1 and 50.");
        Double randomNum = scanner.nextDouble();

        //Magic Ball
        Random rand = new Random(50); //https://mathbits.com/JavaBitsNotebook/LibraryMethods/RandomGeneration.html

        if(jerseyNumber/2 < luckyNumber*Math.random()/2) {
            if(luckyNumber*rand.nextInt() < 75) {
                int magicBall = luckyNumber*rand.nextInt();
            } else {
                int magicBall = (luckyNumber*rand.nextInt()) - 75;

            }
        } else {
            if(jerseyNumber*rand.nextInt() < 75) {
                int magicBall = jerseyNumber*rand.nextInt();
            } else {
                int magicBall = (jerseyNumber*rand.nextInt()) - 75;
            }
        }

        System.out.println("Lottery numbers: "+)
 
        




            
                

        scanner.close();

    }
}