package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Context context, List<Word> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english);
        TextView translatedTextView = (TextView) listItemView.findViewById(R.id.translation);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        englishTextView.setText(currentWord.getEnglishWord());
        translatedTextView.setText(currentWord.getTranslatedWord());
        if (currentWord.getImageVisibility()) {
            imageView.setImageResource(currentWord.getImageResourceId());
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }

}
