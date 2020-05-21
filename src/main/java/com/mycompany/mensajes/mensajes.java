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
 * 
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

/*Paises*/
import java.util.Scanner;

public class Main {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		int entrada=0;
		
		System.out.println("---------------");
		System.out.println("1. España");
		System.out.println("2. R.U.");	
		System.out.println("3. Ecuador");	
		System.out.println("4. Grecia");	
		System.out.println("5. Perú");	
		System.out.println("6. Surafrica");	
		System.out.println("7. Turquia");	
		System.out.println("8. Japón");
		System.out.println("9. Italia");	
		System.out.println("10. Islas Fiyi");	
		System.out.println("---------------");
	
		System.out.println("");
		
		
		System.out.println("* Introduce el número del País para conocer el prefijo (0 para salir)");
		
		do {
			entrada=sc.nextInt();
		switch (entrada) {
		
			case 1:
				System.out.println("España (34)");
				break;
			
				
			case 2:
				System.out.println("Reino Unido (44)");
				break;
				
				
			case 3:
				System.out.println("Ecuador (593)");
				
				
				break;
			case 4:
				System.out.println("Grecia (30)");
				
				
				break;
			case 5:
				System.out.println("Peru (51)");
				
				
				break;
			case 6:
				System.out.println("Surafrica (27)");
				
				
				break;
			case 7:
				System.out.println("Turquia (90)");

				
				break;
			case 8:
				System.out.println("Japón (81)");
				
				
				break;
			case 9:
				System.out.println("Italia (39)");
				
				
				break;
			case 10:
				System.out.println("Fiyi (679)");
				
				
				break;
			
				
		}
		
		}while (entrada!=0);
	}
}
