package com.example.preethi.bicsglobalfirbasetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(TextView) findViewById(R.id.text1);
        text1.setText(FirebaseInstanceId.getInstance().getToken());
        Log.i("Firebase","Firbase Token===>"+FirebaseInstanceId.getInstance().getToken());
    }
}
