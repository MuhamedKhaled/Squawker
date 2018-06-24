package android.example.com.squawker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {

    private TextView appName ;
    private ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        appName = findViewById(R.id.AppName_TextView);
        logo = findViewById(R.id.launch_imgView);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        logo.startAnimation(animation);
        appName.startAnimation(animation);

        final Intent intent = new Intent(this,MainActivity.class);
            Thread thread = new Thread(){
                @Override
                public void run() {
                    try {
                        sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    finally {
                        startActivity(intent);
                        finish();
                    }
                }
            };

            thread.start();


    }
}
