package com.mndavec.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        // Do something in response to button click
        Button button = (Button) view;
        Toast.makeText(this, "This button will launch my " +  button.getText() + " app!", Toast.LENGTH_LONG).show();
    }
}
