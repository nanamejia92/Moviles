package com.example.a4.myapplication;

import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


public class MainActivity extends AppCompatActivity  implements OnClickListener {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Button b1 = (Button) findViewById(R.id.button1);
        //b1.setOnClickListener((View.OnClickListener) this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    int click=0; //variable para saber cuantos botones han oprimido.
    int[] listBoton = new int[10]; //variables para indentificar que botones selecciono.
    int jugador = 1; //identificamos el jugador, incia el jugador1.

    @Override
    public void onClick(View v) {
        // Escuchamos boton1 //
        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener((View.OnClickListener) this);
        // Escuchamos boton2 //
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener((View.OnClickListener) this);
        // Escuchamos boton3 //
        Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener((View.OnClickListener) this);
        // Escuchamos boton4 //
        Button b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener((View.OnClickListener) this);
        // Escuchamos boton5 //
        Button b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener((View.OnClickListener) this);
        // Escuchamos boton6 //
        Button b6 = (Button) findViewById(R.id.button6);
        b6.setOnClickListener((View.OnClickListener) this);
        // Escuchamos boton7 //
        Button b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener((View.OnClickListener) this);
        // Escuchamos boton8 //
        Button b8 = (Button) findViewById(R.id.button8);
        b8.setOnClickListener((View.OnClickListener) this);
        // Escuchamos boton9 //
        Button b9 = (Button) findViewById(R.id.button9);
        b9.setOnClickListener((View.OnClickListener) this);
        // Escuchamos boton10 //
        Button b10 = (Button) findViewById(R.id.button10);
        b10.setOnClickListener((View.OnClickListener) this);
        // Relacionamos botones //
        Button boton1 = (Button) v;
        if (click < 2) { //verificamos que se seleccione de a dos fichas
            switch (boton1.getId()) {
                case R.id.button1:
                    //boton1
                    listBoton[click]=1;
                    click = click + 1;
                    b1.setBackgroundColor(0xff00ffff); //CYAN
                    break;
                case R.id.button2:
                    //boton2
                    listBoton[click]=2;
                    click = click + 1;
                    b2.setBackgroundColor(0xff444444); //DKGRAY
                    break;
                case R.id.button3:
                    //boton3
                    listBoton[click]=3;
                    click = click + 1;
                    b3.setBackgroundColor(0xff00ffff); //CYAN
                    break;
                case R.id.button4:
                    //boton4
                    listBoton[click]=4;
                    click = click + 1;
                    b4.setBackgroundColor(0xff00ff00); //GREEN
                    break;
                case R.id.button5:
                    //boton5
                    listBoton[click]=5;
                    click = click + 1;
                    b5.setBackgroundColor(0xff444444); //DKGRAY
                    break;
                case R.id.button6:
                    //boton6
                    listBoton[click]=6;
                    click = click + 1;
                    b6.setBackgroundColor(0xffff00ff); //MAGENTA
                    break;
                case R.id.button7:
                    //boton7
                    listBoton[click]=7;
                    click = click + 1;
                    b7.setBackgroundColor(0xffffff00); //YELLOW
                    break;
                case R.id.button8:
                    //boton8
                    listBoton[click]=8;
                    click = click + 1;
                    b8.setBackgroundColor(0xff00ff00); //GREEEN
                    break;
                case R.id.button9:
                    //boton9
                    listBoton[click]=9;
                    click = click + 1;
                    b9.setBackgroundColor(0xffff00ff); //MAGENTA
                    break;
                case R.id.button10:
                    //boton10
                    listBoton[click]=10;
                    click = click + 1;
                    b10.setBackgroundColor(0xffffff00); //YELLOW
                    break;
            }
        }
        if(click==2) {
            //b1.setBackgroundColor(0xffffff00);
            sumaJugador(listBoton);
        }
    }

    public void sumaJugador(int [] listBoton){
        //Declaramos los botones que identificamos.
        Button b1 = null;
        Button b2 = null;
        TextView jg; //inicializamos jugador.
        switch (listBoton[0]) { //primer boton seleccionado
            case 1:
                b1 = (Button) findViewById(R.id.button1);
                break;
            case 2:
                b1 = (Button) findViewById(R.id.button2);
                break;
            case 3:
                b1 = (Button) findViewById(R.id.button3);
                break;
            case 4:
                b1 = (Button) findViewById(R.id.button4);
                break;
            case 5:
                b1 = (Button) findViewById(R.id.button5);
                break;
            case 6:
                b1 = (Button) findViewById(R.id.button6);
                break;
            case 7:
                b1 = (Button) findViewById(R.id.button7);
                break;
            case 8:
                b1 = (Button) findViewById(R.id.button8);
                break;
            case 9:
                b1 = (Button) findViewById(R.id.button9);
                break;
            case 10:
                b1 = (Button) findViewById(R.id.button10);
                break;
        }
        switch (listBoton[1]) { //segundo boton seleccionado
            case 1:
                b2 = (Button) findViewById(R.id.button1);
                break;
            case 2:
                b2 = (Button) findViewById(R.id.button2);
                break;
            case 3:
                b2 = (Button) findViewById(R.id.button3);
                break;
            case 4:
                b2 = (Button) findViewById(R.id.button4);
                break;
            case 5:
                b2 = (Button) findViewById(R.id.button5);
                break;
            case 6:
                b2 = (Button) findViewById(R.id.button6);
                break;
            case 7:
                b2 = (Button) findViewById(R.id.button7);
                break;
            case 8:
                b2 = (Button) findViewById(R.id.button8);
                break;
            case 9:
                b2 = (Button) findViewById(R.id.button9);
                break;
            case 10:
                b2 = (Button) findViewById(R.id.button10);
                break;
        }

        ColorDrawable buttonColor = (ColorDrawable) b1.getBackground();
        int colorId = buttonColor.getColor(); //capturamo el color del boton1.
        ColorDrawable buttonColor2 = (ColorDrawable) b2.getBackground();
        int colorId2 = buttonColor2.getColor(); //capturamo el color del boton2.
        if(colorId==colorId2){
            //click=0;//inicializamos para que continue jugando.
            int numero = 0;
            String cadena = ""; //para visualizar el puntaje del jugador.
            if (jugador==1) { //quien juega es el jugador1.
                jg = (TextView) findViewById(R.id.num1); //relacionamos el texto con java. jugador1.
            }
            else{
                jg = (TextView) findViewById(R.id.num2); //relacionamos el texto con java. jugador2.
            }

            numero = Integer.parseInt((String) jg.getText()); //traemos el puntaje y lo convertimos a entero.
            numero = numero + 1; //le sumamos un uno al juagador.
            cadena= Integer.toString(numero); //convertimos el puntaje de entero a string para visualizarlo.
            jg.setText(cadena); //visualizamos el puntaje.
        }
        else{
            b1.setBackgroundColor(0xff000000);
            b2.setBackgroundColor(0xff000000);
            if(jugador==1){
                jugador=2; //es el turno del jugador2.

            }
            else{
                jugador=1; //es el turno del jugador1.
            }
        }
        click=0; //inicializamos para que continue jugando.
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.a4.myapplication/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.a4.myapplication/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }


}
