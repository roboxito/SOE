package mx.com.androiddes.soe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MenuEcoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_menu_eco);
        Button btnEco=(Button) findViewById(R.id.btnEco);
        btnEco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contloc=new Intent(MenuEcoActivity.this,PlazaActivity.class);
                startActivity(contloc);
            }
        });
        Button btnCargaRuta=(Button) findViewById(R.id.btnCargaRuta);
        btnCargaRuta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contloc=new Intent(MenuEcoActivity.this,MenuActivity.class);
                startActivity(contloc);
            }
        });
        utils.Mensaje(this, getResources().getString(R.string.m7), null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_eco, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
