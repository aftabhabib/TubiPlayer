package com.tubitv.media.fsm.concrete;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import com.tubitv.media.controller.PlayerComponentController;
import com.tubitv.media.controller.PlayerUIController;
import com.tubitv.media.fsm.BaseState;
import com.tubitv.media.fsm.Input;
import com.tubitv.media.fsm.State;
import com.tubitv.media.fsm.concrete.factory.StateFactory;
import com.tubitv.media.fsm.state_machine.FsmPlayer;
import com.tubitv.media.helpers.Constants;
import com.tubitv.media.models.AdMediaModel;
import com.tubitv.media.models.MediaModel;

/**
 * Created by allensun on 7/31/17.
 */
public class ReceiveAdState extends BaseState {

    private static final String TAG = ReceiveAdState.class.getSimpleName();

    @Override
    public State transformToState(Input input, StateFactory factory) {

        switch (input) {
            case SHOW_ADS:
                return factory.createState(AdPlayingState.class);
        }

        return null;
    }

    @Override
    public void performWorkAndupdatePlayerUI(@Nullable FsmPlayer fsmPlayer, @NonNull PlayerUIController controller, @NonNull PlayerComponentController componentController, @NonNull MediaModel movieMedia, @Nullable AdMediaModel adMedia) {
        Log.d(Constants.FSMPLAYER_TESTING, "update stat to: " + TAG);
        // doesn't need to do any UI work.

        if(isNull(fsmPlayer,controller,componentController,movieMedia,adMedia)){
            return;
        }
    }
}