package com.example.testdemo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button btnJoin;
    private EditText ipName;
    private EditText ipPhone;
    private EditText ipEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        btnJoin = findViewById(R.id.btnJoin);
        ipName = findViewById(R.id.ipNamae);
        ipPhone = findViewById(R.id.ipPhone);
        ipEmail = findViewById(R.id.ipEmail);


        registerForContextMenu(imageView);
    }

//    @Override
//    protected void onStop() {
//        super.onStop();
//        SharedPreferences pref = getSharedPreferences("data", Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = pref.edit();
//        editor.putString("name",name);
//        editor.putString("phone",phone);
//        editor.putString("email",email);
//        editor.commit();
//    }
//
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        SharedPreferences pref = getSharedPreferences("data", Context.MODE_PRIVATE);
//        name = pref.getString("name", ipName.getText().toString());
//        phone = pref.getString("phone", ipPhone.getText().toString());
//        email = pref.getString("email", ipEmail.getText().toString());
//
//    }

//    String name = ipName.getText().toString();
//    String phone=ipPhone.getText().toString();
//    String email=ipEmail.getText().toString();

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);


        MenuInflater inflater = getMenuInflater();
        if(v.getId() == R.id.imageView){
            inflater.inflate(R.menu.image_menu, menu);
        }

        btnJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.change:
                Intent intent = new Intent(MainActivity.this, ChangeImage.class);

                startActivityForResult(intent, 6666);
                break;

        }
        return super.onContextItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 6666 && resultCode == 8888){
            int image = data.getIntExtra("image", 0);
            switch (image){
                case 1:
                    imageView.setImageResource(R.drawable.dog);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.may);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.trasua);
                    break;
            }
        }
    }




}