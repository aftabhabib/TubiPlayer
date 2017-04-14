package com.tubitv.media;

import android.content.Context;

import com.crashlytics.android.Crashlytics;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.trackselection.TrackSelector;

import io.fabric.sdk.android.Fabric;

/**
 * Created by stoyan on 3/20/17.
 */
public class TubiPlayer extends SimpleExoPlayer {

    public TubiPlayer(Context context, TrackSelector trackSelector, LoadControl loadControl,
                      DrmSessionManager<FrameworkMediaCrypto> drmSessionManager,
                      @ExtensionRendererMode int extensionRendererMode, long allowedVideoJoiningTimeMs) {
        super(context, trackSelector, loadControl, drmSessionManager, extensionRendererMode, allowedVideoJoiningTimeMs);
        Fabric.with(context, new Crashlytics());
    }


}
