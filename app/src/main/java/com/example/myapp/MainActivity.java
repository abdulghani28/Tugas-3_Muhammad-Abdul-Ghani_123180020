package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Integer> imageCountry = new ArrayList<Integer>();
    private ArrayList<String> namaCountry = new ArrayList<>();
    private ArrayList<String> CountryDetail = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataCountry ();
    }

    private void processRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.rv_);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(imageCountry, namaCountry, CountryDetail, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataCountry (){
        namaCountry.add("Indonesia");
        imageCountry.add(R.drawable.indo);
        CountryDetail.add("Indonesia disebut juga dengan Republik Indonesia (RI) atau Negara Kesatuan Republik Indonesia (NKRI), adalah negara di Asia Tenggara yang dilintasi garis khatulistiwa dan berada di antara daratan benua Asia dan Australia, serta antara Samudra Pasifik dan Samudra Hindia. Indonesia adalah negara kepulauan terbesar di dunia yang terdiri dari 17.504 pulau. Nama alternatif yang biasa dipakai adalah Nusantara. Dengan populasi mencapai 270.203.917 jiwa pada tahun 2020, Indonesia adalah negara berpenduduk terbesar keempat di dunia dan negara yang berpenduduk Muslim terbesar di dunia, dengan penganut lebih dari 230 juta jiwa");

        namaCountry.add("Jerman");
        imageCountry.add(R.drawable.jerman);
        CountryDetail.add("Jerman (bahasa Jerman: Deutschland, pengucapan bahasa Jerman: [ˈdɔʏtʃlant]), secara resmi disebut sebagai Republik Federal Jerman (bahasa Jerman: Bundesrepublik Deutschland) adalah negara berbentuk federasi di Eropa Barat. Negara ini memiliki posisi ekonomi dan politik yang sangat penting di Eropa maupun di dunia.");

        namaCountry.add("Brazil");
        imageCountry.add(R.drawable.brazil);
        CountryDetail.add("Republik Federatif Brasil atau Republik Federal Brasil (bahasa Portugis: República Federativa do Brasil, bahasa Inggris: Federative Republic of Brazil, bahasa Latin: Respublica Foederativa Brasiliae) adalah negara paling besar dan paling banyak penduduknya(204.5 juta jiwa pada tahun 2017) di Amerika Selatan");

        namaCountry.add("Argentina");
        imageCountry.add(R.drawable.argentina);
        CountryDetail.add("Republik Argentina (bahasa Spanyol: República Argentina), lebih dikenal sebagai Argentina, merupakan negara Amerika Latin terbesar kedua dan negara berbahasa Spanyol terbesar di dunia. Argentina terletak di bagian selatan benua Amerika Selatan. Posisinya berada di antara Pegunungan Andes di barat dan Samudra Atlantik di selatan. Lokasi ini membuat Argentina dikenal sebagai 'negara paling selatan di selatan' (bahasa Spanyol: \"Sur del sur\")");

        processRecyclerViewAdapter();
    }
}