/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3_2;

import java.util.Scanner;

/**
 *
 * @author punpu
 */
public class Ex3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LiveScoreBean liveScore = new LiveScoreBean();

        Subscriber s1 = new Subscriber("live result");
        Subscriber s2 = new Subscriber("live result");

        liveScore.addPropertyChangeListener(s1);
        liveScore.addPropertyChangeListener(s2);

        while (true) {
            System.out.print("Enter Score: ");
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Program terminated.");
                break;
            }

            liveScore.setSampleProperty(input);
        }

        scanner.close();
    }
    
}
