package com.anta40.app.uselessappdemo;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.anta40.app.uselesslib.MyLib;

public class MainActivity extends AppCompatActivity {

    MyLib lib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lib = new MyLib();
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),
                lib.scrambleString("Hello world"), Toast.LENGTH_SHORT).show();
    }
}