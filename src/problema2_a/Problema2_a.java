/**
 *@author Kevin Andres Toro
 * @since 21/08/2016
 * @version 1.0
 */
package problema2_a;
        
public class Problema2_a 
{
    public static void main(String[] args)
    /**
     * Esta funcion no recibe ningun parametro, tan solo se encarga de correr la funcion casos()
     */
    {
    Casos();
    }
    
    public static void Casos ()
    {
        /**
         * Esta funcion se vale de la funcion comparacion para determinar cuanto ha ganado el jugador 
         */
       int Registro[] = comparacion();
       
       int x = Registro[0];
       System.out.println("X es "+x);
       int y = Registro[1];
       System.out.println("Y es "+y);
       int z = Registro [2];
       System.out.println("Z es "+z);
       
       if (x>0 && y>0)
       {
           System.out.println("Usted ha ganado 100");
       }
       else if (x>0 && y==0 && z==0)
       {
           System.out.println("Usted ha ganado 10");
       }
       else if (x==0 && y!=0)
       {
           System.out.println("Usted ha ganado 100");
       }
       else if (z>0 && x==z)
       {
           System.out.println("Usted ha ganado 1000000");
       }
       else if (x==0 && y==0 && z==0)
       {
           System.out.println("Sigue intentando");
       }
        
    }
    
    public static int[] comparacion()
    {
        /**
         * Esta funcion llama a la funcion juego y oportunidad para contar aciertos para todos los posibles casos dados en el problema.
         * @return Registro, es un arreglo donde se guardan las diferentes contadoras que me serviran en la funcion casos
         */
        
        int Loteria[] = Juego();
        int Intento[] = Oportunidad();
        int Contador = 0;
        int Contador_2 = 0; 
        int Contador_3 = 0; 
        int Registro[];
        Registro = new int[3]; 
        
        for (int i=0;i<Loteria.length;i++)
        {
            for (int j=0;j<Intento.length;j++)
            {
                if(Loteria[0]==Intento[0]&&Loteria[0]!=Intento[1]&&Loteria[0]!=Intento[2])
                {
                Contador = Contador +1; 
                }
                else if(Loteria[1]==Intento[1]&&Loteria[1]!=Intento[0]&&Loteria[1]!=Intento[2])
                {
                Contador = Contador +1; 
                }
                else if (Loteria[2]==Intento[2]&&Loteria[2]!=Intento[0]&&Loteria[2]!=Intento[1])
                {
                Contador = Contador +1; 
                }
            }
        }
        for (int i=0;i<Loteria.length;i++)
        {
            for (int j=0;j<Intento.length;j++)
            {
                if(Loteria[0]==Intento[0]&&Loteria[1]==Intento[1]&&Loteria[2]!=Intento[2])
                {
                Contador_2 = Contador_2 +1; 
                }
                else if(Loteria[0]!=Intento[0]&&Loteria[1]==Intento[1]&&Loteria[2]==Intento[2])
                {
                Contador_2 = Contador_2 +1; 
                }
                else if(Loteria[0]==Intento[0]&&Loteria[1]!=Intento[1]&&Loteria[2]==Intento[2])
                {
                Contador_2 = Contador_2 +1;
                }
                else if(Loteria[0]==Intento[0]&&Loteria[1]==Intento[1]&&Loteria[2]==Intento[2])
                {
                Contador_3 = Contador_3+1;
                }
            }
        }
        Registro[0]=Contador;
        Registro[1]=Contador_2; 
        Registro[2]=Contador_3;
        return (Registro); 
    }
    
    public static int[] Juego()
    {
        /**
         * Esta funcion crea un arreglo con numeros aleatorios segun la descripcion del problema
         * @return un arreglo llamado Loteria en donde se almacenan los numeros de juego 
         */
        int Loteria[];
        Loteria = new int [3]; 
        
       for (int i =0 ; i<Loteria.length;i++)
       {
           Loteria[i] = (int)(Math.random()*9);
       }
       System.out.println("Loteria es "+Loteria[0]+Loteria[1]+Loteria[2]);
       System.out.println();
       
       return (Loteria);
    }
    
    public static int[] Oportunidad()
    {
        /**
         * Esta funcion recibe los 3 numeros ingresados por el usuario
         * @return un arreglo llamado Intento donde se almacenan los 3 numeros ingresados por el usuario
         */
        int Intento [];
        Intento= new int [3];
 
        java.util.Scanner lectura = new java.util.Scanner(System.in);
    
        int Numero_1, Numero_2, Numero_3;
       
        System.out.println("Ingrese el numero 1");
        Numero_1 = lectura.nextInt();
        Intento[0] = Numero_1;
       
        System.out.println("Ingrese el numero 2");
        Numero_2 = lectura.nextInt();
        Intento[1] = Numero_2;
       
        System.out.println("Ingrese el numero 3");
        Numero_3 = lectura.nextInt(); 
        Intento[2] = Numero_3;
       
        System.out.println("Su juego es "+Numero_1+Numero_2+Numero_3);
        System.out.println();
        
        return(Intento);
    }
}
