package android.widget;

import android.content.Context;
import android.util.AttributeSet;

import de.absoluteco.icon_font_android.Iconify;

/**
 * Created by Vincent.VanZyl on 2015/04/14.
 */
public class IconButton extends Button {
    public IconButton(Context context) {
        super(context);
        init();
    }

    public IconButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public IconButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        if (!isInEditMode())
            Iconify.addIcons(this);
        else
            this.setText(this.getText());
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        super.setText(Iconify.compute(text), type);
    }
}
