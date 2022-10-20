import java.util.Scanner;

public class App {
    public static void main( String[] args ) throws Exception {
        // Variables de entrada =
        short uniSld;
        String namEmpl;

        // Variables de asignación =
        final float prd00  = 1000f;
        final String namComp = "Lácteos la Victoria";
        final float pctSav = 0.02f, pctComm = 0.05f;
        final float salBasic = 1500000f, alwTrans = 35000f;
        final String sep00 = "====================================================================";

        // Variables de operación =
        float valSav, valComm, totSls, totPay;

        // Entrada de datos =
        try ( Scanner input = new Scanner( System.in ) ) {
            System.out.println( "" );
            System.out.println( "========================= Ingreso de datos =========================" + "\n" );
            
            System.out.println( "Bienvenido estimado empleado." );
            System.out.print( " Por favor ingrese su nombre y apellido(s) : " );
            namEmpl = input.nextLine();

            System.out.print( " Ingrese el número de productos que vendió : " );
            uniSld  = input.nextShort();
            System.out.println( "" );
            
            System.out.println( sep00 );
            System.out.println( "\n \n" );
        }

        // Operaciones =
        totSls  = ( uniSld * prd00 );
        valSav  = ( salBasic * pctSav );
        valComm = ( totSls * pctComm );
        totPay  = ( ( salBasic + valComm + alwTrans ) - valSav );

        // Salida de datos =
        System.out.println( "----------------------------- FACTURA ------------------------------" );
        System.out.println( "                        " + namComp + "\n" );
        System.out.println( "Nombre del empleado                        : " + namEmpl );
        if ( uniSld > 0 ) {
            System.out.println( "Número de ventas mensuales                 : " + "#" + uniSld + " UD" );
            System.out.println( "Valor de la comisión actual                : " + "$" + valComm + " COP" );
            System.out.println( "Valor total de las ventas en el mes        : " + "$" + totSls + " COP" + "\n" );
        } else {
            System.out.println( "Usted no ha hecho ninguna venta hasta ahora." );
            System.out.println( " Por lo tanto el valor de su comisión es nulo." + "\n" );
        }
        System.out.println( "Valor de ahorro acumulado                  : " + "$" + valSav + " COP" );
        System.out.println( "Valor total a pagar hasta la fecha         : " + "$" + totPay + " COP" + "\n" );
        System.out.println( sep00 );
        System.out.println( "  Toma la píldora blanca, de todos modos, ¡ya se acabó para vos!" + "\n" );
    }
}