package com.example.android_uikit_3;

import android.app.Application;
import android.util.Log;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.sendbird.android.SendbirdChat;
import com.sendbird.android.exception.SendbirdException;
import com.sendbird.android.handler.ConnectHandler;
import com.sendbird.android.handler.InitResultHandler;
import com.sendbird.android.params.InitParams;
import com.sendbird.android.user.User;
import com.sendbird.desk.android.SendBirdDesk;


public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

//        SendbirdChat.init(new InitParams("3CE3CBB9-4B34-4DCA-AE5D-3921DBCE9340", this, false), new InitResultHandler() {
//            @Override
//            public void onMigrationStarted() {
//            }
//
//            @Override
//            public void onInitFailed(@NonNull SendbirdException e) {
//            }
//
//            @Override
//            public void onInitSucceed() {
//
//                Log.i("Application", "Chat Init Success");
//
//                SendBirdDesk.init();
//                Log.i("Application", "Desk Init Success");
//
//
//                SendbirdChat.connect("10", "Token", new ConnectHandler() {
//                    @Override
//                    public void onConnected(@Nullable User user, @Nullable SendbirdException e) {
//                        if (e != null) {
//                            Log.e("Application","Chat Connect Error", e);
//                            return;
//                        }
//
//                        Log.i("Application", "Chat connected");
//
//                        SendBirdDesk.authenticate("10", "Token", new SendBirdDesk.AuthenticateHandler() {
//                            @Override
//                            public void onResult(SendbirdException e) {
//                                if (e != null) {
//                                    Log.e("Application","Desk Auth Error", e);
//                                    return;
//                                }
//                                Log.i("Application", "Desk Authenticated");
//                            }
//                        });
//
//                    }
//                });
//
//
//            }
//
//        });



    }
}
