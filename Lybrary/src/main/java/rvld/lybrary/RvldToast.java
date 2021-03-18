package rvld.lybrary;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RvldToast {
    LayoutInflater inflater;
    View layout;
    ImageView image;
    TextView tText;
    Toast toast;

    public RvldToast(Context context, View view, String text, int imageId, int duration) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        layout = inflater.inflate(R.layout.toast_layout, (ViewGroup) view.findViewById(R.id.toast_layout_root));

        image = (ImageView) layout.findViewById(R.id.image);
        image.setImageResource(imageId);
        tText = (TextView) layout.findViewById(R.id.text);
        tText.setText((CharSequence) text);

        toast = new Toast(context);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }
}
