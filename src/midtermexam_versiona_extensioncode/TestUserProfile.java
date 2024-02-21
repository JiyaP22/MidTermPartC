/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author jiyap
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to User Profile Creator!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Adventure");
        System.out.println("3. Comedy");
        System.out.println("4. Drama");
        System.out.println("5. Fantasy");
        System.out.println("6. Horror");
        System.out.println("7. Mystery");
        System.out.println("8. Romance");
        System.out.println("9. Sci-Fi");
        System.out.print("Enter the number corresponding to your choice: ");
        int genreChoice = scanner.nextInt();
        
        String genre;
        switch (genreChoice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Adventure";
                break;
            case 3:
                genre = "Comedy";
                break;
            case 4:
                genre = "Drama";
                break;
            case 5:
                genre = "Fantasy";
                break;
            case 6:
                genre = "Horror";
                break;
            case 7:
                genre = "Mystery";
                break;
            case 8:
                genre = "Romance";
                break;
            case 9:
                genre = "Sci-Fi";
                break;
            default:
                genre = "Unknown";
                break;
        }
        
        System.out.println("\nUser Profile Created Successfully!");
        System.out.println("Name: " + name);
        System.out.println("Favorite Genre: " + genre);
    }
}

