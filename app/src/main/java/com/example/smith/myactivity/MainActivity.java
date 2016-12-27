package com.example.smith.myactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /**
     * 生命周期的第一个方法,可以做一些初始化工作
     * 加载界面的布局资源,初始化Activity所需数据
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 表示正在重新启动,一般情况下,当当前Activity从不可见重新变为可见状态时,
     * 就会被调用,这是用户的行为导致的,切换到桌面或者打开一个新的Activity,当前的Activity
     * 就会执行onPause和onStop,接着用户又回到这个Activity,就会出现这种情况
     */
    @Override
    protected void onRestart() {
        super.onRestart();
    }

    /**
     * 表示Activity正在被启动,即将开始,这是Activity已经可见了.但是还没有出现的前台,还无法和用户交互,
     * 可以看成,Activity已经显示出来了,但是我们还看不到.
     */
    @Override
    protected void onStart() {
        super.onStart();
    }

    /**
     * 表示Activity已经可见了.并且出现在前台开始活动,
     * 注意.onStart时,已经可见但是还在后台
     * onResume时,已经可见,并且显示到前台
     */
    @Override
    protected void onResume() {
        super.onResume();
    }

    /**
     * 表示Activity正在停止,正常情况下onStop就会被调用.
     * 如果这个时候,快速的再回到当前Activity.那么onResume就会被调用,
     * 在此时可以做一些储存数据,停止动画等工作,但是不能太耗时.会影响新Activity的显示,
     * onPause必须先执行完,新Activity的onResume才会执行
     */
    @Override
    protected void onPause() {
        super.onPause();
    }

    /**
     * 表示Activity即将停止.可以做一些稍微重量级的回收工作,同样不能太耗时.
     */
    @Override
    protected void onStop() {
        super.onStop();
    }

    /**
     * 表示Activity即将被销毁,这是最后一个生命周期的回调,
     * 这里,我们可以做一些回收工作和,最终资源的释放
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
        /*
        onStart和onResume , onPause和onStop看起来都差不多?
            这2个配对的回调分别表示不同的意义,
            onStart 和 onStop 是从Activity是否可见的角度来回调的.
            onResume 和 onPause 是否位于前台这个角度来回调的.
        */

    /**
     * 异常情况下的生命周期的分析
     *
     */

    /**
     * activity的intent-filer匹配原则
     * 1.action的匹配规则:是一个字符串,系统预定义了一些action,同时我们也可以在系统中定义自己的action,
     * action的匹配要求Intent中的action存在且必须和过滤规则中的其中一个action相同,和category匹配规则的不同,区分大小写.
     *
     * 2.category是一个字符串,如果Intent中有category就必须和已经定义了category相同,也可以没有category,
     *
     * 3.data的匹配规则,和action类似如果过滤规则中定义了data,那么Intent中必须要定义可以匹配的data,
     *      data的结构:由mimeType(媒体类型)和URI,
     *      uri:Scheme:URI的模式(例如:http,file,content)
     *      Host:URI主机名(例如:127.0.0.1)
     *      Port:URI中的端口号,(例如8080)
     *      Path.pathPattern和pathPrefix:Path表示完整的路径名称.pathPattern:表示路劲中可以包含统配符,pathPrefix表示路劲的前缀信息
     *
     */

}
