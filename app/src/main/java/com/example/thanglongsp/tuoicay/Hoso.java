package com.example.thanglongsp.tuoicay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hoso extends AppCompatActivity {
    private Button btnUpdatePro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoso);

        btnUpdatePro=(Button)findViewById(R.id.btnUpdatePro);
        btnUpdatePro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Hoso.this,UpdatePro.class);
                startActivity(intent);
            }
        });
    }
}
