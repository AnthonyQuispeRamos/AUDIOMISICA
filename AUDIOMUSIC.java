import java.util.Scanner;
public class AUDIOMUSIC {
    public static void  main    (String[]args){
        Scanner sc=new Scanner(System.in);
        String nombre, apellido,  correo, telefono;
        String metodoPago="";
        int opcion,documento;
        double monto_TOTAL,pago,vuelto,igv;
        boolean datosCorrectos;
        System.out.println("====CARRITO DE COMPRAS====");
        System.out.println("==DATOS PERSONALES==");
        do {
            datosCorrectos = true;
            System.out.println("Ingrese sus nombres");
            nombre = sc.nextLine();
            System.out.println("Ingrese sus Apellidos");
            apellido = sc.nextLine();
            System.out.println("Ingrese su documento de identidad");
            documento= sc.nextInt();
            System.out.println("Ingrese su correo electronico");
            correo = sc.nextLine();
            System.out.println("Ingrese su telefono");
            telefono = sc.nextLine();
            if (nombre.equals("")||apellido.equals("")||correo.equals("")||telefono.equals("")){
                System.out.println("UNO DE LOS DATOS ESTA VACIO! INTENTALO DE NUEVO");
                datosCorrectos=false;
            }
            else {
                System.out.println("¡¡DATOS REGISTRADOS CORRECTAMENTE!!");
            }
        }
        while (!datosCorrectos);
        System.out.println("===SELCCIONE EL METODO DE PAGO (marque un numero)===");
        System.out.println("1.- TARJETA DE CREDITO O DEBITO");
        System.out.println("2.- PAGO POR DEPOSITO");
        System.out.println("3.- YAPE PLIN ");
        opcion= sc.nextInt();
        switch (opcion){
            case 1:
                metodoPago="TARJETA";
                break;
            case 2:
                metodoPago="PAGO POR DEPOSITO";
                break;
            case 3:
                metodoPago="YAPE O PLIN";
                break;
            default:
                System.out.println("OPCION INCORRECTO INTENTELO DE NUEVO");
        }
        System.out.println("PROCESANDO PAGO......");
        System.out.println("INGRESA MONTO AH PAGAR");
        pago= sc.nextDouble();
        if (pago>=monto_TOTAL){
            vuelto=calcularVuelto(pago,monto_TOTAL);
            igv=calcularIGV(monto_TOTAL);
            System.out.println("=====================================");
            System.out.println("     BOLETA DE VENTA ELECTRONICO     ");
            System.out.println("            AUDIOMUSIC     ");
            System.out.println("=====================================");
            System.out.println("Nombres:       "+nombre);
            System.out.println("Apellidos:       "+apellido);
            System.out.println("Documento:       "+documento);
            System.out.println("Correo electronico:       "+correo);
            System.out.println("Telefono:       "+telefono);
            System.out.println("Metodo de pago:       "+metodoPago);

            System.out.println("----------------------------------------");


            System.out.println("IGV:"      +igv);
            System.out.println("Monto total:    "+monto_TOTAL);
            System.out.println("Monto pagado:"     +pago);
            System.out.println("Vuelto:"        +vuelto);

            System.out.println("=====================================");
            System.out.println("=======GRACIAS POR SU COMPRA=========");
            System.out.println("=====================================");
        }
        else {
            System.out.println("PAGO INSUFICIENTE!!");
            System.out.println("FALTA PAGAR: S/"+(monto_TOTAL-pago));
        }
      sc.close();
    }
    public static double calcularVuelto(double pago, double monto_TOTAL){
        return pago-monto_TOTAL;
    }
    public static double calcularIGV(double monto_TOTAL){
        return monto_TOTAL*1.18;
    }
}
