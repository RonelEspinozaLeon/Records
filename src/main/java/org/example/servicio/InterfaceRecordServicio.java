package org.example.servicio;
import org.example.model.Record;
import java.util.List;

public interface InterfaceRecordServicio {
    public List<Record> listarRecords();
    public Record agregarRecord(Record record);
    public Record actualizarRecord(Record record);


}
