package com.example.home_bartending;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {
    private List<Fruit> fruitList=new ArrayList<>();
    private String[] data={"1","2","3","4","5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initFruits();
        FruitAdapter adapter=new FruitAdapter(SearchActivity.this,R.layout.fruit_item,fruitList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        Button but1 = findViewById(R.id.but1);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.but1:
                        fruitList.clear();
                        Fruit five=new Fruit("中等烈度",R.drawable.five);
                        fruitList.add(five);
                        break;
                }

            }
        };
        but1.setOnClickListener(listener);
    }
    private void initFruits()
    {

            Fruit apple=new Fruit("中等烈度",R.drawable.one);
            fruitList.add(apple);
            Fruit two=new Fruit("低等烈度",R.drawable.two);
            fruitList.add(two);
            Fruit three=new Fruit("高等烈度",R.drawable.three);
            fruitList.add(three);
            Fruit four=new Fruit("中等烈度",R.drawable.four);
            fruitList.add(four);
            Fruit five=new Fruit("中等烈度",R.drawable.five);
            fruitList.add(five);

    }



}