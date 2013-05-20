package com.marti.climaproyect;

import java.io.IOException;
import java.io.StringReader;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import android.util.Log;

public class ParserXML {
	public Weather Parsear(String docXML) throws XmlPullParserException,
			IOException {

		Weather clima = new Weather();
		int i=1;
		
		XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
		factory.setNamespaceAware(true);
		XmlPullParser xpp = factory.newPullParser();

		xpp.setInput(new StringReader(docXML));
		int eventType = xpp.getEventType();

		while (eventType != XmlPullParser.END_DOCUMENT) {
			if (eventType == XmlPullParser.START_DOCUMENT) {
				Log.d("setlocation", "Comienza Documento");
			} else if (eventType == XmlPullParser.START_TAG) {
				Log.d("setlocation", "Comienza tag" + xpp.getName());
			} else if (eventType == XmlPullParser.END_TAG) {
				Log.d("setlocation", "Termina tag" + xpp.getName());
			} else if (eventType == XmlPullParser.TEXT) {

				Log.d("setlocation", "Texto" + xpp.getText());
				Log.d("setlocation", ""+i+"");
				if(i%2==0){clima.setGeneral(xpp.getText());}
				i+=1;
			}
			eventType = xpp.next();
			
		}
		Log.d("setlocation", "Termina Documento");
		Log.d("setlocation", clima.toString());
		return clima;
	}

}
