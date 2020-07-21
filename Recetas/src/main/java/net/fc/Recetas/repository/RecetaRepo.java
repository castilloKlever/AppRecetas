package net.fc.Recetas.repository;
import java.util.List;
import org.springframework.data.repository.*;
import net.fc.Recetas.entities.Receta;

public interface  RecetaRepo extends CrudRepository <Receta, Long>{
	List<Receta> findByNombre(String nombre);
	List<Receta> findByPreparacion(String preparacion);
}