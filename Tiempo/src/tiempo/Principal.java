package tiempo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal 
{

	public static void main(String[] args) 
	{
		int hora, minuto, segundo;
		
		Scanner entradaTeclado = new Scanner(System.in);
		Tiempo ObjTiempo = new Tiempo();
		
		try
		{
			System.out.print("\nIntroduce una hora: ");
	        hora = entradaTeclado.nextInt();
	        
	        System.out.print("\nIntroduce una hora: ");
	        minuto = entradaTeclado.nextInt();
	
	        System.out.print("\nIntroduce una hora: ");
	        segundo = entradaTeclado.nextInt();
	        
	        if ((hora >= 0) && (minuto >= 0) && (segundo >= 0))
	        {
	        	
	        	ObjTiempo.Cronometro(hora, minuto, segundo);
	        	
	        	System.out.print("\nLa hora es " + hora + ":" + minuto + ":" + segundo + ".");
	        	
	        }
	        else
            {
	        	
	        	System.out.print("\nDatos incorrectos.");

            }
    	        
		}
		catch(InputMismatchException e)
		{
			
			System.out.print("\nError.");
			
		}

        entradaTeclado.close();
        System.exit(0);
        
	}

}

class Tiempo
{
    public void Cronometro( int hora, int minuto, int segundo)
    {

    	int exceso = 0, resultadohora = 0, resultadominuto = 0, resultadosegundo = 0;
        segundo = segundo + 1;
        
        if (segundo == 60)
        {
            minuto = minuto + 1;
            segundo = 0;

            if (minuto == 60)
            {
                hora = hora + 1;
                minuto = 0;

                if (hora == 24)
                {
                    hora = 0;
                }
            }
        }
        
        resultadohora = hora;
        resultadominuto = minuto;
        resultadosegundo = segundo;
    	
    }
}
