package com.aiguigu.user.shoppingmall.app;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.aiguigu.user.shoppingmall.base.BaseFragment;
import com.aiguigu.user.shoppingmall.community.fragment.communityFragment;
import com.aiguigu.user.shoppingmall.home.fragment.HomeFragment;
import com.aiguigu.user.shoppingmall.shoppingcart.fragment.ShoppingcartFragment;
import com.aiguigu.user.shoppingmall.type.fragment.TypeFragment;
import com.aiguigu.user.shoppingmall.user.fragment.UserFragment;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends FragmentActivity {

    @Bind(R.id.frameLayout)
    FrameLayout frameLayout;

    @Bind(R.id.rg_main)
    RadioGroup rgMain;
    private ArrayList<BaseFragment> fragments;

    private int position = 0;
    private Fragment tempFragemnt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        ButterKnife.bind(this);
        initFragment();
        initListener();

    }

    private void initListener() {
        rgMain.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_home://主页
                        position = 0;
                        break;
                    case R.id.rb_type://分类
                        position = 1;
                        break;
                    case R.id.rb_community://发现
                        position = 2;
                        break;
                    case R.id.rb_cart://购物车
                        position = 3;
                        break;
                    case R.id.rb_user://用户中心
                        position = 4;
                        break;
                    default:
                        position = 0;
                        break;
                }
                //
                BaseFragment baseFragment = getFragment(position);

                switchFragment(tempFragemnt,baseFragment);

            }
        });

        rgMain.check(R.id.rb_home);
    }

    private void initFragment() {
        fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new TypeFragment());
       fragments.add(new  communityFragment());
        fragments.add(new ShoppingcartFragment());
        fragments.add(new UserFragment());
    }

    private BaseFragment getFragment(int position) {
        if (fragments != null && fragments.size() > 0){
            BaseFragment baseFragment = fragments.get(position);
            return baseFragment;
        }
        return null;
    }

    private void switchFragment(Fragment fromFragment, BaseFragment nextFragment) {
        if (tempFragemnt!= nextFragment){
            tempFragemnt = nextFragment;
            if (nextFragment != null) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                //
                if (!nextFragment.isAdded()) {
                    //
                    if (fromFragment != null) {
                        transaction.hide(fromFragment);
                    }
                    transaction.add(R.id.frameLayout, nextFragment).commit();
                } else {
                    //
                    if (fromFragment != null) {
                        transaction.hide(fromFragment);
                    }
                    transaction. show(nextFragment).commit();
                }
            }
        }
    }
}
