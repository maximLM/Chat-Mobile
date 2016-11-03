package lessmeaning.easymessage;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

public class Merger extends Service implements Runnable {


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        new Thread(this).start();
        return START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void run() {
//        do something
    }

    private void sendMsgToUpd() {
        if (checkIsActivityAlive(MainActivity.class, this))
            sendBroadcast(new Intent(LocalCore.BROADCAST));
        else {
            sendBroadcast(new Intent(this, MessageReceiver.class));
        }
    }

    private boolean checkIsActivityAlive(Class<?> serviceClass, Context context) {
        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
            if (serviceClass.getName().equals(service.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

}
