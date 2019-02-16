//Dominic Smorra
//SER 210
// Tic Tac Toe Android game


package edu.quinnipiac.tictactoe;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    boolean PLAYER_X = true;

    int TURN_COUNT = 0;
    Boolean WINNER = false;

    Button b0;
    Button b1;
    Button b2;

    Button b3;
    Button b4;
    Button b5;

    Button b6;
    Button b7;
    Button b8;

    String player1;
    String player2;
    String startTitle;

    Button resetButton;


    TextView title;

    private static final int ROWS = 3, COLS = 3; // number of rows and columns
    private int[][] board = new int[ROWS][COLS];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        player1 = intent.getStringExtra("PLAYER_1");
        player2 = intent.getStringExtra("PLAYER_2");
        startTitle = "Welcome "  + player1 + "!";
        setTitle(startTitle);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);

        resetButton = (Button) findViewById(R.id.resetButton);
        resetButton.setEnabled(false);
        title = (TextView) findViewById(R.id.title);

        resetButton.setOnClickListener(this);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);

        initializeBoardStatus();

    }

    public void makeComputerMove(int buttonNumber){

        switch (buttonNumber){
            case 0:
                b0.callOnClick();
                break;

            case 1:
                b1.callOnClick();
                break;

            case 2:
                b2.callOnClick();
                break;

            case 3:
                b3.callOnClick();
                break;

            case 4:
                b4.callOnClick();
                break;

            case 5:
                b5.callOnClick();
                break;

            case 6:
                b6.callOnClick();
                break;

            case 7:
                b7.callOnClick();
                break;

            case 8:
                b8.callOnClick();
                break;

            default:
                break;

        }
    }


    public void getComputerMove() {
        int count = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == -1) {
                    makeComputerMove(count);
                    return;
                }
                count ++;
            }
        }

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View view) {
        boolean resetButtonPressed = false;
          int x = R.drawable.download;
          int o = R.drawable.alphabattleo;

          Drawable imgO = getResources().getDrawable(o);
          Drawable imgX = getResources().getDrawable(x);


        switch (view.getId()) {
            case R.id.b0:
                if (PLAYER_X) {
                    b0.setBackground(imgX);
                    board[0][0] = 1;
                } else {
                    b0.setBackground(imgO);
                    board[0][0] = 2;
                }
                b0.setEnabled(false);
                break;

            case R.id.b1:
                if (PLAYER_X) {
                    b1.setBackground(imgX);
                    board[0][1] = 1;
                } else {
                    b1.setBackground(imgO);
                    board[0][1] = 2;
                }
                b1.setEnabled(false);
                break;

            case R.id.b2:
                if (PLAYER_X) {
                    b2.setBackground(imgX);
                    board[0][2] = 1;
                } else {
                    b2.setBackground(imgO);
                    board[0][2] = 2;
                }
                b2.setEnabled(false);
                break;

            case R.id.b3:
                if (PLAYER_X) {
                    b3.setBackground(imgX);
                    board[1][0] = 1;
                } else {
                    b3.setBackground(imgO);
                    board[1][0] = 2;
                }
                b3.setEnabled(false);
                break;

            case R.id.b4:
                if (PLAYER_X) {
                    b4.setBackground(imgX);
                    board[1][1] = 1;
                } else {
                    b4.setBackground(imgO);
                    board[1][1] = 2;
                }
                b4.setEnabled(false);
                break;

            case R.id.b5:
                if (PLAYER_X) {
                    b5.setBackground(imgX);
                    board[1][2] = 1;
                } else {
                    b5.setBackground(imgO);
                    board[1][2] = 2;
                }
                b5.setEnabled(false);
                break;

            case R.id.b6:
                if (PLAYER_X) {
                    b6.setBackground(imgX);
                    board[2][0] = 1;
                } else {
                    b6.setBackground(imgO);
                    board[2][0] = 2;
                }
                b6.setEnabled(false);
                break;

            case R.id.b7:
                if (PLAYER_X) {
                    b7.setBackground(imgX);
                    board[2][1] = 1;
                } else {
                    b7.setBackground(imgO);
                    board[2][1] = 2;
                }
                b7.setEnabled(false);
                break;

            case R.id.b8:
                if (PLAYER_X) {
                    b8.setBackground(imgX);
                    board[2][2] = 1;
                } else {
                    b8.setBackground(imgO);
                    board[2][2] = 2;
                }
                b8.setEnabled(false);
                break;

            case R.id.resetButton:
                resetButtonPressed = true;
                break;

            default:
                break;
        }
        if(resetButtonPressed){
            clearBoard();
        }
        else {
            if(PLAYER_X){
                TURN_COUNT ++;
                PLAYER_X = !PLAYER_X;
                checkWinner();
                if(!WINNER) {
                    getComputerMove();
                }
            } else {
                TURN_COUNT ++;
                PLAYER_X = !PLAYER_X;
                checkWinner();
            }

            if(TURN_COUNT==9){
                winner("It's a TIE! Bye!");
            }
        }
    }

    private void checkWinner(){

        int count = 0;
        for(int i=0; i<3; i++) {
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][1] != -1) {
                if(board[i][0] == 1) {
                    winner( player1 + " won! Bye!");
                } else {
                    winner( player2 + " won! Bye!");
                }

            }
            resetButton.setEnabled(true);

        }
        for(int i=0; i<3; i++) {
            if(board[0][i] == board[1][i] && board[2][i] == board[1][i] && board[1][i] != -1) {
                if(board[0][i] == 1) {
                    winner( player1 + " won! Bye!");
                } else {
                    winner( player2 + " won! Bye!");
                }
            }
            resetButton.setEnabled(true);

        }

        if(board[0][0]==board[1][1] && board[1][1] == board[2][2] && board[1][1] != -1) {
            if(board[0][0] == 1) {
                winner( player1 + " won! Bye!");
            } else {
                winner( player2 + " won! Bye!");
            }
            resetButton.setEnabled(true);

        }

        if(board[2][0]==board[1][1] && board[0][2] == board[1][1] && board[1][1] != -1) {
            if(board[2][0] == 1) {
                winner( player1 + " won! Bye!");
            } else {
                winner( player2 + " won! Bye!");
            }
            resetButton.setEnabled(true);

        }

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] != -1) {
                    count ++;
                }
            }
        }
        if(count == 9) {
            winner("It's a TIE! Bye!");
        }
    }

    private void resetButtons(boolean value){
        b0.setEnabled(value);
        b1.setEnabled(value);
        b2.setEnabled(value);
        b3.setEnabled(value);
        b4.setEnabled(value);
        b5.setEnabled(value);
        b6.setEnabled(value);
        b7.setEnabled(value);
        b8.setEnabled(value);
        WINNER = false;
    }

    private void winner(String player){
        setInfo(player);
        resetButtons(false);
        WINNER = true;
    }

    private void clearBoard(){
        b0.setText("");
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        int c = R.color.colorAccent;
        Drawable imgC = getResources().getDrawable(c);
        b0.setBackground(imgC);
        b1.setBackground(imgC);
        b2.setBackground(imgC);
        b3.setBackground(imgC);
        b4.setBackground(imgC);
        b5.setBackground(imgC);
        b6.setBackground(imgC);
        b7.setBackground(imgC);
        b8.setBackground(imgC);



        resetButtons(true);

        PLAYER_X = true;
        TURN_COUNT = 0;

        initializeBoardStatus();

        setInfo("New Game");

        Toast.makeText(this,"Board Reset",Toast.LENGTH_SHORT).show();
    }

    private void setInfo(String text){
        title.setText(text);
    }

    private void initializeBoardStatus(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = -1;
            }
        }

    }

}



