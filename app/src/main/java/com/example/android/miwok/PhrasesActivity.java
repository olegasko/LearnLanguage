package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>(Arrays.asList(
                new Word("Where are you going?", "Куда ты идешь?"),
                new Word("What is your name?", "Как тебя зовут?"),
                new Word("My name is...","Меня зовут ..."),
                new Word("How are you feeling?","Как ты себя чувствуешь?"),
                new Word("I’m feeling good.","Я чувствую себя хорошо"),
                new Word("Are you coming?","Ты идешь?"),
                new Word("Yes, I’m coming.","Да, я иду."),
                new Word("Let’s go.","Пойдем.")
        ));

        WordAdapter itemsAdapter =
                new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
