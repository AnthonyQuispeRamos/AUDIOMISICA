import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class Audio_Musica {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String correoREGISTRO = "";
        String contraseñaREGISTRO = "";
        String correoVERIFICACION="";
        String contraseñaVERIFICACION="";
        String nombreSESION = "";
        boolean INICIO_SE;
        do {
            INICIO_SE = false;
            System.out.println("""
 █████╗ ██╗   ██╗██████╗ ██╗ ██████╗ ███╗   ███╗██╗   ██╗███████╗██╗ ██████╗
██╔══██╗██║   ██║██╔══██╗██║██╔═══██╗████╗ ████║██║   ██║██╔════╝██║██╔════╝
███████║██║   ██║██║  ██║██║██║   ██║██╔████╔██║██║   ██║███████╗██║██║     
██╔══██║██║   ██║██║  ██║██║██║   ██║██║╚██╔╝██║██║   ██║╚════██║██║██║     
██║  ██║╚██████╔╝██████╔╝██║╚██████╔╝██║ ╚═╝ ██║╚██████╔╝███████║██║╚██████╗
╚═╝  ╚═╝ ╚═════╝ ╚═════╝ ╚═╝ ╚═════╝ ╚═╝     ╚═╝ ╚═════╝ ╚══════╝╚═╝ ╚═════╝
 
♫                      ██╗   ██╗██████╗ ███████╗██╗   ██╗                ♫ 
 ♫                     ██║   ██║██╔══██╗██╔════╝██║   ██║                  ♫
♫                      ██║   ██║██████╔╝███S██╗  ██║   ██║                ♫
 ♫                     ██║   ██║██╔═══╝ ██╔══╝  ██║   ██║                  ♫  
♫                      ╚██████╔╝██║     ███████╗╚██████╔╝                ♫
 ♫                      ╚═════╝ ╚═╝     ╚══════╝ ╚═════╝                   ♫
""");
            System.out.println("============================================");
            System.out.println("            INICIAR SESION");
            System.out.println("============================================");
            System.out.println("1.----- REGISTRARSE CON GOOGLE");
            System.out.println("2.----- INICIAR SESION GOOGLE");
            System.out.println("3.----- ENTRAR COMO INVITADO");
            System.out.println("4.----- SALIR");
            int opcionSESION= sc.nextInt();
            switch (opcionSESION){
                case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("        REGISTRO - GOOGLE");
                    System.out.println("-------------------------------------");
                    System.out.println("INGRESE SU CORREO ELECTRONICO:");
                    correoREGISTRO= sc.next();
                    System.out.println("INGRESE SU CONTRASEÑA:");
                    contraseñaREGISTRO= sc.next();
                    System.out.println("INGRESE SU NOMBRE DE USUARIO:");
                    nombreSESION= sc.next();
                    if (nombreSESION.equals("")||contraseñaREGISTRO.equals("")||correoREGISTRO.equals("")){
                        System.out.println("UNO DE LOS DATOS ESTA VACIO!!");
                        INICIO_SE=false ;
                    }
                    else {
                        System.out.println("-------------------------------------");
                        System.out.println("    CONFIRMA LOS DATOS NUEVAMENTE");
                        System.out.println("-------------------------------------");
                        System.out.println("INGRESE SU CORREO ELECTRONICO:");
                        correoVERIFICACION = sc.next();
                        System.out.println("INGRESE SU CONTRASEÑA:");
                        contraseñaVERIFICACION= sc.next();
                    }
                    if (contraseñaVERIFICACION.equals(contraseñaREGISTRO)&& correoVERIFICACION.equals(correoREGISTRO)){
                        System.out.println("DATOS CORRECTAMENTE REGISTRADOS CORRECTAMENTE...");
                        System.out.println("-------------------------------------");
                        System.out.println("            INICIAR SESION");
                        System.out.println("-------------------------------------");
                        System.out.println("1.----- INICIAR SESION  GOOGLE");
                        System.out.println("2.-----        SALIR");
                        int opcionYIR= sc.nextInt();
                        switch (opcionYIR){
                            case 1:
                                System.out.println("    INGRESE SU CORREO Y CONTRASEÑA DE GOOGLE");
                                System.out.println("---------------------------------------------");
                                System.out.println("INGRESE SU CORREO ELECTRONICO:");
                                correoVERIFICACION = sc.next();
                                System.out.println("INGRESE SU CONTRASEÑA:");
                                contraseñaVERIFICACION= sc.next();
                                if (contraseñaVERIFICACION.equals(contraseñaREGISTRO)&& correoVERIFICACION.equals(correoREGISTRO)){
                                    System.out.println("DATOS CORRECTOS...");
                                    System.out.println("INICIANDO SESION.......");
                                    INICIO_SE=true;
                                }
                                else {
                                    System.out.println("DATOS INCORRECTOS!!!");
                                    INICIO_SE=false;
                                }
                                break;
                            case 2:
                                System.out.println("SALIENDO.....");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("OPCION NO VALIDA VUELVELO AH INTENTAR!!");
                                INICIO_SE=false;
                        }
                    }
                    else {
                        System.out.println("DATOS INCORRECTOS... INTENTALO DE NUEVO!");
                        INICIO_SE=false;
                    }
                    break;
                case 2:
                    System.out.println("------------------------");
                    System.out.println("INICIO DE SESION GOOGLE");
                    System.out.println("------------------------");
                    System.out.println("INGRESE SU CORREO ELETRONICO:");
                    sc.nextLine();
                    String correoGOOGLE= sc.nextLine();
                    System.out.println("INGRESE SU CONTRASEÑA:");
                    String contrseñaGOOGLE= sc.nextLine();
                    if (contrseñaGOOGLE.equals("")||correoGOOGLE.equals("")){
                        System.out.println("UNO DE LOS DATOS ESTA VACIO!!");
                        INICIO_SE=false ;
                    }
                    else {
                        System.out.println("¡¡INICIO DE SESION CORRECTAMENTE!!");
                        INICIO_SE=true;
                    }
                    break;
                case 3:
                    System.out.println("USUARIO INVITADO");
                    INICIO_SE=true;
                    break;
                case 4:
                    System.out.println("SALIENDO.....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("OPPCION INCORRECTA!");
            }
        }
        while (!INICIO_SE);
        menuPrincipal(sc);
    }
    public static void menuPrincipal(Scanner sc) {
        int opcion;
        do {
            System.out.println("============================================");
            System.out.println("       BIENVENIDO A AUDIOMUSIC");
            System.out.println("============================================");
            System.out.println("1.----- VER BAJOS ELECTRICOS");
            System.out.println("2.----- VER ESTUCHES");
            System.out.println("3.----- VER CUERDAS");
            System.out.println("4.----- IR AL CARRITO DE COMPRAS");
            System.out.println("5.----- SALIR");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    mostrarBajosElectricos(sc);
                    break;
                case 2:
                    mostrarEstuches(sc);
                    break;
                case 3:
                    mostrarCuerdas(sc);
                    break;
                case 4:
                    carritoDeCompras(sc);
                    break;
                case 5:
                    System.out.println("SALIENDO.....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("OPCION INCORRECTA!");
            }
        }
        while (opcion != 5);
    }
    static double total = 0;
 
    // ========== BAJOS ELECTRICOS ==========
    public static void mostrarBajosElectricos(Scanner sc) {
        String[] bajos = {
                "Bajo de 4 cuerdas con sonido clasico y gran comodidad (MARCA-FENDER)",
                "Bajo profesional de 5 cuerdas ideal para funk y jazz (MARCA-FENDER)",
                "Bajo premium de 5 cuerdas con excelente definicion (MARCA-IBANEZ)",
                "Bajo elegante con sonido moderno y potente (MARCA-IBANEZ)",
                "Bajo de 5 cuerdas con gran versatilidad tonal (MARCA-IBANEZ)",
                "Bajo ligero y comodo para presentaciones en vivo (MARCA-IBANEZ)",
                "Bajo de 4 cuerdas con acabado moderno y sonido brillante (MARCA-IBANEZ)",
                "Bajo multiescala de 5 cuerdas para mayor precision (MARCA-IBANEZ)",
                "Bajo ergonomico sin clavijero con diseno moderno (MARCA-IBANEZ)",
                "Bajo de 5 cuerdas con sonido profundo y profesional (MARCA-IBANEZ)"
        };
        double[] precios = {
                8799, 8599, 8499, 8499,
                8199, 7999, 6999, 5999,
                5499, 4399
        };
        System.out.println("===== BAJOS ELECTRICOS =====");
        for (int i = 0; i < bajos.length; i++) {
            System.out.println((i + 1) + ". " + bajos[i] + " - S/ " + precios[i]);
        }
        System.out.println("Seleccione un producto (0 para cancelar): ");
        int eleccion = sc.nextInt();
        if (eleccion >= 1 && eleccion <= bajos.length) {
            total = total + precios[eleccion - 1];
            System.out.println("Producto agregado correctamente");
        } else if (eleccion == 0) {
            System.out.println("Operacion cancelada");
        } else {
            System.out.println("Opcion no valida");
        }
    }
 
    // ========== ESTUCHES ==========
    public static void mostrarEstuches(Scanner sc) {
        String[] estuches = {
                "Estuche de bajo electrico Rockbag RB20845B COLOR NEGRO",
                "Estuche de bajo RockBag RB20605/PLUS-PREMIUN",
                "Estuche de bajo acustico Rockbag RB 20510 Starline",
                "Estuche de bajo electrico Ibanez IBB541TW",
                "Estuche de bajo electrico Ibanez IBB541 COLOR NEGRO",
                "Estuche de bajo electrico Ibanez IBB541-COLOR BEIGE",
                "Estuche de bajo electrico Rockbag RB20505B BK",
                "Estuche de bajo acustico Rockbag RB 20520 B SERIE STUDENT",
                "Estuche de bajo Acustico IBANEZ IABB101",
                "Estuche de bajo electrico IBANEZ IBB101"
        };
        double[] precios = {
                419, 399, 369, 209,
                199, 169, 159, 109,
                79, 69
        };
        System.out.println("===== ESTUCHES =====");
        for (int i = 0; i < estuches.length; i++) {
            System.out.println((i + 1) + ". " + estuches[i] + " - S/ " + precios[i]);
        }
        System.out.println("Seleccione un producto (0 para cancelar): ");
        int eleccion = sc.nextInt();
        if (eleccion >= 1 && eleccion <= estuches.length) {
            total = total + precios[eleccion - 1];
            System.out.println("Producto agregado correctamente");
        } else if (eleccion == 0) {
            System.out.println("Operacion cancelada");
        } else {
            System.out.println("Opcion no valida");
        }
    }
 
    // ========== CUERDAS ==========
    public static void mostrarCuerdas(Scanner sc) {
        String[] cuerdas = {
                "Cuerdas para bajo electrico Ernie Ball 50-105 Stainless Steel Flatwound",
                "Set 6 cuerdas para bajo electrico Ernie Ball 32-130 Slinky",
                "Set 5 cuerdas para bajo electrico Ernie Ball 40-125",
                "Cuerdas para bajo electrico Ernie Ball 55-110",
                "Set de 6 cuerdas Daddario para bajo EXL170-6",
                "Cuerdas bajo Ernie Ball PO2821 BASS 5-STR POWER",
                "Cuerdas para bajo Ernie Ball P02836 BASS 5-STR SLINKY",
                "Cuerdas para bajo Ernie Ball PO2832 BASS REGLR SLINKY",
                "Cuerdas para bajo Ernie Ball PO2833 BASS HYBRD SLINKY",
                "Cuerdas para bajo Daddario EXL170 (TP)"
        };
        double[] precios = {
                239, 219, 199, 149,
                149, 115, 115, 99,
                99, 95
        };
        System.out.println("===== CUERDAS =====");
        for (int i = 0; i < cuerdas.length; i++) {
            System.out.println((i + 1) + ". " + cuerdas[i] + " - S/ " + precios[i]);
        }
        System.out.println("Seleccione un producto (0 para cancelar): ");
        int eleccion = sc.nextInt();
        if (eleccion >= 1 && eleccion <= cuerdas.length) {
            total = total + precios[eleccion - 1];
            System.out.println("Producto agregado correctamente");
        } else if (eleccion == 0) {
            System.out.println("Operacion cancelada");
        } else {
            System.out.println("Opcion no valida");
        }
    }
 
    public static void carritoDeCompras(Scanner sc) {
        String nombre, apellido, correo, telefono;
        String metodoPago="";
        String ubiDelRecojo="";
        String respuestaLUGAR="";
        int opcion, documento;
        double monto_TOTAL=0, pago=0, vuelto, igv;
        boolean datosCorrectos;
        System.out.println("=====================================");
        System.out.println("      CARRITO DE COMPRAS-AUDIOMUSIC");
        System.out.println("           DATOS PERSONALES");
        System.out.println("=====================================");
        do {
            datosCorrectos = true;
            System.out.println("Ingrese sus nombres");
            sc.nextLine();
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
        monto_TOTAL = total;
        System.out.println("===SELCCIONE EL METODO DE PAGO (marque un numero)===");
        System.out.println("1.- TARJETA DE CREDITO O DEBITO");
        System.out.println("2.- PAGO POR DEPOSITO");
        System.out.println("3.- EFECTIVO");
        opcion= sc.nextInt();
        switch (opcion){
            case 1:
                metodoPago="TARJETA";
                validaPagoTarjeta(sc, monto_TOTAL);
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
            case 1:
                ubiDelRecojo="JULIACA";
                break;
            case 2:
                ubiDelRecojo="PUNO";
                break;
            case 3:
                ubiDelRecojo="AREQUIPA";
                break;
            case 4:
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
    }
    public static double calcularVuelto(double pago, double monto_TOTAL){
        return pago-monto_TOTAL;
    }
    public static double calcularIGV(double monto_TOTAL){
        return monto_TOTAL*0.18;
    }
    public static void validaPagoTarjeta(Scanner sc, double monto_TOTAL) {
        String nroTarjeta, fechaVnecimiento, cvv;
        boolean paAprovado = false;
        System.out.println("El monto total ah pagar es:   " + monto_TOTAL);
        do {
            System.out.println("Ingrese los 16 digitos de la tarjeta");
            nroTarjeta = sc.next();
            sc.nextLine();
            System.out.println("Ingrese la fecha de caducidad (MM/AA)");
            fechaVnecimiento = sc.next();
            System.out.println("Ingrese el codgio de seguridad");
            cvv = sc.next();
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
