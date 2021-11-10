package com.pius.converter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConvertActivity extends AppCompatActivity {
    final double A_MILE = 0.6241;

    private EditText kilometres;
    private TextView solution;
    private  Button convertBtn;
    private  Button quitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.converter);

         kilometres = (EditText) findViewById(R.id.kilometres);
         solution = (TextView) findViewById(R.id.solution);

        convertBtn = (Button) findViewById(R.id.convertBtn);
        quitBtn = (Button) findViewById(R.id.quitBtn);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertKmToMiles();
            }
        });

        quitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void convertKmToMiles(){
        double km = Double.parseDouble( kilometres.getText().toString());
        double miles =  km * A_MILE;
        solution.setText("" + miles + "");
    }
}
