package com.example.rudizeeman.raceprogramme;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

public class Schedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();
        String dataString = getIntent().getStringExtra("data");
        if (extras != null) {
            dataString = extras.getString("data");
        }

        if(dataString.equalsIgnoreCase("Killarney Motor Racing Complex"))
        {
            setContentView(R.layout.activity_schedule_killarney);
        }
        else if(dataString.equalsIgnoreCase("Zwartkops Raceway"))
        {
            setContentView(R.layout.activity_schedule_zwartkops);
        }
        else if(dataString.equalsIgnoreCase("Aldo Scribante Circuit"))
        {
            setContentView(R.layout.activity_schedule_aldo_scribante);
        }
        else if(dataString.equalsIgnoreCase("Phakisa Circuit"))
        {
            setContentView(R.layout.activity_schedule_phakisa);
        }
        else if(dataString.equalsIgnoreCase("Midvaal Raceway"))
        {
            setContentView(R.layout.activity_schedule_midvaal);
        }
        else if (dataString.equalsIgnoreCase(""))
        {
            setContentView(R.layout.activity_schedule_midvaal);
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_schedule, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
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
