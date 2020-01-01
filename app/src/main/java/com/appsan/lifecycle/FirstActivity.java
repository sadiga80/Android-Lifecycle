package com.appsan.lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    String tag = "First Activity Lifecycle";

    private ConstraintLayout constraintLayout;
    private Button mButton;
    private Context mContext;

    private PopupWindow mPopupWindow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        mContext = getApplicationContext();

        constraintLayout = (ConstraintLayout) findViewById(R.id.first_activity);
        mButton = (Button) findViewById(R.id.btnShowPopUp);

        Button btnGoToSecondActivity = (Button) findViewById(R.id.btnGoToSecond);

        btnGoToSecondActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(intent);
            }
        });

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Initialize a new instance of LayoutInflater service
                LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                // Inflate the custom layout/view
                View customView = inflater.inflate(R.layout.popup_window,null);

                /*
                    public PopupWindow (View contentView, int width, int height)

                */
                mPopupWindow = new PopupWindow(
                        customView,
                        RelativeLayout.LayoutParams.MATCH_PARENT,
                        RelativeLayout.LayoutParams.MATCH_PARENT
                );

                // Set an elevation value for popup window
                // Call requires API level 21
                if(Build.VERSION.SDK_INT>=21){
                    mPopupWindow.setElevation(5.0f);
                }

                ImageButton closeButton = (ImageButton) customView.findViewById(R.id.btn_close);

                closeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Dismiss the popup window
                        mPopupWindow.dismiss();
                    }
                });

                /*
                    public void showAtLocation (View parent, int gravity, int x, int y)
                */
                // Finally, show the popup window at the center location of root relative layout
                mPopupWindow.showAtLocation(constraintLayout, Gravity.CENTER,0,0);
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
