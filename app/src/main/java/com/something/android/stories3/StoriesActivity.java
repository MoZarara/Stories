package com.something.android.stories3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.something.android.stories3.Model.Story;
import com.squareup.picasso.Picasso;

public class StoriesActivity extends AppCompatActivity {

    //ad
    private InterstitialAd mInterstitialAd;
    private AdView mAdView;

    private Story story;
    private ImageView imageView;
    private TextView textTitle, textDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);

    /*    MobileAds.initialize(this, "");

        //ads for child
        Bundle extras = new Bundle();
        extras.putString("max_ad_content_rating", "G");


        //banner ad
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()*/
              //  .addNetworkExtrasBundle(AdMobAdapter.class, extras)/*ads for child*/
           /*     .build();
        mAdView.loadAd(adRequest);


        //interstitial ad
        mInterstitialAd = new InterstitialAd(this);
        // replace adUnitId with your ad id from admob website
        mInterstitialAd.setAdUnitId("");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                finish();
            }
        });
*/


        story = (Story) getIntent().getSerializableExtra(getString(R.string.STORIES_KEY));

        imageView = (ImageView)findViewById(R.id.Image_View_Id);
        //Bitmap bitmap = BitmapFactory.decodeResource(getResources(), story.getmImg());
        //imageView.setImageBitmap(bitmap);

        Picasso.with(this).load(story.getmImg()).into(imageView);



        textTitle = (TextView)findViewById(R.id.Title_View_Id);
        textDescription = (TextView)findViewById(R.id.Description_View_Id);

        textTitle.setText(story.getmTitle());
        textDescription.setText(story.getmDescription());

    }

    //ad
    public void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            /*LoadingAdsActivity l = new LoadingAdsActivity();
            l.loadingMessage();*/

            /*Intent intent = new Intent(this, LoadingAdsActivity.class);
            startActivity(intent);*/

            //new LoadingAdsActivity();
            mInterstitialAd.show();
        } else {
            finish();
        }
    }

    //ad
    @Override
    public void onBackPressed() {
        //show ad of app exit
        //showInterstitial();
    }

}
