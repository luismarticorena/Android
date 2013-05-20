Android
=======

# Proyecto de Android: Clima Web Service

El presente proyecto consiste en una aplicacion que se conecte a un web service y nos muestre el clima de una ciudad en especifico.

![screenshot](inter.png)

Simplemente ingresamos el nombre del pais y la ciudad (en ingles, ya que el web service estaba en ingles) de los que queremos obtener el clima y damos click al boton "consultar"
Se nos muestra la ventana con el clima de la ciudad

![screenshot](Captura2.png)

##Codigo

Tenemos las siguientes clases
* ClimaProyectActivity: Es la activity principal que ingresa los nombres de pais y ciudad
* MostrarClimaActivity: Es la activity secundaria que muestra el clima
* ConeccionWS: Esta clase permite la coneccion al webservice
* ParserXML: Nos permite hacer parsing al codigo XML que nos devuelve el webservice
* Weather: La Clase que tiene los atributos del clima y sus metodos set y get


This is the default code generated
```java
package com.example.converter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }    
}
```


