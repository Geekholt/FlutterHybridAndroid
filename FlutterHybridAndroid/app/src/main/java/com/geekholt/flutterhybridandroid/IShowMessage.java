package com.geekholt.flutterhybridandroid;

/**
 * @author 吴灏腾
 * @date 2020/8/17
 * @describe TODO
 */

public interface IShowMessage {
    void onShowMessage(String message);
    void sendMessage(String message, boolean useEventChannel);
}
