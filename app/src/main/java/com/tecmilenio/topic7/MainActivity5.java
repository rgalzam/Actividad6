package com.tecmilenio.topic7;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity5 extends AppCompatActivity {

    private Button buttonSig5;
    /*private Button buttonLeft;
    private Button buttonRight;
    private Button buttonDown;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        buttonSig5 = findViewById(R.id.buttonSig5);
        /*buttonLeft = findViewById(R.id.buttonLeft);
        buttonRight = findViewById(R.id.buttonRight);
        buttonDown = findViewById(R.id.buttonDown);*/

        buttonSig5.setOnClickListener(view ->{
            Intent myIntent = new Intent(MainActivity5.this, MainActivity.class);
            startActivity(myIntent);
        });

        /*buttonLeft.setOnClickListener(view ->{
            Intent myIntent = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(myIntent);
        });


        buttonRight.setOnClickListener(view ->{
            Intent myIntent = new Intent(MainActivity.this, MainActivity4.class);
            startActivity(myIntent);
        });

        buttonDown.setOnClickListener(view ->{
            Intent myIntent = new Intent(MainActivity.this, MainActivity5.class);
            startActivity(myIntent);
        });*/


    }
}