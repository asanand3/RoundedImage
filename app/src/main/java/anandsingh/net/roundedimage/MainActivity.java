package anandsingh.net.roundedimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Anand Singh on 24-07-2015.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView roundedImage = (ImageView) findViewById(R.id.imageView);

        Glide.with(MainActivity.this)
                .load("https://avatars3.githubusercontent.com/u/6316701?v=3&s=400")
                .transform(new RoundImageTransform(MainActivity.this))
                .into(roundedImage);

    }


}
