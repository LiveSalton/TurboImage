package com.salton123.jpeg;

import android.graphics.Bitmap;

/**
 * User: newSalton@outlook.com
 * Date: 2019/4/27 19:08
 * ModifyTime: 19:08
 * Description:
 */
public class JpegTurbo {
    public native static int compressBitmap(Bitmap bitmap, int quality, String saveFile);
}
