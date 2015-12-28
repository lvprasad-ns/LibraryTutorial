package com.example.prasadtumma.librarytutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.prasadtumma.mylittlelibrary.MyView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = new MyView(this);
        setContentView(view);
    }
}
