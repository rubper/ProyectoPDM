package sv.ues.fia.eisi.proyectopdm.db.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.sql.Time;
import java.util.Date;

@Entity(tableName = "SegundaRevision")
public class SegundaRevision {

    @PrimaryKey
    @NonNull
    private String idSegundaRevision;
    @ForeignKey(
            entity = PrimeraRevision.class,
            parentColumns = "idPrimeraRevision",
            childColumns = "idPrimeraRevisionFK"
    )@NonNull
    private String idPrimeraRevisionFK;
    private String fechaSegundaRev;
    private String horaSegundaRev;
    private double notaFinalSegundaRev;
    private String observacionesSegundaRev;
    private String fechaSolicitudSegRev;

    public SegundaRevision(@NonNull String idSegundaRevision, @NonNull String idPrimeraRevisionFK, String fechaSegundaRev, String horaSegundaRev, double notaFinalSegundaRev, String observacionesSegundaRev, String fechaSolicitudSegRev) {
        this.idSegundaRevision = idSegundaRevision;
        this.idPrimeraRevisionFK = idPrimeraRevisionFK;
        this.fechaSegundaRev = fechaSegundaRev;
        this.horaSegundaRev = horaSegundaRev;
        this.notaFinalSegundaRev = notaFinalSegundaRev;
        this.observacionesSegundaRev = observacionesSegundaRev;
        this.fechaSolicitudSegRev = fechaSolicitudSegRev;
    }

    @NonNull
    public String getIdSegundaRevision() {
        return idSegundaRevision;
    }

    public void setIdSegundaRevision(@NonNull String idSegundaRevision) {
        this.idSegundaRevision = idSegundaRevision;
    }

    @NonNull
    public String getIdPrimeraRevisionFK() {
        return idPrimeraRevisionFK;
    }

    public void setIdPrimeraRevisionFK(@NonNull String idPrimeraRevisionFK) {
        this.idPrimeraRevisionFK = idPrimeraRevisionFK;
    }

    public String getFechaSegundaRev() {
        return fechaSegundaRev;
    }

    public void setFechaSegundaRev(String fechaSegundaRev) {
        this.fechaSegundaRev = fechaSegundaRev;
    }

    public String getHoraSegundaRev() {
        return horaSegundaRev;
    }

    public void setHoraSegundaRev(String horaSegundaRev) {
        this.horaSegundaRev = horaSegundaRev;
    }

    public double getNotaFinalSegundaRev() {
        return notaFinalSegundaRev;
    }

    public void setNotaFinalSegundaRev(double notaFinalSegundaRev) {
        this.notaFinalSegundaRev = notaFinalSegundaRev;
    }

    public String getObservacionesSegundaRev() {
        return observacionesSegundaRev;
    }

    public void setObservacionesSegundaRev(String observacionesSegundaRev) {
        this.observacionesSegundaRev = observacionesSegundaRev;
    }

    public String getFechaSolicitudSegRev() {
        return fechaSolicitudSegRev;
    }

    public void setFechaSolicitudSegRev(String fechaSolicitudSegRev) {
        this.fechaSolicitudSegRev = fechaSolicitudSegRev;
    }
}
