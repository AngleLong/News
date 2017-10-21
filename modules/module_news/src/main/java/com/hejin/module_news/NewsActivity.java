package com.hejin.module_news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 这个是新闻页面的Activity
 * 当你把某个类库当成主页面的时候
 * 这里你要把相应的AndroidManifest.xml中进行设置
 * 因为这个清单文件是会有两个的,所以你要在集成开发模式的AndroidManifest.xml
 * 设置默认启动的启动Activity模式,这里要注意一下的
 */
public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
    }
}
