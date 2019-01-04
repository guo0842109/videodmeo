package com.eric.videodemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.eric.videodemo.R;

/**
 * Author: Created by guohaibing
 * Date: on 2019/1/4  16 :31
 * Email: guohaibing@yto.net.cn
 * 关于 SurfaceView，有一个知识点是，渲染到 Surface 上的内容将会由 SurfaceFlinger（而非应用）进行合成，
 * 因此获得的 Surface 可以由单独的线程或单独的进程进行渲染，并与应用界面执行的任何渲染隔离开。
 */
public class DrawableSurfaceViewActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawablesurfaceview);
    }
}
