package com.tgs.karaoke;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.tgs.karaoke.bean.ItemBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vishnu on 08-09-2015.
 */
public class BookingFragment extends android.app.Fragment {
    public static ArrayList<ItemBean> arr_ItemList=new ArrayList<ItemBean>();
    ItemBean ItemMyDiary;
    ListView lvbooking=null;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //Inflate the layout for this fragment

        View row= inflater.inflate(R.layout.fragment_booking, container, false);
        Button btn_booking=(Button)row.findViewById(R.id.btn_booking);
        // Button btn_bookHistory=(Button)row.findViewById(R.id.btn_bookinghistory);
        lvbooking=(ListView)row.findViewById(R.id.lvbooking);





      /*  btn_booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new BookingAdapter(getActivity(),arr_ItemList);
            }
        });*/



        MyBackgroundTask myBackgroundTask=new MyBackgroundTask();
        myBackgroundTask.execute();

        return row;
    }


    class MyBackgroundTask extends AsyncTask<Void,Void,Void>
    {
        ItemBean ib=new ItemBean();
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... voids) {




            ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
            arr_ItemList.add(ib);
            ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
            arr_ItemList.add(ib);
            ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
            arr_ItemList.add(ib);
            ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
            arr_ItemList.add(ib);
            ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
            arr_ItemList.add(ib);

            ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
            arr_ItemList.add(ib);
            ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
            arr_ItemList.add(ib); ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
            arr_ItemList.add(ib);
            ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
            arr_ItemList.add(ib);
            ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
            arr_ItemList.add(ib); ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
            arr_ItemList.add(ib); ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
            arr_ItemList.add(ib); ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
            arr_ItemList.add(ib);
            ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
            arr_ItemList.add(ib);




            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            BookingAdapter bookingAdapter=  new BookingAdapter(getActivity(),arr_ItemList);

            lvbooking.setAdapter(bookingAdapter);
        }
    }
    class BookingAdapter extends BaseAdapter {
        List<ItemBean> arr_tournamentList1 ;

        Context mContext;

        public BookingAdapter(Context _MyContext, List<ItemBean> arr_tournamentList) {
            // TODO Auto-generated constructor stub
            this.arr_tournamentList1=arr_tournamentList;
            mContext = _MyContext;
            this.mContext=_MyContext;

        }
        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return arr_tournamentList1.size();
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return arr_tournamentList1.get(position);
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
                arg1 = li.inflate(R.layout.fragment_booking_item, arg2, false);

            }


            return arg1;
        }

    }
}
