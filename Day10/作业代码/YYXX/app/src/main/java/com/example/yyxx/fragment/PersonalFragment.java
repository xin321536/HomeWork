package com.example.yyxx.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.yyxx.Activity.longinActivity;
import com.example.yyxx.R;

public class PersonalFragment extends Fragment {

    private ImageView per_strings_im;
    private ImageView per_iv_title;
    private TextView per_tv_name;
    private ImageView per_vip_im;
    private RelativeLayout constraintLayout;
    private ImageView per_iv_invitation;
    private TextView textView;
    private ImageView imageView;
    private TextView textView3;
    private TextView textView5;
    private TextView textView4;
    private TextView textView6;
    private ImageView per_order;
    private ImageView per_books;
    private ImageView per_love;
    private ImageView per_dow;
    private TextView textView7;
    private RelativeLayout constraintLayout5;
    private TextView per_tv_Appointment;
    private TextView per_tv_viporder;
    private TextView textView8;
    private ImageView Per_im_order;
    private ImageView per_im_viporder;
    private ImageView per_im_Appointment;
    private TextView per_tv_order;
    private RelativeLayout constraintLayout4;
    private TextView per_VIP;
    private TextView per_tv_learning;
    private TextView textView9;
    private ImageView per_im_coupon;
    private ImageView per_im_learning;
    private ImageView per_im_vip;
    private TextView per_tv_coupon;
    private RelativeLayout constraintLayout3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_personal, container, false);
        initview(inflate);
        return inflate;

    }

    private void initview(View inflate) {
        per_iv_title = inflate.findViewById(R.id.per_iv_title);
        constraintLayout = inflate.findViewById(R.id.constraintLayout);
        switch (inflate.getId()) {
            case R.id.per_iv_title:
                startActivity(new Intent(getContext(), longinActivity.class));
                break;
                case R.id.constraintLayout:
                    Toast.makeText(getContext(), "Layout", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getContext(), longinActivity.class));
                break;
            default:
                break;
        }
    }
}
