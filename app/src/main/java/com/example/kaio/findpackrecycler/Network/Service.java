package com.example.kaio.findpackrecycler.Network;

import com.example.kaio.findpackrecycler.Model.Cod;
import com.example.kaio.findpackrecycler.Model.ResponseCorreios;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

public interface Service {


    @POST("/rastreamento")

    Call<ResponseCorreios>PegarResultados(@HeaderMap Map<String,String> headers, @Body Cod cod);


}
