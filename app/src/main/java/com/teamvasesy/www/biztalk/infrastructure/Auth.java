package com.teamvasesy.www.biztalk.infrastructure;

import android.content.Context;

/**
 * Created by ashwani vasesy on 9/21/2016.
 */
public class Auth {
    private final Context context;
    private User user;

    public Auth(Context context) {
        this.context = context;
        user = new User();
    }

    public User getUser() {
        return user;
    }
}
