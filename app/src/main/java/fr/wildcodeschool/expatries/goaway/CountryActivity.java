package fr.wildcodeschool.expatries.goaway;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,
                R.array.array_name, R.layout.spinner_item);
        adapter.setDropDownViewResource(R.layout.spinner_item);
        Spinner spinner = (Spinner)findViewById(R.id.sort_by_spinner) ;
        spinner.setAdapter(adapter);
        Button suivant = (Button)findViewById(R.id.suivant);
        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CountryActivity.this,HelpActivity.class);
                startActivity(intent);
            }
        });
    }
}
