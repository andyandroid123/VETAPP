package com.example.administrador.vetapp.Actividades;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrador.vetapp.R;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button scan_bt;

    private Button btnMascotas, btnServicios, btnAcerca, btnSalir;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMascotas = (Button)findViewById(R.id.btnMascotas);
        btnServicios = (Button)findViewById(R.id.btnServicios);
        btnAcerca = (Button)findViewById(R.id.btnAcerca);
        btnSalir = (Button)findViewById(R.id.btnSalir);

        btnMascotas.setOnClickListener(this);
        btnServicios.setOnClickListener(this);
        btnAcerca.setOnClickListener(this);
        btnSalir.setOnClickListener(this);

        /*scan_bt = (Button) findViewById(R.id.bt_scan);
        final Activity activity = this;
        scan_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IntentIntegrator integrator = new IntentIntegrator(activity);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
                integrator.setPrompt("Scan");
                integrator.setCameraId(0);
                integrator.setBeepEnabled(false);
                integrator.setBarcodeImageEnabled(false);
                integrator.initiateScan();

            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();*/
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null) {
            if (result.getContents() == null) {
                Toast.makeText(this, "Has Cancelado el Escaneo", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, result.getContents(), Toast.LENGTH_LONG).show();

            }
        } else {

            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.btnMascotas:

                Snackbar.make(view, "En desarrollo", Snackbar.LENGTH_LONG)
                        .setActionTextColor(getResources().getColor(R.color.blanco))
                        /*.setAction("SI", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                finish();
                            }
                        })*/
                        .show();

                break;
            case R.id.btnServicios:

                Snackbar.make(view, "En desarrollo", Snackbar.LENGTH_LONG)
                        .setActionTextColor(getResources().getColor(R.color.blanco))
                        /*.setAction("SI", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                finish();
                            }
                        })*/
                        .show();

                break;
            case R.id.btnAcerca:

                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setMessage("Aplicativo desarrollado por el grupo de trabajo")
                     .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                         @Override
                         public void onClick(DialogInterface dialogInterface, int i) {
                             dialogInterface.cancel();
                         }
                     });
                alert.create();
                alert.show();

                break;
            case R.id.btnSalir:

                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(MainActivity.this);
                builder.setMessage("¿Salir de la aplicación?")
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                MainActivity.this.finish();
                            }
                        })
                        .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                builder.create();
                builder.show();


                break;

            default:
                break;
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){}
        return false;
    }


    /* @Override
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
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.administrador.vetapp/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }*/

   /* @Override
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
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.administrador.vetapp/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }*/



}
