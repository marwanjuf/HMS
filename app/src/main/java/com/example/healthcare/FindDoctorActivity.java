package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FindDoctorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctor);
        CardView exit = findViewById(R.id.cardFDHomePage);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindDoctorActivity.this, HomeActivity.class));
            }
        });
        CardView Familyphysician = findViewById(R.id.cardFDFamilyPhysician);
        Familyphysician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailActivity.class);
                it.putExtra("title","Family Physicians");
                startActivity(it);

            }
        });

        CardView Dietivian = findViewById(R.id.cardFDDietivian);
        Familyphysician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailActivity.class);
                it.putExtra("title","Dietivian");
                startActivity(it);

            }
        });

        CardView Dentist = findViewById(R.id.cardFDDentist);
        Familyphysician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailActivity.class);
                it.putExtra("title","Dentist");
                startActivity(it);

            }
        });

        CardView Surgeon = findViewById(R.id.cardFDSurgeon);
        Familyphysician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailActivity.class);
                it.putExtra("title","Surgeon");
                startActivity(it);

            }
        });
        CardView Dcardiologists = findViewById(R.id.cardFDcardiologists);
        Familyphysician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this,DoctorDetailActivity.class);
                it.putExtra("title","Dcardiologists");
                startActivity(it);

            }
        });
    }
}