import java.util.Scanner;

public class calificaciones{
	public static void main(String[] args) {
		int num,i,c;
		float promedio =0;
		float[] calificacion = new float[5];//arreglo de 5 posiciones para calificaciones		
		String name="";
		boolean f=true,captura=false;
			
	
	Scanner scan= new Scanner(System.in);
	
	
	do{
		System.out.print("\n----------------------------------"+//menu
						"\nQue desea hacer:"+ 
						"\n1.Capturar nombre y calificaciones"+
						"\n2.Imprimir calificaciones y promedio"+
						"\n3.Imprimir calificaciones y clificacion mas baja "+
						"\n4.Imprimir calificaciones y callificacion mas alta"+
						"\n5.Salir"+
						"\n\nIngresa numero: ");
		num = scan.nextInt();
			
		switch(num){  //switch case para el menu
					case 1:	name = datos.getString("Ingrese nombre");
							System.out.println("\nIngrese las 5 calificacions\n");
							for(i=0;i<5;i++){//captuta las calificaciones en orden
								c=i+1;
								System.out.print("Ingrese calificaion "+ c + ": ");
								calificacion[i] = scan.nextFloat();	
								
							}
							promedio = CalculaPromedio.resPromedio(calificacion);//metodo para capturar promedio
							captura=true;//marca la bandera de captura en verdad
							break;
					case 2: if(captura==true){//no se realiza  miesntras que la bandera de captura sea falsa
							MostrarDatos.nombre(name);
							MostrarDatos.calificaciones(calificacion);
							MostrarDatos.promedio(promedio);
							}
							else System.out.println("\nIngrese datos primero");
							break;
					case 3: if(captura==true){//no se realiza  miesntras que la bandera de captura sea falsa
							MostrarDatos.nombre(name);
							MostrarDatos.calificaciones(calificacion);
							MostrarDatos.menorCali(calificacion);
							}
							else System.out.println("\nIngrese datos primero");
							break;
					case 4: if(captura==true){//no se realiza  miesntras que la bandera de captura sea falsa
							MostrarDatos.nombre(name);
							MostrarDatos.calificaciones(calificacion);
							MostrarDatos.mayorCali(calificacion);
							}
							else System.out.println("\nIngrese datos primero");
							break;
					case 5: f=false; break;//convierte la bandera de salida a falsa
					default: System.out.println("\n--Ingresa una de las opciones--");
		}
		
		}while(f==true);//mientras 	que la bandera de salida sea verdadera
		
	}
}

class CalculaPromedio{
	

	public static float resPromedio(float calificacion[]){//calcula el promedio
		int i;
		float sumaCalificaciones=0,promedio;
		for(i=0;i<5;i++) sumaCalificaciones = sumaCalificaciones + calificacion[i];
		promedio = sumaCalificaciones/5;
		return promedio;
	}

}	

class MostrarDatos{

	public static void nombre(String name){//muestra el nombre
		System.out.println("\nNombre: " + name);
	}
	
	public static void calificaciones(float calificacion[]){//muestra las calificaciones en orden
		int i,c;
		for(i=0;i<5;i++){
			c=i+1;
			System.out.print("\nCalificacion " + c +": " + calificacion[i]);
		}
	}

	public static void promedio(float prom){//muestra promedio
		System.out.println("\nPromedio: " + prom);
	}
	
	public static void menorCali(float calificacion[]){//muestra la menor calificacion
		int i;
		float min=calificacion[0];
		for(i=1;i<5;i++){
			if(calificacion[i]<min) min = calificacion[i];
		}
		System.out.println("\nLa calificaion minima es: " + min);
	}
	
	public static void mayorCali(float calificacion[]){//muestra la calificacion mayor
		int i;
		float min=calificacion[0];
		for(i=1;i<5;i++){
			if(calificacion[i]>min) min = calificacion[i];
		}
		System.out.println("\nLa calificaion maxima es: " + min);
	}
}

class datos{//clase de recivir datos por parte del usuario
	
	public static String getString(String mens){
		Scanner scan= new Scanner(System.in);
		System.out.print("\n" + mens +": ");
		return( scan.nextLine() );
	}
}