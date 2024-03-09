package Encoder;

import java.util.Scanner;

public class Main {

    // Function to print Menu
    private void getMenu() {
        System.out.println("--Menu--");
        System.out.println("1. Encode");
        System.out.println("2. Decode");
        System.out.println("3. Exit");
        System.out.print("Select Option: ");
    }

    private void getDecodeMenu() {
        System.out.println("--Decode previously encoded text?--");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("3. Back");
        System.out.print("Select Option: ");
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();
        String offSetError = "Invalid offset. Please try again\n";

        whileloop:
        // Loop for Menu
        while (true) {
            main.getMenu();
            String option = scanner.nextLine();
            switch (option.toLowerCase()) {
                case "encode":
                case "1":
                    System.out.println("Enter plain text: ");
                    String plainText = scanner.nextLine().toUpperCase();
                    System.out.println("Enter offset: ");
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

                case "decode":
                case "2":
                    main.getDecodeMenu();
                    option = scanner.nextLine();
                    switch (option.toLowerCase()) {
                        case "yes":
                        case "1":
                            if (encoder.getPrevEncoded() == "") {
                                System.out.println("No previous encoded text. Please encode a text.\n");
                                break;
                            } else {
                                System.out.println("Prevous encoded text is: " + encoder.getPrevEncoded());
                                String decodedText = decoder.decode(encoder.getPrevEncoded());
                                System.out.println("\nThe decoded text is: " + decodedText + "\n");
                            }
                            break;

                        case "no":
                        case "2":
                            System.out.println("Enter encoded text: ");
                            String encodedText = scanner.nextLine().toUpperCase();
                            try {
                                String decodedText = decoder.decode(encodedText);
                                if (decodedText != offSetError) {
                                    System.out.println("\nThe decoded text is: " + decodedText + "\n");
                                } else {
                                    System.out.println(decodedText + "\n");
                                }
                            } catch (Exception e) {
                                System.out.println(e);
                                System.out.println("Invalid input. Please check again\n");
                            }
                            break;

                        case "exit":
                        case "3":
                            break;
                        default:
                            System.out.println("Invalid Option\n");
                            break;
                    }
                    break;

                case "exit":
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
