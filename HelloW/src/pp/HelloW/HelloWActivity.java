package pp.HelloW;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class HelloWActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView myText = (TextView)findViewById(R.id.myText);
        myText.setText("我的第一个文本test");
        Button myButton = (Button)findViewById(R.id.myButton);
        myButton.setText("我的第一个按钮test");
    }
}