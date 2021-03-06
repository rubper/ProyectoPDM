package sv.ues.fia.eisi.proyectopdm.db.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "TipoEvaluacion")
public class TipoEvaluacion {

    @PrimaryKey(autoGenerate = true)
    private int idTipoEvaluacion;
    private String tipoEvaluacion;
    private int numParticipantes;

    public TipoEvaluacion(int idTipoEvaluacion, String tipoEvaluacion, int numParticipantes) {
        this.idTipoEvaluacion = idTipoEvaluacion;
        this.tipoEvaluacion = tipoEvaluacion;
        this.numParticipantes = numParticipantes;
    }

    public int getIdTipoEvaluacion() {
        return idTipoEvaluacion;
    }

    public void setIdTipoEvaluacion(int idTipoEvaluacion) {
        this.idTipoEvaluacion = idTipoEvaluacion;
    }

    public String getTipoEvaluacion() {
        return tipoEvaluacion;
    }

    public void setTipoEvaluacion(String tipoEvaluacion) {
        this.tipoEvaluacion = tipoEvaluacion;
    }

    public int getNumParticipantes() {
        return numParticipantes;
    }

    public void setNumParticipantes(int numParticipantes) {
        this.numParticipantes = numParticipantes;
    }
}
