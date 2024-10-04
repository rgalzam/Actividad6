package com.tecmilenio.topic7;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {

    private Button buttonSig4;
    /*private Button buttonLeft;
    private Button buttonRight;
    private Button buttonDown;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        buttonSig4 = findViewById(R.id.buttonSig4);
        /*buttonLeft = findViewById(R.id.buttonLeft);
        buttonRight = findViewById(R.id.buttonRight);
        buttonDown = findViewById(R.id.buttonDown);*/

        buttonSig4.setOnClickListener(view ->{
            Intent myIntent = new Intent(MainActivity4.this, MainActivity5.class);
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