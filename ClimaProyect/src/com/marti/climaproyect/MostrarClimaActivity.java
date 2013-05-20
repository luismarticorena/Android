package com.marti.climaproyect;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MostrarClimaActivity extends Activity {
	private TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mostrar_clima);
		
		textView = (TextView) this.findViewById(R.id.Localizacion);
		textView.setText(this.getIntent().getExtras().getString("Ciudad"));
        
		textView = (TextView) this.findViewById(R.id.Temperatura);
		textView.setText(this.getIntent().getExtras().getString("Temperatura"));
        
		textView = (TextView) this.findViewById(R.id.CondicionesCielo);
		textView.setText(this.getIntent().getExtras().getString("Cielo"));
        
		textView = (TextView) this.findViewById(R.id.Humedad);
		textView.setText(this.getIntent().getExtras().getString("Humedad"));
        
        textView = (TextView) this.findViewById(R.id.Presion);
        textView.setText(this.getIntent().getExtras().getString("Presion"));
        
        textView = (TextView) this.findViewById(R.id.Rocio);
        textView.setText(this.getIntent().getExtras().getString("Rocio"));
        
        textView = (TextView) this.findViewById(R.id.Visibilidad);
        textView.setText(this.getIntent().getExtras().getString("Visibilidad"));
        
        textView = (TextView) this.findViewById(R.id.Viento);
        textView.setText(this.getIntent().getExtras().getString("Viento"));
        
        Button ok = (Button) this.findViewById(R.id.botonOK);
        ok.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				MostrarClimaActivity.this.finish();
			}        	
        });
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mostrar_clima, menu);
		return true;
	}

}
