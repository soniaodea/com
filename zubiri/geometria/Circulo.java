/*
 * Clase para obtener resultados de distintas operaciones aritméticas.
 */

package com.zubiri.geometria;
public class Circulo {

	private double radio = 0;
	private double circu = 0;
	private double area = 0;

	public Circulo (){
	}

	public Circulo (double valorRadio){
	
	this.radio = valorRadio;
	}

      public void setRadio(double num)
        {
              	radio = num;
	}

	public double area()
	{  
		area = 3.14f * radio * radio;
		return area;
     	 }

	public double circu()
	{  
		circu = 2 * 3.14f * radio;
		return circu;
		
     	 }

 	public double getArea() 
	{
        return area;
   	 }
 	public double getCircu() 
	{
        return circu;
    	}
}
