package colorchecker.icon.tanjo.in.iconcolorchecker;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {

    private ImageView mIconView;
    private TextView mTextView;

    private final int BLUE_COLOR = 0xFF0000FF;
    private final int RED_COLOR = 0xFF00FF00;
    private final int GREEN_COLOR = 0xFFFF0000;
    private final int BLACK_COLOR = 0xFF000000;
    private final int WHITE_COLOR = 0xFFFFFFFF;

    private int mStatus = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        mIconView = (ImageView) findViewById(R.id.test_icon_view);
        mIconView.setOnClickListener(this);
        mTextView = (TextView) findViewById(R.id.test_image_title);
    }

    @Override
    public void onClick(View v) {

        switch (mStatus % 6) {
            case 0:
                mIconView.clearColorFilter();
                break;
            case 1:
                mIconView.setColorFilter(BLUE_COLOR, PorterDuff.Mode.SRC_IN);
                break;
            case 2:
                mIconView.setColorFilter(RED_COLOR, PorterDuff.Mode.SRC_IN);
                break;
            case 3:
                mIconView.setColorFilter(GREEN_COLOR, PorterDuff.Mode.SRC_IN);
                break;
            case 4:
                mIconView.setColorFilter(BLACK_COLOR, PorterDuff.Mode.SRC_IN);
                break;
            case 5:
                mIconView.setColorFilter(WHITE_COLOR, PorterDuff.Mode.SRC_IN);
                break;
        }

        switch (mStatus) {
            case 0:
                mIconView.setImageResource(R.drawable.test_image);
                mTextView.setText(R.string.test_image);
                break;
            case 6:
                mIconView.setImageResource(R.drawable.test_image_chroma_green);
                mTextView.setText(R.string.test_image_chroma_green);
                break;
            case 12:
                mIconView.setImageResource(R.drawable.test_image_chroma_green_png_24);
                mTextView.setText(R.string.test_image_chroma_green_png_24);
                break;
            case 18:
                mIconView.setImageResource(R.drawable.test_image_chroma_green_png_8);
                mTextView.setText(R.string.test_image_chroma_green_png_8);
                break;
            case 24:
                mIconView.setImageResource(R.drawable.test_image_gray);
                mTextView.setText(R.string.test_image_gray);
                break;
            case 30:
                mIconView.setImageResource(R.drawable.test_image_gray_png_8);
                mTextView.setText(R.string.test_image_gray_png_8);
                break;
            case 36:
                mIconView.setImageResource(R.drawable.test_image_gray_png_24);
                mTextView.setText(R.string.test_image_gray_png_24);
                break;
            case 42:
                mIconView.setImageResource(R.drawable.test_image_png_8);
                mTextView.setText(R.string.test_image_png_8);
                break;
            case 48:
                mIconView.setImageResource(R.drawable.test_image_png_24);
                mTextView.setText(R.string.test_image_png_24);
                break;
            case 54:
                mStatus = -1;
                break;
        }
        mStatus++;

    }
}
