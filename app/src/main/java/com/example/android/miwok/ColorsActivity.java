package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<>(Arrays.asList(
                new Word("red", "красный", R.drawable.color_red, R.raw.red),
                new Word("green", "зеленый", R.drawable.color_green, R.raw.green),
                new Word("brown","коричневый",R.drawable.color_brown, R.raw.brown),
                new Word("grey","серый", R.drawable.color_gray, R.raw.grey),
                new Word("black","черный", R.drawable.color_black, R.raw.black),
                new Word("white","белый", R.drawable.color_white, R.raw.white),
                new Word("yellow","желтый", R.drawable.color_mustard_yellow, R.raw.yellow),
                new Word("orange","оранжевый", R.drawable.color_dusty_yellow, R.raw.orange)
        ));

        WordAdapter itemsAdapter =
                new WordAdapter(this, words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int resourceId, long l) {
                mMediaPlayer =
                        MediaPlayer.create(ColorsActivity.this,
                                words.get(resourceId).getAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
}
