package tk.alltrue.circletext;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

public class CustomViewDemoActivity extends Activity {

    private MyWidgetView mWidget1, mWidget2, mWidget3;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mWidget1 = (MyWidgetView)findViewById(R.id.mywidget1);
        mWidget2 = (MyWidgetView)findViewById(R.id.mywidget2);
        mWidget3 = (MyWidgetView)findViewById(R.id.mywidget3);

        mWidget2.setColor(Color.RED);
        mWidget3.setBackgroundColor(Color.GREEN);
        mWidget3.setColor(Color.BLUE);
    }
}