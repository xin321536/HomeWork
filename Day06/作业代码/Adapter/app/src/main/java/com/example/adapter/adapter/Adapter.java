package com.example.adapter.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.adapter.R;
import com.example.adapter.activity.MainActivity;
import com.example.adapter.entity.Bean;

import java.util.List;

public class Adapter extends BaseMultiItemQuickAdapter<Bean.DataBean.DatasBean, BaseViewHolder> {
    private Context mContext;

    public Adapter(Context context, List<Bean.DataBean.DatasBean> data) {
        super(data);
        addItemType(Bean.DataBean.DatasBean.MULTI_1, R.layout.multi_item1);
        addItemType(Bean.DataBean.DatasBean.MULTI_2, R.layout.multi_item2);
        addItemType(Bean.DataBean.DatasBean.MULTI_3, R.layout.multi_item3);
        this.mContext = context;
    }


    @Override
    protected void convert(BaseViewHolder helper, Bean.DataBean.DatasBean datasBean) {
        switch (datasBean.getItemType()) {
            //只有一张图片
            case Bean.DataBean.DatasBean.MULTI_1:
                Glide.with(mContext).load(R.drawable.ic_launcher_background).
                        into((ImageView) helper.getView(R.id.multi1_iv));
                break;

            //左边文字，右边图片
            case Bean.DataBean.DatasBean.MULTI_2:
                helper.setText(R.id.multi2_tv, datasBean.getTitle());
                Glide.with(mContext).load(R.drawable.ic_launcher_background).
                        into((ImageView) helper.getView(R.id.multi2_iv));

                break;

            //左边图片右边文字
            case Bean.DataBean.DatasBean.MULTI_3:
                helper.setText(R.id.multi3_tv, datasBean.getChapterName());
                Glide.with(mContext).load(R.drawable.ic_launcher_background).
                        into((ImageView) helper.getView(R.id.multi3_iv));
                break;

        }

    }
}
