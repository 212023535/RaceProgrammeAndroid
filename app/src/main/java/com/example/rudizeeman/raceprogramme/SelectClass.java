package com.example.rudizeeman.raceprogramme;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class SelectClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_class);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btnSchedule = (Button)findViewById(R.id.btnSchedule);
        Button btnGo = (Button)findViewById(R.id.btnGo);

        //Get the data string from previous activity
        final String dataString = getIntent().getStringExtra("data");

        Bundle bundle = getIntent().getExtras();



        btnSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),Schedule.class);
                intent2.putExtra("data",dataString);
                startActivity(intent2);
            }
        });

        //Declare and populate array
        String [] classesArrayKillarney = new String[]{"Sports & GT","Masters V8 Series","Fine Cars","GTi Challenge","Supercars","Classic Cars",
                                                        "Clubmans","Formula Libre","Superbikes","Superbikes Class B"};

        String [] classesArrayMidvaal = new String[]{"Formula Monoposto","Modified Production Cars","Libra Productions Silver Cup","Big Boss Auto Super Saloons"
                                                        ,"BMW Racing Series"};

        String [] classesArrayZwartkops = new String[]{"GT Class","Sports Class","111 Sports & Saloons class A","111 Sports & Saloons class B",
                                                        "111 Sports & Saloons class C","120 min Bridgestone Production Car A"};

        String [] classesArrayPhakisa = new String[]{"Alfa Romeo Trofeo /Porsche","Super Saloons","Silver Cup","Super Hatch","Inex Legends"};

        String [] classesArrayAldoScribante = new String[]{"Streetcar Racing Series","Historic Racing","Production Cars"};

        String [] classesArrayKyalami = new String[]{"Track under construction"};


        //if statement to populate the spinner depending on received string
        if(dataString.equalsIgnoreCase("Killarney Motor Racing Complex"))
        {
            //Declaring array adapter and populating with array_locations
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, classesArrayKillarney);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            //Decalre Spinner
            Spinner spinner = (Spinner) findViewById(R.id.spnClass);

            //Populate spinner with array adapter
            spinner.setAdapter(adapter);

            spinner.setPrompt("Select Class");
        }
            else if(dataString.equalsIgnoreCase("Zwartkops Raceway"))
            {
                //Declaring array adapter and populating with array_locations
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, classesArrayZwartkops);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                //Decalre Spinner
                Spinner spinner = (Spinner) findViewById(R.id.spnClass);

                //Populate spinner with array adapter
                spinner.setAdapter(adapter);

                spinner.setPrompt("Select Class");
            }
                else if(dataString.equalsIgnoreCase("Aldo Scribante Circuit"))
                {
                    //Declaring array adapter and populating with array_locations
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, classesArrayAldoScribante);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    //Decalre Spinner
                    Spinner spinner = (Spinner) findViewById(R.id.spnClass);

                    //Populate spinner with array adapter
                    spinner.setAdapter(adapter);

                    spinner.setPrompt("Select Class");
                }
                    else if(dataString.equalsIgnoreCase("Phakisa Circuit"))
                    {
                        //Declaring array adapter and populating with array_locations
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, classesArrayPhakisa);
                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        //Decalre Spinner
                        Spinner spinner = (Spinner) findViewById(R.id.spnClass);

                        //Populate spinner with array adapter
                        spinner.setAdapter(adapter);

                        spinner.setPrompt("Select Class");
                    }
                        else if(dataString.equalsIgnoreCase("Midvaal Raceway"))
                        {
                            //Declaring array adapter and populating with array_locations
                            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, classesArrayMidvaal);
                            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                            //Decalre Spinner
                            Spinner spinner = (Spinner) findViewById(R.id.spnClass);

                            //Populate spinner with array adapter
                            spinner.setAdapter(adapter);

                            spinner.setPrompt("Select Class");

                        }
                            else if(dataString.equalsIgnoreCase("Kyalami GP Circuit"))
                            {
                                //Declaring array adapter and populating with array_locations
                                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, classesArrayKyalami);
                                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                //Decalre Spinner
                                Spinner spinner = (Spinner) findViewById(R.id.spnClass);

                                //Populate spinner with array adapter
                                spinner.setAdapter(adapter);

                                spinner.setPrompt("Select Class");

                                btnGo.setEnabled(false);
                                btnSchedule.setEnabled(false);

                            }
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                final Spinner spinner = (Spinner)findViewById(R.id.spnClass);
                String select = spinner.getSelectedItem().toString();
                intent.putExtra("data",select);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_select_class, menu);
        return true;
    }

    public void sendMessage(View v) {

        //String select = getIntent().getStringExtra("data");
        String select = "Killarney Motor Racing Complex";
        Intent intent = new Intent(getApplicationContext(),Schedule.class);
        intent.putExtra("data",select);
        startActivity(intent);
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
