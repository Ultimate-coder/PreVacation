package com.anything.prevacation;

import android.app.DownloadManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("http://netdna.webdesignerdepot.com/uploads/2013/08/batman.jpg");
                DownloadManager downloadManager;
                downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);

                DownloadManager.Request request = new DownloadManager.Request(uri)
                        .setTitle("Random file")
                        .setDescription("Hello World")
                        .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                downloadManager.enqueue(request);

            }
        });
    }
}
