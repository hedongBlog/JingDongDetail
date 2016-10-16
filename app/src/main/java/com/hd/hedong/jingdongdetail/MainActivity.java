package com.hd.hedong.jingdongdetail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hd.hedong.jingdongdetail.myview.McoyProductContentPage;
import com.hd.hedong.jingdongdetail.myview.McoyProductDetailInfoPage;
import com.hd.hedong.jingdongdetail.myview.McoySnapPageLayout;

public class MainActivity extends AppCompatActivity {

    private McoySnapPageLayout mcoySnapPageLayout = null;
    private McoyProductContentPage bottomPage = null;
    private McoyProductDetailInfoPage topPage = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mcoySnapPageLayout = (McoySnapPageLayout) findViewById(R.id.flipLayout);

        //列表页
        topPage = new McoyProductDetailInfoPage(this,
                getLayoutInflater().inflate(
                        R.layout.top_layout, null));
        //详情页
        bottomPage = new McoyProductContentPage(this,
                getLayoutInflater().inflate(
                        R.layout.webview, null));
        mcoySnapPageLayout.setSnapPages(topPage, bottomPage);


    }

}
