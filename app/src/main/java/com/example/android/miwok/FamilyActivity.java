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
        setContentView(R.layout.activity_famaly_members);

        ArrayList<Word> words = new ArrayList<>(Arrays.asList(
                new Word("father", "отец"),
                new Word("mother", "мать"),
                new Word("son","сын"),
                new Word("daughter","дочь"),
                new Word("brother","брат"),
                new Word("sister","сестра"),
                new Word("grandmother","бабушка"),
                new Word("grandfather","дедушка")
        ));

        WordAdapter itemsAdapter =
                new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
