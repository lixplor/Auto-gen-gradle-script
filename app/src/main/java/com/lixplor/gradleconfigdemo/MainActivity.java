package com.lixplor.gradleconfigdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String info = "应用名称: "
                + "\n包名: " + BuildConfig.APPLICATION_ID
                + "\nVERSION CODE: " + BuildConfig.VERSION_CODE
                + "\nVERSION NAME: " + BuildConfig.VERSION_NAME
                + "\nSERVER BASE URL: " + BuildConfig.SERVER_BASE_URL
                + "\nLOG ENALBE: " + BuildConfig.LOG_ENABLED
                + "\nBUGTAGS ENALBE: " + BuildConfig.BUGTAGS_ENABLED;
        TextView textView = (TextView) findViewById(R.id.tv_info);
        textView.setText(info);
    }
}
