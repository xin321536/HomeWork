package com.example.myapplication.fragment;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CUFragment extends Fragment {


    private TextView Classification;
    private TextView Sorting;
    private TextView Screening;
    private TextView textView2;
    private ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_c_u, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        Classification = view.findViewById(R.id.Classification);
        Sorting = view.findViewById(R.id.Sorting);
        Screening = view.findViewById(R.id.Screening);
        imageView = view.findViewById(R.id.imageView2);

        switch (view.getId()) {
            case R.id.Classification:
                initCallifcation();
                Toast.makeText(getContext(), "打开分类", Toast.LENGTH_SHORT).show();
                break;    case R.id.imageView2:
                Toast.makeText(getContext(), "图片", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Sorting:
                initSorting();
                Toast.makeText(getContext(), "打开排序", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Screening:
                initScreening();
                Toast.makeText(getContext(), "打开筛选", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

    private void initScreening() {
        //初始化布局
        View view = LayoutInflater.from(getContext()).inflate(R.layout.screening_layout, null);
        //找控件
        //创建popu
        final PopupWindow window = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        //window.setBackgroundDrawable(new BitmapDrawable());
        //点击外部消失
        window.setOutsideTouchable(true);

        //弹出位置
        window.showAtLocation(Sorting, Gravity.HORIZONTAL_GRAVITY_MASK, 0, 0);
    }

    private void initSorting() {
        //初始化布局
        View view = LayoutInflater.from(getContext()).inflate(R.layout.sorting_layout, null);
        //找控件
        //创建popu
        final PopupWindow window = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        //window.setBackgroundDrawable(new BitmapDrawable());
        //点击外部消失
        window.setOutsideTouchable(true);

        //弹出位置
        window.showAtLocation(Sorting, Gravity.HORIZONTAL_GRAVITY_MASK, 0, 0);
    }


    private void initCallifcation() {

        //初始化布局
        View view = LayoutInflater.from(getContext()).inflate(R.layout.classification_layout, null);
        //找控件
        Button btno = view.findViewById(R.id.oun);
        //创建popu
        final PopupWindow window = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        //window.setBackgroundDrawable(new BitmapDrawable());
        //点击外部消失
        window.setOutsideTouchable(true);

        btno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                window.dismiss();
            }
        });
        //弹出位置
        window.showAtLocation(Classification, Gravity.HORIZONTAL_GRAVITY_MASK, 0, 0);
    }
}
