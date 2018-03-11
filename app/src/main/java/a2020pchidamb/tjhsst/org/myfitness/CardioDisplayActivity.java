package a2020pchidamb.tjhsst.org.myfitness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CardioDisplayActivity extends AppCompatActivity {
    ArrayList<String> exercises = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio_display);
        if (getIntent().hasExtra("a2020pchidamb.tjhsst.org.myfitness.cardio")){
            //Main2Activity.q.push("Cardio " + getIntent().getExtras().getString("a2020pchidamb.tjhsst.org.myfitness.cardio"));
            int time = Integer.parseInt(getIntent().getExtras().getString("a2020pchidamb.tjhsst.org.myfitness.cardio"));
            String[] array = getResources().getStringArray(R.array.cardio_array);
            int[] ints = new int[time/2];
            for(int y = 0; y < time / 2; y++) {
                int e = (int) (Math.random() * array.length);
                while(contains(ints, e)) {
                    e = (int) (Math.random() * array.length);
                }
                ints[y] = e;
            }
            for(int b : ints){
                exercises.add(array[b]);
            }
            ListView listView = (ListView) findViewById(R.id.listView);
            listView.setAdapter(new ArrayAdapter<String>(this, R.layout.activity_cardio, exercises));

        }
    }

    public boolean contains(int[] array, int y){
        for( int a : array){
            if(a == y)
                return true;
        }

        return false;
    }
}
