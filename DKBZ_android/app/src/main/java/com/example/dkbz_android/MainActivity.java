package com.example.dkbz_android;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
   private WebView web_View;
   private Button btn_ingles;
   private Button btn_español;
   private Button btn_portugues;





    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web_View = (WebView) findViewById(R. id. web_View);
        btn_ingles = (Button) findViewById(R. id. btn_ingles);
        btn_español= (Button) findViewById(R. id. btn_español);
        btn_portugues = (Button) findViewById(R. id. btn_portugues);

        web_View.getSettings().setJavaScriptEnabled(true);
        web_View.getSettings().setAppCacheEnabled(true);
        web_View.getSettings().setDatabaseEnabled(true);
        web_View.getSettings().setDomStorageEnabled(true);
        web_View.getSettings().setSupportZoom(true);
        web_View.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        web_View.getSettings().setBuiltInZoomControls(true);


        final WebSettings ajustesVisorWeb = web_View.getSettings();
        ajustesVisorWeb.setJavaScriptEnabled(true);



    btn_español.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick( View view ) {
            ClassConnection connection = new ClassConnection();

                web_View.loadUrl("http://dkbz-dummy-api.herokuapp.com?lang=esp");
        }
    });

        btn_ingles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view ) {
                ClassConnection connection = new ClassConnection();

                web_View.loadUrl("http://dkbz-dummy-api.herokuapp.com?lang=eng");

            }
        });

        btn_portugues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view ) {
                ClassConnection connection = new ClassConnection();
                web_View.loadUrl("http://dkbz-dummy-api.herokuapp.com?lang=por");

            }
        });

    }
}




