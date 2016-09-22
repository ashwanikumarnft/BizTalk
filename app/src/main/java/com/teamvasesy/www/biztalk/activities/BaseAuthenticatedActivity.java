package com.teamvasesy.www.biztalk.activities;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;

public abstract class BaseAuthenticatedActivity extends BaseActivity {
    @Override
    protected final void onCreate(Bundle savedState){
        super.onCreate(savedState);

        if (!application.getAuth().getUser().isLoggedIn()){
            startActivity(new Intent(this, LoginActivity.class));
            finish();
            return;
        }

        onBizTalkCreate(savedState);

    }

    protected abstract void onBizTalkCreate(Bundle savedState);
}
