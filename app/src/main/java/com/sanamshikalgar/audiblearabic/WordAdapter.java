package com.sanamshikalgar.audiblearabic;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class WordAdapter extends ArrayAdapter <Words>{
    // mBackColorForEachList is a resource id for background color of the list of words
    // global variable so all activities can refer to it and use intended color of the background
    private int mBackColorForEachList;

    public WordAdapter(Activity context, ArrayList<Words> arrayListofWords,int backColorForEachList) {
        super(context, 0, arrayListofWords);
        mBackColorForEachList = backColorForEachList;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {          // Check if the existing view is being reused, otherwise inflate the view
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.each_word_in_list, parent, false);
        }
        Words currentWord = getItem(position);   // Get the object located at this position in the list

        TextView arabicTextView = (TextView) listItemView.findViewById(R.id.arabic_text_view);
        arabicTextView.setText(currentWord.getArabic());

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_text_view);
        englishTextView.setText(currentWord.getEnglish());

// for views with images
        //ImageView pictureImageView = (ImageView) listItemView.findViewById(R.id.picture_icon);
        //pictureImageView.setImageResource(currentWord.getPicture());

// When images are available vs unavailable for views without images

        ImageView pictureImageView = (ImageView) listItemView.findViewById(R.id.picture_icon);
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            pictureImageView.setImageResource(currentWord.getPicture());
            // Make sure the view is visible
            pictureImageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            pictureImageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mBackColorForEachList);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews)*/
        return listItemView;
    }
}
