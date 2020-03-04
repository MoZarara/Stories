package com.something.android.stories3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.something.android.stories3.Model.Story;
import com.something.android.stories3.adapter.StoryListAdapter;
import com.something.android.stories3.adapter.StoryRecyclerAdapter;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    //ad
    //private InterstitialAd mInterstitialAd;
    private AdView mAdView;

    private RecyclerView recyclerView;
    private ArrayList<Story> list;
    private StoryRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

     /*  MobileAds.initialize(this, "");


        //ads for child
        Bundle extras = new Bundle();
        extras.putString("max_ad_content_rating", "G");


        //banner ad
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()*/
             //   .addNetworkExtrasBundle(AdMobAdapter.class, extras)/*ads for child*/
          /*     .build();
        mAdView.loadAd(adRequest);*/


        /*//interstitial ad
        mInterstitialAd = new InterstitialAd(this);
        // replace adUnitId with your ad id from admob website
        mInterstitialAd.setAdUnitId("");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                finish();
            }
        });
*/

        recyclerView = (RecyclerView) findViewById(R.id.list_view);
        recyclerView.setHasFixedSize(true);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        list = new ArrayList<>();
        list.add(new Story(getString(R.string.story1), getString(R.string.description1), R.drawable.img_1));
        list.add(new Story(getString(R.string.story2), getString(R.string.description2), R.drawable.img_2));
        list.add(new Story(getString(R.string.story3), getString(R.string.description3), R.drawable.img_3));
        list.add(new Story(getString(R.string.story4), getString(R.string.description4), R.drawable.img_4));
        list.add(new Story(getString(R.string.story5), getString(R.string.description5), R.drawable.img_5));
        list.add(new Story(getString(R.string.story6), getString(R.string.description6), R.drawable.img_6));
        list.add(new Story(getString(R.string.story7), getString(R.string.description7), R.drawable.img_7));
        list.add(new Story(getString(R.string.story8), getString(R.string.description8), R.drawable.img_8));
        list.add(new Story(getString(R.string.story9), getString(R.string.description9), R.drawable.img_9));
        list.add(new Story(getString(R.string.story10), getString(R.string.description10), R.drawable.img_10));
        list.add(new Story(getString(R.string.story11), getString(R.string.description11), R.drawable.img_11));
        list.add(new Story(getString(R.string.story12), getString(R.string.description12), R.drawable.img_12));
        list.add(new Story(getString(R.string.story13), getString(R.string.description13), R.drawable.img_13));
        list.add(new Story(getString(R.string.story14), getString(R.string.description14), R.drawable.img_14));
        list.add(new Story(getString(R.string.story15), getString(R.string.description15), R.drawable.img_15));
        list.add(new Story(getString(R.string.story16), getString(R.string.description16), R.drawable.img_16));
        list.add(new Story(getString(R.string.story17), getString(R.string.description17), R.drawable.img_17));
        list.add(new Story(getString(R.string.story18), getString(R.string.description18), R.drawable.img_18));
        list.add(new Story(getString(R.string.story19), getString(R.string.description19), R.drawable.img_19));
        list.add(new Story(getString(R.string.story20), getString(R.string.description20), R.drawable.img_20));
        list.add(new Story(getString(R.string.story21), getString(R.string.description21), R.drawable.img_21));
        list.add(new Story(getString(R.string.story22), getString(R.string.description22), R.drawable.img_22));
        list.add(new Story(getString(R.string.story23), getString(R.string.description23), R.drawable.img_23));
        list.add(new Story(getString(R.string.story24), getString(R.string.description24), R.drawable.img_24));
        list.add(new Story(getString(R.string.story25), getString(R.string.description25), R.drawable.img_25));
        list.add(new Story(getString(R.string.story26), getString(R.string.description26), R.drawable.img_26));
        list.add(new Story(getString(R.string.story27), getString(R.string.description27), R.drawable.img_27));
        list.add(new Story(getString(R.string.story28), getString(R.string.description28), R.drawable.img_28));
        list.add(new Story(getString(R.string.story29), getString(R.string.description29), R.drawable.img_29));
        list.add(new Story(getString(R.string.story30), getString(R.string.description30), R.drawable.img_30));
        list.add(new Story(getString(R.string.story31), getString(R.string.description31), R.drawable.img_31));
        list.add(new Story(getString(R.string.story32), getString(R.string.description32), R.drawable.img_32));
        list.add(new Story(getString(R.string.story33), getString(R.string.description33), R.drawable.img_33));
        list.add(new Story(getString(R.string.story34), getString(R.string.description34), R.drawable.img_34));
        list.add(new Story(getString(R.string.story35), getString(R.string.description35), R.drawable.img_35));
        list.add(new Story(getString(R.string.story36), getString(R.string.description36), R.drawable.img_36));
        list.add(new Story(getString(R.string.story37), getString(R.string.description37), R.drawable.img_37));
        list.add(new Story(getString(R.string.story38), getString(R.string.description38), R.drawable.img_38));
        list.add(new Story(getString(R.string.story39), getString(R.string.description39), R.drawable.img_39));
        list.add(new Story(getString(R.string.story40), getString(R.string.description40), R.drawable.img_40));
        list.add(new Story(getString(R.string.story41), getString(R.string.description41), R.drawable.img_41));
        list.add(new Story(getString(R.string.story42), getString(R.string.description42), R.drawable.img_42));
        list.add(new Story(getString(R.string.story43), getString(R.string.description43), R.drawable.img_43));
        list.add(new Story(getString(R.string.story44), getString(R.string.description44), R.drawable.img_44));
        list.add(new Story(getString(R.string.story45), getString(R.string.description45), R.drawable.img_45));
        list.add(new Story(getString(R.string.story46), getString(R.string.description46), R.drawable.img_46));
        list.add(new Story(getString(R.string.story47), getString(R.string.description47), R.drawable.img_47));
        list.add(new Story(getString(R.string.story48), getString(R.string.description48), R.drawable.img_48));
        list.add(new Story(getString(R.string.story49), getString(R.string.description49), R.drawable.img_49));
        list.add(new Story(getString(R.string.story50), getString(R.string.description50), R.drawable.img_50));
        list.add(new Story(getString(R.string.story51), getString(R.string.description51), R.drawable.img_51));
        list.add(new Story(getString(R.string.story52), getString(R.string.description52), R.drawable.img_52));
        list.add(new Story(getString(R.string.story53), getString(R.string.description53), R.drawable.img_53));
        list.add(new Story(getString(R.string.story54), getString(R.string.description54), R.drawable.img_54));
        list.add(new Story(getString(R.string.story55), getString(R.string.description55), R.drawable.img_55));
        list.add(new Story(getString(R.string.story56), getString(R.string.description56), R.drawable.img_56));
        list.add(new Story(getString(R.string.story57), getString(R.string.description57), R.drawable.img_57));
        list.add(new Story(getString(R.string.story58), getString(R.string.description58), R.drawable.img_58));
        list.add(new Story(getString(R.string.story59), getString(R.string.description59), R.drawable.img_59));
        list.add(new Story(getString(R.string.story60), getString(R.string.description60), R.drawable.img_60));


        adapter = new StoryRecyclerAdapter(list, this);
        recyclerView.setAdapter(adapter);

    }

    public void openStories(Story story) {
        Intent intent = new Intent(ListActivity.this, StoriesActivity.class);
        intent.putExtra(getString(R.string.STORIES_KEY), story);
        startActivity(intent);
    }


    /*//ad
    public void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            finish();
        }
    }

    //ad
    @Override
    public void onBackPressed() {
        //show ad of app exit
        showInterstitial();
    }*/

}



