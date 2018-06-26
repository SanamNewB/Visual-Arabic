package com.sanamshikalgar.audiblearabic;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlphabetActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        /*// using ARRAY of Strings
        String [] arrayOfwords = new String[10]; // string[10] mean array length is 10
        arrayOfwords[0] = "a"; // adding by putting element in 0th index of array
        arrayOfwords[1] = "b";
        arrayOfwords[3] = "c";*/

       /*// Using ARRAYLIST of strings
        ArrayList<String> arrayListOfStrings = new ArrayList<String>();
        arrayListOfStrings.add("a");
        arrayListOfStrings.add("b");
        arrayListOfStrings.add("c");*/

        // using custom class "Words.java to create the object instances
        ArrayList<Words> arrayListofWords = new ArrayList<Words>();
        //Words objectinstanceOfWords = new Words("one", "wahid",0,0); // when we use data type Kalimat //Line 1
        //arrayListofWords.add(objectinstanceOfWords);



        // 28 alphabets
        arrayListofWords.add(new Words("alif", "", R.drawable.alpha_0,0));
        arrayListofWords.add(new Words("baa","",R.drawable.alpha_2,0));
        arrayListofWords.add(new Words("taa","",R.drawable.alpha_3,0));
        arrayListofWords.add(new Words("thaa","",R.drawable.alpha_4,0));
        arrayListofWords.add(new Words("jiim","",R.drawable.alpha_5,0));
        arrayListofWords.add(new Words("haa","",R.drawable.alpha_6,0));
        arrayListofWords.add(new Words("kha","",R.drawable.alpha_7,0));
        arrayListofWords.add(new Words("daal","",R.drawable.alpha_8,0));
        arrayListofWords.add(new Words("thaal","",R.drawable.alpha_9,0));
        arrayListofWords.add(new Words("raa","",R.drawable.alpha_10,0));
        arrayListofWords.add(new Words("zaay","",R.drawable.alpha_11,0));
        arrayListofWords.add(new Words("siin","",R.drawable.alpha_12,0));
        arrayListofWords.add(new Words("shiin","",R.drawable.alpha_13,0));
        arrayListofWords.add(new Words("saad","",R.drawable.alpha_14,0));
        arrayListofWords.add(new Words("daad","",R.drawable.alpha_15,0));
        arrayListofWords.add(new Words("taa","",R.drawable.alpha_16,0));
        arrayListofWords.add(new Words("taa","",R.drawable.alpha_17,0));
        arrayListofWords.add(new Words("thaa","",R.drawable.alpha_18,0));
        arrayListofWords.add(new Words("ayn","",R.drawable.alpha_19,0));
        arrayListofWords.add(new Words("ghayn","",R.drawable.alpha_20,0));
        arrayListofWords.add(new Words("faa","",R.drawable.alpha_21,0));
        arrayListofWords.add(new Words("qaaf","",R.drawable.alpha_22,0));
        arrayListofWords.add(new Words("kaaf","",R.drawable.alpha_23,0));
        arrayListofWords.add(new Words("laam","",R.drawable.alpha_24,0));
        arrayListofWords.add(new Words("miim","",R.drawable.alpha_25,0));
        arrayListofWords.add(new Words("nuun","",R.drawable.alpha_26,0));
        arrayListofWords.add(new Words("ha","",R.drawable.alpha_27,0));
        arrayListofWords.add(new Words("waaw","",R.drawable.alpha_28,0));
        arrayListofWords.add(new Words("yaa","",R.drawable.alpha_29,0));

        // ArrayAdapter used in recycling the views. But by default only one textview is handled.
        // Custom ArrayAdapter can be used to hold as many Views as needed by creating it and
        // overriding the getView() in it

        /*ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayListOfStrings);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter)*/;

        WordAdapter wordAdapter = new WordAdapter(this, arrayListofWords,R.color.category_alphabets);
        ListView listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(wordAdapter);
        }
    }
