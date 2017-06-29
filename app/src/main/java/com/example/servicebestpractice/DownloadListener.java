package com.example.servicebestpractice;

/**
 * Created by 恋人星宇 on 2017/5/20.
 * 监听接口
 */

public interface DownloadListener {
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
