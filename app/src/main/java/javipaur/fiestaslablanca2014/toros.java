package javipaur.fiestaslablanca2014;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;


public class toros extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.toros);
    }
}
