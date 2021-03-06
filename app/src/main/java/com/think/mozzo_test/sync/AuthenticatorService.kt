package com.think.mozzo_test.sync

import android.app.Service
import android.content.Intent
import android.os.IBinder

/**
 * Created by anand on 19/12/16.
 */

class AuthenticatorService : Service() {
    // Instance field that stores the authenticator object
    private var mAuthenticator: Authenticator? = null

    override fun onCreate() {
        // Create a new authenticator object
        mAuthenticator = Authenticator(this)
    }

    /*
     * When the system binds to this Service to make the RPC call
     * return the authenticator's IBinder.
     */
    override fun onBind(intent: Intent): IBinder? {
        return mAuthenticator!!.iBinder
    }
}
