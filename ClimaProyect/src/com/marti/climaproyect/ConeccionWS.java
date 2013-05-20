package com.marti.climaproyect;

import java.io.IOException;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import android.util.Log;

public class ConeccionWS {
	public Weather getClima(String ciudad,String pais) {
		String res=null;
		ParserXML par=new ParserXML();
		Weather clima = new Weather();
		
		String NAMESPACE = "http://www.webserviceX.NET";
		String URL="http://www.webservicex.net/globalweather.asmx";
		String METHOD_NAME = "GetWeather";
		String SOAP_ACTION = "http://www.webserviceX.NET/GetWeather";
		
		SoapObject rpc;
		rpc = new SoapObject(NAMESPACE, METHOD_NAME);
		//De acuerdo a la documentacion del ws, hay 2 parametros que debemos pasar nombre de la ciuda y del pais
		//Para obtener informacion del WS , se puede consultar http://www.webservicex.net/globalweather.asmx?WSDL
		rpc.addProperty("CityName", ciudad);
		rpc.addProperty("CountryName", pais);
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.bodyOut = rpc;
		
		envelope.dotNet = true;
		envelope.encodingStyle = SoapSerializationEnvelope.XSD;
		
		//Para acceder al WS se crea un objeto de tipo HttpTransportSE
		HttpTransportSE androidHttpTransport= null;
		try {
			
			androidHttpTransport = new HttpTransportSE(URL);
			androidHttpTransport.debug = true;
			//Llamado al servicio web . Son el nombre del SoapAction, que se encuentra en la documentacion del servicio web y el objeto envelope
			androidHttpTransport.call(SOAP_ACTION, envelope);
			//Respuesta del Servicio web
			
			res = envelope.getResponse().toString();
		}catch (Exception e){
			System.out.println(e.getMessage());
			Log.d("setlocation", e.getMessage());
		}
		try {
			//llamamos al parser del archivo XML
			clima=par.Parsear(res);
		} catch (XmlPullParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return clima;
	}
}
