package com.santiago.retrofitjava.interfaces;

import com.santiago.retrofitjava.models.Users;

import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ApiService {
    @Headers("Authorization: $2b$15$bAwF7OQcbXCEXvlS6zqgsuHCc.BOyxmOoP.QqCk0LcsCGX8bLonji")
    @GET("users")
    Call<ArrayList<Users>> getUsers();

}
