package com.example.ifthen_asombrado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDecision1 = findViewById(R.id.btnDecision1);

        Button btnDecision2 = findViewById(R.id.btnDecision2);

        TextView txtLore = findViewById(R.id.txtLore);
        TextView txtDecision = findViewById(R.id.txtDecision);

        txtLore.setText("You are the last man alive roaming the earth.\n  You have everything to yourself but social contact to other people. \n" +
                "As you roam the streets of the city, you notice a sound from the distance like people talking");

        txtDecision.setText("Do you dare to check out the sound or go ahead and act like it was a figment of your imagination");

        btnDecision1.setOnClickListener(this);
        btnDecision2.setOnClickListener(this);


    }
    @Override
    public void onClick(View view) {
        TextView txtDecision = findViewById(R.id.txtDecision);
        TextView txtLore = findViewById(R.id.txtLore);
        Button btnDecision1 = findViewById(R.id.btnDecision1);
        Button btnDecision2 = findViewById(R.id.btnDecision2);

        if (view.getId() == R.id.btnDecision1) {
            btnDecision1.setVisibility(View.INVISIBLE);
            btnDecision2.setVisibility(View.INVISIBLE);
            txtLore.setText("You check out the sound and you see people with cameras and microphones. \n This whole thing was setup from the start and this was a tv show");
            txtDecision.setText("");

        } else if (view.getId() == R.id.btnDecision2) {
            btnDecision1.setVisibility(View.INVISIBLE);
            btnDecision2.setVisibility(View.INVISIBLE);
            txtLore.setText("You ignored the noise and just think that it is the \nproduct of being lonely,\n You proceed to your daily schedule of being the king of the world");
            txtDecision.setText("");
        }
    }
}
