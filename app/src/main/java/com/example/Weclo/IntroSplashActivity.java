package com.example.Weclo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class IntroSplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_introsplash);

        Handler hd = new Handler();
        hd.postDelayed(new infoSplashhandler(), 2000); // 1초 후에 hd handler 실행  3000ms = 3초

    }

    private class infoSplashhandler implements Runnable{
        public void run(){
            startActivity(new Intent(getApplication(), WeatherActivity.class)); //로딩이 끝난 후, ChoiceFunction 이동
            IntroSplashActivity.this.finish(); // 로딩페이지 Activity stack에서 제거
        }
    }

    @Override
    public void onBackPressed() {
        //초반 플래시 화면에서 넘어갈때 뒤로가기 버튼 못누르게 함
    }

}
