package com.example.animations;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
     @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
     public void fade(View view) {
         ImageView bart = (ImageView) findViewById(R.id.bart);

         /*bart.animate().alpha(0f).setDuration(2000);  //alpha is about transparent an image. 0 is invisible. 1 is completely visible. alpha between 0 and 1.
                                                      //1000 milisecond=1second
           ImageView homer = (ImageView) findViewById(R.id.homer);
         homer.animate().alpha(1).setDuration(2000);
         bart.animate().translationYBy(2000f).setDuration(2000); //translationyby moves him from top to bottom and he goes off of the screen.
         bart.animate().translationXBy(-1000f).setDuration(2000); //it moves him from the right but because of the number is negative it moves him to the left.
            bart.setTranslationX(-1000f); it makes him invisible at the moment.

         bart.animate().rotation(2700f).setDuration(2000);//to rotation 2700degree for 2s sec
         bart.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000); //ro make it bigger and smaller*/

         bart.animate().translationXBy (1000f).translationYBy (1000f).rotation(7200f)
          .setDuration(4000);





     }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bart = (ImageView) findViewById(R.id.bart);
        bart.setTranslationX(-1000f);
        bart.setTranslationY(-1000f);
    }
}
