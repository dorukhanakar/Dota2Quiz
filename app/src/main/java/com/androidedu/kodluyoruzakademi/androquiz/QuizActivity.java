package com.androidedu.kodluyoruzakademi.androquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    TextView textView2;
    private TextView et1;
    private QuestionBank mQuestionLibrary = new QuestionBank();
    private TextView mScoreView;
    private TextView mQuestionView;
    private RadioButton mButtonChoice1;
    private RadioButton mButtonChoice2;
    private RadioButton mButtonChoice3;
    private RadioButton mButtonChoice4;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_quiz);
        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        String fName = intent.getStringExtra("username");
        textView2.setText(fName);
        et1 = (TextView) findViewById(R.id.textView2);
        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (RadioButton) findViewById(R.id.choicea);
        mButtonChoice2 = (RadioButton) findViewById(R.id.choiceb);
        mButtonChoice3 = (RadioButton) findViewById(R.id.choicec);
        mButtonChoice4 = (RadioButton) findViewById(R.id.choiced);
        updateQuestion();
        updateScore();
    }


    private void updateQuestion() {

        if (mQuestionNumber < mQuestionLibrary.getLength()) {
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice(mQuestionNumber, 1));
            mButtonChoice2.setText(mQuestionLibrary.getChoice(mQuestionNumber, 2));
            mButtonChoice3.setText(mQuestionLibrary.getChoice(mQuestionNumber, 3));
            mButtonChoice4.setText(mQuestionLibrary.getChoice(mQuestionNumber, 4));

            mQuestionNumber++;
        } else {
            Intent intent = new Intent(QuizActivity.this, ScoreActivity.class);
            intent.putExtra("score", mScore);
            intent.putExtra("username", et1.getText().toString());
            startActivity(intent);
        }
    }

    private void updateScore() {
        mScoreView.setText("" + mScore + "/" + mQuestionLibrary.getLength());
    }

    public void onClick(View view) {


        switch (mQuestionNumber) {
            case 1:
                if (((RadioButton) findViewById(R.id.choicec)).isChecked()) {
                    mScore = mScore + 1;
                    Toast.makeText(QuizActivity.this, "Doğru!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(QuizActivity.this, "Yanlış!", Toast.LENGTH_SHORT).show();
                break;

            case 2:
                if (((RadioButton) findViewById(R.id.choiceb)).isChecked()) {
                    mScore = mScore + 1;
                    Toast.makeText(QuizActivity.this, "Doğru!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(QuizActivity.this, "Yanlış!", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                if (((RadioButton) findViewById(R.id.choicea)).isChecked()) {
                    mScore = mScore + 1;
                    Toast.makeText(QuizActivity.this, "Doğru!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(QuizActivity.this, "Yanlış!", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                if (((RadioButton) findViewById(R.id.choiceb)).isChecked()) {
                    mScore = mScore + 1;
                    Toast.makeText(QuizActivity.this, "Doğru!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(QuizActivity.this, "Yanlış!", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                if (((RadioButton) findViewById(R.id.choicec)).isChecked()) {
                    mScore = mScore + 1;
                    Toast.makeText(QuizActivity.this, "Doğru!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(QuizActivity.this, "Yanlış!", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                if (((RadioButton) findViewById(R.id.choicec)).isChecked()) {
                    mScore = mScore + 1;
                    Toast.makeText(QuizActivity.this, "Doğru!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(QuizActivity.this, "Yanlış!", Toast.LENGTH_SHORT).show();
                break;
            case 7:
                if (((RadioButton) findViewById(R.id.choicea)).isChecked()) {
                    mScore = mScore + 1;
                    Toast.makeText(QuizActivity.this, "Doğru!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(QuizActivity.this, "Yanlış!", Toast.LENGTH_SHORT).show();
                break;
            case 8:
                if (((RadioButton) findViewById(R.id.choiced)).isChecked()) {
                    mScore = mScore + 1;
                    Toast.makeText(QuizActivity.this, "Doğru!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(QuizActivity.this, "Yanlış!", Toast.LENGTH_SHORT).show();
                break;
            case 9:
                if (((RadioButton) findViewById(R.id.choicea)).isChecked()) {
                    mScore = mScore + 1;
                    Toast.makeText(QuizActivity.this, "Doğru!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(QuizActivity.this, "Yanlış!", Toast.LENGTH_SHORT).show();
                break;
            case 10:
                if (((RadioButton) findViewById(R.id.choiced)).isChecked()) {
                    mScore = mScore + 1;
                    Toast.makeText(QuizActivity.this, "Doğru!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(QuizActivity.this, "Yanlış!", Toast.LENGTH_SHORT).show();
                break;

            default:

                break;

        }


        updateScore();
        updateQuestion();

    }
}
