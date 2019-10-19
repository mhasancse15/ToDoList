package com.threesixity.todolist.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class AlarmRecever extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent != null) {
            Bundle b = intent.getExtras();
            String TaskTitle = b.getString("TaskTitle");
            String TaskPrority = b.getString("TaskPrority");
            int _id = b.getInt("id");
            Intent myIntent = new Intent(context, NotificationService.class);
            myIntent.putExtra("TaskTitle", TaskTitle);
            myIntent.putExtra("TaskPrority",TaskPrority);
            myIntent.putExtra("id",_id);
            context.startService(myIntent);
        }

    }
}
