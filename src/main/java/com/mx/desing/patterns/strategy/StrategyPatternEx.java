package com.mx.desing.patterns.strategy;

import java.util.Scanner;

public class StrategyPatternEx {

    public static void main(String[] args) {
        System.out.println("***Strategy Pattern Demo***");
        
        IChoice ic = null;
        Context cxt = new Context();
        String input1, input2;;

        try(Scanner in = new Scanner(System.in);/* To take input from user*/ ) {
            for (int i = 1; i <= 2; i++) { //Looping twice to test two different choices
                System.out.println("Enter an integer:");
                input1 = in.nextLine();
                
                System.out.println("Enter another integer:");
                input2 = in.nextLine();
                
                System.out.println("Enter ur choice(1 or 2)");
                System.out.println("Press 1 for Addition, 2 for Concatenation");
                String c = in.nextLine();
                
                if (c.equals("1")) { //If user input is 1, create object of FirstChoice (Strategy 1)
                    ic = new FirstChoice();
                } else { //If user input is 2, create object of SecondChoice (Strategy 2)
                    ic = new SecondChoice();
                }

                cxt.SetChoice(ic); //Associate the Strategy with Context
                cxt.ShowChoice(input1, input2);
            }
        }
        
        System.out.println("End of Strategy pattern");
    }
}
