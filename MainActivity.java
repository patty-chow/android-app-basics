package com.example.tallycounter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textview;

    private Button increaseBTN;
    private Button decreaseBTN;
    private Button resetBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUI();

        increaseBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newText = Integer.toString(Integer.parseInt(textview.getText().toString())+1);
                textview.setText(newText);
            }
        });

        decreaseBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.parseInt(textview.getText().toString()) != 0) {
                    String newText = Integer.toString(Integer.parseInt(textview.getText().toString())-1);
                    textview.setText(newText);
                }
            }
        });
    }

    public void resetTextView(View view){
        textview.setText("0");
    }

    private void setUI(){
        textview = findViewById(R.id.textView);

        increaseBTN = findViewById(R.id.increase);

    }
}