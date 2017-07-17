package com.example.logutil;

import android.util.Log;

/**
 * Created by viss on 7/17/17.
 */

public class LogDebug {

    private static final String TAG = "LOGUTIL";

    public static void showLog(String message){
        Log.e(TAG , message);
    }

}
