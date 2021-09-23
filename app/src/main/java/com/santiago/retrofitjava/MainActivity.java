package com.santiago.retrofitjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.santiago.retrofitjava.interfaces.ApiService;
import com.santiago.retrofitjava.models.Users;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    ArrayList<Users> listaUsuarios = new ArrayList();
    ListView lista;
    ArrayAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        referenciar();
        //adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaUsuarios);
       // lista.setAdapter(adaptador);
    }

    private void referenciar() {
         lista = findViewById(R.id.listaUsuarios);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api-autonoma.herokuapp.com/api/v1/admin/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService service= retrofit.create(ApiService.class);
        service.getUsers().enqueue(new Callback<ArrayList<Users>>(){

            @Override
            public void onResponse(Call<ArrayList<Users>> call, Response<ArrayList<Users>> response) {
                listaUsuarios = response.body();
                Log.e("lista",response.body().toString());

            }

            @Override
            public void onFailure(Call<ArrayList<Users>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();

            }
        } );
    }
}