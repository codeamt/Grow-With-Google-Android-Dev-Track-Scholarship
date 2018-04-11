/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.implicitintents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * @param v Button that was clicked.
     */
    public void onClickOpenWebpageButton(View v) {
        String urlAsString = "http://www.udacity.com";
        openWebPage(urlAsString);
    }

    /**
     * @param v Button that was clicked.
     */
    public void onClickOpenAddressButton(View v) {
        String addressString = "1600 Amphitheatre Parkway, CA";

        Uri.Builder builder = new Uri.Builder();
        builder.scheme("geo")
                .path("0,0")
                .query(addressString);
        Uri addressUri = builder.build();

        showMap(addressUri);
    }

    /**
     * @param v Button that was clicked.
     */
    public void onClickShareTextButton(View v) {
        String mimeType = "text/plain";
        String title = "Learning How to Share";
        String textToShare = "Hello There";

        ShareCompat.IntentBuilder.from(this)
                .setChooserTitle(title)
                .setType(mimeType)
                .setText(textToShare);
    }

    /**
     * @param v Button that was clicked.
     */
    public void onClickCreateEmail(View v) {
        String email = "annmargaret.tutu@icloud.com";
        String subject = "I'm sending an email to Udacity and Google";
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, email);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     *
     * @param url Url of webpage to open. Should start with http:// or https:// as that is the
     *            scheme of the URI expected with this Intent according to the Common Intents page
     */
    private void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * @param geoLocation The Uri representing the location that will be opened in the map
     */
    private void showMap(Uri geoLocation) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    private  void shareText(String text) {
        String acceptedText = text;
        String mimeType = "text/plain";
        String title = "Autonomous Attempt";
        ShareCompat.IntentBuilder.from(this)
                .setChooserTitle(title)
                .setType(mimeType)
                .setText(acceptedText);


    }
}