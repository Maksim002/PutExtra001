package com.example.putextra001;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements Listener {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewPutExtra);
        recyclerView.setAdapter(new Adaptor(getList(), this));
    }

    List<Content> getList() {
        List<Content> contents = new ArrayList<>();
        contents.add(new Content("Вондам", AwesomeEnum.TOAST));
        contents.add(new Content("Вондам", AwesomeEnum.MESSAGE));
        contents.add(new Content("Вондам", AwesomeEnum.UNKNOWN));
        contents.add(new Content("Вондам", AwesomeEnum.TOAST));
        return contents;
    }

    @Override
    public void onClikGaleri(int adapterPosition, Content content) {
        Class classType;
        switch (content.getType()) {
            case UNKNOWN:
                classType = Main2Activity.class;
                break;
            case TOAST:
                classType = Main3Activity.class;
                break;
            case MESSAGE:
                classType = Main3Activity.class;
                break;
            case TAP:
                classType = Main4Activity.class;
                break;
            default:
                classType = null;
                break;
        }
        if (classType != null) {
            Intent intent = new Intent(MainActivity.this, classType);
            startActivity(intent);
        }
    }
}
