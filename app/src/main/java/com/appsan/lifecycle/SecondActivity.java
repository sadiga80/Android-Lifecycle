package com.appsan.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    String tag = "Second Activity Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnGoBack = (Button) findViewById(R.id.btnGoBack);

        btnGoBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),FirstActivity.class);
                startActivity(intent);
            }
        });

        Log.d(tag, "In the onCreate() event");

        Toast toast = Toast.makeText(getApplicationContext(),
                "In the onCreate() event",
                Toast.LENGTH_SHORT);

        toast.show();
    }

     /*
    Android lifecycle callback methods....
     */

    public void onStart()
    {
        super.onStart();
        Log.d(tag, "In the onStart() event");

        Toast toast = Toast.makeText(getApplicationContext(),
                "In the onStart() event",
                Toast.LENGTH_SHORT);
    }
    public void onRestart()
    {
        super.onRestart();
        Log.d(tag, "In the onRestart() event");

        Toast toast = Toast.makeText(getApplicationContext(),
                "In the onRestart() event",
                Toast.LENGTH_SHORT);
    }
    public void onResume()
    {
        super.onResume();
        Log.d(tag, "In the onResume() event");

        Toast toast = Toast.makeText(getApplicationContext(),
                "In the onResume() event",
                Toast.LENGTH_SHORT);
    }
    public void onPause()
    {
        super.onPause();
        Log.d(tag, "In the onPause() event");

        Toast toast = Toast.makeText(getApplicationContext(),
                "In the onPause() event",
                Toast.LENGTH_SHORT);
    }
    public void onStop()
    {
        super.onStop();
        Log.d(tag, "In the onStop() event");

        Toast toast = Toast.makeText(getApplicationContext(),
                "In the onStop() event",
                Toast.LENGTH_SHORT);
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");

        Toast toast = Toast.makeText(getApplicationContext(),
                "In the onDestroy() event",
                Toast.LENGTH_SHORT);
    }
}
