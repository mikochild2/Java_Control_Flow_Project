import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main( String args[]) {
        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();
        System.out.println("Look who?man, I can do tricks.\nJoking. . .\nOr not\n 0_o\nOk, no more jokes. Let's get started.\nBy the way..");

        //User interaction

        //Name
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name: ");
        String userName = scanner.next();
        System.out.println("Hello "+ userName+"\n");

        //Continue/Exit
        int continueTrigger = 0;
       // String nameContinueLowerCase; //= nameContinue.toLowerCase(); //tutorialspoint.com/java_string_tolowercase.htm
        do {
            System.out.println("Would you like to start the Lottery Survey? Yes or No");
        String nameContinue = scanner.next();

            switch(nameContinue) {
                case "yes":
                    System.out.println("\nGreat! Let's get started.");
                    continueTrigger = 1;
                    break;
                case "no":
                    System.out.printf("\nSorry to see you go %s. Please return later to complete the survey!.", userName);
                    System.exit(0); //geeksforgeeks.org/system-exit-in-java/
                default:
                    System.out.print("\nI'm not sure what that was . . .");
            }
        }
        while (continueTrigger == 0);

        
       
       // String newSurveyLowerCase = "yes";
       String newSurvey;
        do{
            //Pet Name
        System.out.println("\nWhat is the first name of your favorite pet? If you don't have one make one up.");
        String petName = scanner.next();
        if(petName.length() < 5) {
            System.out.println("\nGreat name!");
        }else {
            System.out.println("\nInteresting . . .");
        }

        //Pet Age
        System.out.println("\nHow old is " + petName + "?");
        int petAge = scanner.nextInt();                

        //Lucky Number
        System.out.println("\nWhat is your lucky number?");
        int luckyNumber = scanner.nextInt();
        System.out.println("\nAre you sure . . .\nNevermind. Next Question.");

        //Quarterback
        System.out.println("\nDo you have a favorite quarterback? If so, what is their jersey number? If not, any random 2 digit number will do.");
        int jerseyNumber = scanner.nextInt();
                if(jerseyNumber%2 == 1){
                    System.out.println("\nHow about those Bears?!\n. . .\nNo?\n. . .\nNever mind . . . stupid who?mans . . .");
                } else {
                    System.out.println("\nYou've got to be joking!\n Guess there's no accounting for taste when it comes to who?mans . . .");
                }

        //Car year
        System.out.println("\nWhat is the two-digit model year of your car? Hint: If you don't have a car, lie.");
        int carYear = scanner.nextInt();

        if(carYear <13) {
            System.out.println("\nTime for a new car, isn't it?");
        } else if(carYear < 17) {
            System.out.println("\nNot new, but not bad.");
        } else {
            System.out.println("\nNice!");
        }

        //Actor
        System.out.println("\nWhat is the first name of your favorite actor or actress?");
        String favActor = scanner.next();
        System.out.println("\nOk. . .");

        //Random Number
        int randomNum = 1;
        do {
            System.out.println("\nEnter a random number between 1 and 50.");
            randomNum = scanner.nextInt();
        }
        while (randomNum > 50);


        //Random Math Numbers
        Random rand = new Random(); //https://www.geeksforgeeks.org/generating-random-numbers-in-java/
        int rand_int1 = rand.nextInt(75);
        int rand_int2 = rand.nextInt(65);
        int rand_int3 = rand.nextInt(65);
        int rand_int4 = rand.nextInt(65);

        //Magic Ball
        int magicBall = luckyNumber * rand_int1;
        while (magicBall > 75) {
            magicBall = magicBall - 75;
        }

        //Other Random Numbers

        //Pet
        int petInput = petName.toUpperCase().charAt(2)-25;
        int petValue = petInput;

        //Car Year
        int carValue = carYear*luckyNumber;
        while (carValue > 65) {
            carValue = carValue - 65;
        }

        //Favorite Actor
        int actorInput = favActor.toUpperCase().charAt(0)-25;
        int actorValue = actorInput;

        //Pet Car
        int petCarValue = petAge + carYear;
        while (petCarValue > 65) {
            petCarValue = petCarValue-65;
        }

        //QB petAge luckyNumber
        int mixedValue = jerseyNumber + petAge + luckyNumber;
        while (mixedValue > 65) {
            mixedValue = mixedValue - 65;
        }

        System.out.printf("\nLottery numbers: %s, %S, %s, %s, %s Magic ball: %s", petValue, carValue, actorValue, petCarValue, mixedValue, magicBall);
        
        //Again?
        System.out.println("\nWould you like to reanswer the questions for more lottery numbers? Yes or No?");
        newSurvey = scanner.next();
        //newSurveyLowerCase = newSurvey.toLowerCase();
        }
        while (newSurvey.equalsIgnoreCase("yes")); // https://www.geeksforgeeks.org/compare-two-strings-in-java/
        
        System.out.println("\nHave a great day!");
        


        scanner.close();

    }
}