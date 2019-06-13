package com.example.demobroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class NetworkBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Network on change",Toast.LENGTH_LONG).show();
        Log.e("RECEIVER", "Bật Toast");
    }
}
