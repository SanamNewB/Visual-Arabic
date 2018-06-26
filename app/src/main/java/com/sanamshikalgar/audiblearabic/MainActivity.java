package com.sanamshikalgar.audiblearabic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.sanamshikalgar.audiblearabic.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view that shows all category
        TextView alphabets = (TextView) findViewById(R.id.alphabets);
        TextView animals = (TextView) findViewById(R.id.animals);
        TextView colors = (TextView) findViewById(R.id.colors);
        TextView fruits = (TextView) findViewById(R.id.fruits);
        TextView numbers = (TextView) findViewById(R.id.numbers); // edit the .xml file to remove the onClick attribute for button click
        TextView phrases = (TextView) findViewById(R.id.phrases);
        TextView things = (TextView) findViewById(R.id.things);

        // Set onclick listener on those View

        alphabets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent alphabetsIntent = new Intent(MainActivity.this,AlphabetActivity.class);
                startActivity(alphabetsIntent);
            }
        });

        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent animalsIntent = new Intent(MainActivity.this,AnimalsActivity.class);
                startActivity(animalsIntent);
            }
        });

        colors.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) { //onClick() is an abstract method which can have customized behavior
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        fruits.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) { //onClick() is an abstract method which can have customized behavior
                Intent fruitsIntent = new Intent(MainActivity.this, FruitActivity.class);
                startActivity(fruitsIntent);
            }
        });

        numbers.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) { //onClick() is an abstract method which can have customized behavior
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) { //onClick() is an abstract method which can have customized behavior
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

        things.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) { //onClick() is an abstract method which can have customized behavior
                Intent thingsIntent = new Intent(MainActivity.this, ThingsActivity.class);
                startActivity(thingsIntent);
            }
        });
    }
}
