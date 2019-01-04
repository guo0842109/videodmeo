package com.eric.videodemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.eric.videodemo.ui.DrawableSurfaceViewActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_1://SurfaceView显示图片
                startActivity(new Intent(this,DrawableSurfaceViewActivity.class));
                break;
        }
    }
}
