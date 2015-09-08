package com.tgs.karaoke;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Vishnu on 08-09-2015.
 */
public class MainActivity extends Activity{



        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void selectFrag(View view) {
        Fragment fr=null;

        if(view == findViewById(R.id.btn_bookview)) {
            fr = new BookingFragment();

        }else if(view == findViewById(R.id.btn_news)) {
            fr = new NewsFragment();

        }else if(view == findViewById(R.id.btn_music)) {
            fr = new MusicFragment();

        }else if(view == findViewById(R.id.btn_profile)) {
            fr = new ProfileFragment();

        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place, fr);
        fragmentTransaction.commit();

    }

}

