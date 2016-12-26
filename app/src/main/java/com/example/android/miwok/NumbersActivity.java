package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<>(Arrays.asList(
                new Word("one", "один", R.drawable.number_one, R.raw.one),
                new Word("two", "два", R.drawable.number_two, R.raw.two),
                new Word("three","три", R.drawable.number_three, R.raw.three),
                new Word("four","чотири", R.drawable.number_four, R.raw.four),
                new Word("five","пять", R.drawable.number_five, R.raw.five),
                new Word("six","шесть", R.drawable.number_six, R.raw.six),
                new Word("seven","семь", R.drawable.number_seven, R.raw.seven),
                new Word("eight","восемь", R.drawable.number_eight, R.raw.eight),
                new Word("nine","девять", R.drawable.number_nine, R.raw.nine),
                new Word("ten","десять", R.drawable.number_ten, R.raw.ten)
        ));

        WordAdapter itemsAdapter =
                new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int resourceId, long l) {
                releaseMediaPlayer();
                mMediaPlayer =
                        MediaPlayer.create(NumbersActivity.this,
                                words.get(resourceId).getAudioResourceId());
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }

    private void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }
}
