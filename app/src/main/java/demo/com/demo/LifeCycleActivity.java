package demo.com.demo;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LifeCycleActivity extends AppCompatActivity {
    Button btn;
    CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        System.out.println("LifeCycleActivity.onCreate");

        btn= (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LifeCycleActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });


        System.out.println("");

    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("LifeCycleActivity.onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("LifeCycleActivity.onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("LifeCycleActivity.onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("LifeCycleActivity.onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("LifeCycleActivity.onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("LifeCycleActivity.onDestroy");
    }
}
