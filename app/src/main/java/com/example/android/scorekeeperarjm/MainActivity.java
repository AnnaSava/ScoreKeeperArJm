package com.example.android.scorekeeperarjm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalsArg = 0;
    int yellowsArg = 0;
    int redsArg = 0;
    int foulsArg = 0;

    int goalsJam = 0;
    int yellowsJam = 0;
    int redsJam = 0;
    int foulsJam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addGoalForArg(View view) {
        goalsArg++;
        displayGoalsArg(goalsArg);

        displayPain();
    }

    public void addYellowForArg(View view) {
        yellowsArg++;
        displayYellowsArg(yellowsArg);
    }

    public void addRedForArg(View view) {
        redsArg++;
        displayRedsArg(redsArg);
    }

    public void addFoulForArg(View view) {
        foulsArg++;
        displayFoulsArg(foulsArg);
    }

    public void addGoalForJam(View view) {
        goalsJam++;
        displayGoalsJam(goalsJam);

        displayPain();
    }

    public void addYellowForJam(View view) {
        yellowsJam++;
        displayYellowsJam(yellowsJam);
    }

    public void addRedForJam(View view) {
        redsJam++;
        displayRedsJam(redsJam);
    }

    public void addFoulForJam(View view) {
        foulsJam++;
        displayFoulsJam(foulsJam);
    }

    public void resetScore(View view){
        goalsArg = yellowsArg = redsArg = foulsArg = 0;
        goalsJam = yellowsJam = redsJam = foulsJam = 0;
        displayGoalsArg(goalsArg);
        displayYellowsArg(yellowsArg);
        displayRedsArg(redsArg);
        displayFoulsArg(foulsArg);
        displayGoalsJam(goalsJam);
        displayYellowsJam(yellowsJam);
        displayRedsJam(redsJam);
        displayFoulsJam(foulsJam);

        TextView txtView = (TextView)findViewById(R.id.pain);
        txtView.setVisibility(View.INVISIBLE);
    }

    public void displayGoalsArg(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goals_arg);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsArg(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_arg);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowsArg(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellows_arg);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedsArg(int score) {
        TextView scoreView = (TextView) findViewById(R.id.reds_arg);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGoalsJam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goals_jam);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsJam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_jam);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowsJam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellows_jam);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedsJam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.reds_jam);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPain()
    {
        TextView txtView = (TextView)findViewById(R.id.pain);
        if(goalsArg == 5 && goalsJam == 0){
            txtView.setVisibility(View.VISIBLE);
        }
        else
        {
            txtView.setVisibility(View.INVISIBLE);
        }
    }
}
