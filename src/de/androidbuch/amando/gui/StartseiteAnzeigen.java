package de.androidbuch.amando.gui;

import de.androidbuch.amando.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;

public class StartseiteAnzeigen extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.startseite_anzeigen);
		
		registerForContextMenu(findViewById(R.id.sf_starte_geokontakte));
		
		// setContentView(R.layout.);
		
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.hauptmenue, menu);
		
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
		
		case R.id.opt_einstellungenBearbeiten:
			return true;
		
		case R.id.opt_hilfe:
			return true;
		case R.id.opt_amandoBeenden:
			finish();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}	
		
	}	
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.sf_starte_geokontakte){
			getMenuInflater().inflate(R.menu.startseite_contextmenue, menu);
		}
		
		super.onCreateContextMenu(menu, v, menuInfo);	
	}
	
	  @Override
	  public boolean onContextItemSelected(MenuItem item) {
	    if (item.getItemId() ==
	        R.id.opt_geokontakt_verwalten_hilfe) {  
	      final Intent intent = new Intent(this,
	    		  HilfeAnzeigen.class);
	      startActivity(intent);
	      return true;
	    }
	    return super.onContextItemSelected(item);   
	  }
	  
	  public void onClickGeokontakteVerwaltenI(final View sfNormal){
		  
		  
		  
	  }
	

}
