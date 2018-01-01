package com.melayer.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.melayer.retrofitdemo.domain.DtoInfo;
import com.melayer.retrofitdemo.domain.User;
import com.melayer.retrofitdemo.rest.ApiServices;
import com.melayer.retrofitdemo.rest.RetrofitClient;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiServices apiServices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getData();
            }
        });
    }
    private void getData(){

        apiServices = RetrofitClient.getClient().create(ApiServices.class);
       User user =  new User();
       user.setFirstName(getName().getText().toString());
        user.setEmailId(getEmail().getText().toString());
        user.setPassword(getPassword().getText().toString());

     Call<DtoInfo>call = apiServices.userRegister(user);
     call.enqueue(new Callback<DtoInfo>() {
         @Override
         public void onResponse(Call<DtoInfo> call, Response<DtoInfo> response) {
          Log.i("@sahil","response " +response);

          DtoInfo dtoInfo =response.body();
          String getMsg =  dtoInfo.getStatus();
          String getSt = dtoInfo.getSuccess();
          Log.i("@sahil "," msg  " + getMsg+  "  new  " +getSt);

         }

         @Override
         public void onFailure(Call<DtoInfo> call, Throwable t) {
             Log.i("@sahil","response fail" +call +  " throwable " +t);
         }
     });




    }

     private EditText getName(){
        return (EditText)findViewById(R.id.txtName);
     }
     private EditText getEmail(){
         return (EditText)findViewById(R.id.textemail);
     }
     private EditText getPassword(){
         return (EditText)findViewById(R.id.textpassword);
     }





}
