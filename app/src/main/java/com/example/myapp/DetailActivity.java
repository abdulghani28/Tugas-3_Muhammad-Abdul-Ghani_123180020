package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    ImageView ivLogoCountry,ivJerseyCountry;
    TextView tvDetailCountry,tvNamaCountryDetail, tvArena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivLogoCountry = findViewById(R.id.iv_logo_Country);
        tvNamaCountryDetail = findViewById(R.id.tv_nama_Country_detail);
        tvDetailCountry = findViewById(R.id.tv_detail_Country);

        getIncomingExtra();
    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("image_Country") && getIntent().hasExtra("nama_Country") && getIntent().hasExtra("court_Country")){
            Integer imageCountry = getIntent().getIntExtra("image_Country",0);
            String namaCountry = getIntent().getStringExtra("nama_Country");
            String detailCountry = getIntent().getStringExtra("detail_Country");

            setDataActivity(imageCountry, namaCountry, detailCountry);
        }
    }

    private void setDataActivity(Integer imageCountry, String namaCountry, String detailCountry){
        Glide.with(this).asBitmap().load(imageCountry).into(ivLogoCountry);

        tvNamaCountryDetail.setText(namaCountry);

        tvDetailCountry.setText(detailCountry);
    }
}