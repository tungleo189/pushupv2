package com.example.testdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ChangeImage extends AppCompatActivity {
    private int a;
    private Button btnSave;
    private ImageView dog;
    private ImageView may;
    private ImageView trasua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_image);
        btnSave = findViewById(R.id.btnSave);
        dog = findViewById(R.id.dog);
        may = findViewById(R.id.may);
        trasua = findViewById(R.id.trasua);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent();
                data.putExtra("image", a);
                setResult(8888,data);
                finish();
            }
        });

    }


//    @Override
//    protected void onStop() {
//        super.onStop();
//        SharedPreferences pref = getSharedPreferences("data", Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = pref.edit();
//        editor.putInt("image",a);
//        editor.commit();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        SharedPreferences pref = getSharedPreferences("data", Context.MODE_PRIVATE);
//        a = pref.getInt("image", a);
//
//    }




    public void MyClick(View view){
        switch (view.getId()){
            case R.id.dog:
                dog.setBackgroundColor(Color.RED);
                may.setBackgroundColor(Color.WHITE);
                trasua.setBackgroundColor(Color.WHITE);

                a= 1;
                break;
            case R.id.may:
                dog.setBackgroundColor(Color.WHITE);
                may.setBackgroundColor(Color.RED);
                trasua.setBackgroundColor(Color.WHITE);
                a= 2;
                break;
            case R.id.trasua:
                dog.setBackgroundColor(Color.WHITE);
                may.setBackgroundColor(Color.WHITE);
                trasua.setBackgroundColor(Color.RED);
                a= 3;
                break;
        }
    }
}