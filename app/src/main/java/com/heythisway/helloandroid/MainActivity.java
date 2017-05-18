package com.heythisway.helloandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * 클릭리스너 구현하는 방법 세가지
 * 1. 위젯을 사용하는 객체가 상속받아서 구현
 * 2. 객체내에서 변수로 생성
 * 3. setOnclickListener 함수에 익명 개체로 전달(식별자가 없는 객체)
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView);
        btn = (Button) findViewById(R.id.btnClick);

        //1번 형태로 구현
        btn.setOnClickListener(this);

        /*
        // 2번 형태로 구현- 아래에 구현된 리스너를 통해 구현된다.
        btn.setOnClickListener(listener);

        // 2. 객체내에서 변수로 생성
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("안녕? 안드로이드!");
            }
        }

        // 3. 익명개체로 전달해서 클릭리스너 구현
        /*
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("안녕? 안드로이드!");
            }
        });
        */


    }

    //1번 형태로 구현
    @Override
    public void onClick(View v) {
        tv.setText("안녕 안드로이드");
    }
}
