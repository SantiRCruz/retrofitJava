package com.santiago.retrofitjava.interfaces;

import com.santiago.retrofitjava.models.Users;

import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("users")
    Call<ArrayList<Users>> getUsers();

}
