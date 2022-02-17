package com.example.recycv_timetable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Model> rasp = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setData();

        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);

        RecyclerView recyclerView = findViewById(R.id.recycleView);
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, rasp);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(layoutManager);
    }

    private void setData(){
        rasp.add(new Model("ПОНЕДЕЛЬНИК","Разработка программных модулей\nТех разработки и защиты БД","А.Ю. Бушин\nА.С. Токарчук","Физическая культура\n------------------","Д.М. Салоникес\n--------------","ИС разработки ПО","Ю.В. Севастьянов","Разработка программных модулей","А.А. Шимберёв"," "," "));
        rasp.add(new Model("ВТОРНИК","ПРАКТИКА"," ","ПРАКТИКА"," ","ПРАКТИКА"," ","ПРАКТИКА"," ","ПРАКТИКА"," "));
        rasp.add(new Model("СРЕДА","ПРАКТИКА"," ","ПРАКТИКА"," ","ПРАКТИКА"," ","ПРАКТИКА"," ","ПРАКТИКА"," "));
        rasp.add(new Model("ЧЕТВЕРГ","Технология разработки ПО","          Л.А. Соколова","Разработка программных модулей","          А.Ю. Бушин","Системное программирование","          А.Д. Нилов","Разработка мобильных приложений","          А.О. Лясников"," "," "));
        rasp.add(new Model("ПЯТНИЦА"," "," ","Иностранный язык в ПД","          А.Д. Завьялова","Тех разработки и защиты БД","          А.С. Токарчук","ИС разработки ПО\nРазработка мобильных приложений","          Ю.В. Севастьянов\n          А.О. Лясников","Технология разработки ПО\nСистемное программирование","          Л.А. Соколова\n          А.Д. Нилов"));
        rasp.add(new Model("СУББОТА"," "," "," "," "," "," "," "," "," "," "));
        //5
    }
}