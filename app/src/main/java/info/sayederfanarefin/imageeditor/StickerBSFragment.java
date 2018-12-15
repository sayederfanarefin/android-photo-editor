package info.sayederfanarefin.imageeditor;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import info.sayederfanarefin.imageeditor.R;

public class StickerBSFragment extends BottomSheetDialogFragment {

    public StickerBSFragment() {
        // Required empty public constructor
    }

    private StickerListener mStickerListener;

    public void setStickerListener(StickerListener stickerListener) {
        mStickerListener = stickerListener;
    }

    public interface StickerListener {
        void onStickerClick(Bitmap bitmap);
    }

    private BottomSheetBehavior.BottomSheetCallback mBottomSheetBehaviorCallback = new BottomSheetBehavior.BottomSheetCallback() {

        @Override
        public void onStateChanged(@NonNull View bottomSheet, int newState) {
            if (newState == BottomSheetBehavior.STATE_HIDDEN) {
                dismiss();
            }

        }

        @Override
        public void onSlide(@NonNull View bottomSheet, float slideOffset) {
        }
    };


    @SuppressLint("RestrictedApi")
    @Override
    public void setupDialog(Dialog dialog, int style) {
        super.setupDialog(dialog, style);
        View contentView = View.inflate(getContext(), R.layout.fragment_bottom_sticker_emoji_dialog, null);
        dialog.setContentView(contentView);
        CoordinatorLayout.LayoutParams params = (CoordinatorLayout.LayoutParams) ((View) contentView.getParent()).getLayoutParams();
        CoordinatorLayout.Behavior behavior = params.getBehavior();

        if (behavior != null && behavior instanceof BottomSheetBehavior) {
            ((BottomSheetBehavior) behavior).setBottomSheetCallback(mBottomSheetBehaviorCallback);
        }
        ((View) contentView.getParent()).setBackgroundColor(getResources().getColor(android.R.color.transparent));
        RecyclerView rvEmoji = contentView.findViewById(R.id.rvEmoji);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 3);
        rvEmoji.setLayoutManager(gridLayoutManager);
        StickerAdapter stickerAdapter = new StickerAdapter();
        rvEmoji.setAdapter(stickerAdapter);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    public class StickerAdapter extends RecyclerView.Adapter<StickerAdapter.ViewHolder> {

        int[] stickerList = new int[]{
                R.drawable.aa,
                R.drawable.bb ,
                R.drawable.a1,
                R.drawable.a2,
                R.drawable.a3,
                R.drawable.a4,
                R.drawable.a5,
                R.drawable.a6,
                R.drawable.a7,
                R.drawable.a8,
                R.drawable.a9,
                R.drawable.a10,
                R.drawable.a11,
                R.drawable.a12,
                R.drawable.a13,
                R.drawable.a14,
                R.drawable.a15,
                R.drawable.a16,
                R.drawable.a17,
                R.drawable.a18,
                R.drawable.a19,
                R.drawable.a20,
                R.drawable.a21,
                R.drawable.a22,
                R.drawable.a23,
                R.drawable.a24,
                R.drawable.a25,
                R.drawable.a26,
                R.drawable.a27,
                R.drawable.a29,
                R.drawable.a30,
                R.drawable.a31,
                R.drawable.a32,
                R.drawable.a33,
                R.drawable.a34,
                R.drawable.a35,
                R.drawable.a36,
                R.drawable.a37,
                R.drawable.a38,
                R.drawable.a39,
                R.drawable.a40,
                R.drawable.a41,
                R.drawable.a42,
                R.drawable.a43,
                R.drawable.a44,
                R.drawable.a45,
                R.drawable.a46,
                R.drawable.a47,
                R.drawable.a48,
                R.drawable.a49,
                R.drawable.a50,
                R.drawable.a51,
                R.drawable.a52,
                R.drawable.a53,
                R.drawable.a54,
                R.drawable.a55,
                R.drawable.a56,
                R.drawable.a57,
                R.drawable.a58,
                R.drawable.a59,
                R.drawable.a60,
                R.drawable.a61,
                R.drawable.a62,
                R.drawable.a63,
                R.drawable.a64,
                R.drawable.a65,
                R.drawable.a66,
                R.drawable.a67,
                R.drawable.a68,
                R.drawable.a69,
                R.drawable.a70,
                R.drawable.a71,
                R.drawable.a72,
                R.drawable.a73,
                R.drawable.a74,
                R.drawable.a75,
                R.drawable.a76,
                R.drawable.a77,
                R.drawable.a78,
                R.drawable.a79,
                R.drawable.a80,
                R.drawable.a81,
                R.drawable.a82,
                R.drawable.a83,
                R.drawable.a84,
                R.drawable.a85,
                R.drawable.a86,
                R.drawable.a87,
                R.drawable.a88,
                R.drawable.a89,
                R.drawable.a90,
                R.drawable.a91,
                R.drawable.a92,
                R.drawable.a93,
                R.drawable.a94,
                R.drawable.a95,
                R.drawable.a96,
                R.drawable.a97,
                R.drawable.a98,
                R.drawable.a99,
                R.drawable.a100,
                R.drawable.a101,
                R.drawable.a102,
                R.drawable.a103,
                R.drawable.a104,
                R.drawable.a105,
                R.drawable.a106,
                R.drawable.a107,
                R.drawable.a108,
                R.drawable.a109,
                R.drawable.a110,
                R.drawable.a111,
                R.drawable.a112,
                R.drawable.a113,
                R.drawable.a114,
                R.drawable.a115,
                R.drawable.a116,
                R.drawable.a117,
                R.drawable.a118,
                R.drawable.a119,
                R.drawable.a120
//                R.drawable.a121,
//                R.drawable.a122,
//                R.drawable.a123,
//                R.drawable.a124,
//                R.drawable.a125,
//                R.drawable.a126,
//                R.drawable.a127,
//                R.drawable.a128,
//                R.drawable.a129
        };

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_sticker, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.imgSticker.setImageResource(stickerList[position]);
        }

        @Override
        public int getItemCount() {
            return stickerList.length;
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            ImageView imgSticker;

            ViewHolder(View itemView) {
                super(itemView);
                imgSticker = itemView.findViewById(R.id.imgSticker);

                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (mStickerListener != null) {
                            mStickerListener.onStickerClick(
                                    BitmapFactory.decodeResource(getResources(),
                                            stickerList[getLayoutPosition()]));
                        }
                        dismiss();
                    }
                });
            }
        }
    }

    private String convertEmoji(String emoji) {
        String returnedEmoji = "";
        try {
            int convertEmojiToInt = Integer.parseInt(emoji.substring(2), 16);
            returnedEmoji = getEmojiByUnicode(convertEmojiToInt);
        } catch (NumberFormatException e) {
            returnedEmoji = "";
        }
        return returnedEmoji;
    }

    private String getEmojiByUnicode(int unicode) {
        return new String(Character.toChars(unicode));
    }
}