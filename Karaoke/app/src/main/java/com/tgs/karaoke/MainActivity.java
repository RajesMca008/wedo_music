package com.tgs.karaoke;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

/**
 * Created by Vishnu on 08-09-2015.
 */
public class MainActivity extends FragmentActivity{



        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

            findViewById( R.id.btn_profile).callOnClick();
    }

    public void selectFrag(View view) {
        Fragment fr=null;
        switch (view.getId())
        {
            case R.id.btn_bookview:
                fr = new BookingFragment();
                break;
            case R.id.btn_news:
                fr = new NewsFragment();
                break;
            case R.id.btn_music:
                fr = new MusicFragment();
                break;
            case R.id.btn_profile:
                fr = new ProfileFragment();
                break;
        }
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place, fr);
        fragmentTransaction.commit();

    }

}

