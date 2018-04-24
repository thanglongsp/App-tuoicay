package com.example.thanglongsp.tuoicay;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class GopY extends AppCompatActivity {
    private Button btnGui;

    ArrayList<thongbao> arrayThongbao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gop_y);
        addThongbao();
        btnGui=(Button)findViewById(R.id.btnGui);
        btnGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Cảm ơn bạn đã góp ý!", Toast.LENGTH_LONG).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(GopY.this,arrayThongbao.get(0).getFile());
                mediaPlayer.start();
            }
        });
    }

    private void addThongbao() {
        arrayThongbao = new ArrayList<>();
        arrayThongbao.add(new thongbao(R.raw.translategopyok));
    }
}
