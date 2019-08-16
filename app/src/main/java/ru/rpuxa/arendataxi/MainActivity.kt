package ru.rpuxa.arendataxi

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        private const val START_URL = "https://arenda-taxi.com/"
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webview.webViewClient = WebViewClient()
        webview.webChromeClient = WebChromeClient()
        webview.settings.javaScriptEnabled = true
        webview.settings.domStorageEnabled = true
        webview.settings.allowFileAccessFromFileURLs = true
        webview.loadUrl(START_URL)
    }

    override fun onBackPressed() {
        if (webview.canGoBack())
            webview.goBack()
    }
}
