package com.think.mozzo_test.sync

import android.accounts.AbstractAccountAuthenticator
import android.accounts.Account
import android.accounts.AccountAuthenticatorResponse
import android.accounts.NetworkErrorException
import android.content.Context
import android.os.Bundle

/**
 * Created by anand on 19/12/16.
 */

class Authenticator(context: Context) : AbstractAccountAuthenticator(context) {

    // No properties to edit.
    override fun editProperties(
            r: AccountAuthenticatorResponse, s: String): Bundle {
        throw UnsupportedOperationException()
    }

    // Because we're not actually adding an account to the device, just return null.
    @Throws(NetworkErrorException::class)
    override fun addAccount(
            r: AccountAuthenticatorResponse,
            s: String,
            s2: String,
            strings: Array<String>,
            bundle: Bundle): Bundle? {
        return null
    }

    // Ignore attempts to confirm credentials
    @Throws(NetworkErrorException::class)
    override fun confirmCredentials(
            r: AccountAuthenticatorResponse,
            account: Account,
            bundle: Bundle): Bundle? {
        return null
    }

    // Getting an authentication token is not supported
    @Throws(NetworkErrorException::class)
    override fun getAuthToken(
            r: AccountAuthenticatorResponse,
            account: Account,
            s: String,
            bundle: Bundle): Bundle {
        throw UnsupportedOperationException()
    }

    // Getting a label for the auth token is not supported
    override fun getAuthTokenLabel(s: String): String {
        throw UnsupportedOperationException()
    }

    // Updating user credentials is not supported
    @Throws(NetworkErrorException::class)
    override fun updateCredentials(
            r: AccountAuthenticatorResponse,
            account: Account,
            s: String, bundle: Bundle): Bundle {
        throw UnsupportedOperationException()
    }

    // Checking features for the account is not supported
    @Throws(NetworkErrorException::class)
    override fun hasFeatures(
            r: AccountAuthenticatorResponse,
            account: Account, strings: Array<String>): Bundle {
        throw UnsupportedOperationException()
    }
}