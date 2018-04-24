package com.example.thanglongsp.tuoicay;

import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class UpdateOk extends AppCompatActivity {
    private Image imgUpdate;
    private Image imgReupdate;

    ArrayList<thongbao> arrayThongbao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_ok);

        addThongbao();
        final ImageView imgUpdate = (ImageView)findViewById(R.id.staRed);
        final ImageView imgReupdate = (ImageView)findViewById(R.id.staBlue);

        imgUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgUpdate.setVisibility(View.INVISIBLE);
                imgReupdate.setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(),"Bạn đã cập nhật thành công!", Toast.LENGTH_LONG).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(UpdateOk.this,arrayThongbao.get(0).getFile());
                mediaPlayer.start();
            }
        });
    }

    private void addThongbao() {
        arrayThongbao = new ArrayList<>();
        arrayThongbao.add(new thongbao(R.raw.translateupdateok));
    }
}
