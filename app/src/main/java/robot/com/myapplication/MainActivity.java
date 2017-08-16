package robot.com.myapplication;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

import robot.com.baseapp.NumberActivity;

public class MainActivity extends NumberActivity{
    private static final String KEY_NUMBER = "number";
    WebView mWebView;
    Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
//        button = (Button) findViewById(R.id.btn);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String ipAddress = NetworkUtils.getIPAddress(true);
//                Toast.makeText(MainActivity.this, ipAddress, Toast.LENGTH_SHORT).show();
//            }
//        });

    }

}