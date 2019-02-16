package edu.quinnipiac.tictactoe;

public class TicTacToe implements ITicTacToe{// The game board and the game status
    private static final int ROWS = 3, COLS = 3; // number of rows and columns
    private int[][] board = new int[ROWS][COLS]; // game board in 2D array

    /**
     * clear board and set current player
     */
    public TicTacToe(){

    }
    @Override
    public void clearBoard() {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                board[i][j] = 0;
            }
        }
    }

    @Override
    public void setMove(int player, int location) {
        int count = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(count == location && (board[i][j] == 0)) {
                    board[i][j] = player;
                }
                count ++;
            }
        }
    }

    @Override
    public int getComputerMove() {
        int count = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 0) {
                    return count;
                }
                count ++;
            }
        }
        return 0;
    }

    @Override
    public int checkForWinner() {
        int count = 0;
        for(int i=0; i<3; i++) {
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][1] != 0) {
                if(board[i][0] == 1) {
                    return 2;
                } else {
                    return 3;
                }

            }
        }
        for(int i=0; i<3; i++) {
            if(board[0][i] == board[1][i] && board[2][i] == board[1][i] && board[1][i] != 0) {
                if(board[0][i] == 1) {
                    return 2;
                } else {
                    return 3;
                }
            }
        }

        if(board[0][0]==board[1][1] && board[1][1] == board[2][2] && board[1][1] != 0) {
            if(board[0][0] == 1) {
                return 2;
            } else {
                return 3;
            }

        }

        if(board[2][0]==board[1][1] && board[0][2] == board[1][1] && board[1][1] != 0) {
            if(board[2][0] == 1) {
                return 2;
            } else {
                return 3;
            }

        }

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] != 0) {
                    count ++;
                }
            }
        }
        if(count == 9) {
            return 1;
        }

        return 0;
    }

    /**
     *  Print the game board
     */
    public  void printBoard() {
        for (int row = 0; row < ROWS; ++row) {
            for (int col = 0; col < COLS; ++col) {
                printCell(board[row][col]); // print each of the cells
                if (col != COLS - 1) {
                    System.out.print("|");   // print vertical partition
                }
            }
            System.out.println();
            if (row != ROWS - 1) {
                System.out.println("-----------"); // print horizontal partition
            }
        }
        System.out.println();
    }

    /**
     * Print a cell with the specified "content"
     * @param content either CROSS, NOUGHT or EMPTY
     */
    public  void printCell(int content) {
        switch (content) {
            case EMPTY:  System.out.print("   "); break;
            case NOUGHT: System.out.print(" O "); break;
            case CROSS:  System.out.print(" X "); break;
        }
    }// Name-constants to represent the seeds and cell contents

}
