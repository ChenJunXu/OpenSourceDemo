package com.xu.opensourcelibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * 吐司工具类
 *
 * @author chenjunxu
 * @date 16/8/30
 */
public class ToastUtils {

    /**
     * 显示吐司
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
