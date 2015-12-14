package javipaur.fiestaslablanca2014;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_my);

        final ImageButton bares = (ImageButton)findViewById(R.id.bares);
        //Implementamos el evento “click” del botón
        bares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(MyActivity.this, bares.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

        final ImageButton desarrolladores = (ImageButton)findViewById(R.id.desarrolladores);
        //Implementamos el evento “click” del botón
        desarrolladores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(MyActivity.this, desarrolladores.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

        final ImageButton conciertos = (ImageButton)findViewById(R.id.conciertos);
        //Implementamos el evento “click” del botón
        conciertos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(MyActivity.this, Conciertos.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

        final ImageButton toros = (ImageButton)findViewById(R.id.toros);
        //Implementamos el evento “click” del botón
        toros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(MyActivity.this, toros.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

        final ImageButton fuegos = (ImageButton)findViewById(R.id.fuegos);
        //Implementamos el evento “click” del botón
        fuegos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(MyActivity.this, fuegos.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

        final ImageButton programa = (ImageButton)findViewById(R.id.programafiestas);
        //Implementamos el evento “click” del botón
        programa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(MyActivity.this, programa.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

        final ImageButton gmargolariak = (ImageButton)findViewById(R.id.margolariak);
        //Implementamos el evento “click” del botón
        gmargolariak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(MyActivity.this, gmargolariak.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}