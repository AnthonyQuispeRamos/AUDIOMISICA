import java.time.Year;
import java.util.Scanner;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class AUDIOMUSIC {
    public static void  main    (String[]args){
        Scanner sc=new Scanner(System.in);
        String nombre, apellido,  correo, telefono;
        String metodoPago="";
        String ubiDelRecojo="";
        String respuestaLUGAR="";
        int opcion,documento;
        double monto_TOTAL,pago,vuelto,igv;
        boolean datosCorrectos;
        System.out.println("=====================================");
        System.out.println("      CARRITO DE COMPRAS-AUDIOMUSIC");
        System.out.println("           DATOS PERSONALES");
        System.out.println("=====================================");
        do {
            datosCorrectos = true;
            System.out.println("Ingrese sus nombres");
            nombre = sc.nextLine();
            System.out.println("Ingrese sus Apellidos");
            apellido = sc.nextLine();
            System.out.println("Ingrese su documento de identidad");
            documento= sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese su correo electronico");
            correo = sc.nextLine();

            System.out.println("Ingrese su telefono");
            telefono = sc.nextLine();
            if (nombre.equals("")||apellido.equals("")){
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
        System.out.println("3.- EFECTIVO");
        opcion= sc.nextInt();
        switch (opcion){
            case 1:
                metodoPago="TARJETA";
                validaPagoTarjeta( sc, monto_TOTAL);
                break;
            case 2:
                metodoPago="PAGO POR DEPOSITO";
                break;
            case 3:
                metodoPago="EFECTIVO";
                break;
            default:
                System.out.println("OPCION INCORRECTO INTENTELO DE NUEVO");
        }
        System.out.println("El monto total ah pagar es:   " + monto_TOTAL);
        System.out.println("INGRESA MONTO AH PAGAR");
        pago= sc.nextDouble();
        System.out.println("PROCESANDO PAGO......");
        System.out.println("TENEMOS 3 TIENDAS FISICAS, DONDE SE LE PUEDE ENTREGAR EL INSTRUMENTO O ENVIOS AH NIVEL NACIONAL (marque un numero)");
        System.out.println("1.-   JULIACA");
        System.out.println("2.-   PUNO");
        System.out.println("3.-   AREQUIPA");
        System.out.println("4.-   ENVIO POR UNA AGENCIA");
        int opcionENTREGA= sc.nextInt();
        switch (opcionENTREGA){
            case    1:
                ubiDelRecojo="JULIACA";
                break;
            case    2:
                ubiDelRecojo="PUNO";
                break;
            case    3:
                ubiDelRecojo="AREQUIPA";
                break;
            case    4:
                System.out.println("CUAL ES LA AGENCIA DE SU PREFERENCIA:");
                System.out.println("1.-   SHALOM");
                System.out.println("2.-   FLORES");
                System.out.println("3.-   MARVISUR");
                int opcion77= sc.nextInt();
                switch (opcion77){
                    case 1:
                        sc.nextLine();
                        System.out.println("ESCRIBA SU LUGAR DE DESTINO");
                        respuestaLUGAR= sc.nextLine();
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.println("ESCRIBA SU LUGAR DE DESTINO");
                        respuestaLUGAR= sc.nextLine();
                        break;
                    case 3:
                        sc.nextLine();
                        System.out.println("ESCRIBA SU LUGAR DE DESTINO");
                        respuestaLUGAR= sc.nextLine();
                        break;
                    default:
                        System.out.println("OPCION NO VALIDA!!");
                }
                break;
            default:
                System.out.println("OPCION NO VALIDA!!");
        }
        if (pago>=monto_TOTAL){
            vuelto=calcularVuelto(pago,monto_TOTAL);
            igv=calcularIGV(monto_TOTAL);
            System.out.println("=====================================");
            System.out.println("     BOLETA DE VENTA ELECTRONICO     ");
            System.out.println("            AUDIOMUSIC               ");
            System.out.println("=====================================");
            System.out.println("Nombres:       "+nombre);
            System.out.println("Apellidos:       "+apellido);
            System.out.println("Documento:       "+documento);
            System.out.println("Correo electronico:       "+correo);
            System.out.println("Telefono:       "+telefono);
            System.out.println("Metodo de pago:       "+metodoPago);
            System.out.println("Entrega en la tienda de:"    +ubiDelRecojo );
            System.out.println("Destino de envio:"          +respuestaLUGAR);

            System.out.println("---------------------------------------");


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
        return monto_TOTAL*0.18;
    }
    public static void validaPagoTarjeta(Scanner sc,double monto_TOTAL) {
        String nroTarjeta, fechaVnecimiento, cvv;
        boolean paAprovado = false;
        System.out.println("El monto total ah pagar es:   " + monto_TOTAL);
        do {
            System.out.println("Ingrese los 16 digitos de la tarjeta");
            nroTarjeta = sc.nextLine();
            sc.nextLine();
            System.out.println("Ingrese la fecha de caducidad (MM/AA)");
            fechaVnecimiento = sc.nextLine();
            System.out.println("Ingrese el codgio de seguridad");
            cvv = sc.nextLine();
            boolean tarjetaOK=(nroTarjeta.length()==16);
            boolean cvvOk=(cvv.length()==3);
            boolean fechaEstructuraOK=(fechaVnecimiento.length()==5&&fechaVnecimiento.contains("/"));
            boolean fechaNovencida=false;
            if (fechaEstructuraOK){
                try {
                    DateTimeFormatter Formateador=DateTimeFormatter.ofPattern("MM/yy");
                    YearMonth fechaTarjeta=YearMonth.parse(fechaVnecimiento,Formateador);
                    YearMonth fechaActual= YearMonth.now();
                    if (fechaTarjeta.isAfter(fechaActual)||fechaTarjeta.equals(fechaActual)){
                        fechaNovencida=true;
                    }
                }
                catch (DateTimeParseException error){
                    fechaEstructuraOK=false;
                }
            }
            if (tarjetaOK&&fechaEstructuraOK&&fechaNovencida){
                System.out.println(" TARJETA VALIDA");
                paAprovado=true;
            }
            else {
                System.out.println("Operacion cancelada....");
            }
            if (!tarjetaOK){
                System.out.println("El numero de tarjeta debe contener exactamente 16 digitos");
            }
            if(!fechaEstructuraOK){
                System.out.println("Fromato de fecha incorrecta");
            }
            if (fechaEstructuraOK&&!fechaNovencida){
                System.out.println("¡TARJETA CADUCADA!");
            }
            if (!cvvOk){
                System.out.println("Intente nuevamente el pago...");
            }
        }
        while (!paAprovado);
    }
}

