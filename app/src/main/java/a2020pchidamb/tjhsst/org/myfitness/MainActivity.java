package a2020pchidamb.tjhsst.org.myfitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), Main2Activity.class);
                Spinner spinner4 = (Spinner)findViewById(R.id.spinner4);
                int min = Integer.parseInt(spinner4.getSelectedItem().toString());
                String s = ""+min;
                startIntent.putExtra("a2020pchidamb.tjhsst.org.myfitness.SOMETHING", s);
                startActivity(startIntent);
            }
        });
    }
}
