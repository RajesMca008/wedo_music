package com.tgs.karaoke;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Vishnu on 08-09-2015.
 */
public class ProfileFragment extends android.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //Inflate the layout for this fragment

        return inflater.inflate(
                R.layout.fragment_login, container, false);
    }
}
