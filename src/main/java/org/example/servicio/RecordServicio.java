package org.example.servicio;
import org.example.model.Record;
import org.example.repositorio.RecordRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RecordServicio implements InterfaceRecordServicio{
    @Autowired
    private RecordRepositorio repositorio;
    @Override
    public List<Record> listarRecords() {
        return (List<Record>) repositorio.findAll();
    }

    @Override
    public Record agregarRecord(Record record) {
        return repositorio.save(record);
    }

    @Override
    public Record actualizarRecord(Record record) {
        return repositorio.save(record);
    }
}
















