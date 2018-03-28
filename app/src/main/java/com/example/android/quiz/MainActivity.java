package com.example.android.quiz;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    TextView userScore;
    RadioButton q1, q2, q3,  q4, q5, q6, q7, q8, q9, q10;
    int score = 0;

    CheckBox a , b, c, d;
    EditText answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        userScore = (TextView)findViewById(R.id.user_score);

        // Radiobuttons

        q1 = (RadioButton)findViewById(R.id.correct1) ;
        q2 = (RadioButton)findViewById(R.id.correct2);
        q3 = (RadioButton)findViewById(R.id.correct3);
        q4 = (RadioButton)findViewById(R.id.correct4);
        q5 = (RadioButton)findViewById(R.id.correct5);
        q6 = (RadioButton)findViewById(R.id.correct6);
        q7 = (RadioButton)findViewById(R.id.correct7);
        q8 = (RadioButton)findViewById(R.id.correct8);
        q9 = (RadioButton)findViewById(R.id.correct9);
        q10 = (RadioButton)findViewById(R.id.correct10);


        //  Check Box
        a = (CheckBox)findViewById(R.id.correct11_a);
        b = (CheckBox)findViewById(R.id.correct11_b);
        c = (CheckBox)findViewById(R.id.correct11_c);
        d = (CheckBox)findViewById(R.id.correct11_d);

        // EditText
        answer = (EditText)findViewById(R.id.correct12);

    }



    public void submit(View view){

        if(q1.isChecked()){
            score += 1;
        }

        if(q2.isChecked()){
            score += 1;
        }

        if(q3.isChecked()){
            score += 1;
        }

        if(q4.isChecked()){
            score += 1;
        }

        if(q5.isChecked()){
            score += 1;
        }

        if(q6.isChecked()){
            score += 1;
        }

        if(q7.isChecked()){
            score += 1;
        }

        if(q8.isChecked()){
            score += 1;
        }

        if(q9.isChecked()){
            score += 1;
        }

        if(q10.isChecked()){
            score += 1;
        }


        if(b.isChecked() && c.isChecked() && !a.isChecked() && !d.isChecked() ){
            score += 1;
        }else{
            score += 0;
        }
        

        if(answer.getText().toString() == "Google" || answer.getText().toString() == "google" || answer.getText().toString() == "GOOGLE"){
            score += 1;
        }else{
            score += 0;
        }


        Toast.makeText(this, "You Scored: "+score, Toast.LENGTH_SHORT).show();
 //       userScore.setText(scorecard());

    }

//    public String scorecard(){
//        String message;
//        message = " Your Score: "+score;
//        return message;
//    }

}



