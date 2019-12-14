package com.azhar.dzikir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class event extends AppCompatActivity implements View.OnClickListener {
    private Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        btnMove = findViewById(R.id.daftar);
        btnMove.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.daftar:
                startActivity(new Intent(this, daftar.class));
                break;
        }
    }
}