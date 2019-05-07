package com.upsight.android.toasterlibrary;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

public class ToasterMessage {
    public static void toastMethod(final Context c) {
        //Toast.makeText(c, "Sean Hello World", Toast.LENGTH_SHORT).show();

        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(c, "Sean Hello World jitpack", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
