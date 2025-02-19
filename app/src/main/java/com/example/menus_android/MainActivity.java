package com.example.menus_android;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ListView listAndroidVersion=findViewById(R.id.listAndroidVersion);
        ArrayAdapter<AndroidVersion> adapter=new ArrayAdapter<>(listAndroidVersion.getContext(),R.layout.vresion_item);

        adapter.add(new AndroidVersion("Android 16","Baklava",2));
        adapter.add(new AndroidVersion("Android 15","Baklava",1));

        listAndroidVersion.setAdapter(adapter);



        getSupportActionBar().setTitle("AndroidVersion");


    }

}