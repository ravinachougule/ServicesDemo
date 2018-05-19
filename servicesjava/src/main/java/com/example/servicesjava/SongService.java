package com.example.servicesjava;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class SongService extends Service {

    private MediaPlayer player;
    public SongService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        player=MediaPlayer.create(this,R.raw.song);
        player.start();
        return START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {

        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onDestroy() {
        player.stop();
        player.release();
        super.onDestroy();
    }
}
