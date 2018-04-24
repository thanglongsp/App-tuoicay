package com.example.thanglongsp.tuoicay;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Gaitri extends AppCompatActivity {
    TextView textSong;
    ImageView btnPlay,btnStop;

    ArrayList<Song> arraySong;
    int position=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaitri);

        Anhxa();
        AddSong();

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(Gaitri.this,arraySong.get(position).getFile());
                mediaPlayer.start();
                textSong.setText(arraySong.get(position).getTitle());
                btnPlay.setVisibility(view.VISIBLE);
                btnStop.setVisibility(view.INVISIBLE);
                Toast.makeText(getApplicationContext(),"Play!", Toast.LENGTH_LONG).show();
                btnPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        btnPlay.setVisibility(view.INVISIBLE);
                        btnStop.setVisibility(view.VISIBLE);
                        mediaPlayer.pause();
                        Toast.makeText(getApplicationContext(),"End!", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }

    private void AddSong() {
        arraySong = new ArrayList<>();
        arraySong.add(new Song("Xuân này con không về",R.raw.xxx));
    }

    private void Anhxa() {
        textSong=(TextView)findViewById(R.id.textSong);
        btnPlay=(ImageView)findViewById(R.id.imgPlay);
        btnStop=(ImageView)findViewById(R.id.imgStop);

    }
}
