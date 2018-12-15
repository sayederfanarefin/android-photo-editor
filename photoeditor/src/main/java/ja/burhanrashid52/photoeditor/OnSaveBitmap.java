package ja.burhanrashid52.photoeditor;

import android.graphics.Bitmap;

/**
 * @author Sayed Erfan Arefin</a>
 * @version 1.0.0
 * @since 5/21/2018
 */
public interface OnSaveBitmap {
    void onBitmapReady(Bitmap saveBitmap);

    void onFailure(Exception e);
}
