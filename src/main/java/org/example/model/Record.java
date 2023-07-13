package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "records")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long edad;
    @Column(name = "nombre", nullable = true, length = 180)
    private  String nombre;
    @Column(name = "apellido", nullable = true, length = 180)
    private  String apellido;
    @Column(name = "tipo de record", nullable = true, length = 180)
    private  String Tipo;
    @Column(name = "record", nullable = true, length = 180)
    private  String record;

    public Record(Long edad, String nombre, String apellido, String tipo, String record) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Tipo = tipo;
        this.record = record;
    }

    public Record() {

    }

    public Long getEdad() {
        return edad;
    }

    public void setEdad(Long edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }
}
