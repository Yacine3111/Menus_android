package com.example.menus_android;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    List<AndroidVersion> androidVersions=new ArrayList<>();
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

        AndroidVersionAdapter adapter=new AndroidVersionAdapter(this,R.layout.vresion_item,androidVersions);

        androidVersions.add(new AndroidVersion("Android 16","Baklava",2));
        androidVersions.add(new AndroidVersion("Android 15","Baklava",1));

        listAndroidVersion.setAdapter(adapter);



        getSupportActionBar().setTitle("AndroidVersion");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int itemId=item.getItemId();

        if(itemId== R.id.AddItem){
            return true;
        } else if (itemId==R.id.EraseItem) {
            return true;
        }else{
            return super.onOptionsItemSelected(item);
        }
    }

}