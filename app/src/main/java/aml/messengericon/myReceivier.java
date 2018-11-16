package aml.messengericon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by aml on 04/11/18.
 */

public class myReceivier extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        //Intent myIntent = new Intent(context, ChatHeadService.class);
        context.startService(intent);

    }
}
