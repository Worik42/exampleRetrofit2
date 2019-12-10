package ru.kemsu.exampleretrofit2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getEventsWithId(1);
        getEvents(1);
    }


    private void getEventsWithId(int id) {
        NetworkService.getInstance().getJSONApi().getEventsID(id).enqueue(new Callback<EventsModel>() {
            @Override
            public void onResponse(Call<EventsModel> call, Response<EventsModel> response) {
                /**
                 * Если все прошло успешно, то вызовется этот метод и можно делать с данными , что-то другое
                 */
            }

            @Override
            public void onFailure(Call<EventsModel> call, Throwable t) {
                /**
                 * Если что-то пошло не так, то вызовется этот метод
                 */
            }
        });
    }

    private void getEvents(int id) {

        JSONObject paramObject = new JSONObject();
        try {
            paramObject.put("id", id);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        NetworkService.getInstance().getJSONApi().getEvents(paramObject.toString()).enqueue(new Callback<EventsModel>() {
            @Override
            public void onResponse(Call<EventsModel> call, Response<EventsModel> response) {

            }

            @Override
            public void onFailure(Call<EventsModel> call, Throwable t) {

            }
        });
    }
}
