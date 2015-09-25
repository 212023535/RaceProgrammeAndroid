package com.example.rudizeeman.raceprogramme;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    //Declare and populate array
    String [] locationsArray = new String[]{"Killarney Motor Racing Complex","Kyalami GP Circuit","Zwartkops Raceway","Aldo Scribante Circuit",
            "Phakisa Circuit","Midvaal Raceway"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        final Spinner spinner = (Spinner)findViewById(R.id.spnTrack);

        //Declaring array adapter and populating with array_locations
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, locationsArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Populate spinner with array adapter
        spinner.setAdapter(adapter);

        spinner.setPrompt("Select Track");

        return super.onCreateOptionsMenu(menu);
    }

    public void sendMessage(View v) {

        final Spinner spinner = (Spinner)findViewById(R.id.spnTrack);
        //int i =  spinner.getSelectedItemPosition();
        //String selection = locationsArray[i];

        String select = spinner.getSelectedItem().toString();

        Intent intent = new Intent(getApplicationContext(),SelectClass.class);
        intent.putExtra("data", select);
        startActivity(intent);
        Intent intent1 = new Intent(getApplication(),Schedule.class);
        intent1.putExtra("data",select);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);*/

        switch(id)
        {
            case R.id.action_exit:
            {
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(0);
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
