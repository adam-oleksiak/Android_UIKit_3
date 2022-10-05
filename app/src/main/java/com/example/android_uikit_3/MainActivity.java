package com.example.android_uikit_3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.sendbird.android.SendbirdChat;
import com.sendbird.android.exception.SendbirdException;
import com.sendbird.android.handler.ConnectHandler;
import com.sendbird.android.handler.InitResultHandler;
import com.sendbird.android.params.InitParams;
import com.sendbird.android.user.User;
import com.sendbird.desk.android.SendBirdDesk;

//import com.sendbird.uikit.activities.ChannelListActivity;

public class MainActivity extends AppCompatActivity { // ChannelListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void initChat(View view) {
        SendbirdChat.init(new InitParams("3CE3CBB9-4B34-4DCA-AE5D-3921DBCE9340", this, false), new InitResultHandler() {
            @Override
            public void onMigrationStarted() {
            }

            @Override
            public void onInitFailed(@NonNull SendbirdException e) {
            }

            @Override
            public void onInitSucceed() {
                Log.i("Application", "Chat Init Success");
            }
        });
    }

    public void initDesk(View view) {
        SendBirdDesk.init();
        Log.i("Application", "Desk Init Success");
    }

    public void connectChat(View view) {
        SendbirdChat.connect("10", "Token", new ConnectHandler() {
            @Override
            public void onConnected(@Nullable User user, @Nullable SendbirdException e) {
                if (e != null) {
                    Log.e("Application","Chat Connect Error", e);
                    return;
                }

                Log.i("Application", "Chat connected");
            }
        });
    }

    public void authDesk(View view) {
        SendBirdDesk.authenticate("10", "Token", new SendBirdDesk.AuthenticateHandler() {
            @Override
            public void onResult(SendbirdException e) {
                if (e != null) {
                    Log.e("Application","Desk Auth Error", e);
                    return;
                }
                Log.i("Application", "Desk Authenticated");
            }
        });
    }


}