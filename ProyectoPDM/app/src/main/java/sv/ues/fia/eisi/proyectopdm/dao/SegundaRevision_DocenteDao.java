package sv.ues.fia.eisi.proyectopdm.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import sv.ues.fia.eisi.proyectopdm.db.entity.Docente;
import sv.ues.fia.eisi.proyectopdm.db.entity.SegundaRevision;
import sv.ues.fia.eisi.proyectopdm.db.entity.SegundaRevision_Docente;

/*
En esta clase hacemos una insercion a la entidad resultado de la relacion muchos a muchos entre Docente y
SegundaRevision necesitamos relacionar el campo de las llaves compuestas con la llave primaria de la entidad
El primer Query se muestra relacionando el idSegundaRevision de la tabla SegundaRevision con la compuesta
de SegundaRevision_Docente llamada idSegundaRevisionFK luego seleccionamos el campo donde queremos insertar
el dato que seria carnetDocenteFK y se crea la variable en la insercion luego en la lista asignamos esa variable
 */

@Dao
public interface SegundaRevision_DocenteDao {

    @Insert
    void insert(SegundaRevision_Docente segundaRevision_docente);

    @Query("select * from SegundaRevision inner join SegundaRevision_Docente on " +
            "SegundaRevision.idSegundaRevision=SegundaRevision_Docente.idSegundaRevisionFK "+
            "where SegundaRevision_Docente.carnetDocenteFK=:carnetDocenteFK")
    List<Docente> getDocente(final String carnetDocenteFK);

    @Query("select * from Docente inner join SegundaRevision_Docente on "+
            "Docente.carnetDocente=SegundaRevision_Docente.carnetDocenteFK "+
            "where SegundaRevision_Docente.idSegundaRevisionFK=:idSegundaRevisionFK")
    List<SegundaRevision> getSegundaRevision(final String idSegundaRevisionFK);
}
