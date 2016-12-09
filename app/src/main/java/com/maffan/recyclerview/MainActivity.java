package com.maffan.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import static com.maffan.recyclerview.R.styleable.RecyclerView;

public class MainActivity extends AppCompatActivity  {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] alphabets = {"ListView","GridView","RecyclerView","CustomList"};
    private ListView simpleList;
    private RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = (RelativeLayout) findViewById(R.id.activity_main);
        simpleList = new ListView(this);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, alphabets);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (alphabets[position]){
                    case "ListView": {

                        Toast.makeText(getBaseContext(),"You're already in " + alphabets[position],Toast.LENGTH_SHORT).show();

                    }
                    break;
                    case "GridView": {

                        Intent intent = new Intent(MainActivity.this,GridViewActivity.class);
                        startActivity(intent);

                    }
                    break;
                    case "RecyclerView": {

                        Toast.makeText(getBaseContext(),"Not Implemented Yet",Toast.LENGTH_SHORT).show();
                    }
                    break;
                    case "CustomList":{

                        Intent intent = new Intent(MainActivity.this,CustomList.class);
                        startActivity(intent);
                    }
                    break;

                }
            }
        });
        simpleList.setAdapter(adapter);
        relativeLayout.addView(simpleList);
    }

}


