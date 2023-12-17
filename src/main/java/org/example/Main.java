package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IncorrectPincodeException {

        boolean flag = false;
        Scanner scanner = new Scanner(System.in);

        while(!flag)
        {
            System.out.print("Enter the pincode: ");

            try {
                Pincode pincode = new Pincode(scanner.nextLine());
                flag = true;
            }

            catch (IncorrectPincodeException e)
            {
                System.out.println(e.getMessage());
            }

        }
    }
}