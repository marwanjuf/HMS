package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailActivity extends AppCompatActivity {
    private String[][] doctor_details1 =
            {
                    {"Doctor Name : Abdullah Aljufaili ", "Hospital Address : Ibra " , "Exp : 20 yrs", "mobile Num 98988888" ,"900"},
                    {"Doctor Name : Wala Alharthy  ", "Hospital Address : Alqabil  " , "Exp : 1 yrs", "mobile Num 955423543" ,"120"},
                    {"Doctor Name : Noura Obaid  ", "Hospital Address : Mabila  " , "Exp : 24 yrs", "mobile Num 98911111","950"},
                    {"Doctor Name : Saadaa salim   ", "Hospital Address : sinaw   " , "Exp : 14 yrs", "mobile Num 9896666","750"}
            };
    private String[][] doctor_details2 =
            {
                    {"Doctor Name : Abdullah Aljufaili ", "Hospital Address : Ibra " , "Exp : 20 yrs", "mobile Num 98988888" ,"900"},
                    {"Doctor Name : Wala Alharthy  ", "Hospital Address : Alqabil  " , "Exp : 1 yrs", "mobile Num 955423543" ,"120"},
                    {"Doctor Name : Noura Obaid  ", "Hospital Address : Mabila  " , "Exp : 24 yrs", "mobile Num 98911111","950"},
                    {"Doctor Name : Saadaa salim   ", "Hospital Address : sinaw   " , "Exp : 14 yrs", "mobile Num 9896666","750"}
            };
    private String[][] doctor_details3 =
            {
                    {"Doctor Name : Abdullah Aljufaili ", "Hospital Address : Ibra " , "Exp : 20 yrs", "mobile Num 98988888" ,"900"},
                    {"Doctor Name : Wala Alharthy  ", "Hospital Address : Alqabil  " , "Exp : 1 yrs", "mobile Num 955423543" ,"120"},
                    {"Doctor Name : Noura Obaid  ", "Hospital Address : Mabila  " , "Exp : 24 yrs", "mobile Num 98911111","950"},
                    {"Doctor Name : Saadaa salim   ", "Hospital Address : sinaw   " , "Exp : 14 yrs", "mobile Num 9896666","750"}
            };
    private String[][] doctor_details4 =
            {
                    {"Doctor Name : Abdullah Aljufaili ", "Hospital Address : Ibra " , "Exp : 20 yrs", "mobile Num 98988888" ,"900"},
                    {"Doctor Name : Wala Alharthy  ", "Hospital Address : Alqabil  " , "Exp : 1 yrs", "mobile Num 955423543" ,"120"},
                    {"Doctor Name : Noura Obaid  ", "Hospital Address : Mabila  " , "Exp : 24 yrs", "mobile Num 98911111","950"},
                    {"Doctor Name : Saadaa salim   ", "Hospital Address : sinaw   " , "Exp : 14 yrs", "mobile Num 9896666","750"}
            };
    private String[][] doctor_details5 =
            {
                    {"Doctor Name : Abdullah Aljufaili ", "Hospital Address : Ibra " , "Exp : 20 yrs", "mobile Num 98988888" ,"900"},
                    {"Doctor Name : Wala Alharthy  ", "Hospital Address : Alqabil  " , "Exp : 1 yrs", "mobile Num 955423543" ,"120"},
                    {"Doctor Name : Noura Obaid  ", "Hospital Address : Mabila  " , "Exp : 24 yrs", "mobile Num 98911111","950"},
                    {"Doctor Name : Saadaa salim   ", "Hospital Address : sinaw   " , "Exp : 14 yrs", "mobile Num 9896666","750"}
            };

    TextView tv;
    Button btn;
    String [][] doctor_details = {};
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_detail);

        tv = findViewById(R.id.textViewDDTitle);
        btn = findViewById(R.id.buttonDDBack);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);
        if (title.compareTo("Family Physicians")==0)
            doctor_details = doctor_details1;
        else
        if (title.compareTo("Dietician")==0)
            doctor_details = doctor_details2;
        else
        if (title.compareTo("Dentist")==0)
            doctor_details = doctor_details3;
        else
        if (title.compareTo("Surgeon")==0)
            doctor_details = doctor_details4;
        else
        if (title.compareTo("Family Physicians")==0)
            doctor_details = doctor_details5;
            btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DoctorDetailActivity.this, FindDoctorActivity.class));
            }
        });

        {   }


    }
}