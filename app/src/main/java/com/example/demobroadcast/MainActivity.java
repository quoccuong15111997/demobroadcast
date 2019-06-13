package com.example.demobroadcast;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    NetworkBroadcastReceiver networkBroadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        networkBroadcastReceiver= new NetworkBroadcastReceiver();
        final IntentFilter intentFilter= new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(networkBroadcastReceiver,intentFilter);

    }
    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Toast.makeText(this, "Đã đăng ký background cho ứng dụng", Toast.LENGTH_LONG).show();
    }
}
