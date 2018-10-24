package com.example.jesse.demo_one;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button firstButton, secondButton, thirdButton, fourthButton, fifthButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstButton = findViewById(R.id.btnFirstToast);
        secondButton = findViewById(R.id.btnSecondToast);
        thirdButton = findViewById(R.id.btnThirdToast);
        fourthButton = findViewById(R.id.btnFourthToast);
        fifthButton = findViewById(R.id.btnFifthToast);


        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t = Toast.makeText(getApplicationContext(), "Toasted", Toast.LENGTH_LONG);
                t.setGravity(Gravity.CENTER, 0, 0);
                t.show();
            }
        });

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.custom_toast_two,
                        (ViewGroup)findViewById(R.id.customToastTwo));
                TextView text = (TextView)layout.findViewById(R.id.customTextTwo);
                text.setText("Toast 2");

                Toast t = new Toast(getApplicationContext());
                t.setDuration(Toast.LENGTH_LONG);
                t.setView(layout);
                t.show();
            }
        });

        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.custom_toast_three,
                        (ViewGroup)findViewById(R.id.customToastThree));
                TextView text = (TextView)layout.findViewById(R.id.customTextThree);
                text.setText("Toast 3");

                Toast t = new Toast(getApplicationContext());
                t.setDuration(Toast.LENGTH_LONG);
                t.setView(layout);
                t.setGravity(Gravity.CENTER, -50, 0);
                t.show();
            }
        });

        fourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.custom_toast_four,
                        (ViewGroup)findViewById(R.id.customToastFour));
                TextView text = (TextView)layout.findViewById(R.id.customTextFour);
                text.setText("Toast 5");

                Toast t = new Toast(getApplicationContext());
                t.setDuration(Toast.LENGTH_LONG);
                t.setGravity(Gravity.FILL, 0, 0);
                t.setView(layout);
                t.show();
            }
        });

        fifthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t = new Toast(getApplicationContext());
                ImageView view = new ImageView(getApplicationContext());
                view.setImageResource(R.drawable.toast);
                t.setView(view);
                t.show();
            }
        });
    }
}
