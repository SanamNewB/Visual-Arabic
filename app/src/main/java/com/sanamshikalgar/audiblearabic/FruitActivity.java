package com.sanamshikalgar.audiblearabic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FruitActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        ArrayList<Words> arrayListofWords = new ArrayList<Words>();
        // 10 fruits

        arrayListofWords.add(new Words("apples", "tafah", 0, 0));
        arrayListofWords.add(new Words("oranges","burtuqaal",0,0));
        arrayListofWords.add(new Words("bananas","mooz",0,0));
        arrayListofWords.add(new Words("lemons","laymuun",0,0));
        arrayListofWords.add(new Words("pomegranate","rummaan",0,0));
        arrayListofWords.add(new Words("watermelon","battiix",0,0));
        arrayListofWords.add(new Words("strawberry","farawla",0,0));
        arrayListofWords.add(new Words("grapes","eanab",0,0));
        arrayListofWords.add(new Words("peach","xoox",0,0));
        arrayListofWords.add(new Words("dates","tamr",0,0));
        arrayListofWords.add(new Words("pineapple","ananaas",0,0));

        /*arrayListofWords.add(new Words("a fish","samak",0,0));
        arrayListofWords.add(new Words("an ant","naml",0,0));
        arrayListofWords.add(new Words("a sheep","ġanam",0,0));
        arrayListofWords.add(new Words("a chicken","dajaaj",0,0));
        arrayListofWords.add(new Words("an owl","buum",0,0));
        arrayListofWords.add(new Words("a peacock","Taawuus",0,0));
        arrayListofWords.add(new Words("a nightingale","bulbul",0,0));
        arrayListofWords.add(new Words("an eagle","nasr",0,0));
        arrayListofWords.add(new Words("a turtle","sulhufaah",0,0));
        arrayListofWords.add(new Words("a snake","thueban",0,0));*/

        WordAdapter wordAdapter = new WordAdapter(this, arrayListofWords,R.color.category_fruits);
        ListView listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(wordAdapter);
    }
}
