package com.example.android.totalquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Bible extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;
    TextView score, question;

    private BibleQuestions bibleQuestions = new BibleQuestions();

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsLength = bibleQuestions.mQuestion.length;

    Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bible);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        r = new Random();

        answer1 = (Button)findViewById(R.id.answer1);
        answer2 = (Button)findViewById(R.id.answer2);
        answer3 = (Button)findViewById(R.id.answer3);
        answer4 = (Button)findViewById(R.id.answer4);

        score = (TextView)findViewById(R.id.score);
        question = (TextView)findViewById(R.id.question);



        score.setText("Score: " + mScore);
        updateQuestion(r.nextInt(mQuestionsLength));


        answer1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(answer1.getText()== mAnswer){
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                }else {
                    gameOver();
                }



            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(answer2.getText()== mAnswer){
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                }else {
                    gameOver();
                }


            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(answer3.getText()== mAnswer){
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                }else {
                    gameOver();
                }



            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(answer4.getText()== mAnswer){
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                }else {
                    gameOver();
                }
            }
        });
    }



    private void updateQuestion(int i) {
        question.setText(bibleQuestions.getQuestions(i));
        answer1.setText(bibleQuestions.getChoice1(i));
        answer2.setText(bibleQuestions.getChoice2(i));
        answer3.setText(bibleQuestions.getChoice3(i));
        answer4.setText(bibleQuestions.getChoice4(i));

        mAnswer = bibleQuestions.getCorrectAnswer(i);
    }
    private void gameOver() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Bible.this);
        alertDialogBuilder
                .setMessage("Game Over! Your Score Is: " + mScore + " Points.")
                .setCancelable(false)
                .setPositiveButton("NEW GAME", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        finish();

                    }
                })
                .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }

}
