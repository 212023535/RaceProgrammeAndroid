package com.example.rudizeeman.raceprogramme;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final String dataString = getIntent().getStringExtra("data");
        if(dataString.equalsIgnoreCase("Sports & GT"))
        {
            setContentView(R.layout.activity_drivers_kil_sgt);
        }
        else if(dataString.equalsIgnoreCase("Masters V8 Series"))
        {
            setContentView(R.layout.activity_drivers_kil_v8m);
        }
        else if(dataString.equalsIgnoreCase("Fine Cars"))
        {
            setContentView(R.layout.activity_drivers_kil_fine_cars);
        }
        else if(dataString.equalsIgnoreCase("GTi Challenge"))
        {
            setContentView(R.layout.activity_drivers_kil_gti);
        }
        else if(dataString.equalsIgnoreCase("Supercars"))
        {
            setContentView(R.layout.activity_drivers_kil_supercars);
        }
        else if(dataString.equalsIgnoreCase("Classic Cars"))
        {
            setContentView(R.layout.activity_drivers_kil_classic);
        }
        else if(dataString.equalsIgnoreCase("Clubmans"))
        {
            setContentView(R.layout.activity_drivers_kil_clubmans);
        }
        else if(dataString.equalsIgnoreCase("Formula Libre"))
        {
            setContentView(R.layout.activity_drivers_kil_formula_libre);
        }else if(dataString.equalsIgnoreCase("Superbikes"))
        {
            setContentView(R.layout.activity_drivers_kil_superbikes);
        }else if(dataString.equalsIgnoreCase("Superbikes Class B"))
        {
            setContentView(R.layout.activity_drivers_kil_superbikes);
        }else if(dataString.equalsIgnoreCase("Formula Monoposto"))
        {
            setContentView(R.layout.activity_drivers_kil_formula_libre);
        }else if(dataString.equalsIgnoreCase("Modified Production Cars"))
        {
            setContentView(R.layout.activity_drivers_kil_v8m);
        }else if(dataString.equalsIgnoreCase("Libra Productions Silver Cup"))
        {
            setContentView(R.layout.activity_drivers_kil_gti);
        }
        else if(dataString.equalsIgnoreCase("Big Boss Auto Super Saloons"))
        {
            setContentView(R.layout.activity_drivers_kil_fine_cars);
        }else if(dataString.equalsIgnoreCase("BMW Racing Series"))
        {
            setContentView(R.layout.activity_drivers_kil_clubmans);
        }else if(dataString.equalsIgnoreCase("GT Class"))
        {
            setContentView(R.layout.activity_drivers_kil_sgt);
        }else if(dataString.equalsIgnoreCase("Sports Class"))
        {
            setContentView(R.layout.activity_drivers_kil_supercars);
        }else if(dataString.equalsIgnoreCase("111 Sports & Saloons class A"))
        {
            setContentView(R.layout.activity_drivers_kil_clubmans);
        }
        else if(dataString.equalsIgnoreCase("111 Sports & Saloons class B"))
        {
            setContentView(R.layout.activity_drivers_kil_gti);
        }else if(dataString.equalsIgnoreCase("111 Sports & Saloons class C"))
        {
            setContentView(R.layout.activity_drivers_kil_classic);
        }else if(dataString.equalsIgnoreCase("120 min Bridgestone Production Car A"))
        {
            setContentView(R.layout.activity_drivers_kil_fine_cars);
        }else if(dataString.equalsIgnoreCase("Alfa Romeo Trofeo /Porsche"))
        {
            setContentView(R.layout.activity_drivers_kil_sgt);
        }else if(dataString.equalsIgnoreCase("Super Saloons"))
        {
            setContentView(R.layout.activity_drivers_kil_clubmans);
        }
        else if(dataString.equalsIgnoreCase("Streetcar Racing Series"))
        {
            setContentView(R.layout.activity_drivers_kil_gti);
        }else if(dataString.equalsIgnoreCase("Historic Racing"))
        {
            setContentView(R.layout.activity_drivers_kil_classic);
        }else if(dataString.equalsIgnoreCase("Production Cars")) {
            setContentView(R.layout.activity_drivers_kil_clubmans);
        }



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TabHost tabHost = (TabHost)findViewById(R.id.tabHost);

        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("Drivers");
        tabSpec.setContent(R.id.tabDrivers);
        tabSpec.setIndicator("Drivers");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("Grid");
        tabSpec.setContent(R.id.tabGrid);
        tabSpec.setIndicator("Grid");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("Lap Times");
        tabSpec.setContent(R.id.tabLapTimes);
        tabSpec.setIndicator("Lap Times");
        tabHost.addTab(tabSpec);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch(id)
        {
            case R.id.action_exit:
            {
                finish();
            }
            case R.id.action_about:
            {
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setMessage("Created by: RD Zeeman" + "\n" + "rdzeeman@gmail.com");
                alert.setTitle("ABOUT");
                alert.setPositiveButton("OK", null);
                alert.setCancelable(true);
                alert.create().show();

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                }).create();
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
