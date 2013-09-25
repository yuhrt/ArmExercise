package com.example.armexercise;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class ArmExercise extends Activity implements View.OnClickListener {

	int count;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arm_exercise);
        View a;
        
        Button btn[] = new Button[5];
        btn[0] = (Button)findViewById(R.id.minus_five);
        btn[1] = (Button)findViewById(R.id.minus_ten);
        btn[2] = (Button)findViewById(R.id.minus_twelve);
        btn[3] = (Button)findViewById(R.id.minus_thirty);
        btn[4] = (Button)findViewById(R.id.initiate);
        
        for(int i = 0; i<5; i++){
        	btn[i].setOnClickListener(this);
        }
    }
    
    public void onClick(View v){
    	count = Integer.parseInt((String) ((TextView)findViewById(R.id.counter)).getText());
    	int m = Integer.parseInt(v.getTag().toString());
    	System.out.println(v.getTag().toString());
    	if(m==1)
    		count=50;
    	else
    		count -= m;
    	((TextView)findViewById(R.id.counter)).setText(Integer.toString(count));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_arm_exercise, menu);
        return true;
    }
}
