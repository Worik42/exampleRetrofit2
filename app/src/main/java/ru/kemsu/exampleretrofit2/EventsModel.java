package ru.kemsu.exampleretrofit2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class EventsModel {
    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("listEvents")
    @Expose
    private ArrayList<NameModel> events;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<NameModel> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<NameModel> events) {
        this.events = events;
    }
}
