package sg.edu.rp.c346.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);




        Intent intent = getIntent();
        String[] info = intent.getStringArrayExtra("info");
        String selectedRadioValue = intent.getStringExtra("radioGroup1Selected");
        String selectedRadioValue2 = intent.getStringExtra("radioGroup2Selected");
        String selectedRadioValue3 = intent.getStringExtra("radioGroup3Selected");

        TextView tv1 = (TextView) findViewById(R.id.textView1);
        tv1.setText("Read up on materials before class: " + selectedRadioValue);

        TextView tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("Arrive on time so as not to miss important part of the lesson: " + selectedRadioValue2);

        TextView tv3 = (TextView) findViewById(R.id.textView3);
        tv3.setText("Attempt the problem myself: " + selectedRadioValue3);

        TextView tv4 = (TextView) findViewById(R.id.textView4);
        // Display the name and age on the TextView
        tv4.setText("Reflection: " + info[0]);



    }
}
