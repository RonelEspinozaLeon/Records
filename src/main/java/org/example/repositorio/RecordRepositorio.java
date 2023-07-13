package org.example.repositorio;
import org.example.model.Record;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepositorio extends CrudRepository<Record, Long>{
}
