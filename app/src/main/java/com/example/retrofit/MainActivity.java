package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
    }

    public void clickBtn(View view) {

//        Retrofit retrofit = RetrofitHelper.getRetrofitInstanceGson();
        Retrofit retrofit = RetrofitHelper.getRetrofitInstanceScalars();
        RetrofitService service = retrofit.create(RetrofitService.class);

//        Call<ArrayList<Item>> call= service.arrayList(0);
//        call.enqueue(new Callback<ArrayList<Item>>() {
//            @Override
//            public void onResponse(Call<ArrayList<Item>> call, Response<ArrayList<Item>> response) {
//                Toast.makeText(MainActivity.this, "성공", Toast.LENGTH_SHORT).show();
//
//
//            }
//
//            @Override
//            public void onFailure(Call<ArrayList<Item>> call, Throwable t) {
//                Toast.makeText(MainActivity.this, "실패"+t.getMessage(), Toast.LENGTH_SHORT).show();
//
//            }
//        });

        Call<String> call = service.getJsonString(0);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                String s = response.body();
                tv.setText(s);
                Toast.makeText(MainActivity.this, "성공", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.e("Log",t.getMessage());
                Log.i("log", t.getMessage());
                tv.setText("error : "+t.getMessage());
            }
        });



//        Call<Void> call = service.get(0);
//        call.enqueue(new Callback<Void>() {
//            @Override
//            public void onResponse(Call<Void> call, Response<Void> response) {
//                Toast.makeText(MainActivity.this, "성공", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onFailure(Call<Void> call, Throwable t) {
//                tv.setText("error : "+t.getMessage());
//            }
//        });

//        Call<String> call = service.stringTest();
//        call.enqueue(new Callback<String>() {
//            @Override
//            public void onResponse(Call<String> call, Response<String> response) {
//                String s = response.body();
//                tv.setText(s);
//            }
//
//            @Override
//            public void onFailure(Call<String> call, Throwable t) {
//                tv.setText("error : "+t.getMessage());
//            }
//        });


    }
}