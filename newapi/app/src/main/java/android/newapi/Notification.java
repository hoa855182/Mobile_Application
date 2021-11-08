package android.newapi;

import android.content.Intent;
import android.graphics.Color;
import android.newapi.NotificationDetail.DetailNotification1;
import android.newapi.NotificationDetail.DetailNotification2;
import android.newapi.NotificationDetail.DetailNotification3;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Notification#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Notification extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Notification() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static Notification newInstance() {
        Notification fragment = new Notification();
        Bundle args = new Bundle();;
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notification, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        LinearLayout noti1 = (LinearLayout) getView().findViewById(R.id.no1);
        // set a onclick listener for when the button gets clicked
        noti1.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(), DetailNotification1.class);
                startActivity(mainIntent);
                v.setBackgroundColor(Color.WHITE);
            }
        });

        LinearLayout noti2 = (LinearLayout) getView().findViewById(R.id.no2);
        // set a onclick listener for when the button gets clicked
        noti2.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                v.setBackgroundColor(Color.WHITE);
            }
        });

        LinearLayout noti3 = (LinearLayout) getView().findViewById(R.id.no3);
        // set a onclick listener for when the button gets clicked
        noti3.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(), DetailNotification2.class);
                startActivity(mainIntent);
                v.setBackgroundColor(Color.WHITE);
            }
        });

        LinearLayout noti4 = (LinearLayout) getView().findViewById(R.id.no4);
        // set a onclick listener for when the button gets clicked
        noti4.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                v.setBackgroundColor(Color.WHITE);
            }
        });

        LinearLayout noti5 = (LinearLayout) getView().findViewById(R.id.no5);
        // set a onclick listener for when the button gets clicked
        noti5.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(),
                        DetailNotification1.class);
                startActivity(mainIntent);
                v.setBackgroundColor(Color.WHITE);
            }
        });

        LinearLayout noti6 = (LinearLayout) getView().findViewById(R.id.no6);
        // set a onclick listener for when the button gets clicked
        noti6.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                v.setBackgroundColor(Color.WHITE);
            }
        });

        LinearLayout noti7 = (LinearLayout) getView().findViewById(R.id.no7);
        // set a onclick listener for when the button gets clicked
        noti7.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(),
                        DetailNotification3.class);
                startActivity(mainIntent);
                v.setBackgroundColor(Color.WHITE);
            }
        });

        LinearLayout noti8 = (LinearLayout) getView().findViewById(R.id.no8);
        // set a onclick listener for when the button gets clicked
        noti8.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(),
                        DetailNotification3.class);
                startActivity(mainIntent);
                v.setBackgroundColor(Color.WHITE);
            }
        });

        LinearLayout noti9 = (LinearLayout) getView().findViewById(R.id.no9);
        // set a onclick listener for when the button gets clicked
        noti9.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                v.setBackgroundColor(Color.WHITE);
            }
        });

        LinearLayout noti10 = (LinearLayout) getView().findViewById(R.id.no10);
        // set a onclick listener for when the button gets clicked
        noti10.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(),
                        DetailNotification2.class);
                startActivity(mainIntent);
                v.setBackgroundColor(Color.WHITE);
            }
        });
    }
}