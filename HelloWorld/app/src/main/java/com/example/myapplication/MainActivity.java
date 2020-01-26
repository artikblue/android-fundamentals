package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView t1;
    Button b1;
    Button b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.change1);
        b2 = (Button) findViewById(R.id.change2);
        t1 = (TextView) findViewById(R.id.text1);

        b1.setOnClickListener(this); /// we are setting an event listener "onclickllistener" on this class only
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.change1:
                t1.setText("clicked button 1");
                break;
            case R.id.change2:
                t1.setText("clicked button 2 ");
        }

    }
}
