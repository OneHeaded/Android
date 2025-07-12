package com.example.tictak;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
    int Flag = 0;
    int count = 0;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }
    private void init(){
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);

    }

    public void Button10(View view){
        Reset();
    }

    public void Check(View view){
        Button button = (Button) view;
        if(button.getText().toString().isEmpty()){
        count++;

        if(Flag == 0){
            button.setText("X");
            Flag = 1;
        }
        else{
            button.setText("O");
            Flag = 0;
        }

        if(count>4) {

            b1 = button1.getText().toString();
            b2 = button2.getText().toString();
            b3 = button3.getText().toString();
            b4 = button4.getText().toString();
            b5 = button5.getText().toString();
            b6 = button6.getText().toString();
            b7 = button7.getText().toString();
            b8 = button8.getText().toString();
            b9 = button9.getText().toString();

            if (b1.equals(b2) && b1.equals(b3) && !b1.isEmpty()) {
                Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                Reset();
            } else if (b4.equals(b5) && b4.equals(b6) && !b4.isEmpty()) {
                Toast.makeText(this, "Winner is " + b4, Toast.LENGTH_SHORT).show();
                Reset();
            } else if (b7.equals(b8) && b7.equals(b9) && !b7.isEmpty()) {
                Toast.makeText(this, "Winner is " + b7, Toast.LENGTH_SHORT).show();
                Reset();
            } else if (b1.equals(b4) && b1.equals(b7) && !b1.isEmpty()) {
                Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                Reset();
            } else if (b2.equals(b5) && b2.equals(b8) && !b2.isEmpty()) {
                Toast.makeText(this, "Winner is " + b2, Toast.LENGTH_SHORT).show();
                Reset();
            } else if (b3.equals(b6) && b3.equals(b9) && !b3.isEmpty()) {
                Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                Reset();
            } else if (b1.equals(b5) && b1.equals(b9) && !b1.isEmpty()) {
                Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                Reset();
            } else if (b3.equals(b5) && b3.equals(b7) && !b3.isEmpty()) {
                Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                Reset();
            } else if (count == 9) {
                Toast.makeText(this, "Draw", Toast.LENGTH_SHORT).show();
                Reset();
            }
        }


        }

    }

    public void Reset(){
        Flag = 0;
        count = 0;
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");

    }
}