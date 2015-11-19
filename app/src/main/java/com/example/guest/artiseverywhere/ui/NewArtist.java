package com.example.guest.artiseverywhere.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.guest.artiseverywhere.R;

import java.util.ArrayList;

public class NewArtist extends AppCompatActivity {

    private Button mAddArtistButton;
    private EditText mNewArtistText;
    private ArrayList<String> mArtists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_artist);

        mAddArtistButton = (Button) findViewById(R.id.addArtistButton);
        mNewArtistText = (EditText) findViewById(R.id.newArtistUserInput);


        mAddArtistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addArtist();
            }
        });
    }

    private void addArtist() {
        String newArtist = mNewArtistText.getText().toString();
        Intent intent = new Intent(NewArtist.this, ArtistsActivity.class);
        startActivity(intent);
        mArtists.add(newArtist);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_artist, menu);
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
