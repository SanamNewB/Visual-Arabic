package com.sanamshikalgar.audiblearabic;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        ArrayList<Words> arrayListofWords = new ArrayList<Words>();

        // 10 colors
        arrayListofWords.add(new Words("Blue", "'azraq", R.drawable.color_blue,0));
        arrayListofWords.add(new Words("Black", "'aswad", R.drawable.color_black,0));
        arrayListofWords.add(new Words("Brown", "bunaa", R.drawable.color_brown, 0));
        arrayListofWords.add(new Words("Grey", "ramaadi", R.drawable.color_gray, 0));
        arrayListofWords.add(new Words("Green", "'akhdir", R.drawable.color_green, 0));
        arrayListofWords.add(new Words("Orange", "burtuqaali", R.drawable.color_orange, 0));
        arrayListofWords.add(new Words("Purple", "urjuwaani", R.drawable.color_purple, 0));
        arrayListofWords.add(new Words("Red", "'humr", R.drawable.color_red, 0));
        arrayListofWords.add(new Words("White", "abyad", R.drawable.color_white, 0));
        arrayListofWords.add(new Words("Yellow", "asfar", R.drawable.color_yellow, 0));

        /* DO NOT DELETE THIS BLOCK TO BE USED LATER

        arrayListofWords.add(new Words("Blue", "'azraq", R.drawable.color_blue, R.raw.testringtone));
        arrayListofWords.add(new Words("Black", "'aswad", R.drawable.color_black, R.raw.testringtone2));
        arrayListofWords.add(new Words("Brown", "bunaa", R.drawable.color_brown, 0));
        arrayListofWords.add(new Words("Gray", "allawn alramadiu", R.drawable.color_gray, 0));
        arrayListofWords.add(new Words("Green", "'akhdir", R.drawable.color_green, 0));
        arrayListofWords.add(new Words("Orange", "alburtuqaliu", R.drawable.color_orange, 0));
        arrayListofWords.add(new Words("Purple", "sbe", R.drawable.color_purple, 0));
        arrayListofWords.add(new Words("Red", "'arijwani", R.drawable.color_red, 0));
        arrayListofWords.add(new Words("White", "'ahmar", R.drawable.color_white, 0));
        arrayListofWords.add(new Words("Yellow", "al'asfar", R.drawable.color_yellow, 0));
*/
        WordAdapter wordAdapter = new WordAdapter(this, arrayListofWords, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(wordAdapter);
    }
}