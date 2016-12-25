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
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words = new ArrayList<>(Arrays.asList(
                new Word("red", "красный"),
                new Word("green", "зеленый"),
                new Word("brown","коричневый"),
                new Word("grey","серый"),
                new Word("black","черный"),
                new Word("white","белый"),
                new Word("purple","пурпурный"),
                new Word("yellow","желтый"),
                new Word("orange","оранжевый"),
                new Word("blue","голубой")
        ));

        WordAdapter itemsAdapter =
                new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
