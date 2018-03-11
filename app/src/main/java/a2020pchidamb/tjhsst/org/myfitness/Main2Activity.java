package a2020pchidamb.tjhsst.org.myfitness;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main2Activity extends AppCompatActivity {

    //public static Stack<String> q = new Stack<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (getIntent().hasExtra("a2020pchidamb.tjhsst.org.myfitness.SOMETHING")) {
            final String text = getIntent().getExtras().getString("a2020pchidamb.tjhsst.org.myfitness.SOMETHING");
            Button cardio = (Button) findViewById(R.id.cardio);
            cardio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent cardioIntent = new Intent(getApplicationContext(), CardioDisplayActivity.class);
                    cardioIntent.putExtra("a2020pchidamb.tjhsst.org.myfitness.cardio", text);
                    startActivity(cardioIntent);
                }
            });
            Button arms = (Button) findViewById(R.id.arms);
            arms.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent armsIntent = new Intent(getApplicationContext(), armsDisplayActivity.class);
                    armsIntent.putExtra("a2020pchidamb.tjhsst.org.myfitness.arms", text);
                    startActivity(armsIntent);
                }
            });
            Button abs = (Button) findViewById(R.id.abs);
            abs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent absIntent = new Intent(getApplicationContext(), absDisplayActivity.class);
                    absIntent.putExtra("a2020pchidamb.tjhsst.org.myfitness.abs", text);
                    startActivity(absIntent);
                }
            });
            Button legs = (Button) findViewById(R.id.legs);
            legs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent legsIntent = new Intent(getApplicationContext(), legsDisplayActivity.class);
                    legsIntent.putExtra("a2020pchidamb.tjhsst.org.myfitness.legs", text);
                    startActivity(legsIntent);
                }
            });
            Button stretch = (Button) findViewById(R.id.stretch);
            stretch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent stretchIntent = new Intent(getApplicationContext(), stretchDisplayActivity.class);
                    stretchIntent.putExtra("a2020pchidamb.tjhsst.org.myfitness.stretch", text);
                    startActivity(stretchIntent);
                }
            });
            Button all = (Button) findViewById(R.id.all);
            all.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent allIntent = new Intent(getApplicationContext(), allDisplayActivity.class);
                    allIntent.putExtra("a2020pchidamb.tjhsst.org.myfitness.all", text);
                    startActivity(allIntent);
                }
            });

        }
    }
}
