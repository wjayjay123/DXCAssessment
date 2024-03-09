package Encoder;

import java.util.Scanner;
import Encoder.Encoder;

public class Main {

    // Function to print Menu
    private void getMenu() {
        System.out.println("--Menu--");
        System.out.println("1. Encode");
        System.out.println("2. Decode");
        System.out.println("3. Exit");
        System.out.print("Select Option: ");
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        Encoder encoder = new Encoder();
        String offSetError = "Invalid offset. Please try again\n";

        whileloop:
        // Loop for Menu
        while (true) {
            main.getMenu();
            String option = scanner.nextLine();

            switch (option.toLowerCase()) {
                case "encode":
                case "1":
                    System.out.println("Enter PlainText: ");
                    String plainText = scanner.nextLine().toUpperCase();
                    System.out.println("Enter OffSet: ");
                    String input = scanner.nextLine().toUpperCase();
                    try {
                        char offSet = input.charAt(0);
                        String encodedText = encoder.encode(plainText, offSet);
                        if (encodedText != offSetError) {
                            System.out.println("\nThe encoded text is: " + encodedText + "\n");
                        } else {
                            System.out.println(encodedText + "\n");
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                        System.out.println("Invalid input. Please check again\n");
                    }
                    break;

                case "3":
                    System.out.println("Exiting program.\n");
                    break whileloop;

                default:
                    System.out.println("Invalid Option\n");
                    break;
            }

        }
    }
}
