package com.sanamshikalgar.audiblearabic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        ArrayList<Words> arrayListofWords = new ArrayList<Words>();

        arrayListofWords.add(new Words("one", "wahid", R.drawable.number_one,0));
        arrayListofWords.add(new Words("two", "athnan", R.drawable.number_two,0));
        arrayListofWords.add(new Words("three", "thlath",R.drawable.number_three,0));
        arrayListofWords.add(new Words("four", "arbe",R.drawable.number_four,0));
        arrayListofWords.add(new Words("five", "khms",R.drawable.number_five,0));
        arrayListofWords.add(new Words("six", "st",R.drawable.number_six,0));
        arrayListofWords.add(new Words("seven", "sbe",R.drawable.number_seven,0));
        arrayListofWords.add(new Words("eight", "thmany",R.drawable.number_eight,0));
        arrayListofWords.add(new Words("nine", "tse",R.drawable.number_nine,0));
        arrayListofWords.add(new Words("ten", "eshr",R.drawable.number_ten,0));

        /* DO NOT DELETE THIS BLOCK TO BE USED LATER

        arrayListofWords.add(new Words("one", "wahid", R.drawable.number_one, R.raw.testringtone));
        arrayListofWords.add(new Words("two", "athnan", R.drawable.number_two,R.raw.testringtone2));
        arrayListofWords.add(new Words("three", "thlath",R.drawable.number_three,0));
        arrayListofWords.add(new Words("four", "arbe",R.drawable.number_four,0));
        arrayListofWords.add(new Words("five", "khms",R.drawable.number_five,0));
        arrayListofWords.add(new Words("six", "st",R.drawable.number_six,0));
        arrayListofWords.add(new Words("seven", "sbe",R.drawable.number_seven,0));
        arrayListofWords.add(new Words("eight", "thmany",R.drawable.number_eight,0));
        arrayListofWords.add(new Words("nine", "tse",R.drawable.number_nine,0));
        arrayListofWords.add(new Words("ten", "eshr",R.drawable.number_ten,0));*/

        WordAdapter wordAdapter = new WordAdapter(this, arrayListofWords,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(wordAdapter);
    }
}
