package net.kariyer.techchallenge.marketim;

import android.app.Application;

import com.orhanobut.hawk.Hawk;

/**
 * Created by batuhanc on 23.09.2019.
 */

public class MarketimApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        //Initizalize HAWK
        Hawk.init(this).build();


    }
}
