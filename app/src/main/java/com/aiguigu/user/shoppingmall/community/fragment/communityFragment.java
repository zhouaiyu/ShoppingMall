package com.aiguigu.user.shoppingmall.community.fragment;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.aiguigu.user.shoppingmall.base.BaseFragment;

import static android.content.ContentValues.TAG;

/**
 * Created by Administrator on 2018/6/26.
 */

public class communityFragment extends BaseFragment {
    private TextView textView;
    @Override
    public View initView() {
        Log.e(TAG,"发现的Fragment的UI被初始化了");
        textView = new TextView(mContext);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(25);
        return textView;
    }

    @Override
    public void initData() {
        super.initData();
        Log.e(TAG,"发现的Fragment的数据被初始化了");
        textView.setText("发现内容");
    }
}
