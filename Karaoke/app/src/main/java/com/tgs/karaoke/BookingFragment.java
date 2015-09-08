package com.tgs.karaoke;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //Inflate the layout for this fragment

        View row= inflater.inflate(R.layout.fragment_booking, container, false);
        Button btn_booking=(Button)row.findViewById(R.id.btn_booking);
        Button btn_bookHistory=(Button)row.findViewById(R.id.btn_bookinghistory);
        ListView lvbooking=(ListView)row.findViewById(R.id.lvbooking);

        ItemBean ib=new ItemBean();
        Bitmap img1 = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.img1);
        Bitmap img2 = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.img2);
        Bitmap img3 = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.img3);
        Bitmap img4 = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.img4);
        Bitmap img5 = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.img5);
        Bitmap img6 = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.img6);

        ib.setBitMap(img1);
        ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
        arr_ItemList.add(ib);
        ib.setBitMap(img2);
        ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
        arr_ItemList.add(ib);
        ib.setBitMap(img3);
        ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
        arr_ItemList.add(ib);
        ib.setBitMap(img4);
        ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
        arr_ItemList.add(ib);
        ib.setBitMap(img5);
        ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
        arr_ItemList.add(ib);
        ib.setBitMap(img6);
        ib.setStr_item("The HC also asked the state government to ensure that proper appointments were done against these posts by following all the rules with regard to qualifications.");
        arr_ItemList.add(ib);


        btn_booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new BookingAdapter(getActivity(),arr_ItemList);
            }
        });





        return row;
    }


    class BookingAdapter extends BaseAdapter {
        List<ItemBean> arr_tournamentList1 ;

        Context mContext;

        public BookingAdapter(Context _MyContext, List<ItemBean> arr_tournamentList) {
            // TODO Auto-generated constructor stub
            this.arr_tournamentList1=arr_tournamentList;
            //mContext = _MyContext;
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
            return 0;
        }

        @Override
        public View getView(int arg0, View arg1, ViewGroup arg2) {
            // TODO Auto-generated method stub

            View MyView = arg1;
            //	final View MyView1 = convertView;

            try {
                ItemMyDiary = (ItemBean) getItem(arg0);

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            LayoutInflater li = getActivity().getLayoutInflater();
            MyView = li.inflate(R.layout.fragment_booking_item, arg2, false);






            return MyView;
        }

    }
}
