package com.sanamshikalgar.audiblearabic;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        ArrayList<Words> arrayListofWords = new ArrayList<Words>();

        arrayListofWords.add(new Words("What is your name?", "'ma asmak?",0));
        arrayListofWords.add(new Words("How are you?", "kayf halik?",0));
        arrayListofWords.add(new Words("I am doing well.", "'ana ealaa ma yaram.",0));
        arrayListofWords.add(new Words("Where are you from?", "min ayi balad 'anat?",0));
        arrayListofWords.add(new Words("All the best.", "'atamanaa lak kl khayr",0));
        arrayListofWords.add(new Words("See you again", "narakum maratan 'ukhraa.",0));
        arrayListofWords.add(new Words("I am sorry.", "'iinaa asif",0));
        arrayListofWords.add(new Words("Have a good day.", "'atamanaa lak yawm jayid",0));
        arrayListofWords.add(new Words("What is the time?", "kam alsaaeat?",0));
        arrayListofWords.add(new Words("I love you", "'ahbak",0));

        WordAdapter wordAdapter = new WordAdapter(this, arrayListofWords,R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(wordAdapter);
    }
}

