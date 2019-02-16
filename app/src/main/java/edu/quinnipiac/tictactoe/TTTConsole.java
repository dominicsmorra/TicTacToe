package edu.quinnipiac.tictactoe;

import java.util.Scanner;

public class TTTConsole {

    public static Scanner in = new Scanner(System.in); // the input Scanner

    public static TicTacToe TTTboard = new TicTacToe();
    /** The entry main method (the program starts here) */
    public static void main(String[] args) {

        int currentState = TicTacToe.PLAYING;
        String userInput;
        //game loop
        do {
            boolean done = false;
            TTTboard.printBoard();
            // Print message if game-over

            userInput = in.next();
            while(Integer.valueOf(userInput) > 8 || Integer.valueOf(userInput) < 0) {
                System.out.println("Number between 0-8");
                userInput = in.next();
            }
            TTTboard.setMove(1, Integer.valueOf(userInput));
            currentState = TTTboard.checkForWinner();
            if (currentState == 0){
                int num = TTTboard.getComputerMove();
                TTTboard.setMove(2, num);
                currentState = TTTboard.checkForWinner();
            }

            /**
             * get player input here and call setMove(). user should input a number between 0-8
             */

            if (currentState == ITicTacToe.CROSS_WON && !done) {
                System.out.println("'X' won! Bye!");
                TTTboard.printBoard();
            } else if (currentState == ITicTacToe.NOUGHT_WON && !done) {
                System.out.println("'O' won! Bye!");
                TTTboard.printBoard();
            } else if (currentState == ITicTacToe.TIE && !done) {
                System.out.println("It's a TIE! Bye!");
                TTTboard.printBoard();
            }
            //user can break the loop. remove this line when you finish implementation.


        } while ((currentState == ITicTacToe.PLAYING) && (!userInput.equals("q"))); // repeat if not game-over
    }

}
