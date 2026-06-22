import java.util.Scanner;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
public class AUDIMUSIC1 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> bajosElectricos = new ArrayList<>();
    static ArrayList<Double> precioBajosElectricos = new ArrayList<>();
    static ArrayList<String> estuches = new ArrayList<>();
    static ArrayList<Double> precioEstuches = new ArrayList<>();
    static ArrayList<String> cuerdas = new ArrayList<>();
    static ArrayList<Double> precioCuerdas = new ArrayList<>();
    static ArrayList<String> guitarrasAcusticas = new ArrayList<>();
    static ArrayList<Double> precioGuitarrasAcusticas = new ArrayList<>();
    static ArrayList<String> guitarrasElectricas = new ArrayList<>();
    static ArrayList<Double> precioGuitarrasElectricas = new ArrayList<>();
    static ArrayList<String> bajosMedios = new ArrayList<>();
    static ArrayList<Double> precioBajosMedios = new ArrayList<>();
    static ArrayList<String> pianos = new ArrayList<>();
    static ArrayList<Double> precioPianos = new ArrayList<>();
    static ArrayList<String> baterias = new ArrayList<>();
    static ArrayList<Double> precioBaterias = new ArrayList<>();
    static ArrayList<String> microfonos = new ArrayList<>();
    static ArrayList<Double> precioMicrofonos = new ArrayList<>();
    static ArrayList<Integer> carritoBajosElectricos = new ArrayList<>();
    static ArrayList<Integer> carritoEstuches = new ArrayList<>();
    static ArrayList<Integer> carritoCuerdas = new ArrayList<>();
    static ArrayList<Integer> carritoGuitarrasAcusticas = new ArrayList<>();
    static ArrayList<Integer> carritoGuitarrasElectricas = new ArrayList<>();
    static ArrayList<Integer> carritoBajosMedios = new ArrayList<>();
    static ArrayList<Integer> carritoPianos = new ArrayList<>();
    static ArrayList<Integer> carritoBaterias = new ArrayList<>();
    static ArrayList<Integer> carritoMicrofonos = new ArrayList<>();
    static String usuarioActivo = "Invitado";
    static String correoRegistrar = "";
    static String contraseñaRegistrar = "";
    static boolean cuentaCreada = false;
    static boolean esAdmin = false;
    static String nombreSESION = "";

    public static void main(String[] args) {
        inicializarProductos();
        menuPrincipal();
    }

    // ===== INICIALIZAR PRODUCTOS =====
    public static void inicializarProductos() {
        // Bajos Eléctricos
        bajosElectricos.add("Bajo de 4 cuerdas con sonido clasico y gran comodidad (MARCA-FENDER)");
        precioBajosElectricos.add(8799.0);
        bajosElectricos.add("Bajo profesional de 5 cuerdas ideal para funk y jazz (MARCA-FENDER)");
        precioBajosElectricos.add(8599.0);
        bajosElectricos.add("Bajo premium de 5 cuerdas con excelente definicion (MARCA-IBANEZ)");
        precioBajosElectricos.add(8499.0);
        bajosElectricos.add("Bajo elegante con sonido moderno y potente (MARCA-IBANEZ)");
        precioBajosElectricos.add(8499.0);
        bajosElectricos.add("Bajo de 5 cuerdas con gran versatilidad tonal (MARCA-IBANEZ)");
        precioBajosElectricos.add(8199.0);
        bajosElectricos.add("Bajo ligero y comodo para presentaciones en vivo (MARCA-IBANEZ)");
        precioBajosElectricos.add(7999.0);
        bajosElectricos.add("Bajo de 4 cuerdas con acabado moderno y sonido brillante (MARCA-IBANEZ)");
        precioBajosElectricos.add(6999.0);
        bajosElectricos.add("Bajo multiescala de 5 cuerdas para mayor precision (MARCA-IBANEZ)");
        precioBajosElectricos.add(5999.0);
        bajosElectricos.add("Bajo ergonomico sin clavijero con diseno moderno (MARCA-IBANEZ)");
        precioBajosElectricos.add(5499.0);
        bajosElectricos.add("Bajo de 5 cuerdas con sonido profundo y profesional (MARCA-IBANEZ)");
        precioBajosElectricos.add(4399.0);

        // Estuches
        estuches.add("Estuche de bajo electrico Rockbag RB20845B COLOR NEGRO");
        precioEstuches.add(419.0);
        estuches.add("Estuche de bajo RockBag RB20605/PLUS-PREMIUN");
        precioEstuches.add(399.0);
        estuches.add("Estuche de bajo acustico Rockbag RB 20510 Starline");
        precioEstuches.add(369.0);
        estuches.add("Estuche de bajo electrico Ibanez IBB541TW");
        precioEstuches.add(209.0);
        estuches.add("Estuche de bajo electrico Ibanez IBB541 COLOR NEGRO");
        precioEstuches.add(199.0);
        estuches.add("Estuche de bajo electrico Ibanez IBB541-COLOR BEIGE");
        precioEstuches.add(169.0);
        estuches.add("Estuche de bajo electrico Rockbag RB20505B BK");
        precioEstuches.add(159.0);
        estuches.add("Estuche de bajo acustico Rockbag RB 20520 B SERIE STUDENT");
        precioEstuches.add(109.0);
        estuches.add("Estuche de bajo Acustico IBANEZ IABB101");
        precioEstuches.add(79.0);
        estuches.add("Estuche de bajo electrico IBANEZ IBB101");
        precioEstuches.add(69.0);

        // Cuerdas
        cuerdas.add("Cuerdas para bajo electrico Ernie Ball 50-105 Stainless Steel Flatwound");
        precioCuerdas.add(239.0);
        cuerdas.add("Set 6 cuerdas para bajo electrico Ernie Ball 32-130 Slinky");
        precioCuerdas.add(219.0);
        cuerdas.add("Set 5 cuerdas para bajo electrico Ernie Ball 40-125");
        precioCuerdas.add(199.0);
        cuerdas.add("Cuerdas para bajo electrico Ernie Ball 55-110");
        precioCuerdas.add(149.0);
        cuerdas.add("Set de 6 cuerdas Daddario para bajo EXL170-6");
        precioCuerdas.add(149.0);
        cuerdas.add("Cuerdas bajo Ernie Ball PO2821 BASS 5-STR POWER");
        precioCuerdas.add(115.0);
        cuerdas.add("Cuerdas para bajo Ernie Ball P02836 BASS 5-STR SLINKY");
        precioCuerdas.add(115.0);
        cuerdas.add("Cuerdas para bajo Ernie Ball PO2832 BASS REGLR SLINKY");
        precioCuerdas.add(99.0);
        cuerdas.add("Cuerdas para bajo Ernie Ball PO2833 BASS HYBRD SLINKY");
        precioCuerdas.add(99.0);
        cuerdas.add("Cuerdas para bajo Daddario EXL170 (TP)");
        precioCuerdas.add(95.0);

        // Guitarras Acústicas
        guitarrasAcusticas.add("Yamaha F310");
        precioGuitarrasAcusticas.add(599.0);
        guitarrasAcusticas.add("Yamaha FX310AII");
        precioGuitarrasAcusticas.add(799.0);
        guitarrasAcusticas.add("Fender FA-125");
        precioGuitarrasAcusticas.add(699.0);
        guitarrasAcusticas.add("Fender CD-60");
        precioGuitarrasAcusticas.add(999.0);
        guitarrasAcusticas.add("Ibanez V50NJP");
        precioGuitarrasAcusticas.add(649.0);
        guitarrasAcusticas.add("Ibanez AW54");
        precioGuitarrasAcusticas.add(1299.0);
        guitarrasAcusticas.add("Takamine GD11M");
        precioGuitarrasAcusticas.add(899.0);
        guitarrasAcusticas.add("Takamine GD20");
        precioGuitarrasAcusticas.add(1399.0);
        guitarrasAcusticas.add("Cort AD810");
        precioGuitarrasAcusticas.add(549.0);
        guitarrasAcusticas.add("Cort Earth 70");
        precioGuitarrasAcusticas.add(899.0);

        // Guitarras Eléctricas
        guitarrasElectricas.add("Fender Squier Stratocaster");
        precioGuitarrasElectricas.add(999.0);
        guitarrasElectricas.add("Fender Squier Telecaster");
        precioGuitarrasElectricas.add(1099.0);
        guitarrasElectricas.add("Ibanez GRX70QA");
        precioGuitarrasElectricas.add(1199.0);
        guitarrasElectricas.add("Ibanez Gio GRG121");
        precioGuitarrasElectricas.add(999.0);
        guitarrasElectricas.add("Yamaha Pacifica 012");
        precioGuitarrasElectricas.add(899.0);
        guitarrasElectricas.add("Yamaha Pacifica 112V");
        precioGuitarrasElectricas.add(1399.0);
        guitarrasElectricas.add("Epiphone Les Paul Special II");
        precioGuitarrasElectricas.add(1299.0);
        guitarrasElectricas.add("Epiphone SG Special");
        precioGuitarrasElectricas.add(1199.0);
        guitarrasElectricas.add("Cort X100");
        precioGuitarrasElectricas.add(899.0);
        guitarrasElectricas.add("Jackson JS11");
        precioGuitarrasElectricas.add(1099.0);

        // Bajos (Gama Media)
        bajosMedios.add("Ibanez GSR200");
        precioBajosMedios.add(899.0);
        bajosMedios.add("Ibanez SR300");
        precioBajosMedios.add(1499.0);
        bajosMedios.add("Fender Squier Jazz Bass");
        precioBajosMedios.add(1299.0);
        bajosMedios.add("Fender Squier Precision Bass");
        precioBajosMedios.add(1199.0);
        bajosMedios.add("Yamaha TRBX174");
        precioBajosMedios.add(999.0);
        bajosMedios.add("Yamaha TRBX304");
        precioBajosMedios.add(1599.0);
        bajosMedios.add("Cort Action PJ");
        precioBajosMedios.add(799.0);
        bajosMedios.add("Cort GB34");
        precioBajosMedios.add(1399.0);
        bajosMedios.add("Jackson JS2 Spectra");
        precioBajosMedios.add(1299.0);
        bajosMedios.add("Epiphone Toby Standard");
        precioBajosMedios.add(999.0);

        // Pianos
        pianos.add("Roland GO KEYS 3");
        precioPianos.add(1799.0);
        pianos.add("Roland GO KEYS 5");
        precioPianos.add(2399.0);
        pianos.add("Roland FP-10");
        precioPianos.add(2799.0);
        pianos.add("Roland FP-E50");
        precioPianos.add(4399.0);
        pianos.add("Roland FP-60X");
        precioPianos.add(5999.0);
        pianos.add("Walters DK-100");
        precioPianos.add(2699.0);
        pianos.add("Walters DK-100B Brown");
        precioPianos.add(2699.0);
        pianos.add("Walters DK-100B Light Cherry");
        precioPianos.add(2399.0);
        pianos.add("Casio Celviano AP-550");
        precioPianos.add(5799.0);
        pianos.add("Roland E-X50");
        precioPianos.add(2099.0);

        // Baterías
        baterias.add("Avatar SD61-6BT");
        precioBaterias.add(1599.0);
        baterias.add("Avatar SD61-5BT");
        precioBaterias.add(1499.0);
        baterias.add("Avatar SD51-2");
        precioBaterias.add(1149.0);
        baterias.add("Avatar SD201-1S");
        precioBaterias.add(2299.0);
        baterias.add("Roland TD-02KV");
        precioBaterias.add(3299.0);
        baterias.add("Roland TD-07DMK");
        precioBaterias.add(4699.0);
        baterias.add("Avatar A-31");
        precioBaterias.add(3299.0);
        baterias.add("Roland TD-07KX");
        precioBaterias.add(6999.0);
        baterias.add("Roland TD-17KV2");
        precioBaterias.add(7499.0);
        baterias.add("Roland TD-02K");
        precioBaterias.add(1999.0);

        // Micrófonos
        microfonos.add("Shure SM58");
        precioMicrofonos.add(499.0);
        microfonos.add("Shure SM57");
        precioMicrofonos.add(479.0);
        microfonos.add("Audio-Technica AT2020");
        precioMicrofonos.add(699.0);
        microfonos.add("AKG P120");
        precioMicrofonos.add(459.0);
        microfonos.add("Behringer C1");
        precioMicrofonos.add(299.0);
        microfonos.add("Rode NT1");
        precioMicrofonos.add(1299.0);
        microfonos.add("Samson Q2U");
        precioMicrofonos.add(399.0);
        microfonos.add("Shure PGA48");
        precioMicrofonos.add(299.0);
        microfonos.add("AKG P420");
        precioMicrofonos.add(899.0);
        microfonos.add("Audio-Technica AT2040");
        precioMicrofonos.add(599.0);
    }
    public static void menuPrincipal() {
        boolean estado = true;
        while (estado) {
            System.out.println("============================================");
            System.out.println(" █████╗ ██╗   ██╗██████╗ ██╗ ██████╗ ███╗   ███╗██╗   ██╗███████╗██╗ ██████╗");
            System.out.println("██╔══██╗██║   ██║██╔══██╗██║██╔═══██╗████╗ ████║██║   ██║██╔════╝██║██╔════╝");
            System.out.println("███████║██║   ██║██║  ██║██║██║   ██║██╔████╔██║██║   ██║███████╗██║██║     ");
            System.out.println("██╔══██║██║   ██║██║  ██║██║██║   ██║██║╚██╔╝██║██║   ██║╚════██║██║██║     ");
            System.out.println("██║  ██║╚██████╔╝██████╔╝██║╚██████╔╝██║ ╚═╝ ██║╚██████╔╝███████║██║╚██████╗");
            System.out.println("╚═╝  ╚═╝ ╚═════╝ ╚═════╝ ╚═╝ ╚═════╝ ╚═╝     ╚═╝ ╚═════╝ ╚══════╝╚═╝ ╚═════╝");
            System.out.println("============================================");
            System.out.println("Status: [" + usuarioActivo + "] [admin: " + esAdmin + "]");
            System.out.println("1.----- INICIAR SESIÓN");
            System.out.println("2.----- CREAR CUENTA");
            System.out.println("3.----- TIENDA AUDIOMUSIC --> (INVITADO)");
            if (esAdmin) {
                System.out.println("4.----- PANEL DE ADMINISTRADOR");
            }
            System.out.println("5.----- SALIR");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    iniciarSesion();
                    break;
                case 2:
                    crearCuenta();
                    break;
                case 3:
                    menuTiendaCliente();
                    break;
                case 4:
                    if (esAdmin) {
                        menuAdminCRUD();
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;
                case 5:
                    System.out.println("SALIENDO.....");
                    estado = false;
                    break;
                default:
                    System.out.println("OPCION INCORRECTA!");
            }
        }
    }
    public static void iniciarSesion() {
        System.out.println("------------------------");
        System.out.println("INICIO DE SESION CORREO ELECTRONICO");
        System.out.println("------------------------");
        System.out.print("INGRESE SU CORREO ELECTRONICO: ");
        String correoIngresado = sc.nextLine();
        System.out.print("INGRESE SU CONTRASEÑA: ");
        String contraseniaIngresada = sc.nextLine();
        if (correoIngresado.equals("admin@gmail.com") && contraseniaIngresada.equals("admin123")) {
            esAdmin = true;
            usuarioActivo = "Admin";
            System.out.println("¡Bienvenido Administrador!");
        } else if (cuentaCreada && correoIngresado.equals(correoRegistrar) && contraseniaIngresada.equals(contraseñaRegistrar)) {
            esAdmin = false;
            usuarioActivo = correoIngresado;
            System.out.println("¡Bienvenido " + usuarioActivo + "!");
        } else {
            System.out.println("DATOS INCORRECTOS!!!");
        }
    }
    public static void crearCuenta() {

        System.out.println("-------------------------------------");
        System.out.println("   REGISTRO - CORREO ELECTRONICO");
        System.out.println("-------------------------------------");

        System.out.print("INGRESE SU CORREO ELECTRONICO: ");
        correoRegistrar = sc.nextLine();

        if (!correoRegistrar.contains("@")) {
            System.out.println("CORREO INVALIDO! DEBE CONTENER '@'");
            return;
        }

        if (!correoRegistrar.contains(".com")) {
            System.out.println("CORREO INVALIDO! DEBE CONTENER '.com'");
            return;
        }

        System.out.print("INGRESE SU CONTRASEÑA: ");
        contraseñaRegistrar = sc.nextLine();

        boolean tieneNumero = false;

        for (int i = 0; i < contraseñaRegistrar.length(); i++) {
            if (Character.isDigit(contraseñaRegistrar.charAt(i))) {
                tieneNumero = true;
                break;
            }
        }

        if (!tieneNumero) {
            System.out.println("LA CONTRASEÑA DEBE CONTENER AL MENOS UN NUMERO.");
            return;
        }

        if (contraseñaRegistrar.length() < 6) {
            System.out.println("LA CONTRASEÑA DEBE TENER MINIMO 6 CARACTERES.");
            return;
        }

        System.out.print("INGRESE SU NOMBRE DE USUARIO: ");
        nombreSESION = sc.nextLine();

        if (nombreSESION.equals("") || contraseñaRegistrar.equals("") || correoRegistrar.equals("")) {
            System.out.println("UNO DE LOS DATOS ESTA VACIO!!");
        } else {
            cuentaCreada = true;
            System.out.println("CUENTA CREADA..✅");
            menuTiendaCliente();
        }
    }
    public static void menuTiendaCliente() {
        int opcionTienda = 0;
        while (opcionTienda != 11) {
            System.out.println("============================================");
            System.out.println("       BIENVENIDO A AUDIOMUSIC");
            System.out.println("============================================");
            System.out.println("1.----- VER BAJOS ELECTRICOS");
            System.out.println("2.----- VER ESTUCHES");
            System.out.println("3.----- VER CUERDAS");
            System.out.println("4.----- VER GUITARRAS ACUSTICAS");
            System.out.println("5.----- VER GUITARRAS ELECTRICAS");
            System.out.println("6.----- VER BAJOS (GAMA MEDIA)");
            System.out.println("7.----- VER PIANOS");
            System.out.println("8.----- VER BATERIAS");
            System.out.println("9.----- VER MICROFONOS");
            System.out.println("10.---- IR AL CARRITO DE COMPRAS");
            System.out.println("11.---- VOLVER AL MENÚ PRINCIPAL");
            System.out.println("12.---- BUSCAR POR PRECIO INSTRUMENTO");
            System.out.print("Seleccione una opción: ");
            opcionTienda = sc.nextInt();
            sc.nextLine();
            switch (opcionTienda) {
                case 1:
                    mostrarProductos("BAJOS ELECTRICOS", bajosElectricos, precioBajosElectricos, carritoBajosElectricos);
                    break;
                case 2:
                    mostrarProductos("ESTUCHES", estuches, precioEstuches, carritoEstuches);
                    break;
                case 3:
                    mostrarProductos("CUERDAS", cuerdas, precioCuerdas, carritoCuerdas);
                    break;
                case 4:
                    mostrarProductos("GUITARRAS ACUSTICAS", guitarrasAcusticas, precioGuitarrasAcusticas, carritoGuitarrasAcusticas);
                    break;
                case 5:
                    mostrarProductos("GUITARRAS ELECTRICAS", guitarrasElectricas, precioGuitarrasElectricas, carritoGuitarrasElectricas);
                    break;
                case 6:
                    mostrarProductos("BAJOS (GAMA MEDIA)", bajosMedios, precioBajosMedios, carritoBajosMedios);
                    break;
                case 7:
                    mostrarProductos("PIANOS", pianos, precioPianos, carritoPianos);
                    break;
                case 8:
                    mostrarProductos("BATERIAS", baterias, precioBaterias, carritoBaterias);
                    break;
                case 9:
                    mostrarProductos("MICROFONOS", microfonos, precioMicrofonos, carritoMicrofonos);
                    break;
                case 10:
                    carritoDeCompras();
                    break;
                case 11:
                    menuPrincipal();
                    break;
                case 12:
                    buscarPorPrecio();
                    break;
                default:
                    System.out.println("OPCION INCORRECTA!");
            }
        }
    }
    // ===== MOSTRAR PRODUCTOS =====
    public static void mostrarProductos(String categoria, ArrayList<String> productos, ArrayList<Double> precios, ArrayList<Integer> carrito) {
        System.out.println("----------------------------");
        System.out.println("===== " + categoria + " =====");
        System.out.println("----------------------------");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i) + " - S/ " + precios.get(i));
        }
        System.out.print("Seleccione un producto (0 para cancelar): ");
        int eleccion = sc.nextInt();
        if (eleccion >= 1 && eleccion <= productos.size()) {
            carrito.add(eleccion - 1);
            System.out.println("Producto agregado correctamente.");
        } else if (eleccion == 0) {
            System.out.println("Operacion cancelada");
        } else {
            System.out.println("Opcion no valida");
        }
    }
    public static void carritoDeCompras() {
        String nombre, apellido, correo, telefono;
        String metodoPago = "";
        String ubiDelRecojo = "";
        String respuestaLUGAR = "";
        int opcion, documento;
        double monto_TOTAL, pago, vuelto, igv;
        boolean datosCorrectos;
        double totalCarrito = calcularTotalCarrito();
        if (totalCarrito == 0) {
            System.out.println("El carrito está vacío. Agregue productos primero.");
            return;
        }
        System.out.println("=====================================");
        System.out.println("      CARRITO DE COMPRAS - AUDIOMUSIC");
        System.out.println("           DATOS PERSONALES");
        System.out.println("=====================================");
        do {
            datosCorrectos = true;
            System.out.print("Ingrese sus nombres: ");
            nombre = sc.nextLine();
            System.out.print("Ingrese sus Apellidos: ");
            apellido = sc.nextLine();
            System.out.print("Ingrese su documento de identidad: ");
            documento = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese su correo electronico: ");
            correo = sc.nextLine();
            System.out.print("Ingrese su telefono: ");
            telefono = sc.nextLine();
            if (nombre.equals("") || apellido.equals("")) {
                System.out.println("UNO DE LOS DATOS ESTA VACIO! INTENTALO DE NUEVO");
                datosCorrectos = false;
            }
            if (!correo.contains("@")) {
                System.out.println("CORREO INVALIDO! DEBE CONTENER '@'");
                return;
            }
            if (!correo.contains(".com")) {
                System.out.println("CORREO INVALIDO! DEBE CONTENER '.com'");
                return;
            }
            else {
                System.out.println("¡¡DATOS REGISTRADOS CORRECTAMENTE!!");
            }
        } while (!datosCorrectos);
        monto_TOTAL = totalCarrito;
        System.out.println("=== SELECCIONE EL METODO DE PAGO ===");
        System.out.println("1.- TARJETA DE CREDITO O DEBITO");
        System.out.println("2.- PAGO POR DEPOSITO");
        System.out.println("3.- EFECTIVO");
        System.out.print("Seleccione una opción: ");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                metodoPago = "TARJETA";
                validaPagoTarjeta(monto_TOTAL);
                break;
            case 2:
                metodoPago = "PAGO POR DEPOSITO";
                break;
            case 3:
                metodoPago = "EFECTIVO";
                break;
            default:
                System.out.println("OPCION INCORRECTA, INTENTELO DE NUEVO");
        }
        System.out.println("El monto total a pagar es: S/ " + monto_TOTAL);
        System.out.print("INGRESE MONTO A PAGAR: ");
        pago = sc.nextDouble();
        System.out.println("PROCESANDO PAGO......");
        System.out.println("TENEMOS 3 TIENDAS FISICAS O ENVIOS A NIVEL NACIONAL (marque un numero)");
        System.out.println("1.-   JULIACA");
        System.out.println("2.-   PUNO");
        System.out.println("3.-   AREQUIPA");
        System.out.println("4.-   ENVIO POR UNA AGENCIA");
        System.out.print("Seleccione una opción: ");
        int opcionENTREGA = sc.nextInt();
        sc.nextLine();
        switch (opcionENTREGA) {
            case 1:
                ubiDelRecojo = "JULIACA";
                break;
            case 2:
                ubiDelRecojo = "PUNO";
                break;
            case 3:
                ubiDelRecojo = "AREQUIPA";
                break;
            case 4:
                System.out.println("CUAL ES LA AGENCIA DE SU PREFERENCIA:");
                System.out.println("1.-   SHALOM");
                System.out.println("2.-   FLORES");
                System.out.println("3.-   MARVISUR");
                System.out.print("Seleccione una opción: ");
                int opcionAgencia = sc.nextInt();
                sc.nextLine();
                switch (opcionAgencia) {
                    case 1:
                        System.out.print("ESCRIBA SU LUGAR DE DESTINO: ");
                        respuestaLUGAR = sc.nextLine();
                        break;
                    case 2:
                        System.out.print("ESCRIBA SU LUGAR DE DESTINO: ");
                        respuestaLUGAR = sc.nextLine();
                        break;
                    case 3:
                        System.out.print("ESCRIBA SU LUGAR DE DESTINO: ");
                        respuestaLUGAR = sc.nextLine();
                        break;
                    default:
                        System.out.println("OPCION NO VALIDA!!");
                }
                break;
            default:
                System.out.println("OPCION NO VALIDA!!");
        }
        if (pago >= monto_TOTAL) {

            vuelto = calcularVuelto(pago, monto_TOTAL);
            igv = calcularIGV(monto_TOTAL);

            System.out.println("\n==================================================");
            System.out.println("              BOLETA DE VENTA ELECTRÓNICA");
            System.out.println("                    AUDIOMUSIC");
            System.out.println("==================================================");
            System.out.println("RUC: 20123456789");
            System.out.println("B001-000001");
            System.out.println("Fecha: " + java.time.LocalDate.now());
            System.out.println("--------------------------------------------------");
            System.out.println("DATOS DEL CLIENTE");
            System.out.println("--------------------------------------------------");
            System.out.println("Nombre     : " + nombre + " " + apellido);
            System.out.println("Documento  : " + documento);
            System.out.println("Correo     : " + correo);
            System.out.println("Teléfono   : " + telefono);
            System.out.println("--------------------------------------------------");
            System.out.println("DETALLE DE COMPRA");
            System.out.println("--------------------------------------------------");

            System.out.printf("%-30s S/ %8.2f%n", "Subtotal:", monto_TOTAL - igv);
            System.out.printf("%-30s S/ %8.2f%n", "IGV (18%):", igv);
            System.out.printf("%-30s S/ %8.2f%n", "TOTAL:", monto_TOTAL);
            System.out.printf("%-30s S/ %8.2f%n", "PAGÓ:", pago);
            System.out.printf("%-30s S/ %8.2f%n", "VUELTO:", vuelto);

            System.out.println("--------------------------------------------------");
            System.out.println("Método de pago : " + metodoPago);
            System.out.println("Entrega tienda : " + ubiDelRecojo);
            System.out.println("Destino envío  : " + respuestaLUGAR);
            System.out.println("==================================================");
            System.out.println("          ¡GRACIAS POR SU PREFERENCIA!");
            System.out.println("               www.audiomusic.pe");
            System.out.println("==================================================");

            guardarBoletaTXT(
                    nombre,
                    apellido,
                    documento,
                    correo,
                    telefono,
                    monto_TOTAL,
                    igv,
                    pago,
                    vuelto,
                    metodoPago,
                    ubiDelRecojo,
                    respuestaLUGAR
            );

            limpiarCarritos();
        }
        else {
            System.out.println("PAGO INSUFICIENTE!!");
            System.out.println("FALTA PAGAR: S/ " + (monto_TOTAL - pago));
        }
    }
    public static void guardarBoletaTXT(
            String nombre,
            String apellido,
            int documento,
            String correo,
            String telefono,
            double monto_TOTAL,
            double igv,
            double pago,
            double vuelto,
            String metodoPago,
            String ubiDelRecojo,
            String respuestaLUGAR) {

        try {

            FileWriter archivo = new FileWriter("Boleta_Audiomusic.txt");

            archivo.write("\n==================================================\n");
            archivo.write("              BOLETA DE VENTA ELECTRÓNICA\n");
            archivo.write("                    AUDIOMUSIC\n");
            archivo.write("==================================================\n");
            archivo.write("RUC: 20123456789\n");
            archivo.write("B001-000001\n");
            archivo.write("Fecha: " + java.time.LocalDate.now() + "\n");
            archivo.write("--------------------------------------------------\n");
            archivo.write("DATOS DEL CLIENTE\n");
            archivo.write("--------------------------------------------------\n");
            archivo.write("Nombre     : " + nombre + " " + apellido + "\n");
            archivo.write("Documento  : " + documento + "\n");
            archivo.write("Correo     : " + correo + "\n");
            archivo.write("Teléfono   : " + telefono + "\n");
            archivo.write("--------------------------------------------------\n");
            archivo.write("DETALLE DE COMPRA\n");
            archivo.write("--------------------------------------------------\n");

            archivo.write(String.format("%-30s S/ %8.2f%n", "Subtotal:", monto_TOTAL - igv));
            archivo.write(String.format("%-30s S/ %8.2f%n", "IGV (18%):", igv));
            archivo.write(String.format("%-30s S/ %8.2f%n", "TOTAL:", monto_TOTAL));
            archivo.write(String.format("%-30s S/ %8.2f%n", "PAGÓ:", pago));
            archivo.write(String.format("%-30s S/ %8.2f%n", "VUELTO:", vuelto));

            archivo.write("--------------------------------------------------\n");
            archivo.write("Método de pago : " + metodoPago + "\n");
            archivo.write("Entrega tienda : " + ubiDelRecojo +  "\n");
            archivo.write("Destino envío  : " + respuestaLUGAR + "\n");
            archivo.write("==================================================\n");
            archivo.write("          ¡GRACIAS POR SU PREFERENCIA!\n");
            archivo.write("               www.audiomusic.pe\n");
            archivo.write("==================================================\n");

            archivo.close();

            System.out.println("BOLETA TXT GENERADA CORRECTAMENTE.");

        } catch (IOException e) {
            System.out.println("ERROR AL GENERAR LA BOLETA.");
        }
    }
    public static double calcularTotalCarrito() {
        double total = 0;
        System.out.println("--- 🛒 TU CARRITO DE COMPRAS ---");
        for (int idx : carritoBajosElectricos) {
            System.out.println("- " + bajosElectricos.get(idx) + " (Bajo Eléctrico) -> S/." + precioBajosElectricos.get(idx));
            total += precioBajosElectricos.get(idx);
        }
        for (int idx : carritoEstuches) {
            System.out.println("- " + estuches.get(idx) + " (Estuche) -> S/." + precioEstuches.get(idx));
            total += precioEstuches.get(idx);
        }
        for (int idx : carritoCuerdas) {
            System.out.println("- " + cuerdas.get(idx) + " (Cuerdas) -> S/." + precioCuerdas.get(idx));
            total += precioCuerdas.get(idx);
        }
        for (int idx : carritoGuitarrasAcusticas) {
            System.out.println("- " + guitarrasAcusticas.get(idx) + " (Guitarra Acústica) -> S/." + precioGuitarrasAcusticas.get(idx));
            total += precioGuitarrasAcusticas.get(idx);
        }
        for (int idx : carritoGuitarrasElectricas) {
            System.out.println("- " + guitarrasElectricas.get(idx) + " (Guitarra Eléctrica) -> S/." + precioGuitarrasElectricas.get(idx));
            total += precioGuitarrasElectricas.get(idx);
        }
        for (int idx : carritoBajosMedios) {
            System.out.println("- " + bajosMedios.get(idx) + " (Bajo Gama Media) -> S/." + precioBajosMedios.get(idx));
            total += precioBajosMedios.get(idx);
        }
        for (int idx : carritoPianos) {
            System.out.println("- " + pianos.get(idx) + " (Piano) -> S/." + precioPianos.get(idx));
            total += precioPianos.get(idx);
        }
        for (int idx : carritoBaterias) {
            System.out.println("- " + baterias.get(idx) + " (Batería) -> S/." + precioBaterias.get(idx));
            total += precioBaterias.get(idx);
        }
        for (int idx : carritoMicrofonos) {
            System.out.println("- " + microfonos.get(idx) + " (Micrófono) -> S/." + precioMicrofonos.get(idx));
            total += precioMicrofonos.get(idx);
        }
        System.out.println("---------------------------------");
        System.out.println("TOTAL ACUMULADO: S/." + total);
        System.out.println("_________________________________");
        return total;
    }
    public static void limpiarCarritos() {
        carritoBajosElectricos.clear();
        carritoEstuches.clear();
        carritoCuerdas.clear();
        carritoGuitarrasAcusticas.clear();
        carritoGuitarrasElectricas.clear();
        carritoBajosMedios.clear();
        carritoPianos.clear();
        carritoBaterias.clear();
        carritoMicrofonos.clear();
    }
    public static double calcularVuelto(double pago, double monto_TOTAL) {
        return pago - monto_TOTAL;
    }
    public static double calcularIGV(double monto_TOTAL) {
        return monto_TOTAL * 0.18;
    }
    public static void validaPagoTarjeta(double monto_TOTAL) {
        String nroTarjeta, fechaVnecimiento, cvv;
        boolean paAprovado = false;
        System.out.println("El monto total a pagar es: S/" + monto_TOTAL);
        do {
            System.out.print("Ingrese los 16 digitos de la tarjeta: ");
            nroTarjeta = sc.next();
            sc.nextLine();
            System.out.print("Ingrese la fecha de caducidad (MM/AA): ");
            fechaVnecimiento = sc.next();
            System.out.print("Ingrese el código de seguridad: ");
            cvv = sc.next();
            boolean tarjetaOK = (nroTarjeta.length() == 16);
            boolean cvvOk = (cvv.length() == 3);
            boolean fechaEstructuraOK = (fechaVnecimiento.length() == 5 && fechaVnecimiento.contains("/"));
            boolean fechaNovencida = false;
            if (fechaEstructuraOK) {
                try {
                    DateTimeFormatter Formateador = DateTimeFormatter.ofPattern("MM/yy");
                    YearMonth fechaTarjeta = YearMonth.parse(fechaVnecimiento, Formateador);
                    YearMonth fechaActual = YearMonth.now();
                    if (fechaTarjeta.isAfter(fechaActual) || fechaTarjeta.equals(fechaActual)) {
                        fechaNovencida = true;
                    }
                } catch (DateTimeParseException error) {
                    fechaEstructuraOK = false;
                }
            }
            if (tarjetaOK && fechaEstructuraOK && fechaNovencida) {
                System.out.println(" TARJETA VALIDA");
                paAprovado = true;
            } else {
                System.out.println("Operacion cancelada....");
            }
            if (!tarjetaOK) {
                System.out.println("El numero de tarjeta debe contener exactamente 16 digitos");
            }
            if (!fechaEstructuraOK) {
                System.out.println("Fromato de fecha incorrecta");
            }
            if (fechaEstructuraOK && !fechaNovencida) {
                System.out.println("¡TARJETA CADUCADA!");
            }
            if (!cvvOk) {
                System.out.println("Intente nuevamente el pago...");
            }
        }
        while (!paAprovado);
    }
    public static void menuAdminCRUD() {
        int opcionCRUD = 0;

        while (opcionCRUD != 5) {
            System.out.println("=================================");
            System.out.println("      PANEL DE ADMINISTRADOR");
            System.out.println("=================================");
            System.out.println("1.- REGISTRAR PRODUCTO");
            System.out.println("2.- ACTUALIZAR PRODUCTO");
            System.out.println("3.- ELIMINAR PRODUCTO");
            System.out.println("4.- BUSCAR PRODUCTO");
            System.out.println("5.- VOLVER AL MENU PRINCIPAL");
            System.out.print("Seleccione una opcion: ");

            opcionCRUD = sc.nextInt();
            sc.nextLine();

            switch (opcionCRUD) {
                case 1:
                    crudCrear();
                    break;
                case 2:
                    crudModificar();
                    break;
                case 3:
                    eliminarCrud();
                    break;
                case 4:
                    crudBuscar();
                    break;
                case 5:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }
    }

    public static void crudCrear() {

        System.out.println("1. Bajos Electricos");
        System.out.println("2. Estuches");
        System.out.println("3. Cuerdas");
        System.out.println("4. Guitarras Acusticas");
        System.out.println("5. Guitarras Electricas");
        System.out.println("6. Bajos Gama Media");
        System.out.println("7. Pianos");
        System.out.println("8. Baterias");
        System.out.println("9. Microfonos");

        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre del producto: ");
        String producto = sc.nextLine();

        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        sc.nextLine();

        switch (tipo) {

            case 1:
                bajosElectricos.add(producto);
                precioBajosElectricos.add(precio);
                break;

            case 2:
                estuches.add(producto);
                precioEstuches.add(precio);
                break;

            case 3:
                cuerdas.add(producto);
                precioCuerdas.add(precio);
                break;

            case 4:
                guitarrasAcusticas.add(producto);
                precioGuitarrasAcusticas.add(precio);
                break;

            case 5:
                guitarrasElectricas.add(producto);
                precioGuitarrasElectricas.add(precio);
                break;

            case 6:
                bajosMedios.add(producto);
                precioBajosMedios.add(precio);
                break;

            case 7:
                pianos.add(producto);
                precioPianos.add(precio);
                break;

            case 8:
                baterias.add(producto);
                precioBaterias.add(precio);
                break;

            case 9:
                microfonos.add(producto);
                precioMicrofonos.add(precio);
                break;

            default:
                System.out.println("Opcion invalida.");
                return;
        }

        System.out.println("Producto registrado correctamente.");
    }

    public static void crudModificar() {

        System.out.println("1. Bajos Electricos");
        System.out.println("2. Estuches");
        System.out.println("3. Cuerdas");
        System.out.println("4. Guitarras Acusticas");
        System.out.println("5. Guitarras Electricas");
        System.out.println("6. Bajos Gama Media");
        System.out.println("7. Pianos");
        System.out.println("8. Baterias");
        System.out.println("9. Microfonos");

        int tipo = sc.nextInt();
        sc.nextLine();

        int pos;

        switch (tipo) {

            case 1:
                for (int i = 0; i < bajosElectricos.size(); i++)
                    System.out.println(i + ". " + bajosElectricos.get(i));
                pos = sc.nextInt();
                sc.nextLine();
                if (pos >= 0 && pos < bajosElectricos.size()) {
                    System.out.print("Nuevo nombre: ");
                    bajosElectricos.set(pos, sc.nextLine());
                    System.out.print("Nuevo precio: ");
                    precioBajosElectricos.set(pos, sc.nextDouble());
                }
                break;

            case 2:
                for (int i = 0; i < estuches.size(); i++)
                    System.out.println(i + ". " + estuches.get(i));
                pos = sc.nextInt();
                sc.nextLine();
                if (pos >= 0 && pos < estuches.size()) {
                    System.out.print("Nuevo nombre: ");
                    estuches.set(pos, sc.nextLine());
                    System.out.print("Nuevo precio: ");
                    precioEstuches.set(pos, sc.nextDouble());
                }
                break;

            case 3:
                for (int i = 0; i < cuerdas.size(); i++)
                    System.out.println(i + ". " + cuerdas.get(i));
                pos = sc.nextInt();
                sc.nextLine();
                if (pos >= 0 && pos < cuerdas.size()) {
                    System.out.print("Nuevo nombre: ");
                    cuerdas.set(pos, sc.nextLine());
                    System.out.print("Nuevo precio: ");
                    precioCuerdas.set(pos, sc.nextDouble());
                }
                break;

            case 4:
                for (int i = 0; i < guitarrasAcusticas.size(); i++)
                    System.out.println(i + ". " + guitarrasAcusticas.get(i));
                pos = sc.nextInt();
                sc.nextLine();
                if (pos >= 0 && pos < guitarrasAcusticas.size()) {
                    System.out.print("Nuevo nombre: ");
                    guitarrasAcusticas.set(pos, sc.nextLine());
                    System.out.print("Nuevo precio: ");
                    precioGuitarrasAcusticas.set(pos, sc.nextDouble());
                }
                break;

            case 5:
                for (int i = 0; i < guitarrasElectricas.size(); i++)
                    System.out.println(i + ". " + guitarrasElectricas.get(i));
                pos = sc.nextInt();
                sc.nextLine();
                if (pos >= 0 && pos < guitarrasElectricas.size()) {
                    System.out.print("Nuevo nombre: ");
                    guitarrasElectricas.set(pos, sc.nextLine());
                    System.out.print("Nuevo precio: ");
                    precioGuitarrasElectricas.set(pos, sc.nextDouble());
                }
                break;

            case 6:
                for (int i = 0; i < bajosMedios.size(); i++)
                    System.out.println(i + ". " + bajosMedios.get(i));
                pos = sc.nextInt();
                sc.nextLine();
                if (pos >= 0 && pos < bajosMedios.size()) {
                    System.out.print("Nuevo nombre: ");
                    bajosMedios.set(pos, sc.nextLine());
                    System.out.print("Nuevo precio: ");
                    precioBajosMedios.set(pos, sc.nextDouble());
                }
                break;

            case 7:
                for (int i = 0; i < pianos.size(); i++)
                    System.out.println(i + ". " + pianos.get(i));
                pos = sc.nextInt();
                sc.nextLine();
                if (pos >= 0 && pos < pianos.size()) {
                    System.out.print("Nuevo nombre: ");
                    pianos.set(pos, sc.nextLine());
                    System.out.print("Nuevo precio: ");
                    precioPianos.set(pos, sc.nextDouble());
                }
                break;

            case 8:
                for (int i = 0; i < baterias.size(); i++)
                    System.out.println(i + ". " + baterias.get(i));
                pos = sc.nextInt();
                sc.nextLine();
                if (pos >= 0 && pos < baterias.size()) {
                    System.out.print("Nuevo nombre: ");
                    baterias.set(pos, sc.nextLine());
                    System.out.print("Nuevo precio: ");
                    precioBaterias.set(pos, sc.nextDouble());
                }
                break;

            case 9:
                for (int i = 0; i < microfonos.size(); i++)
                    System.out.println(i + ". " + microfonos.get(i));
                pos = sc.nextInt();
                sc.nextLine();
                if (pos >= 0 && pos < microfonos.size()) {
                    System.out.print("Nuevo nombre: ");
                    microfonos.set(pos, sc.nextLine());
                    System.out.print("Nuevo precio: ");
                    precioMicrofonos.set(pos, sc.nextDouble());
                }
                break;
        }

        System.out.println("Producto actualizado.");
    }

    public static void eliminarCrud() {

        System.out.println("1. Bajos Electricos");
        System.out.println("2. Estuches");
        System.out.println("3. Cuerdas");
        System.out.println("4. Guitarras Acusticas");
        System.out.println("5. Guitarras Electricas");
        System.out.println("6. Bajos Gama Media");
        System.out.println("7. Pianos");
        System.out.println("8. Baterias");
        System.out.println("9. Microfonos");

        int tipo = sc.nextInt();
        int pos;

        switch (tipo) {

            case 1:
                pos = sc.nextInt();
                bajosElectricos.remove(pos);
                precioBajosElectricos.remove(pos);
                break;

            case 2:
                pos = sc.nextInt();
                estuches.remove(pos);
                precioEstuches.remove(pos);
                break;

            case 3:
                pos = sc.nextInt();
                cuerdas.remove(pos);
                precioCuerdas.remove(pos);
                break;

            case 4:
                pos = sc.nextInt();
                guitarrasAcusticas.remove(pos);
                precioGuitarrasAcusticas.remove(pos);
                break;

            case 5:
                pos = sc.nextInt();
                guitarrasElectricas.remove(pos);
                precioGuitarrasElectricas.remove(pos);
                break;

            case 6:
                pos = sc.nextInt();
                bajosMedios.remove(pos);
                precioBajosMedios.remove(pos);
                break;

            case 7:
                pos = sc.nextInt();
                pianos.remove(pos);
                precioPianos.remove(pos);
                break;

            case 8:
                pos = sc.nextInt();
                baterias.remove(pos);
                precioBaterias.remove(pos);
                break;

            case 9:
                pos = sc.nextInt();
                microfonos.remove(pos);
                precioMicrofonos.remove(pos);
                break;
        }

        System.out.println("Producto eliminado.");
    }

    public static void crudBuscar() {

        System.out.print("Ingrese nombre exacto del producto: ");
        String buscar = sc.nextLine();

        if (bajosElectricos.contains(buscar)) {
            int i = bajosElectricos.indexOf(buscar);
            System.out.println("BAJO ELECTRICO");
            System.out.println("Precio: S/ " + precioBajosElectricos.get(i));
        } else if (estuches.contains(buscar)) {
            int i = estuches.indexOf(buscar);
            System.out.println("ESTUCHE");
            System.out.println("Precio: S/ " + precioEstuches.get(i));
        } else if (cuerdas.contains(buscar)) {
            int i = cuerdas.indexOf(buscar);
            System.out.println("CUERDAS");
            System.out.println("Precio: S/ " + precioCuerdas.get(i));
        } else if (guitarrasAcusticas.contains(buscar)) {
            int i = guitarrasAcusticas.indexOf(buscar);
            System.out.println("GUITARRA ACUSTICA");
            System.out.println("Precio: S/ " + precioGuitarrasAcusticas.get(i));
        } else if (guitarrasElectricas.contains(buscar)) {
            int i = guitarrasElectricas.indexOf(buscar);
            System.out.println("GUITARRA ELECTRICA");
            System.out.println("Precio: S/ " + precioGuitarrasElectricas.get(i));
        } else if (bajosMedios.contains(buscar)) {
            int i = bajosMedios.indexOf(buscar);
            System.out.println("BAJO GAMA MEDIA");
            System.out.println("Precio: S/ " + precioBajosMedios.get(i));
        } else if (pianos.contains(buscar)) {
            int i = pianos.indexOf(buscar);
            System.out.println("PIANO");
            System.out.println("Precio: S/ " + precioPianos.get(i));
        } else if (baterias.contains(buscar)) {
            int i = baterias.indexOf(buscar);
            System.out.println("BATERIA");
            System.out.println("Precio: S/ " + precioBaterias.get(i));
        } else if (microfonos.contains(buscar)) {
            int i = microfonos.indexOf(buscar);
            System.out.println("MICROFONO");
            System.out.println("Precio: S/ " + precioMicrofonos.get(i));
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
    public static void buscarPorPrecio() {

        System.out.print("Ingrese el precio máximo: S/ ");
        double precioMax = sc.nextDouble();

        System.out.println("PRODUCTOS ENCONTRADOS:");

        for (int i = 0; i < bajosElectricos.size(); i++) {
            if (precioBajosElectricos.get(i) <= precioMax) {
                System.out.println(bajosElectricos.get(i)
                        + " - S/ " + precioBajosElectricos.get(i));
            }
        }

        for (int i = 0; i < estuches.size(); i++) {
            if (precioEstuches.get(i) <= precioMax) {
                System.out.println(estuches.get(i)
                        + " - S/ " + precioEstuches.get(i));
            }
        }

        for (int i = 0; i < cuerdas.size(); i++) {
            if (precioCuerdas.get(i) <= precioMax) {
                System.out.println(cuerdas.get(i)
                        + " - S/ " + precioCuerdas.get(i));
            }
        }

        for (int i = 0; i < guitarrasAcusticas.size(); i++) {
            if (precioGuitarrasAcusticas.get(i) <= precioMax) {
                System.out.println(guitarrasAcusticas.get(i)
                        + " - S/ " + precioGuitarrasAcusticas.get(i));
            }
        }

        for (int i = 0; i < guitarrasElectricas.size(); i++) {
            if (precioGuitarrasElectricas.get(i) <= precioMax) {
                System.out.println(guitarrasElectricas.get(i)
                        + " - S/ " + precioGuitarrasElectricas.get(i));
            }
        }

        for (int i = 0; i < bajosMedios.size(); i++) {
            if (precioBajosMedios.get(i) <= precioMax) {
                System.out.println(bajosMedios.get(i)
                        + " - S/ " + precioBajosMedios.get(i));
            }
        }

        for (int i = 0; i < pianos.size(); i++) {
            if (precioPianos.get(i) <= precioMax) {
                System.out.println(pianos.get(i)
                        + " - S/ " + precioPianos.get(i));
            }
        }

        for (int i = 0; i < baterias.size(); i++) {
            if (precioBaterias.get(i) <= precioMax) {
                System.out.println(baterias.get(i)
                        + " - S/ " + precioBaterias.get(i));
            }
        }

        for (int i = 0; i < microfonos.size(); i++) {
            if (precioMicrofonos.get(i) <= precioMax) {
                System.out.println(microfonos.get(i)
                        + " - S/ " + precioMicrofonos.get(i));
            }
        }
    }
}