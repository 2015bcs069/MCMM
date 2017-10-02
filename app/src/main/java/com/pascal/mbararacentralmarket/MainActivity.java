package com.pascal.mbararacentralmarket;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    String[] items={"Vegetable","Clothes","Fruits","Shoes"};
    String[] item1={"Vegetable","Clothes","Fruits","Shoes"};

    private Context con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        con=MainActivity.this;


        int configuration=getResources().getConfiguration().orientation;
        if(configuration== Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.portrait);
            ListView listView= (ListView) findViewById(R.id.portlist);

            ListAdapter adapter=new ArrayAdapter<String>(con,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout r1= (RelativeLayout) findViewById(R.id.veg);
                RelativeLayout r2= (RelativeLayout) findViewById(R.id.fragClothes);
                RelativeLayout r3 = (RelativeLayout) findViewById(R.id.fru);
                RelativeLayout r4 = (RelativeLayout) findViewById(R.id.sho);


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String selects=String.valueOf(parent.getItemAtPosition(position));
                    switch (selects){
                        case "Vegetable":

                            r1.setVisibility(View.VISIBLE);
                            r2.setVisibility(View.INVISIBLE);
                            r3.setVisibility(view.INVISIBLE);
                            r4.setVisibility(view.INVISIBLE);

                            break;
                        case "Clothes":

                            r1.setVisibility(View.INVISIBLE);
                            r2.setVisibility(View.VISIBLE);
                            r3.setVisibility(view.INVISIBLE);
                            r4.setVisibility(view.INVISIBLE);
                            break;
                        case "Fruits":

                            r1.setVisibility(View.INVISIBLE);
                            r2.setVisibility(View.INVISIBLE);
                            r3.setVisibility(view.VISIBLE);
                            r4.setVisibility(view.INVISIBLE);
                            break;
                        case "Shoes":

                            r1.setVisibility(View.INVISIBLE);
                            r2.setVisibility(View.INVISIBLE);
                            r3.setVisibility(view.INVISIBLE);
                            r4.setVisibility(view.VISIBLE);
                            break;

                    }
                }
            });

        }
        else if(configuration== Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.landscape);
            ListView listView = (ListView) findViewById(R.id.landList);

            ListAdapter adapter = new ArrayAdapter<String>(con, android.R.layout.simple_list_item_1, item1);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout r1 = (RelativeLayout) findViewById(R.id.veg1);
                RelativeLayout r2 = (RelativeLayout) findViewById(R.id.clo2);
                RelativeLayout r3 = (RelativeLayout) findViewById(R.id.fru2);
                RelativeLayout r4 = (RelativeLayout) findViewById(R.id.sho2);


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String user_chose = String.valueOf(parent.getItemAtPosition(position));
                    switch (user_chose) {
                        case "Vegetable":

                            r1.setVisibility(View.VISIBLE);
                            r2.setVisibility(View.INVISIBLE);
                            r3.setVisibility(view.INVISIBLE);
                            r4.setVisibility(view.INVISIBLE);

                            break;
                        case "Clothes":

                            r1.setVisibility(View.INVISIBLE);
                            r2.setVisibility(View.VISIBLE);
                            r3.setVisibility(view.INVISIBLE);
                            r4.setVisibility(view.INVISIBLE);
                            break;
                        case "Fruits":

                            r1.setVisibility(View.INVISIBLE);
                            r2.setVisibility(View.INVISIBLE);
                            r3.setVisibility(view.VISIBLE);
                            r4.setVisibility(view.INVISIBLE);
                            break;
                        case "Shoes":

                            r1.setVisibility(View.INVISIBLE);
                            r2.setVisibility(View.INVISIBLE);
                            r3.setVisibility(view.INVISIBLE);
                            r4.setVisibility(view.VISIBLE);
                            break;

                    }
                }
            });
        }
    }
}
