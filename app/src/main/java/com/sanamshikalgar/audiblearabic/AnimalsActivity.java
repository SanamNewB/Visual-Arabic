package com.sanamshikalgar.audiblearabic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        ArrayList<Words> arrayListofWords = new ArrayList<Words>();
        // 20 animals
        arrayListofWords.add(new Words("a dog", "kalb", 0, 0));
        arrayListofWords.add(new Words("a cat","qata",0,0));
        arrayListofWords.add(new Words("a cow","baqara",0,0));
        arrayListofWords.add(new Words("a horse","hisan",0,0));
        arrayListofWords.add(new Words("a camel","jamal",0,0));
        arrayListofWords.add(new Words("a lion","asad",0,0));
        arrayListofWords.add(new Words("a giraffe","zaraafa",0,0));
        arrayListofWords.add(new Words("a cheetah","fahd",0,0));
        arrayListofWords.add(new Words("a tiger","namir",0,0));
        arrayListofWords.add(new Words("an elephant","fiil",0,0));
        arrayListofWords.add(new Words("a monkey","qird",0,0));
        arrayListofWords.add(new Words("a fish","samak",0,0));
        arrayListofWords.add(new Words("an ant","naml",0,0));
        arrayListofWords.add(new Words("a sheep","ġanam",0,0));
        arrayListofWords.add(new Words("a chicken","dajaaj",0,0));
        arrayListofWords.add(new Words("an owl","buum",0,0));
        arrayListofWords.add(new Words("a peacock","Taawuus",0,0));
        arrayListofWords.add(new Words("a nightingale","bulbul",0,0));
        arrayListofWords.add(new Words("an eagle","nasr",0,0));
        arrayListofWords.add(new Words("a turtle","sulhufaah",0,0));
        arrayListofWords.add(new Words("a snake","thueban",0,0));

        WordAdapter wordAdapter = new WordAdapter(this, arrayListofWords,R.color.category_animals);
        ListView listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(wordAdapter);
     }
}
