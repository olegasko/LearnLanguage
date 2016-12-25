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
                new Word("one", "один", R.drawable.number_one),
                new Word("two", "два", R.drawable.number_two),
                new Word("three","три", R.drawable.number_three),
                new Word("four","чотири", R.drawable.number_four),
                new Word("five","пять", R.drawable.number_five),
                new Word("six","шесть", R.drawable.number_six),
                new Word("seven","семь", R.drawable.number_seven),
                new Word("eight","восемь", R.drawable.number_eight),
                new Word("nine","девять", R.drawable.number_nine),
                new Word("ten","десять", R.drawable.number_ten)
        ));

        WordAdapter itemsAdapter =
                new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
