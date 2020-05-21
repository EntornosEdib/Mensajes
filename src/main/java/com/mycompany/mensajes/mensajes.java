/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor..
 */
package com.mycompany.mensajes;
import java.util.Scanner;

/**
 *
 * @author Rafael Cuello
 */
public class mensajes {
    public static void main(String args[]){
      
   	String Telefono;
       Scanner sc = new Scanner(System.in);
       System.out.println("Como te llamas?");
       String name = sc.nextLine();
       System.out.println("Hola como estás "+name  );
       
       //Introduccion de los Numero de Telefono
       
       int Tel1, Tel2;
       System.out.println("Introduce Numero de Telefono");
       Tel1=sc.nextInt();
       System.out.println("Introduce Segundo Numero de Telefono");
       Tel2=sc.nextInt();
       
       
       //Metodo abs de la Clase Math para evitar que sea negativo
       Telefono=telefonotoString(Math.abs(Tel1),Math.abs(Tel2));
       System.out.println(Telefono+" Guardado Correctamente");
         //Correo Electronico
       System.out.println("Cual es tu correo electronico");
       email.correo_electronico();
	    // esto es una prueba2
	    // esto es una prueba remota
           
    } 
    
    public static String telefonotoString(int Telefono1, int Telefono2) {
   	 
      //Logarimo de 10 para averiguar los digitos del numero de telefono y actuar en consequencia
   	 
  	  String end="";	 
  	  if ((int)(Math.log10(Telefono1)+1)!=9)  {
  		  throw new IllegalArgumentException ("Number 1 must have 9 digits"); 
  	  }
  	  if ((int)(Math.log10(Telefono2)+1)<9) {
  		  throw new IllegalArgumentException ("Number 2 must have 9 digits"); 
  	  } 
  	  
  	  //Transformacion a la cadena de Strings Correcta "123-456-789/123-456-789"
  	  
  	  String Telefono =Integer.toString(Telefono1);
  	  for (int x = 0; x<2; x++) {
  		  for (int i = 3; i <=9; i=i+3) {
  			  if (i<=3) {
  				  end= end+""+Telefono.substring(0, 3);
  				  Telefono=Telefono.substring(3,Telefono.length() );
  			  }else {
  				  try {
  					  end= end+"-"+Telefono.substring(0, 3);
  					  Telefono=Telefono.substring(3,Telefono.length() );
  				  }catch(Exception e){Telefono=null;}
  			  }
 	
  		  }
  		  Telefono=Integer.toString(Telefono2);    	
  		  end=end+"/";
  	  }
  	  end=end.substring(0,end.length()-1);
  	  return end; 
	}
   	}     
