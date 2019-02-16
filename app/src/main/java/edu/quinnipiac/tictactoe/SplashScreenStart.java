//Dominic Smorra
//SER 210
// Tic Tac Toe Android game

package edu.quinnipiac.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SplashScreenStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final EditText Player1 = (EditText) findViewById(R.id.etPlayer1);
        final EditText Player2 = (EditText) findViewById(R.id.etPlayer2);
        Button playButton = (Button) findViewById(R.id.bPlay);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String PLAYER_1 = "" + Player1.getText().toString();
                String PLAYER_2 = "" + Player2.getText().toString();

                Intent intent = new Intent(SplashScreenStart.this,MainActivity.class);

                intent.putExtra("PLAYER_1",PLAYER_1);
                intent.putExtra("PLAYER_2",PLAYER_2);

                startActivity(intent);

            }
        });
    }
}