package ru.kemsu.exampleretrofit2;

import retrofit2.Call;
import retrofit2.http.*;

public interface JSONPlaceHolderApi {
    @GET("/events/{id}")
    Call<EventsModel> getEventsID(@Path("id") int id);

    @Headers("Content-Type: application/json")
    @POST("/login")
    Call<EventsModel> getEvents(@Body String body);
}
