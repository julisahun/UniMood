package rector.app.rector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.media.MediaPlayer;




public class MainActivity2 extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mediaPlayer= mediaPlayer.create(this, R.raw.musica_2);
        mediaPlayer.start();
    }


    protected void onPause() {
        super.onPause();
        mediaPlayer.pause();
    }
}

