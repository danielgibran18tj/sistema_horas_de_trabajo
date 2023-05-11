package model;

import java.util.ArrayList;
import java.util.List;

public class PersonalDeEmpresa {
    public String nombres;
    private long cedula;
    private String cargo;
    private String area;
    private Double salario;
    private String telefono;
    public List<Double> horasDiarias = new ArrayList<>();
    public Double diasLaborados = 0.0;
    public Double horasLaboradas = 0.0;
    private Double pagoCorrespondiente ;
    public PersonalDeEmpresa(String nombres, long cedula, String cargo, String area, Double salario) {
        this.nombres = nombres;
        this.cedula = cedula;
        this.cargo = cargo;
        this.area = area;
        this.salario = salario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Double> getHorasDiarias() {
        return horasDiarias;
    }

    public void setHorasDiarias(List<Double> horasDiarias) {
        this.horasDiarias = horasDiarias;
    }

    public Double getDiasLaborados() {
        return diasLaborados;
    }

    public void setDiasLaborados(Double diasLaborados) {
        this.diasLaborados = diasLaborados;
    }

    public Double getHorasLaboradas() {
        return horasLaboradas;
    }

    public void setHorasLaboradas(Double horasLaboradas) {
        this.horasLaboradas = horasLaboradas;
    }

    public Double getPagoCorrespondiente() {
        return pagoCorrespondiente;
    }

    public void setPagoCorrespondiente(Double pagoCorrespondiente) {
        this.pagoCorrespondiente = pagoCorrespondiente;
    }
}
