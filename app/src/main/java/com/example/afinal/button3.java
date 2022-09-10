package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
<<<<<<< HEAD
import android.widget.TextView;

import com.example.afinal.buttonPage;
import com.example.afinal.MARS.MARSDaily;
=======
>>>>>>> parent of 83ca2cf (button 3 is working currently adding a check for internet function)

public class button3 extends AppCompatActivity implements View.OnClickListener {
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button3);

<<<<<<< HEAD
        //buttons used
        back = (Button)findViewById(R.id.back3);
        back.setOnClickListener(this);
        marsPhotoB = (Button)findViewById(R.id.searching3);
        marsPhotoB.setOnClickListener(this);
        setTitle("Mars Rover Photos");
=======
        back = (Button)findViewById(R.id.back);

        back.setOnClickListener(this);
>>>>>>> parent of 83ca2cf (button 3 is working currently adding a check for internet function)

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.back3:
                Intent intent1 = new Intent(this, buttonPage.class);
                startActivity(intent1);
<<<<<<< HEAD
                break;

            case R.id.searching3:
                Intent intent3 = new Intent(this, MARSDaily.class);
                startActivity(intent3);
                break;
=======
>>>>>>> parent of 83ca2cf (button 3 is working currently adding a check for internet function)
        }
    }
}