package tk.alltrue.circletext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;


public class MyWidgetView extends View {

    final int MIN_WIDTH = 300; //476
    final int MIN_HEIGHT = 150;
    final int DEFAULT_COLOR = Color.WHITE;
    final int STROKE_WIDTH = 2;

    private int mColor;
    private Paint mPaint;

    public MyWidgetView(Context context) {
        super(context);
        init();
    }

    public MyWidgetView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyWidgetView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {
        setMinimumWidth(MIN_WIDTH);
        setMinimumHeight(MIN_HEIGHT);
        mColor = DEFAULT_COLOR;
        mPaint = new Paint();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(getSuggestedMinimumWidth(), getSuggestedMinimumHeight());
    }

    @Override
    protected void onDraw(Canvas canvas) {
        mPaint.setColor(mColor);
        mPaint.setStrokeWidth(STROKE_WIDTH);
        canvas.drawRect(5, 5, getWidth() - 5, getHeight() - 5, mPaint);
    }

    public void setColor(int color) {
        mColor = color;
    }
}
