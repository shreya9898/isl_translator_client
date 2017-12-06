package com.example.divyaje.voice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.koushikdutta.ion.Ion;


public class showGif extends AppCompatActivity {

//    private TextView text1;
//    private VideoView vid1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_gif);

        Log.e("Test message : ", "This works");

        TextView text1 = (TextView) findViewById(R.id.textView);
        ImageView image1 = (ImageView) findViewById(R.id.imageView);

        String url = getIntent().getStringExtra("url");
        String english = getIntent().getStringExtra("english");

        // DISPLAY

        if(url!=null)
        {
            text1.setText(english);
            Ion.with(image1).load(url);
        }
        else
        {
            text1.setText("Sorry, word not found!");
        }

        Log.e("display","Image in Ion");
        // DOWNLOAD IMG
        /*ImageDownloader task = new ImageDownloader();
        Bitmap image;

        try {
            if(url != null){
                image = task.execute(url).get();
                image1.setImageBitmap(image);
            }
            else{
                text1.setText("Sorry, word not found!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }*/


    }

    /*public class ImageDownloader extends AsyncTask<String, Void, Bitmap> {
        @Override
        protected Bitmap doInBackground(String... urls) {

            try {
                URL url = new URL(urls[0]);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                InputStream input = connection.getInputStream();
                Bitmap img = BitmapFactory.decodeStream(input);
                return img;


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }
    }*/

}
