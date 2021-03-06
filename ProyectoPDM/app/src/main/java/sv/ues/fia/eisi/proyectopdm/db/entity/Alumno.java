package sv.ues.fia.eisi.proyectopdm.db.entity;



import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.room.Relation;

import java.util.List;

@Entity(tableName = "Alumno")
public class Alumno {

    @PrimaryKey
    @NonNull
    private String carnetAlumno;
    private String nombre;
    private String apellido;
    private String carrera;



    public Alumno(@NonNull String carnetAlumno, String nombre, String apellido, String carrera) {
        this.carnetAlumno = carnetAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
    }

    @NonNull
    public String getCarnetAlumno() {
        return carnetAlumno;
    }

    public void setCarnetAlumno(@NonNull String carnetAlumno) {
        this.carnetAlumno = carnetAlumno;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
