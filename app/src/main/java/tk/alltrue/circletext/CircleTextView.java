package tk.alltrue.circletext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class CircleTextView extends View {
    private Paint mPaint;
    private Paint mTextPaint;
    private Path mCirclePath;

    public CircleTextView(Context context) {
        super(context);
        mPaint = new Paint();
        mTextPaint = new Paint();
        mCirclePath = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        setBackgroundResource(R.drawable.background);
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.STROKE);

        mPaint.setStrokeWidth(2.0f);
        mPaint.setAntiAlias(true);

        mTextPaint.setTextSize(72);
        mTextPaint.setAntiAlias(true);
        mTextPaint.setColor(Color.WHITE);

        mCirclePath.addCircle(360,360, 330, Path.Direction.CW);

        canvas.drawPath(mCirclePath, mPaint);
        canvas.drawTextOnPath("Text inside a circle!", mCirclePath,0, 32, mTextPaint);

        setLayerType(View.LAYER_TYPE_SOFTWARE, null);
    }
}
