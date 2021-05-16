package rector.app.rector;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.so_ambient);
        mediaPlayer.setLooping(true);


        btn1 = (Button) findViewById(R.id.btnVelocirector);
        btn2 = (Button) findViewById(R.id.button1);
        btn3 = (Button) findViewById(R.id.button2);
        btn4 = (Button) findViewById(R.id.button3);
        btn5 = (Button) findViewById(R.id.button4);
        btn6 = (Button) findViewById(R.id.button5);
        btn7 = (Button) findViewById(R.id.button6);
        btn8 = (Button) findViewById(R.id.button7);
        btn9 = (Button) findViewById(R.id.button8);
        btn10 = (Button) findViewById(R.id.button9);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity1.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity10.class));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity3.class));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity4.class));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity5.class));
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity6.class));
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity7.class));
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity8.class));
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity9.class));
            }
        });

    }
    protected void onPause() {
        super.onPause();
        mediaPlayer.pause();
    }
    protected void onResume() {
        super.onResume();
        mediaPlayer = MediaPlayer.create(this, R.raw.so_ambient);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }


}