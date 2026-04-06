package org.example;

public class UC4 {
    public static void main(String[] args) {

            String result;

            // Check if arguments are provided
            if (args.length > 0) {
                result = String.join(", ", args); // Join names with comma
            } else {
                result = "World"; // Default value
            }

            System.out.println("Hello, " + result + "!");
        }
    }

