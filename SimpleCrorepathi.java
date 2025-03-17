package com.assignment;

import java.util.Scanner;

public class SimpleCrorepathi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalReward = 0;
        boolean[] lifelinesUsed = {false, false, false}; // to track used lifelines

        // question 1
        System.out.println("\nQuestion 1: What is the capital of India?");
        System.out.println("1. Delhi");
        System.out.println("2. Mumbai");
        System.out.println("3. Kolkata");
        System.out.println("4. Chennai");
        System.out.println("A. Audience Phone");
        System.out.println("B. 50-50");
        System.out.println("C. Skip");
        System.out.print("Enter your answer (1-4) or use a lifeline (A, B, C): ");
        String input1 = scanner.nextLine();

        if (input1.equalsIgnoreCase("A")) {
            if (lifelinesUsed[0]) {
                System.out.println("Audience Phone lifeline has already been used.");
            } else {
                System.out.println("Audience Phone: The majority of the audience thinks the answer is 1. Delhi");
                lifelinesUsed[0] = true;
            }
        } else if (input1.equalsIgnoreCase("B")) {
            if (lifelinesUsed[1]) {
                System.out.println("50-50 lifeline has already been used.");
            } else {
                System.out.println("50-50: Two options have been removed.");
                System.out.println("1. Delhi");
                System.out.println("4. Chennai");
                lifelinesUsed[1] = true;
            }
        } else if (input1.equalsIgnoreCase("C")) {
            if (lifelinesUsed[2]) {
                System.out.println("Skip lifeline has already been used.");
            } else {
                System.out.println("Skip: You have skipped this question.");
                lifelinesUsed[2] = true;
                totalReward += 1000; // reward for skipping
                System.out.println("Your total reward is now: " + totalReward + " Rupees.");
            }
        } else if (input1.equals("1")) {
            totalReward += 1000;
            System.out.println("Correct! Your total reward is now: " + totalReward + " Rupees.");
        } else {
            System.out.println("Incorrect! Game over. Your total reward is: " + totalReward + " Rupees.");
            return;
        }

        // question 2
        System.out.println("\nQuestion 2: Which is the largest planet in our solar system?");
        System.out.println("1. Earth");
        System.out.println("2. Mars");
        System.out.println("3. Jupiter");
        System.out.println("4. Saturn");
        System.out.println("A. Audience Phone");
        System.out.println("B. 50-50");
        System.out.println("C. Skip");
        System.out.print("Enter your answer (1-4) or use a lifeline (A, B, C): ");
        String input2 = scanner.nextLine();

        if (input2.equalsIgnoreCase("A")) {
            if (lifelinesUsed[0]) {
                System.out.println("Audience Phone lifeline has already been used.");
            } else {
                System.out.println("Audience Phone: The majority of the audience thinks the answer is 3. Jupiter");
                lifelinesUsed[0] = true;
            }
        } else if (input2.equalsIgnoreCase("B")) {
            if (lifelinesUsed[1]) {
                System.out.println("50-50 lifeline has already been used.");
            } else {
                System.out.println("50-50: Two options have been removed.");
                System.out.println("3. Jupiter");
                System.out.println("4. Saturn");
                lifelinesUsed[1] = true;
            }
        } else if (input2.equalsIgnoreCase("C")) {
            if (lifelinesUsed[2]) {
                System.out.println("Skip lifeline has already been used.");
            } else {
                System.out.println("Skip: You have skipped this question.");
                lifelinesUsed[2] = true;
                totalReward += 2000; // Reward for skipping
                System.out.println("Your total reward is now: " + totalReward + " Rupees.");
            }
        } else if (input2.equals("3")) {
            totalReward += 2000;
            System.out.println("Correct! Your total reward is now: " + totalReward + " Rupees.");
        } else {
            System.out.println("Incorrect! Game over. Your total reward is: " + totalReward + " Rupees.");
            return;
        }

        // question 3
        System.out.println("\nQuestion 3: What is the chemical symbol for water?");
        System.out.println("1. H2O");
        System.out.println("2. CO2");
        System.out.println("3. O2");
        System.out.println("4. N2");
        System.out.println("A. Audience Phone");
        System.out.println("B. 50-50");
        System.out.println("C. Skip");
        System.out.print("Enter your answer (1-4) or use a lifeline (A, B, C): ");
        String input3 = scanner.nextLine();

        if (input3.equalsIgnoreCase("A")) {
            if (lifelinesUsed[0]) {
                System.out.println("Audience Phone lifeline has already been used.");
            } else {
                System.out.println("Audience Phone: The majority of the audience thinks the answer is 1. H2O");
                lifelinesUsed[0] = true;
            }
        } else if (input3.equalsIgnoreCase("B")) {
            if (lifelinesUsed[1]) {
                System.out.println("50-50 lifeline has already been used.");
            } else {
                System.out.println("50-50: Two options have been removed.");
                System.out.println("1. H2O");
                System.out.println("2. CO2");
                lifelinesUsed[1] = true;
            }
        } else if (input3.equalsIgnoreCase("C")) {
            if (lifelinesUsed[2]) {
                System.out.println("Skip lifeline has already been used.");
            } else {
                System.out.println("Skip: You have skipped this question.");
                lifelinesUsed[2] = true;
                totalReward += 3000; // reward for skipping
                System.out.println("Your total reward is now: " + totalReward + " Rupees.");
            }
        } else if (input3.equals("1")) {
            totalReward += 3000;
            System.out.println("Correct! Your total reward is now: " + totalReward + " Rupees.");
        } else {
            System.out.println("Incorrect! Game over. Your total reward is: " + totalReward + " Rupees.");
            return;
        }

        // question 4
        System.out.println("\nQuestion 4: Who wrote the play 'Romeo and Juliet'?");
        System.out.println("1. William Shakespeare");
        System.out.println("2. Jane Austen");
        System.out.println("3. Charles Dickens");
        System.out.println("4. Mark Twain");
        System.out.println("A. Audience Phone");
        System.out.println("B. 50-50");
        System.out.println("C. Skip");
        System.out.print("Enter your answer (1-4) or use a lifeline (A, B, C): ");
        String input4 = scanner.nextLine();

        if (input4.equalsIgnoreCase("A")) {
            if (lifelinesUsed[0]) {
                System.out.println("Audience Phone lifeline has already been used.");
            } else {
                System.out.println("Audience Phone: The majority of the audience thinks the answer is 1. William Shakespeare");
                lifelinesUsed[0] = true;
            }
        } else if (input4.equalsIgnoreCase("B")) {
            if (lifelinesUsed[1]) {
                System.out.println("50-50 lifeline has already been used.");
            } else {
                System.out.println("50-50: Two options have been removed.");
                System.out.println("1. William Shakespeare");
                System.out.println("2. Jane Austen");
                lifelinesUsed[1] = true;
            }
        } else if (input4.equalsIgnoreCase("C")) {
            if (lifelinesUsed[2]) {
                System.out.println("Skip lifeline has already been used.");
            } else {
                System.out.println("Skip: You have skipped this question.");
                lifelinesUsed[2] = true;
                totalReward += 4000; // reward for skipping
                System.out.println("Your total reward is now: " + totalReward + " Rupees.");
            }
        } else if (input4.equals("1")) {
            totalReward += 4000;
            System.out.println("Correct! Your total reward is now: " + totalReward + " Rupees.");
        } else {
            System.out.println("Incorrect! Game over. Your total reward is: " + totalReward + " Rupees.");
            return;
        }

        // question 5
        System.out.println("\nQuestion 5: What is the capital of France?");
        System.out.println("1. Paris");
        System.out.println("2. London");
        System.out.println("3. Berlin");
        System.out.println("4. Madrid");
        System.out.println("A. Audience Phone");
        System.out.println("B. 50-50");
        System.out.println("C. Skip");
        System.out.print("Enter your answer (1-4) or use a lifeline (A, B, C): ");
        String input5 = scanner.nextLine();

        if (input5.equalsIgnoreCase("A")) {
            if (lifelinesUsed[0]) {
                System.out.println("Audience Phone lifeline has already been used.");
            } else {
                System.out.println("Audience Phone: The majority of the audience thinks the answer is 1. Paris");
                lifelinesUsed[0] = true;
            }
        } else if (input5.equalsIgnoreCase("B")) {
            if (lifelinesUsed[1]) {
                System.out.println("50-50 lifeline has already been used.");
            } else {
                System.out.println("50-50: Two options have been removed.");
                System.out.println("1. Paris");
                System.out.println("2. London");
                lifelinesUsed[1] = true;
            }
        } else if (input5.equalsIgnoreCase("C")) {
            if (lifelinesUsed[2]) {
                System.out.println("Skip lifeline has already been used.");
            } else {
                System.out.println("Skip: You have skipped this question.");
                lifelinesUsed[2] = true;
                totalReward += 5000; // reward for skipping
                System.out.println("Your total reward is now: " + totalReward + " Rupees.");
            }
        } else if (input5.equals("1")) {
            totalReward += 5000;
            System.out.println("Correct! Your total reward is now: " + totalReward + " Rupees.");
        } else {
            System.out.println("Incorrect! Game over. Your total reward is: " + totalReward + " Rupees.");
            return;
        }

        System.out.println("Congratulations! You have won the game with a total reward of: " + totalReward + " Rupees.");
        scanner.close();
    }
}