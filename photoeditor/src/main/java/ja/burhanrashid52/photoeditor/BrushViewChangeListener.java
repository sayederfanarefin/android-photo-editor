package ja.burhanrashid52.photoeditor;

/**
 * Created on 1/17/2018.
 * @author Sayed Erfan Arefin</a>
 * <p></p>
 */

interface BrushViewChangeListener {
    void onViewAdd(BrushDrawingView brushDrawingView);

    void onViewRemoved(BrushDrawingView brushDrawingView);

    void onStartDrawing();

    void onStopDrawing();
}
