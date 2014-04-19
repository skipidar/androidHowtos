package com.binaryme.helloDualScrollable;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

public class HelloDualScrollable extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mscroll);
        
        // TabActivity's method
        TabHost tabHost = getTabHost();
        
        // distribute horizontal views among tabs
        tabHost.addTab(tabHost.newTabSpec("Horizont1")
        		.setIndicator("horizont")
        		.setContent(R.id.horizontalScrollView));
        
        
        //get the Content View for adding text
        LinearLayout content = (LinearLayout) findViewById(R.id.llContentHorizontal); 
        
        for (int i=0; i<20; i++){
        	TextView tv = new TextView(this);
        	tv.setText("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
        	tv.setLayoutParams(new LayoutParams(
        			 LayoutParams.MATCH_PARENT,
        			 LayoutParams.WRAP_CONTENT));

        	content.addView(tv);
        }
    }

}