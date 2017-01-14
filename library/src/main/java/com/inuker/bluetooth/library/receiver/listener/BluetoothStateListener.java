package com.inuker.bluetooth.library.receiver.listener;

/**
 * Created by dingjikerbo on 2016/11/26.
 */

public abstract class BluetoothStateListener extends BluetoothClientListener {

    abstract void onBluetoothStateChanged(boolean openOrClosed);

    @Override
    public void onSyncInvoke(Object... args) {
        boolean openOrClosed = (boolean) args[0];
        onBluetoothStateChanged(openOrClosed);
    }
}
