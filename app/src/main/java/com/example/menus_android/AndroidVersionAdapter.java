package com.example.menus_android;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class AndroidVersionAdapter extends ArrayAdapter {
    private final List<AndroidVersion> androidVersions;
    public AndroidVersionAdapter(Context context,int layoutId, List<AndroidVersion> androidVersions){
        super(context,layoutId,androidVersions);
        this.androidVersions=androidVersions;
    }

    @NonNull
    @SuppressLint("ViewHolder")
    public View getView(int position, View convertView, @NonNull ViewGroup parent){
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.vresion_item,parent,false);

        AndroidVersion androidVersion=androidVersions.get(position);

        TextView nomVersionTV=convertView.findViewById(R.id.nomVersion);
        TextView nomCodeVersionTV=convertView.findViewById(R.id.nomCodeVersion);
        TextView numeroVersionTV=convertView.findViewById(R.id.numeroVersion);

        nomVersionTV.setText(androidVersion.getNom());
        nomCodeVersionTV.setText(androidVersion.getNomCode());
        numeroVersionTV.setText(""+androidVersion.getVersion());

        return convertView;
    }
}
