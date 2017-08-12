package com.androidedu.kodluyoruzakademi.androquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {


    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_score);
        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        String fName = intent.getStringExtra("username");
        textView2.setText(fName);
        TextView txtScore = (TextView) findViewById(R.id.textScore);

        int score = intent.getIntExtra("score", 0);

        txtScore.setText("Doğru Sayınız: " + score);


    }

    public void onClick(View view) {
        Intent intent = new Intent(ScoreActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
