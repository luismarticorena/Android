package com.marti.climaproyect;

import android.util.Log;

public class Weather {

	String Location;
	String Time;
	String Wind;
	String Visibility;
	String SkyConditions;
	String Temperature;
	String DewPoint;
	String RelativeHumidity;
	String Preassure;
	String Status;
	
	public Weather() {
		Location = null;
		Time = null;
		Wind = null;
		Visibility = null;
		SkyConditions = null;
		Temperature = null;
		DewPoint = null;
		RelativeHumidity = null;
		Preassure = null;
		Status = null;
	}
	
	public Weather(String location, String time, String wind,
			String visibility, String skyConditions, String temperature,
			String dewPoint, String relativeHumidity, String preassure,
			String status) {
		Location = location;
		Time = time;
		Wind = wind;
		Visibility = visibility;
		SkyConditions = skyConditions;
		Temperature = temperature;
		DewPoint = dewPoint;
		RelativeHumidity = relativeHumidity;
		Preassure = preassure;
		Status = status;
	}
	
	

	@Override
	public String toString() {
		return "Weather [Location=" + Location + ", Time=" + Time + ", Wind="
				+ Wind + ", Visibility=" + Visibility + ", SkyConditions="
				+ SkyConditions + ", Temperature=" + Temperature
				+ ", DewPoint=" + DewPoint + ", RelativeHumidity="
				+ RelativeHumidity + ", Preassure=" + Preassure + ", Status="
				+ Status + "]";
	}

	public void setGeneral(String s1) {
		if (this.Location== null){
		Location = s1;} else if (this.Time == null){
		Time = s1;}else if (this.Wind == null){
		Wind = s1;} else if (this.Visibility == null){
		Visibility = s1;}else if (this.SkyConditions == null){
		SkyConditions = s1;}   else if (this.Temperature == null){
		Temperature = s1;}else if (this.DewPoint == null){
		DewPoint = s1;}else if (this.RelativeHumidity == null){
		RelativeHumidity = s1;} else if (this.Preassure == null){
		Preassure = s1;}else if (this.Status == null){
		Status = s1;}
		
	}


	public String getLocation() {
		return Location.substring(0, Location.indexOf(" "));
	}

	public String getTime() {
		return Time;
	}

	public String getWind() {
		return Wind;
	}

	public String getVisibility() {
		return Visibility;
	}

	public String getSkyConditions() {
		Log.d("condiciones", "("+SkyConditions+")"); 
		if(SkyConditions.contains("partly cloudy")){		
			return "Parcialmente Nublado";}
		else if (SkyConditions.contains("clear")){
			return "Despejado";}
		else if (SkyConditions.contains("obscured")){
			return "Oscuro";}
		else if (SkyConditions.contains("overcast")){
		return "Nublado";}
		else return SkyConditions;
	}

	public String getTemperature() {
		return Temperature.substring(Temperature.indexOf("(")+1, Temperature.indexOf(")"));
	}

	public String getDewPoint() {
		return DewPoint.substring(DewPoint.indexOf("(")+1, DewPoint.indexOf(")"));
	}

	public String getRelativeHumidity() {
		return RelativeHumidity;
	}

	public String getPreassure() {
		return Preassure.substring(Preassure.indexOf("(")+1, Preassure.indexOf(")"));
	}

	public String getStatus() {
		return Status;
	}
	
	
	
	

}
