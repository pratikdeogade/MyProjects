package demo.com.demo.green;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

import demo.com.demo.R;

public class VideoActivity extends AppCompatActivity implements AdvancedWebView.Listener{

    WebView webView;
    Button btnVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
       // btnVideo= (Button) findViewById(R.id.btnVideo);
        webView= (WebView) findViewById(R.id.webView);

//        webView.getSettings().setLoadWithOverviewMode(true);
//       webView.getSettings().setUseWideViewPort(false);

        webView.getSettings().setJavaScriptEnabled(true);
//        webView.getSettings().setBuiltInZoomControls(true);
//        webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
//        webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);

        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.setWebViewClient(new myClient());
        webView.loadUrl("http://192.168.101.1:8037/VideoPlayer/cricket.html");

//
//        Uri uri = Uri.parse("http://192.168.101.1:8037/VideoPlayer/cricket.html");
//        CustomTabsIntent.Builder intentBuilder = new CustomTabsIntent.Builder();
//        intentBuilder.enableUrlBarHiding();
//        CustomTabsIntent customTabsIntent = intentBuilder.build();
//        customTabsIntent.launchUrl(VideoActivity.this, uri);



//        webView.setListener(this, this);
//        webView.setGeolocationEnabled(false);
//        webView.setMixedContentAllowed(true);
//        webView.setCookiesEnabled(true);
//        webView.setThirdPartyCookiesEnabled(true);
//        webView.setWebViewClient(new WebViewClient() {
//
//            @Override
//            public void onPageFinished(WebView view, String url) {
//                Toast.makeText(VideoActivity.this, "Finished loading", Toast.LENGTH_SHORT).show();
//            }
//
//        });
//        webView.setWebChromeClient(new WebChromeClient() {
//
//            @Override
//            public void onReceivedTitle(WebView view, String title) {
//                super.onReceivedTitle(view, title);
//                Toast.makeText(VideoActivity.this, title, Toast.LENGTH_SHORT).show();
//            }
//
//        });
//        webView.addHttpHeader("X-Requested-With", "");
//        webView.loadUrl("http://192.168.101.1:8037/VideoPlayer/cricket.html");


//        btnVideo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Uri uri = Uri.parse("http://192.168.101.1:8037/VideoPlayer/cricket.html");
//
//                CustomTabsIntent.Builder intentBuilder = new CustomTabsIntent.Builder();
//
//                intentBuilder.setToolbarColor(ContextCompat.getColor(VideoActivity.this,R.color.colorHotSatr));
//               // intentBuilder.setToolbarColor(Color.parseColor("FF88B95E"));
//
//                intentBuilder.setShowTitle(true);
//
//
//                intentBuilder.enableUrlBarHiding();
//                CustomTabsIntent customTabsIntent = intentBuilder.build();
//                customTabsIntent.launchUrl(VideoActivity.this, uri);
//            }
//        });

    }

    @Override
    public void onPageStarted(String url, Bitmap favicon) {

    }

    @Override
    public void onPageFinished(String url) {

    }

    @Override
    public void onPageError(int errorCode, String description, String failingUrl) {
        Toast.makeText(VideoActivity.this, description, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDownloadRequested(String url, String suggestedFilename, String mimeType, long contentLength, String contentDisposition, String userAgent) {

    }

    @Override
    public void onExternalPageRequest(String url) {

    }


    private class  myClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }


    }


}
