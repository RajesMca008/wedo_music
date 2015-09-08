package com.tgs.karaoke;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.tgs.karaoke.bean.ItemBean;

import java.util.List;

/**
 * Created by Vishnu on 08-09-2015.
 */
public class NewsFragment extends android.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //Inflate the layout for this fragment

        View view=inflater.inflate(
                R.layout.fragment_news, container, false);
        ListView listView=(ListView)view.findViewById(R.id.lv_news);

        listView.setAdapter(new NewsAdapter(getActivity(),null));
        return view;


    }


    class NewsAdapter extends BaseAdapter {
        List<ItemBean> arr_tournamentList1 ;

        Context mContext;

        public NewsAdapter(Context _MyContext, List<ItemBean> arr_tournamentList) {
            // TODO Auto-generated constructor stub
            this.arr_tournamentList1=arr_tournamentList;
            mContext = _MyContext;
            this.mContext=_MyContext;

        }
        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return 15;
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        @Override
        public View getView(int arg0, View arg1, ViewGroup arg2) {
            // TODO Auto-generated method stub

            if(arg1==null)
            {
                LayoutInflater li = getActivity().getLayoutInflater();
                arg1 = li.inflate(R.layout.fragment_news_item, arg2, false);

            }


            return arg1;
        }

    }
}