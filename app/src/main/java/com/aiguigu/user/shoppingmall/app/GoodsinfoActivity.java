package com.aiguigu.user.shoppingmall.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class GoodsinfoActivity extends Activity implements View.OnClickListener {
    private ImageButton ibGoodInfoBack;
    private ImageButton ibGoodInfoMore;
    private ImageView ivGoodInfoImage;
    private TextView tvGoodInfoName;
    private TextView tvGoodInfoDesc;
    private TextView tvGoodInfoPrice;
    private TextView tvGoodInfoStore;
    private TextView tvGoodInfoStyle;
    private WebView wbGoodInfoMore;
    private LinearLayout llGoodsRoot;
    private TextView tvGoodInfoCallcenter;
    private TextView tvGoodInfoCallection;
    private TextView tvGoodInfoCart;
    private Button btuGoodInfoAddcart;
    private TextView tv_more_share;
    private TextView tv_more_search;
    private TextView tv_more_home;
    private Button btn_more;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2018-06-28 10:20:45 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        tv_more_share=(TextView) findViewById(R.id. tv_more_share);
        tv_more_search =(TextView) findViewById(R.id. tv_more_search);
        tv_more_home=(TextView) findViewById(R.id. tv_more_home);
        btn_more=(Button) findViewById(R.id.btn_more);
        ibGoodInfoBack = (ImageButton)findViewById( R.id.ib_good_info_back );
        ibGoodInfoMore = (ImageButton)findViewById( R.id.ib_good_info_more );
        ivGoodInfoImage = (ImageView)findViewById( R.id.iv_good_info_image );
        tvGoodInfoName = (TextView)findViewById( R.id.tv_good_info_name );
        tvGoodInfoDesc = (TextView)findViewById( R.id.tv_good_info_desc );
        tvGoodInfoPrice = (TextView)findViewById( R.id.tv_good_info_price );
        tvGoodInfoStore = (TextView)findViewById( R.id.tv_good_info_store );
        tvGoodInfoStyle = (TextView)findViewById( R.id.tv_good_info_style );
        wbGoodInfoMore = (WebView)findViewById( R.id.wb_good_info_more );
        llGoodsRoot = (LinearLayout)findViewById( R.id.ll_goods_root );
        tvGoodInfoCallcenter = (TextView)findViewById( R.id.tv_good_info_callcenter );
        tvGoodInfoCallection = (TextView)findViewById( R.id.tv_good_info_callection );
        tvGoodInfoCart = (TextView)findViewById( R.id.tv_good_info_cart );
        btuGoodInfoAddcart = (Button)findViewById( R.id.btu_good_info_addcart );

        ibGoodInfoBack.setOnClickListener( this );
        ibGoodInfoMore.setOnClickListener( this );
        btuGoodInfoAddcart.setOnClickListener( this );

        tvGoodInfoCallcenter.setOnClickListener( this );
        tvGoodInfoCallection.setOnClickListener( this );
        tvGoodInfoCart.setOnClickListener( this );

        //设置点击事件
        tv_more_share.setOnClickListener( this );

        tv_more_search.setOnClickListener( this );

        tv_more_home.setOnClickListener( this );

        btn_more.setOnClickListener( this );


    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2018-06-28 10:20:45 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == ibGoodInfoBack ) {

            // Handle clicks for ibGoodInfoBack
            finish();
        } else if ( v == ibGoodInfoMore ) {

            // Handle clicks for ibGoodInfoMore
            Toast.makeText(this,"更多",Toast.LENGTH_SHORT).show();
        } else if ( v == btuGoodInfoAddcart ) {
            // Handle clicks for btuGoodInfoAddcart
            Toast.makeText(this,"添加到购物车",Toast.LENGTH_SHORT).show();
        }else if (v== tvGoodInfoCallcenter){
            Toast.makeText(this,"客服中心",Toast.LENGTH_SHORT).show();
        }else if (v== tvGoodInfoCallection) {
            Toast.makeText(this, "收藏", Toast.LENGTH_SHORT).show();
        }else if (v== tvGoodInfoCart ) {
            Toast.makeText(this, "购物车", Toast.LENGTH_SHORT).show();
        }else if (v== tv_more_share
                ) {
            Toast.makeText(this, "分享", Toast.LENGTH_SHORT).show();
        }else if (v==  tv_more_search ) {
            Toast.makeText(this, "搜索", Toast.LENGTH_SHORT).show();
        }else if (v==  tv_more_home ) {
            Toast.makeText(this, "主页面", Toast.LENGTH_SHORT).show();
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_info);
        findViews();
    }
}
