package com.tubitv.media.fsm;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.tubitv.media.controller.PlayerUIController;
import com.tubitv.media.fsm.concrete.factory.StateFactory;
import com.tubitv.media.models.MediaModel;

/**
 * Created by allensun on 7/27/17.
 * This is the state to describe ExoPlayer's state
 *
 * The state should not hold any other reference, because the state can change a lot of time during video playing experiences,
 * so you can create the state class using {@link StateFactory}
 */
public interface State {

    /**
     * let the state to examine itself in a constant time line to detects any input that can change the state.
     */
    State transformToState(@NonNull Input input, @NonNull StateFactory factory);

    /**
     * once the fsm changes states, update player's UI components.
     * @param controller container/wrapper for all the necessary player UI view
     * @param movieMedia the source of movie
     * @param adMedia the source of ad
     */
    void updatePlayerUI(@NonNull PlayerUIController controller, @NonNull MediaModel movieMedia, @Nullable MediaModel adMedia);

}
