package com.example.thanusha.coffeeapp;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCatergoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listDrinks =getListView();

        ArrayAdapter<Drinks> listAdapter =new ArrayAdapter<Drinks>(
                this,
                android.R.layout.simple_list_item_1,
                Drinks.drinks
        );
        listDrinks.setAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent =new Intent(DrinkCatergoryActivity.this,DrinkActivity.class);
//        Intent.putExtra(DrinkActivity.EXTRA_DRINKNO(int))
        startActivity(intent);
    }
}
