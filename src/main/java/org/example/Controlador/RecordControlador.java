package org.example.Controlador;

import org.example.model.Record;
import org.example.servicio.RecordServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/records")
public class RecordControlador {
    @Autowired
    private RecordServicio servicio;
    @GetMapping
    public List<Record> index() {
        return servicio.listarRecords();
    }
    @PostMapping
    public Record store(@RequestBody Record record) {
        return servicio.agregarRecord(record);
    }
    @PutMapping("/{edad}")
    public Record update(@PathVariable("edad") Long edad, @RequestBody Record record) {

        Record c = new Record();
        c.setEdad(edad);
        c.setNombre(record.getNombre());
        c.setApellido(record.getApellido());
        c.setTipo(record.getTipo());
        c.setRecord(record.getRecord());
        return  servicio.actualizarRecord(c);
    }

}
