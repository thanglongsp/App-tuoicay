package com.example.thanglongsp.tuoicay;

import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class Unupdate extends AppCompatActivity {
    private Image imgUnupdate;

    ArrayList<thongbao> arrayThongbao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unupdate);

        addThongbao();
        final ImageView imgUnupdate = (ImageView)findViewById(R.id.staUnred);
        imgUnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Bạn Không thể cập nhật, vì ở vị trí quá xa cây?!", Toast.LENGTH_LONG).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(Unupdate.this,arrayThongbao.get(0).getFile());
                mediaPlayer.start();
            }
        });
    }

    private void addThongbao() {
            arrayThongbao = new ArrayList<>();
            arrayThongbao.add(new thongbao(R.raw.translatenotupdate));
    }
}
