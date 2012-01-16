package de.androidbuch.amando.gui;


import java.io.InputStream;

import de.androidbuch.amando.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.webkit.WebView;

public class HilfeAnzeigen extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.hilfe_anzeigen);
//		setContentView(findViewById(R.layout.hilfe_anzeigen));

		
		final WebView view = (WebView)findViewById(R.id.webview);
		view.getSettings().setJavaScriptEnabled(true);
		initialisiereWebKit(view,this);
		view.bringToFront();
		
	}
		

	private void initialisiereWebKit(WebView view, Context context) {
		
		final String mimeType = "text/html";
		final String encoding = "UTF-8";
		String htmldata;
		int contextMenueId = R.raw.hilfe_komplett;
		InputStream is = context.getResources().openRawResource(contextMenueId);
		
		try{
			if(is != null && is.available() > 0){
				final byte[] bytes = new byte[is.available()];
				is.read(bytes);
				htmldata= new String(bytes);
				view.loadDataWithBaseURL(null, htmldata, mimeType, encoding, null);
			}			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
