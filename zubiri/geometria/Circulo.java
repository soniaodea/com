/*
 * Clase para obtener resultados de distintas operaciones aritméticas.
 */

package com.zubiri.geometria;
public class Circulo {

	private float radio = 0;
	private float circu = 0;
	private float area = 0;

	public Circulo (float valorRadio){
	
	this.radio = valorRadio;
	}

      public void setRadio(float num)
        {
              	radio = num;
	}

	public float area()
	{  
		area = 3.14f * radio * radio;
		return area;
     	 }

	public float circu()
	{  
		circu = 2 * 3.14f * radio;
		return circu;
		
     	 }

 	public float getArea() 
	{
        return area;
   	 }
 	public float getCircu() 
	{
        return circu;
    	}
}
