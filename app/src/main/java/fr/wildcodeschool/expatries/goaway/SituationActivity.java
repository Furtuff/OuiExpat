package fr.wildcodeschool.expatries.goaway;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SituationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation);


        Button futurexpat = (Button)findViewById(R.id.futurexpat);
        Button expat = (Button)findViewById(R.id.expat);
        Button retour = (Button)findViewById(R.id.back);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        futurexpat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SituationActivity.this,CountryActivity.class);
                startActivity(intent);
            }
        });

        expat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SituationActivity.this,HelpActivity.class);
                startActivity(intent);
            }
        });
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SituationActivity.this,HelpActivity.class);
                startActivity(intent);
            }
        });

    }
}
