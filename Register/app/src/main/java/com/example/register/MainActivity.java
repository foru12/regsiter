package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

    public class MainActivity extends AppCompatActivity {
        EditText edname;
        Button voity;
        EditText edLogin, edPassword, PlaceOfBirth, number, password1;
        EditText tv_date;

        EditText eDname, name11;


        Button NEXT;
        private DatabaseReference mdataBase;
        private String USERKEY = "User";


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            voity = findViewById(R.id.button2);
            tv_date = findViewById(R.id.tv_date);
            edLogin = findViewById(R.id.EtLogin);
            edPassword = findViewById(R.id.ETPassword);
            eDname = findViewById(R.id.FIO);
            PlaceOfBirth = findViewById(R.id.PlaceOfBirth);
            number = findViewById(R.id.editTextPhone);
            NEXT = findViewById(R.id.next);
            name11 = findViewById(R.id.login1);
            password1 = findViewById(R.id.password);


            init();

        }

        public void read(View view) {
            Intent t = new Intent(com.example.register.MainActivity.this, Register.class);
            startActivity(t);
        }


        public void init() {
            mdataBase = FirebaseDatabase.getInstance().getReference(USERKEY);
        }

        public void onClickSave(View view) {
            String id = mdataBase.getKey();
            String name = edLogin.getText().toString();
            String Password = edPassword.getText().toString();
            String edName = eDname.getText().toString();
            String placeofbirth = PlaceOfBirth.getText().toString();
            String Num = number.getText().toString();
            String TVFDATE = tv_date.getText().toString();
            //String name1 = name11.getText().toString();

            User newuser = new User(id, name, Password, edName, placeofbirth, Num, TVFDATE);
            mdataBase.push().setValue(newuser);
            Intent intent = new Intent(com.example.register.MainActivity.this, Register.class);
            startActivity(intent);

        }

        public void onClickSAVE(View view) {
        }
    }
