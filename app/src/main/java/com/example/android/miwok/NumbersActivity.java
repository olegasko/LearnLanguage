package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>(Arrays.asList(
                new Word("one", "один"),
                new Word("two", "два"),
                new Word("three","три"),
                new Word("four","чотири"),
                new Word("five","пять"),
                new Word("six","шесть"),
                new Word("seven","семь"),
                new Word("eight","восемь"),
                new Word("nine","девять"),
                new Word("ten","десять")
        ));

        WordAdapter itemsAdapter =
                new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
