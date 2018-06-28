package com.aiguigu.user.shoppingmall.home.fragment;

import android.nfc.Tag;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;


import com.aiguigu.user.shoppingmall.app.R;
import com.aiguigu.user.shoppingmall.base.BaseFragment;

import static android.content.ContentValues.TAG;

/**
 * Created by Administrator on 2018/6/26.
 */

public class HomeFragment extends BaseFragment {

    @Override
    public View initView() {
        Log.e(TAG,"主页面的Fragment的UI被初始化了");
        View view = View.inflate(mContext, R.layout.fragment_home,null);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        Log.e(TAG,"主页面的Fragment的数据被初始化了");

    }
}
