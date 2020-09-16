package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity  extends AppCompatActivity {

     Button b;
    EditText e;
    TextView p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b= (Button) findViewById(R.id.hellobutton);
p=(TextView) findViewById(R.id.printtext);
                e=(EditText) findViewById(R.id.PersonName);

                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                      String s=e.getText().toString();
                        p.setText("Hello, "+s);
                    }

                });

    }


}