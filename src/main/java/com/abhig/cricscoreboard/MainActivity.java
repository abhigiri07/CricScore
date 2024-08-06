package com.abhig.cricscoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

TextView overs,balls,runs,wickets;
TextView teamA,teamB;
Button zero,one, two, three, four, six;
Button out,wide,nob;
Button convert,nextInningButton;

        int run = 0, wicket =0, ball=0;
        double over =0.0;
        int currentInning = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        overs = findViewById(R.id.overs);
        balls = findViewById(R.id.balls);
        runs = findViewById(R.id.runs);
        wickets = findViewById(R.id.wickets);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        six = findViewById(R.id.six);
        out = findViewById(R.id.out);
        wide = findViewById(R.id.wide);
        nob = findViewById(R.id.nob);
        convert = findViewById(R.id.convert);
        teamA = findViewById(R.id.teamA);
        teamB = findViewById(R.id.teamB);
        nextInningButton = findViewById(R.id.nextInningButton);

        nextInningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                run = 0;
                ball = 0;
                over =0;
                wicket = 0;
                currentInning = (currentInning + 1)%2;
                runs.setText("0");
                overs.setText("0.0");
                balls.setText("0");
                wickets.setText("0");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentInning==1) {
                    teamA.setText(run+"/"+wicket);
                    ball = ball + 1;
                    balls.setText(Integer.toString(ball));
                    String no = balls.getText().toString();
                    int a = Integer.parseInt(no);
                    int rem = a%6;
                    int quotient = a/6;
                    overs.setText((quotient+"."+rem));
                }
                else{
                    teamB.setText(run+"/"+wicket);
                    ball = ball + 1;
                    balls.setText(Integer.toString(ball));
                    String no = balls.getText().toString();
                    int a = Integer.parseInt(no);
                    int rem = a%6;
                    int quotient = a/6;
                    overs.setText((quotient+"."+rem));
                }
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentInning==1) {
                    run = run + 1;
                    runs.setText(Integer.toString(run));
                    teamA.setText(run+"/"+wicket);
                    ball = ball + 1;
                    balls.setText(Integer.toString(ball));
                    String no = balls.getText().toString();
                    int a = Integer.parseInt(no);
                    int rem = a%6;
                    int quotient = a/6;
                    overs.setText((quotient+"."+rem));
                }
                else{
                    run = run + 1;
                    runs.setText(Integer.toString(run));
                    teamB.setText(run+"/"+wicket);
                    ball = ball + 1;
                    balls.setText(Integer.toString(ball));
                    String no = balls.getText().toString();
                    int a = Integer.parseInt(no);
                    int rem = a%6;
                    int quotient = a/6;
                    overs.setText((quotient+"."+rem));
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentInning==1) {
                    run = run + 2;
                    runs.setText(Integer.toString(run));
                    teamA.setText(run+"/"+wicket);
                    ball = ball + 1;
                    balls.setText(Integer.toString(ball));
                    String no = balls.getText().toString();
                    int a = Integer.parseInt(no);
                    int rem = a%6;
                    int quotient = a/6;
                    overs.setText((quotient+"."+rem));
                }
                else{
                    run = run + 2;
                    runs.setText(Integer.toString(run));
                    teamB.setText(run+"/"+wicket);
                    ball = ball + 1;
                    balls.setText(Integer.toString(ball));
                    String no = balls.getText().toString();
                    int a = Integer.parseInt(no);
                    int rem = a%6;
                    int quotient = a/6;
                    overs.setText((quotient+"."+rem));
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentInning==1) {
                    run = run + 3;
                    runs.setText(Integer.toString(run));
                    teamA.setText(run+"/"+wicket);
                    ball = ball + 1;
                    balls.setText(Integer.toString(ball));
                    String no = balls.getText().toString();
                    int a = Integer.parseInt(no);
                    int rem = a%6;
                    int quotient = a/6;
                    overs.setText((quotient+"."+rem));
                }
                else{
                    run = run + 3;
                    runs.setText(Integer.toString(run));
                    teamB.setText(run+"/"+wicket);
                    ball = ball + 1;
                    balls.setText(Integer.toString(ball));
                    String no = balls.getText().toString();
                    int a = Integer.parseInt(no);
                    int rem = a%6;
                    int quotient = a/6;
                    overs.setText((quotient+"."+rem));
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentInning==1) {
                    run = run + 4;
                    runs.setText(Integer.toString(run));
                    teamA.setText(run+"/"+wicket);
                    ball = ball + 1;
                    balls.setText(Integer.toString(ball));
                    String no = balls.getText().toString();
                    int a = Integer.parseInt(no);
                    int rem = a%6;
                    int quotient = a/6;
                    overs.setText((quotient+"."+rem));
                }
                else{
                    run = run + 4;
                    runs.setText(Integer.toString(run));
                    teamB.setText(run+"/"+wicket);
                    ball = ball + 1;
                    balls.setText(Integer.toString(ball));
                    String no = balls.getText().toString();
                    int a = Integer.parseInt(no);
                    int rem = a%6;
                    int quotient = a/6;
                    overs.setText((quotient+"."+rem));
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentInning==1) {
                    run = run + 6;
                    runs.setText(Integer.toString(run));
                    teamA.setText(run+"/"+wicket);
                    ball = ball + 1;
                    balls.setText(Integer.toString(ball));
                    String no = balls.getText().toString();
                    int a = Integer.parseInt(no);
                    int rem = a%6;
                    int quotient = a/6;
                    overs.setText((quotient+"."+rem));
                }
                else{
                    run = run + 6;
                    runs.setText(Integer.toString(run));
                    teamB.setText(run+"/"+wicket);
                    ball = ball + 1;
                    balls.setText(Integer.toString(ball));
                    String no = balls.getText().toString();
                    int a = Integer.parseInt(no);
                    int rem = a%6;
                    int quotient = a/6;
                    overs.setText((quotient+"."+rem));
                }
            }
        });
        wide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentInning==1) {
                    run = run + 1;
                    runs.setText(Integer.toString(run));
                    teamA.setText(run+"/"+wicket);
                    String no = balls.getText().toString();
                    int a = Integer.parseInt(no);
                    int rem = a%6;
                    int quotient = a/6;
                    overs.setText((quotient+"."+rem));
                }
                else{
                    run = run + 1;
                    runs.setText(Integer.toString(run));
                    teamB.setText(run+"/"+wicket);
                    String no = balls.getText().toString();
                    int a = Integer.parseInt(no);
                    int rem = a%6;
                    int quotient = a/6;
                    overs.setText((quotient+"."+rem));
                }
            }
        });
        nob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentInning==1) {
                    run = run + 1;
                    runs.setText(Integer.toString(run));
                    teamA.setText(run+"/"+wicket);
                    String no = balls.getText().toString();
                    int a = Integer.parseInt(no);
                    int rem = a%6;
                    int quotient = a/6;
                    overs.setText((quotient+"."+rem));
                }
                else{
                    run = run + 1;
                    runs.setText(Integer.toString(run));
                    teamB.setText(run+"/"+wicket);
                    String no = balls.getText().toString();
                    int a = Integer.parseInt(no);
                    int rem = a%6;
                    int quotient = a/6;
                    overs.setText((quotient+"."+rem));
                }
            }
        });
        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentInning==1) {
                    wicket = wicket+1;
                    wickets.setText(Integer.toString(wicket));
                    teamA.setText(run+"/"+wicket);
                    ball = ball + 1;
                    balls.setText(Integer.toString(ball));
                    String no = balls.getText().toString();
                    int a = Integer.parseInt(no);
                    int rem = a%6;
                    int quotient = a/6;
                    overs.setText((quotient+"."+rem));
                }
                else{
                    wicket = wicket+1;
                    wickets.setText(Integer.toString(wicket));
                    teamB.setText(run+"/"+wicket);
                    ball = ball + 1;
                    balls.setText(Integer.toString(ball));
                    String no = balls.getText().toString();
                    int a = Integer.parseInt(no);
                    int rem = a%6;
                    int quotient = a/6;
                    overs.setText((quotient+"."+rem));
                }
            }
        });


    }
}