package com.miraphonic.androidmaptest;

import android.os.Bundle;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

import android.widget.LinearLayout;
import android.widget.TextView;


public class AndroidMapTest extends MapActivity {
	MapView mapView;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        LinearLayout mainLayout = (LinearLayout)findViewById(R.id.mainlayout);
        mapView = (MapView) findViewById(R.id.mapview);
        //mapView.setBuiltInZoomControls(true);
        TextView tv = new TextView(this);
        tv.setText("Hello, Android");
        mainLayout.addView(tv);
    }
    
    @Override
    protected boolean isRouteDisplayed() {
        return false;
    }
}
