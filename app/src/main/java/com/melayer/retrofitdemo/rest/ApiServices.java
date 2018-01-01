package com.melayer.retrofitdemo.rest;

import com.melayer.retrofitdemo.domain.DtoInfo;
import com.melayer.retrofitdemo.domain.LoginCredential;
import com.melayer.retrofitdemo.domain.User;


import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;



public interface ApiServices {
        @Headers({
                "Accept: application/json",
                "Content-Type: application/json"
        })
        /*@POST("user/userRegistration")
        Observable<User> saveUser();*/

        @POST("user/registerUser")
        Call<DtoInfo>userRegister(@Body User user);


       @POST("user/loginUser")
       Observable<Map<String, Object>> loginUser(@Body LoginCredential loginCredential);

}
