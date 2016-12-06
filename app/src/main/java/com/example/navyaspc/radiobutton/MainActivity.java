package com.example.navyaspc.radiobutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View v){
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton rb;
        Button b = (Button) findViewById(R.id.button);

        int rbid = rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(rbid);
        Toast.makeText(MainActivity.this, rb.getText().toString(), Toast.LENGTH_LONG).show();
     }

}