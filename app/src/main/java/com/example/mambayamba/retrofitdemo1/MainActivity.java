package com.example.mambayamba.retrofitdemo1;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.mambayamba.retrofitdemo1.model.Example;
import com.example.mambayamba.retrofitdemo1.model.Item;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

//https://api.stackexchange.com/2.2/search?order=desc&sort=activity&tagged=android&site=stackoverflow
public class MainActivity extends AppCompatActivity implements Callback<SOItems> {
    public static final String TAG = "happy";
    private SOItems soItems;
    @BindView(R.id.button)Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
    @OnClick(R.id.button)
    public void onClick(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.stackexchange.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        StackOverflowAPI soApi = retrofit.create(StackOverflowAPI.class);
        Call<SOItems> call = soApi.loadItems("android");
        call.enqueue(this);
    }

    @Override
    public void onResponse(Response<SOItems> response, Retrofit retrofit) {
        Log.d(TAG, "starting operation...");
        soItems = response.body();
        List<Item> items = soItems.getItems();
        for(Item item: items){
            Log.d(TAG, item.getTitle()+"\n");
        }

        Log.d(TAG, "operation finished");
    }

    @Override
    public void onFailure(Throwable t) {
        Log.d(TAG, "something went south! "+t.toString());
    }
}
