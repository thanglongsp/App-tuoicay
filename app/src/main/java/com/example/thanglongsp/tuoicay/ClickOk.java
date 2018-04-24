package com.example.thanglongsp.tuoicay;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import java.util.ArrayList;

public class ClickOk extends AppCompatActivity {
    private Image imgUpdate;
    private Image imgReupdate;
    private Image imgTuoi;
    private Image imgEx;

    ArrayList<thongbao> arrayThongbao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_ok);

        addThongbao();

        final ImageView imgUpdate = (ImageView)findViewById(R.id.staRed);
        final ImageView imgReupdate = (ImageView)findViewById(R.id.staBlue);
        final ImageView imgTuoi = (ImageView)findViewById(R.id.imageTuoi);
        final ImageView imgEx = (ImageView)findViewById(R.id.imgEx);

        imgUpdate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                imgUpdate.setVisibility(View.INVISIBLE);
                imgReupdate.setVisibility(View.VISIBLE);
            }
        });

        imgTuoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClickOk.this,UpdateOk.class);
                startActivity(intent);
                MediaPlayer mediaPlayer = MediaPlayer.create(ClickOk.this,arrayThongbao.get(0).getFile());
                mediaPlayer.start();

            }
        });

        imgEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClickOk.this,Unupdate.class);
                startActivity(intent);
                MediaPlayer mediaPlayer = MediaPlayer.create(ClickOk.this,arrayThongbao.get(0).getFile());
                mediaPlayer.start();
            }
        });

    }

    private void addThongbao() {
        arrayThongbao = new ArrayList<>();
        arrayThongbao.add(new thongbao(R.raw.translateupdatestatus));
    }
}
