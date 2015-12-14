package javipaur.fiestaslablanca2014;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

/**
 * Created by Javipaur on 22/06/2014.
 */
public class Conciertos extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.conciertos);

        final ImageButton spana = (ImageButton)findViewById(R.id.espana);
        //Implementamos el evento “click” del botón
        spana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(Conciertos.this, spana.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

        final ImageButton fueros = (ImageButton)findViewById(R.id.fueros);
        //Implementamos el evento “click” del botón
        fueros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(Conciertos.this, fueros.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

        final ImageButton machete = (ImageButton)findViewById(R.id.machete);
        //Implementamos el evento “click” del botón
        machete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(Conciertos.this, machete.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });

        final ImageButton txoznas = (ImageButton)findViewById(R.id.choznas);
        //Implementamos el evento “click” del botón
        txoznas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(Conciertos.this, txoznas.class);


                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });
    }
}
