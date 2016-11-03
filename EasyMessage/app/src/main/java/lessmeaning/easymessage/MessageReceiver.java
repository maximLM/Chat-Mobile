package lessmeaning.easymessage;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

public class MessageReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        makeNotification(context);
    }
    private void makeNotification(Context context) {
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(context)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentTitle("My notification")
                        .setContentText("Hello BBBBBBBB!");
        NotificationManager m = (NotificationManager)
                context.getSystemService(Context.NOTIFICATION_SERVICE);
        m.notify(11,mBuilder.build());
//        TODO make it go into MainActivity
    }

}

