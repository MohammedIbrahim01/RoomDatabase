package com.example.x.myroomdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase database = AppDatabase.getInstance(this);
        database.taskDao().insertTask(new Task("walk up morning", 1));

        Log.i("WWW", database.taskDao().getAllTasks().get(0).getName());
    }
}
