package de.androidbuch.amando.gui;

import de.androidbuch.amando.R;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class GeoKontakteAuflisten extends ListActivity{
	
	private static final String[] NAMEN = new String[] {
		"Hans Wurst", "Peter Lustig", "Guido Knopp", "Andi R"
		};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.geokontakte_auflisten);
		
		
		
	}
	
	
	private void zeigeGeoKontakte(){
		
	}
	

}
