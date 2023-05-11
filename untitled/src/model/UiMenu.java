package model;

import java.util.ArrayList;
import java.util.Scanner;

public class UiMenu {
    public static ArrayList<PersonalDeEmpresa> empleados = new ArrayList<>();
    public static PersonalDeEmpresa empleadoLogueado;

    public static void mostrarmenu() {

        //RECURSOS HUMANOS
        empleados.add(new PersonalDeEmpresa("Emily Cevillano", 98926124, "supervisor", "recursos humanos", 650.0));
        empleados.add(new PersonalDeEmpresa("Daniel Hinostrosa", 999981265, "auxiliar", "recursos humanos", 550.0));
        empleados.add(new PersonalDeEmpresa("Maicol Camacho", 939260236, "pasante", "recursos humanos", 250.0));
        empleados.add(new PersonalDeEmpresa("Elvira Villa", 985050368, "auxiliar", "recursos humanos", 550.0));
        empleados.add(new PersonalDeEmpresa("Blanca Zambrano", 939867538, "auxiliar", "recursos humanos", 550.00));
        //CONTABILIDAD
        empleados.add(new PersonalDeEmpresa("Andy Camacho", 976542687, "supervisora", "contabilidad", 600.0));
        empleados.add(new PersonalDeEmpresa("Antonella Villa", 985182581, "auxiliar", "contabilidad", 450.0));
        empleados.add(new PersonalDeEmpresa("Maximo Villa", 986181528, "pasante", "contabilidad", 300.0));
        //PRODUCCION Y BODEGA
        empleados.add(new PersonalDeEmpresa("Diego Cevillano", 973836387, "supervisor", "produccion y bodega", 700.0));
        empleados.add(new PersonalDeEmpresa("Isabel Villa", 976383683, "operador", "produccion y bodega", 600.0));
        empleados.add(new PersonalDeEmpresa("Luis Camacho", 986847387, "bodeguero", "produccion y bodega", 500.0));


        System.out.println("Selecciona la area perteneciente:");
        String respuesta = "";
        do {
            System.out.println("1. Area de recursos humanos");
            System.out.println("2. Area de contabilidad");
            System.out.println("3. Area de produccion y bodega");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            respuesta = sc.nextLine();
            switch (respuesta) {
                case "1":
                    System.out.println("Ingresaste al area de recursos humanos");
                    DatosColaboradores.listaColaboradores("recursos humanos", 1);
                    break;
                case "2":
                    System.out.println("Ingresaste al area de contabilidad");
                    DatosColaboradores.listaColaboradores("contabilidad", 2);
                    break;
                case "3":
                    System.out.println("Ingresaste al area de produccion");
                    DatosColaboradores.listaColaboradores("produccion y bodega", 3);
                    break;
                case "0":
                    System.out.println("Gracias por tu visita");
                    respuesta = "0";
                    break;
                default:
                    System.out.println("ingresaste una opcion incorrecta");
            }
        } while (respuesta != "0");
    }

    public static void datosDeArea(String usuarioArea) {
        long cedulaBuscada;
        System.out.println("ingrese la cedula correspondiente");
        boolean cedulaCorrecta = false;
        Scanner sc = new Scanner(System.in);
        do {
                cedulaBuscada = sc.nextLong();
                for (PersonalDeEmpresa p : empleados) {   //se recorre toda la lista de profesores
                    if (p.getCedula() == cedulaBuscada && p.getArea() == usuarioArea) { //hasta hayar la que de igualdad de email
                        cedulaCorrecta = true;
                        //obtener valores de usuario logeado
                        empleadoLogueado = p;
                        System.out.println("Bienvenido colaborador " + UiMenu.empleadoLogueado.nombres);
                        DatosColaboradores.horasLaboradas(empleadoLogueado);
                    }else {
                        cedulaCorrecta=true;
                    }
                }
        }while (!cedulaCorrecta);
        if (empleadoLogueado.getCedula() != cedulaBuscada){System.out.println("ingresaste una cedula no correspondiente al area\n");}
    }
}
