package demo.com.demo;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String msg = "msg";
    private android.widget.RelativeLayout.LayoutParams layoutParams;
    Button btnStart;
    ProgressBar pbar;
    TextView txt_counter;
    CountDownTimer timer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart = (Button) findViewById(R.id.start);
        pbar = (ProgressBar) findViewById(R.id.progressbar);
        txt_counter = (TextView) findViewById(R.id.txt_counter);

        timerLeft();
        btnStart.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        timer.start();

                    }
                });
  }


    public void timerLeft() {
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    timer = new CountDownTimer(10000, 100) {
                        @Override
                        public void onTick(long l) {
                            int progress = (101 - (int) l / 100);
                            pbar.setProgress(progress);
                            txt_counter.setText(String.valueOf(progress));
                        }
                        @Override
                        public void onFinish() {
                            pbar.setProgress(100);
                        }
                    };
                }
                pbar.setProgress(0);
            }
        });
    }
}
