package com.example.api_exp1;



import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiInterface {
    String BASE_URL = "http://10.0.2.2:8686/";
    @GET("produits/listes/")
    Call<List<Produit>> Affichage();

}
