package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // public static final String TAG = MainActivity.class.getSimpleName();
    private int mCount = 0;
    private TextView mShowCount;
    private Button zeroButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        zeroButton = (Button) findViewById(R.id.button_zero);
        //Log.d(TAG,String.valueOf(count));//debug using log
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void resetZero(View view) {
        mCount = 0;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
            view.setBackgroundColor(Color.parseColor("#AAAAAA"));
        }
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
        }
        if(mCount != 0){
            zeroButton.setBackgroundColor(Color.parseColor("#FA0AED"));
        }
        if(mCount%2==0){
            view.setBackgroundColor(Color.rgb(55,0,179));
        }
        else{
            view.setBackgroundColor(Color.rgb(154,205,50));
        }
    }
}