package com.example.my_app12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView = findViewById(R.id.recycler_view);
        AddressAdapter adapter = new AddressAdapter(address);
        recyclerView.setAdapter(adapter);
    }
    private void  loadData() {
        address=new ArrayList<>();
        address.add("ЦОН Ленинского района");
        address.add("ЦОН-Центры обслуживания населения");
        address.add("Центр Обслуживания Населения 2");
        address.add("Цон 2");
        address.add("Департамент регистрации населения и актов гражданского состояния");
        address.add("ЦОН - 4 ЦОП");
        address.add("Государственная Регистрационная Служба");
        address.add("ЦОН");
        address.add("Паспортный Стол");
        address.add("Жибек Жолу 356");
        address.add("Паспортный стол Свердловского района");
        address.add("Аю гранд");
        address.add("Администрация октябрьского района г. Бишкек");


    }
}