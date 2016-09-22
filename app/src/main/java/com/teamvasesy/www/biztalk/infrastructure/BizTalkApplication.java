package com.teamvasesy.www.biztalk.infrastructure;

import android.app.Application;

/**
 * Created by ashwani vasesy on 9/21/2016.
 */
public class BizTalkApplication extends Application {
    private Auth auth;

    @Override
    public void onCreate() {
        super.onCreate();
        auth = new Auth(this);
    }
    public Auth getAuth(){
        return auth;
    }
}
