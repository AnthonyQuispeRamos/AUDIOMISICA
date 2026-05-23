import java.util.Scanner;
public class INICIO_DE_SESION {
    public static void  main    (String[]args){
        Scanner sc= new Scanner(System.in);
        String correoREGISTRO;
        String contraseñaREGISTRO;
        String correoVERIFICACION="";
        String contraseñaVERIFICACION="";
        String nombreSESION;
        boolean INICIO_SE;
        do {
            INICIO_SE = true;
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
            boolean yaREGISTRADO;
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
                    }
                    break;
                case 3:
                    System.out.println("USUARIO INVITADO");
                    break;
                case    4:
                    System.out.println("SALIENDO.....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("OPPCION INCORRECTA!");
            }
        }
        while (!INICIO_SE);
        //ROY "LA OFICINA" CUANDO UNA VEZ REGISTRADO, PUEDE ACCEDER AQUII
        System.out.println("Ingresaste");
    }
}
