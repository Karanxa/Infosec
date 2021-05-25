package com.karanxa.info_sec.MAIN;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import com.karanxa.info_sec.R;

public class Books extends AppCompatActivity {


    ListView listView;
    ArrayAdapter<String > adapter;
    String[] listItem;
    WebView webView;
    ProgressBar progressBar;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);


        listView = (ListView) findViewById(R.id.listView);
        listView = (ListView) findViewById(R.id.listView);
        listItem = getResources().getStringArray(R.array.Books);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
        listView.setAdapter(adapter);
        textView = findViewById(R.id.textview);
        webView = (WebView) findViewById(R.id.webview);
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
                    webView.setWebViewClient(new Books.client());

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
                    webView.loadUrl("https://drive.google.com/file/d/1Sf6IXGG4lsmmJOGw15fIfvjXu2iax5la/export?format=doc");

                }



                if (position ==  1) {
                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Books.client());

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
                    webView.loadUrl("https://drive.google.com/file/d/1Rw5DA5MpVvJrB4XLmWqO-U242Xp496Tg/view?usp=sharing");
                }

                if (position ==  2) {
                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Books.client());

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
                    webView.loadUrl("https://drive.google.com/file/d/1-QXMOk-DxzbmYs9QM5dpITtaGjLoWT8M/view?usp=sharing");
                }

                if (position ==  3) {
                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Books.client());

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
                    webView.loadUrl("https://drive.google.com/file/d/1tZXRqZ9iHASbz1aeScSrUOwWg30p47Kw/view?usp=sharing");
                }


                if (position ==  4) {
                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Books.client());

                    WebSettings ws = webView.getSettings();
                    ws.setJavaScriptEnabled(true);
                    webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                    webView.clearCache(true);
                    webView.clearHistory();

                    webView.loadUrl("https://drive.google.com/file/d/1aPNP2jq3UVrDT2v4dqNVK6zl0SRhM2JF/view?usp=sharing");
                }
                if (position ==  5) {
                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Books.client());

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
                    webView.loadUrl("https://drive.google.com/file/d/1rGDOjPUT3k2DzwslTu_wlVOup77zA4SO/view?usp=sharing");
                }

                if (position ==  6) {
                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Books.client());

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
                    webView.loadUrl("https://drive.google.com/file/d/1KFOwtmzvwApsbOJwSsbLs9n_qHviFRz5/view?usp=sharing");
                }
                if (position ==  7) {
                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Books.client());

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
                    webView.loadUrl("https://drive.google.com/file/d/1NCrsqbgWGJYXcmyN_T9PC4h6wJ9LADDu/view?usp=sharing");
                }

                if (position ==  8) {
                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Books.client());

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
                    webView.loadUrl("https://drive.google.com/file/d/17gANwYG8Z8o8U_djEjTiSXqgY14fr9th/view?usp=sharing");
                }


                if (position ==  9) {
                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Books.client());

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
                    webView.loadUrl("https://drive.google.com/file/d/1DjDhvnejCJf3Je5GvwvCk9pR04WARs1V/view?usp=sharing ");
                }
                if (position ==  10) {
                    getSupportActionBar().hide();

                    progressBar.setVisibility(View.VISIBLE);
                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Books.client());

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
                    webView.loadUrl("https://drive.google.com/file/d/17HVPtqEbN4Ld7FZZSkLcyRFGVM2crPlV/view?usp=sharing");
                }

            }
        });



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
            Toast.makeText(Books.this, "Oh no! " + description, Toast.LENGTH_SHORT).show();
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

