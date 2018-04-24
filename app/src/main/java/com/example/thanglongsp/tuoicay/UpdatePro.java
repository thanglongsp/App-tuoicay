package com.example.thanglongsp.tuoicay;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class UpdatePro extends AppCompatActivity {
    private Button btnUpdate;

    ArrayList<thongbao> arrayThongbao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_pro);

        addThongbao();

        btnUpdate=(Button)findViewById(R.id.btnUpdateProOk);
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Bạn đã cập nhật thành công!", Toast.LENGTH_LONG).show();
                MediaPlayer mediaPlayer = MediaPlayer.create(UpdatePro.this,arrayThongbao.get(0).getFile());
                mediaPlayer.start();
            }
        });

    }

    private void addThongbao() {
        arrayThongbao = new ArrayList<>();
        arrayThongbao.add(new thongbao(R.raw.cntchs));
    }
}
