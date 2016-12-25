package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>(Arrays.asList(
                new Word("red", "красный", R.drawable.color_red),
                new Word("green", "зеленый", R.drawable.color_green),
                new Word("brown","коричневый",R.drawable.color_brown),
                new Word("grey","серый", R.drawable.color_gray),
                new Word("black","черный", R.drawable.color_black),
                new Word("white","белый", R.drawable.color_white),
                new Word("yellow","желтый", R.drawable.color_mustard_yellow),
                new Word("orange","оранжевый", R.drawable.color_dusty_yellow)
        ));

        WordAdapter itemsAdapter =
                new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
