package com.teamvasesy.www.biztalk.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.teamvasesy.www.biztalk.infrastructure.BizTalkApplication;

public abstract class BaseActivity extends AppCompatActivity {
    protected BizTalkApplication application;

    @Override
    protected void onCreate(Bundle savedState){
        super.onCreate(savedState);

        application = (BizTalkApplication) getApplication();

    }

}
