package com.karanxa.info_sec.MAIN;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import com.karanxa.info_sec.R;

public class Websites extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String > adapter;
    String[] listItem;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_websites);

        listView = (ListView) findViewById(R.id.listView);
        listView = (ListView) findViewById(R.id.listView);
        listItem = getResources().getStringArray(R.array.Hacking);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==  0) {
                    getSupportActionBar().hide();

                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Websites.client());

                    WebSettings ws = webView.getSettings();
                    ws.setJavaScriptEnabled(true);
                    webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                    webView.clearCache(true);
                    webView.clearHistory();

                    webView.loadUrl("https://maker.pro/linux/projects/how-to-archive-files-and-directories-in-linux");
                }

                if (position ==  1) {
                    getSupportActionBar().hide();

                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Websites.client());

                    WebSettings ws = webView.getSettings();
                    ws.setJavaScriptEnabled(true);
                    webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                    webView.clearCache(true);
                    webView.clearHistory();

                    webView.loadUrl("https://maker.pro/linux/projects/how-to-archive-files-and-directories-in-linux");
                }

                if (position ==  2) {
                    getSupportActionBar().hide();

                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Websites.client());

                    WebSettings ws = webView.getSettings();
                    ws.setJavaScriptEnabled(true);
                    webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                    webView.clearCache(true);
                    webView.clearHistory();

                    webView.loadUrl("https://maker.pro/linux/projects/how-to-archive-files-and-directories-in-linux");
                }

                if (position ==  3) {
                    getSupportActionBar().hide();

                    listView.setVisibility(View.INVISIBLE);
                    webView.setWebViewClient(new Websites.client());

                    WebSettings ws = webView.getSettings();
                    ws.setJavaScriptEnabled(true);
                    webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                    webView.clearCache(true);
                    webView.clearHistory();

                    webView.loadUrl("https://maker.pro/linux/projects/how-to-archive-files-and-directories-in-linux");
                }


            }
        });


    }

    private class client extends WebViewClient {

        public boolean shouldOverrideUrlLoading(WebView webView, String url) {
            return false;
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





