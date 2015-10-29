package com.example.guest.artiseverywhere.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.guest.artiseverywhere.R;
import com.example.guest.artiseverywhere.models.Artist;
import com.example.guest.artiseverywhere.models.ArtistBio;

public class ArtistsActivity extends AppCompatActivity {

    private Button mMainButton;
    private Button mNextArtistButton;
    private TextView mArtistNameLabel;
    private TextView mArtistInfo;
    private ImageView mArtistImages;

    private ArtistBio mArtistBio;
    private Artist mCurrentArtist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        mArtistNameLabel = (TextView) findViewById(R.id.artistNameLabel);
        mArtistInfo = (TextView) findViewById(R.id.artistInfo);
        mArtistImages = (ImageView) findViewById(R.id.artistImages);

        mNextArtistButton = (Button) findViewById(R.id.nextArtistButton);
        mMainButton = (Button) findViewById(R.id.mainButton);

        mArtistBio = new ArtistBio();
        mCurrentArtist = mArtistBio.getArtists().get(0);

        setLayoutContent();

        mNextArtistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentArtist = mArtistBio.nextArtist(mCurrentArtist);
                setLayoutContent();
            }
        });

        mMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ArtistsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setLayoutContent() {
        mArtistNameLabel.setText(mCurrentArtist.getName());
        mArtistInfo.setText(mCurrentArtist.getArtistInfo());
        mArtistImages.setImageResource(mCurrentArtist.getImage());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_artists, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
