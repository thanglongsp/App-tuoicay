package com.example.thanglongsp.tuoicay;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btnClickOk;
    private Button btnClickCancel;
    private Button btnGui;
    private Button btnGopy;
    private Button btnHoso;
    private Button btnGiaitri;

    ArrayList<thongbao> arrayThongbao;
    int position=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();
        addThongbao();

        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,arrayThongbao.get(0).getFile());
        mediaPlayer.start();


        btnClickOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ClickOk.class);
                startActivity(intent);
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,arrayThongbao.get(5).getFile());
                mediaPlayer.start();
            }
        });


        btnGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Guide.class);
                startActivity(intent);
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,arrayThongbao.get(4).getFile());
                mediaPlayer.start();
            }
        });


        btnGopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,GopY.class);
                startActivity(intent);
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,arrayThongbao.get(2).getFile());
                mediaPlayer.start();
            }
        });


        btnHoso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Hoso.class);
                startActivity(intent);
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,arrayThongbao.get(3).getFile());
                mediaPlayer.start();
            }
        });


        btnClickCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ClickCancel.class);
                startActivity(intent);
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,arrayThongbao.get(6).getFile());
                mediaPlayer.start();
            }
        });


        btnGiaitri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Gaitri.class);
                startActivity(intent);
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,arrayThongbao.get(1).getFile());
                mediaPlayer.start();
            }
        });
    }

    private void anhxa() {
        btnClickOk=(Button)findViewById(R.id.btnOk);
        btnGui=(Button)findViewById(R.id.bntGuide);
        btnGopy=(Button)findViewById(R.id.bntGopy);
        btnHoso=(Button)findViewById(R.id.bntProfile);
        btnClickCancel=(Button)findViewById(R.id.btnCancel);
        btnGiaitri=(Button)findViewById(R.id.button3);
    }

    private void addThongbao() {
            arrayThongbao = new ArrayList<>();
            arrayThongbao.add(new thongbao(R.raw.home));
            arrayThongbao.add(new thongbao(R.raw.translategiaitri));
            arrayThongbao.add(new thongbao(R.raw.gopy));
            arrayThongbao.add(new thongbao(R.raw.hoso));
            arrayThongbao.add(new thongbao(R.raw.hd));
            arrayThongbao.add(new thongbao(R.raw.translateok));
            arrayThongbao.add(new thongbao(R.raw.translatecancel));
    }


}
