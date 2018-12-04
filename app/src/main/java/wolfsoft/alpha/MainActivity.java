package wolfsoft.alpha;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    private TextView name;

    private ImageView image;

    private  TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Typeface face1 = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Semibold.ttf");

        Typeface face2 = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Light.ttf");



        name = (TextView) findViewById(R.id.name);
        status = (TextView)findViewById(R.id.status);


        name.setTypeface(face1);
        status.setTypeface(face2);



    }


}



