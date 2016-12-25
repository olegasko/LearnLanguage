package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>(Arrays.asList(
                new Word("father", "отец", R.drawable.family_father),
                new Word("mother", "мать", R.drawable.family_mother),
                new Word("son","сын", R.drawable.family_son),
                new Word("daughter","дочь", R.drawable.family_daughter),
                new Word("brother","брат", R.drawable.family_older_brother),
                new Word("sister","сестра",R.drawable.family_younger_sister),
                new Word("grandmother","бабушка", R.drawable.family_grandmother),
                new Word("grandfather","дедушка", R.drawable.family_grandfather)
        ));

        WordAdapter itemsAdapter =
                new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
