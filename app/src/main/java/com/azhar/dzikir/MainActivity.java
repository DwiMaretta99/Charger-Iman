package com.azhar.dzikir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMove = findViewById(R.id.kotlin_jadwal);
        btnMove.setOnClickListener(this);


        btnMove = findViewById(R.id.dzikir);
        btnMove.setOnClickListener(this);


        btnMove = findViewById(R.id.quran);
        btnMove.setOnClickListener(this);

        btnMove = findViewById(R.id.event);
        btnMove.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.kotlin_jadwal:
                startActivity(new Intent(this, kotlin_jadwal.class));
                break;
            case R.id.dzikir:
                startActivity(new Intent(this, dzikir.class));
                break;
            case R.id.quran:
                startActivity(new Intent(this, quran.class));
                break;

            case R.id.event:
                startActivity(new Intent(this, event.class));
                break;


        }
    }
}

