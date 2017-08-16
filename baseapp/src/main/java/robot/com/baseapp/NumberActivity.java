package robot.com.baseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import robot.com.myapplication.number.ScreenX;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScreenX.Companion.getInstance(this).getHeight(this);

    }
}
