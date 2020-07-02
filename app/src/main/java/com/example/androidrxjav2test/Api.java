package com.example.androidrxjav2test;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {
    @GET("/practicalSkills/getPracticalSkillsTestList.do")
    Call<User> getUserInfoWithPath(
            @Query("username") String userName,
            @Query("productType") String productType);
}
