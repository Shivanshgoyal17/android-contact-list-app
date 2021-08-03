package com.example.contactlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.CursorAdapter;

public class MainActivity extends AppCompatActivity {
    Contact o1 = new Contact(1,"3290765467", "Tony");
    Contact o2 = new Contact(2,"4890765467", "Steve");
    Contact o3 = new Contact(3,"2170765467", "Natasha");
    Contact o4 = new Contact(4,"3898765467", "Banner");
    Contact o5 = new Contact(5,"2990765467", "Thor");
    Contact o6 = new Contact(6,"1690765467", "Captain Marvel");
    Contact o7 = new Contact(7,"5890765467", "Peter");
    Contact o8 = new Contact(8,"1890455467", "Vision");
    Contact o9 = new Contact(9,"3390766467", "Black Panther");

    Contact [] contacts = {o1, o2, o3, o4, o5, o6, o7, o8, o9};
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad = new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


    }
}