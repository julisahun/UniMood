package rector.app.rector;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity8 extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        mediaPlayer = MediaPlayer.create(this, R.raw.musica_8);
        mediaPlayer.start();
    }


    protected void onPause() {
        super.onPause();
        mediaPlayer.pause();
    }

}