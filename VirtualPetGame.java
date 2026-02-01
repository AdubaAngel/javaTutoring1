import java.util.Scanner;

public class VirtualPetGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the virtual pet app!");
        System.out.println("Enter a name for your pet: ");

        String petName = scanner.nextLine();

        VirtualPet myPet = new VirtualPet(petName, 0, 0, 0);

        System.out.println("Congratulations, you have adopted " + petName + ".");

        boolean gameRunning = true;

        while(gameRunning){
            System.out.println("What would you like to do?");
            System.out.println("Feed " + petName);
            System.out.println("Play with " + petName);
            System.out.println("Allow " + petName + " to sleep");
            System.out.println("Check status");
            System.out.println("Enter your choice (1 - 5):");
            Scanner choiceScanner = new Scanner(System.in);
            String choice =  scanner.nextLine();
            //int option = choiceScanner.nextInt();

            switch (choice) {
                case "1":
                    System.out.println("What is " + petName + "'s current hunger level");
                    int option = choiceScanner.nextInt();

                    myPet.feed(option);
                    break;

                case "2":
                    myPet.play();
                    break;

                case "3":
                    myPet.sleep();
                    break;

                case "4":
                    myPet.checkStatus();
                    break;

                case "five":
                    gameRunning = false;
                    System.out.println("Thanks for playing");

                    break;
            
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }
    }

}
