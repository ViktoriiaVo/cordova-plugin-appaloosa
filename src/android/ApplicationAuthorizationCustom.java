package com.appaloosa.cordova.plugin;

import android.app.Activity;

import org.apache.cordova.CallbackContext;

import appaloosa_store.com.appaloosa_android_tools.Appaloosa;
import appaloosa_store.com.appaloosa_android_tools.tools.interfaces.ApplicationAuthorizationInterface;
import appaloosa_store.com.appaloosa_android_tools.tools.models.ApplicationAuthorization;

/**
 * Created by gsautreau on 15/02/2016.
 */
public class ApplicationAuthorizationCustom extends Activity implements ApplicationAuthorizationInterface {

    CallbackContext callbackContext;

    public ApplicationAuthorizationCustom(CallbackContext cbContext){
        callbackContext = cbContext;
    }

    @Override
    public void isAuthorized(appaloosa_store.com.appaloosa_android_tools.tools.models.ApplicationAuthorization authorization) {
        callbackContext.success();
    }

    @Override
    public void isNotAuthorized(appaloosa_store.com.appaloosa_android_tools.tools.models.ApplicationAuthorization authorization) {
        callbackContext.error("error");
    }
}
