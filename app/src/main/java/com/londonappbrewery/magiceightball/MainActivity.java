package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = (Button) findViewById(R.id.ask_button);
        final ImageView eightBallImage = (ImageView) findViewById(R.id.eight_ball);

        final int[] eightBallArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();
                Random randomNumberGenerator = new Random();
                int pickAnswer = randomNumberGenerator.nextInt(5);
                eightBallImage.setImageResource(eightBallArray[pickAnswer]);

            }
        });
    }
}
