package com.example.adminsonapc.rollthedice;

import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {


    SecureRandom secureRandomNumber = new SecureRandom();

    int number1 = 0;
    int number2 = 0;
    int number3 = 0;
    int number4 = 0;
    int number5 = 0;
    int number6 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView txtNumber1 = (TextView) findViewById(R.id.txtNumber1);
        final TextView txtNumber2 = (TextView) findViewById(R.id.txtNumber2);
        final TextView txtNumber3 = (TextView) findViewById(R.id.txtNumber3);
        final TextView txtNumber4 = (TextView) findViewById(R.id.txtNumber4);
        final TextView txtNumber5 = (TextView) findViewById(R.id.txtNumber5);
        final TextView txtNumber6 = (TextView) findViewById(R.id.txtNumber6);

        final ImageView imgNumber1 = (ImageView) findViewById(R.id.imgNumber1);
        final ImageView imgNumber2 = (ImageView) findViewById(R.id.imgNumber2);
        final ImageView imgNumber3 = (ImageView) findViewById(R.id.imgNumber3);
        final ImageView imgNumber4 = (ImageView) findViewById(R.id.imgNumber4);
        final ImageView imgNumber5 = (ImageView) findViewById(R.id.imgNumber5);
        final ImageView imgNumber6 = (ImageView) findViewById(R.id.imgNumber6);
        ImageView imgDice = (ImageView) findViewById(R.id.imgDice);

        Button btnRollTheDice = (Button) findViewById(R.id.btnRollTheDice);

        btnRollTheDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for(int i=1;i<=100;i++){
                    int randomNumber = 1 + secureRandomNumber.nextInt(6);
                    switch (randomNumber){
                        case 1:
                            ++number1;
                            break;
                        case 2:
                            ++number2;
                            break;
                        case 3:
                            ++number3;
                            break;
                        case 4:
                            ++number4;
                            break;
                        case 5:
                            ++number5;
                            break;
                        case 6:
                            ++number6;
                            break;
                    }

                }
                txtNumber1.setText(number1 + "");
                txtNumber2.setText(number2 + "");
                txtNumber3.setText(number3 + "");
                txtNumber4.setText(number4 + "");
                txtNumber5.setText(number5 + "");
                txtNumber6.setText(number6 + "");

                imgNumber1.setImageResource(R.drawable.dice1);//set picture of dice1 to image having id imgNumber1
                imgNumber2.setImageResource(R.drawable.dice2);   // set picture of dice2 to image id imgNumber2
                imgNumber3.setImageResource(R.drawable.dice3);   // ...in order to set the images from starting of
                imgNumber4.setImageResource(R.drawable.dice4);   // app : select imageView --> find src attribute
                imgNumber5.setImageResource(R.drawable.dice5);   // --> select the pucture --> find srcCompat attr-
                imgNumber6.setImageResource(R.drawable.dice6);   // ibute --> delete content of it.
                                                                 // eg: dice imageView
            }
        });


    }


}
