package com.miraphonic.androidmaptest;

import android.os.Bundle;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

public class AndroidMapTest extends MapActivity {
	MapView mapView;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mapView = (MapView) findViewById(R.id.mapview);
        mapView.setBuiltInZoomControls(true);
        
    }
    
    @Override
    protected boolean isRouteDisplayed() {
        return false;
    }
}
