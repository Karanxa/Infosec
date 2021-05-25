package com.karanxa.info_sec.MAIN;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import com.karanxa.info_sec.R;

public class Linux extends AppCompatActivity {


    ListView listView;
    ArrayAdapter<String > adapter;
    String[] listItem;
    WebView webView;
    ProgressBar progressBar;
    TextView textView;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linux);


        listView = (ListView) findViewById(R.id.listView);
        listView = (ListView) findViewById(R.id.listView);
        listItem = getResources().getStringArray(R.array.Linux);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
        listView.setAdapter(adapter);
        webView = (WebView) findViewById(R.id.webview);
        textView = findViewById(R.id.textview);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setVisibility(View.INVISIBLE);
        textView.setVisibility(View.INVISIBLE);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                if (position ==  0) {
                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Linux.client());

                    WebSettings ws = webView.getSettings();
                    ws.setJavaScriptEnabled(true);
                    webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                    webView.clearCache(true);
                    webView.clearHistory();

                    webView.setDownloadListener(new DownloadListener() {
                        public void onDownloadStart(String url, String userAgent,
                                                    String contentDisposition, String mimetype,
                                                    long contentLength) {
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                    });
                    webView.loadUrl("https://www.linuxtrainingacademy.com/what-is-linux/");



                }



                if (position ==  1) {

                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Linux.client());

                    WebSettings ws = webView.getSettings();
                    ws.setJavaScriptEnabled(true);
                    webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                    webView.clearCache(true);
                    webView.clearHistory();

                    webView.setDownloadListener(new DownloadListener() {
                        public void onDownloadStart(String url, String userAgent,
                                                    String contentDisposition, String mimetype,
                                                    long contentLength) {
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                    });
                    webView.loadUrl("https://techlog360.com/a-z-kali-linux-commands/");
                }

                if (position ==  2) {
                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Linux.client());

                    WebSettings ws = webView.getSettings();
                    ws.setJavaScriptEnabled(true);
                    webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                    webView.clearCache(true);
                    webView.clearHistory();

                    webView.setDownloadListener(new DownloadListener() {
                        public void onDownloadStart(String url, String userAgent,
                                                    String contentDisposition, String mimetype,
                                                    long contentLength) {
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                    });
                    webView.loadUrl("http://docs.google.com/document/d/1K1YU_NUMZ3UjZJy33fFDY7InLSLXUX3pbSPlwVT8yHA/export?format=doc");

                }

                if (position ==  3) {
                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Linux.client());

                    WebSettings ws = webView.getSettings();
                    ws.setJavaScriptEnabled(true);
                    webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                    webView.clearCache(true);
                    webView.clearHistory();

                    webView.loadUrl("https://drive.google.com/file/d/1EknxfGD502uYBnr-fhL99vXUe2O9oi7g/view?usp=sharing");

                }


                if (position ==  4) {
                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Linux.client());

                    WebSettings ws = webView.getSettings();
                    ws.setJavaScriptEnabled(true);
                    webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                    webView.clearCache(true);
                    webView.clearHistory();

                    webView.loadUrl("https://www.maketecheasier.com/copy-paste-files-linux-command-line/");
                }
                if (position ==  5) {
                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Linux.client());

                    WebSettings ws = webView.getSettings();
                    ws.setJavaScriptEnabled(true);
                    webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                    webView.clearCache(true);
                    webView.clearHistory();

                    webView.loadUrl("https://linuxize.com/post/how-to-move-files-in-linux-with-mv-command/");
                }

                if (position ==  6) {
                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Linux.client());

                    WebSettings ws = webView.getSettings();
                    ws.setJavaScriptEnabled(true);
                    webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                    webView.clearCache(true);
                    webView.clearHistory();

                    webView.loadUrl("https://linuxize.com/post/how-to-remove-files-and-directories-using-linux-command-line/");
                }
                if (position ==  7) {
                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Linux.client());

                    WebSettings ws = webView.getSettings();
                    ws.setJavaScriptEnabled(true);
                    webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                    webView.clearCache(true);
                    webView.clearHistory();

                    webView.loadUrl("https://linuxize.com/post/how-to-use-apt-command/");
                }

                if (position ==  8) {
                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Linux.client());

                    WebSettings ws = webView.getSettings();
                    ws.setJavaScriptEnabled(true);
                    webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                    webView.clearCache(true);
                    webView.clearHistory();

                    webView.loadUrl("https://maker.pro/linux/projects/how-to-archive-files-and-directories-in-linux");
                }


                if (position ==  9) {
                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Linux.client());

                    WebSettings ws = webView.getSettings();
                    ws.setJavaScriptEnabled(true);
                    webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                    webView.clearCache(true);
                    webView.clearHistory();

                    webView.loadUrl("https://www.reddit.com/r/Kalilinux/");
                }

                if (position ==  10) {
                    getSupportActionBar().hide();

                    //progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    //webView.setWebViewClient(new Linux.client());
                    textView.setVisibility(View.VISIBLE);
                    //WebSettings ws = webView.getSettings();
                    //ws.setJavaScriptEnabled(true);
                    //webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                    //webView.clearCache(true);
                    //webView.clearHistory();

                    //webView.loadUrl("https://techlog360.com/a-z-kali-linux-commands/");
                }

            }
        });






    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState )
    {
        super.onSaveInstanceState(outState);
        webView.saveState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        webView.restoreState(savedInstanceState);
    }

    private class MyChrome extends WebChromeClient {

        private View mCustomView;
        private WebChromeClient.CustomViewCallback mCustomViewCallback;
        protected FrameLayout mFullscreenContainer;
        private int mOriginalOrientation;
        private int mOriginalSystemUiVisibility;

        MyChrome() {}

        public Bitmap getDefaultVideoPoster()
        {
            if (mCustomView == null) {
                return null;
            }
            return BitmapFactory.decodeResource(getApplicationContext().getResources(), 2130837573);
        }

        public void onHideCustomView()
        {
            ((FrameLayout)getWindow().getDecorView()).removeView(this.mCustomView);
            this.mCustomView = null;
            getWindow().getDecorView().setSystemUiVisibility(this.mOriginalSystemUiVisibility);
            setRequestedOrientation(this.mOriginalOrientation);
            this.mCustomViewCallback.onCustomViewHidden();
            this.mCustomViewCallback = null;
        }

        public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
        {
            if (this.mCustomView != null)
            {
                onHideCustomView();
                return;
            }
            this.mCustomView = paramView;
            this.mOriginalSystemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
            this.mOriginalOrientation = getRequestedOrientation();
            this.mCustomViewCallback = paramCustomViewCallback;
            ((FrameLayout)getWindow().getDecorView()).addView(this.mCustomView, new FrameLayout.LayoutParams(-1, -1));
            getWindow().getDecorView().setSystemUiVisibility(3846);
        }
    }




    private class client extends WebViewClient {


        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String url) {
            return false;
        }

        @Override
        public void onReceivedError(WebView view, int errorCode,
                                    String description, String failingUrl) {
            // TODO Auto-generated method stub

            //super.onReceivedError(view, errorCode, description, failingUrl);
        }
        @Override
        public void onPageFinished(WebView view, String url) {
            // TODO Auto-generated method stub
            super.onPageFinished(view, url);

            progressBar.setVisibility(View.GONE);
        }


    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == android.view.KeyEvent.KEYCODE_BACK) && this.webView.canGoBack()) {
            this.webView.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        MenuItem searchViewItem = menu.findItem(R.id.app_bar_search);
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchViewItem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchView.clearFocus();
             /*   if(list.contains(query)){
                    adapter.getFilter().filter(query);
                }else{
                    Toast.makeText(MainActivity.this, "No Match found",Toast.LENGTH_LONG).show();
                }*/
                return false;

            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }


}

