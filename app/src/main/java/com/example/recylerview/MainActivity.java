package com.example.recylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<contactModal> arraycontact = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView= findViewById(R.id.recylerview);

//        GridLayoutManager gridLayoutManager= new GridLayoutManager(this,3);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

//        recyclerView.setLayoutManager(gridLayoutManager);


        arraycontact.add(new contactModal(R.drawable.whatsapp , "A", "33333300000"));
        arraycontact.add(new contactModal(R.drawable.insta , "B", "33333300000"));
        arraycontact.add(new contactModal(R.drawable.whatsapp , "c", "33333300000"));
        arraycontact.add(new contactModal(R.drawable.insta , "d", "33333300000"));
        arraycontact.add(new contactModal(R.drawable.whatsapp , "e", "33333300000"));
        arraycontact.add(new contactModal(R.drawable.insta , "f", "33333300000"));
        arraycontact.add(new contactModal(R.drawable.whatsapp , "f", "33333300000"));
        arraycontact.add(new contactModal(R.drawable.insta , "g", "33333300000"));
        arraycontact.add(new contactModal(R.drawable.whatsapp , "h", "33333300000"));
        arraycontact.add(new contactModal(R.drawable.insta , "i", "33333300000"));
        arraycontact.add(new contactModal(R.drawable.whatsapp , "j", "33333300000"));
        arraycontact.add(new contactModal(R.drawable.insta , "k", "33333300000"));
        arraycontact.add(new contactModal(R.drawable.whatsapp , "l", "33333300000"));
        arraycontact.add(new contactModal(R.drawable.insta , "l", "33333300000"));
        arraycontact.add(new contactModal(R.drawable.whatsapp , "m", "33333300000"));
        arraycontact.add(new contactModal(R.drawable.insta , "n", "33333300000"));
        arraycontact.add(new contactModal(R.drawable.whatsapp , "o", "33333300000"));
        arraycontact.add(new contactModal(R.drawable.insta , "p", "33333300000"));
        arraycontact.add(new contactModal(R.drawable.whatsapp , "q", "33333300000"));
        arraycontact.add(new contactModal(R.drawable.whatsapp,"r","03333000000"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arraycontact);
        recyclerView.setAdapter(adapter);






    }
}