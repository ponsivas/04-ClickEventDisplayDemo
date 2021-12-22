package com.example.j4_twoedittextonebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText I,O;
    Button CK,CL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        I = (EditText) findViewById(R.id.IN);
        O = (EditText) findViewById(R.id.OUT);
        CK = (Button) findViewById(R.id.CLK);
        CL = (Button) findViewById(R.id.CLR);

        CK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (I.getText().length()==0){
                    Toast toast = Toast.makeText(getApplicationContext(),"Enter the text in first box and click CLICK the button", Toast.LENGTH_LONG);
                    toast.show();
                } else {
                    O.setText(I.getText().toString());
                }
            }
        });

        CL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (I.getText().length()==0 || O.getText().length()==0){
                    Toast toast = Toast.makeText(getApplicationContext(),"Enter the text in first box and click the CLEAR button", Toast.LENGTH_LONG);
                    toast.show();
                } else {
                    O.setText("");
                    I.setText("");
                }
            }
        });
    }
}