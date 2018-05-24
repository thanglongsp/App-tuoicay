package com.example.thanglongsp.tuoicay;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class ClickCancel extends AppCompatActivity {
    private Image imgView;
    private Image imgViewDunuoc;

    ArrayList<thongbao> arrayThongbao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_cancel);
        addThongbao();
        final ImageView imgView = (ImageView)findViewById(R.id.imageView);
        final ImageView imgViewDunuoc = (ImageView)findViewById(R.id.imageViewDunuoc);

        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClickCancel.this,ClickOk.class);
                startActivity(intent);
                MediaPlayer mediaPlayer = MediaPlayer.create(ClickCancel.this,arrayThongbao.get(0).getFile());
                mediaPlayer.start();
            }
        });

        imgViewDunuoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(ClickCancel.this,arrayThongbao.get(1).getFile());
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(),"Cây đã đủ nước!", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void addThongbao() {
        arrayThongbao = new ArrayList<>();
        arrayThongbao.add(new thongbao(R.raw.translateok));
        arrayThongbao.add(new thongbao(R.raw.dunuoc));
    }
}
