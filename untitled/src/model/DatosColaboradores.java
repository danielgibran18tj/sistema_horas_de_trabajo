package model;

import java.util.Scanner;
import static model.UiMenu.empleadoLogueado;
import static model.UiMenu.empleados;

public class DatosColaboradores {
    public Boolean regreso = false;
    public static void listaColaboradores(String textoArea , int numArea){
        for (PersonalDeEmpresa p : empleados) {
            if (p.getArea() == textoArea){
                empleadoLogueado = p;
                System.out.println("Nombres: " + empleadoLogueado.nombres
                        + "     Cedula: " + empleadoLogueado.getCedula());
            }
        }
        UiMenu.datosDeArea(textoArea);
    }

    public static void horasLaboradas(PersonalDeEmpresa colaborador) {
        boolean salida = false;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese las horas del dia del colaborador " + colaborador.nombres);
            double horas = sc.nextDouble();
            colaborador.horasDiarias.add(horas);
            System.out.println("Deseas agregar la hora del sgte dia? \n1. Si        2.No ");
            int resp = sc.nextInt();
            if (resp==1){
                salida = true;
            }else {
                salida = false;
            }
        }while (salida);
        colaborador.horasLaboradas = 0.0 ;
        for (Double d : colaborador.horasDiarias) {
            colaborador.horasLaboradas += d;
        }

        System.out.println("las horas trabajadas del colaborador " + colaborador.nombres
                + " son de " + colaborador.horasLaboradas);

        Double salarioHora = (colaborador.getSalario() / 30 ) / 8 ;
        colaborador.setPagoCorrespondiente(salarioHora * colaborador.horasLaboradas);

        System.out.println("el pago correspondiente de " + colaborador.nombres
            + " es de $ " + colaborador.getPagoCorrespondiente() + "\n\n\n");
    }

}
