package ba.tareas.Service;

import ba.tareas.model.Tarea;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITareaService {

    public List<Tarea> listarTareas();

    public Tarea buscarTareaPorId(Long id);

    public void guardarTarea(Tarea tarea);

    public void eliminarTarea(Tarea tarea);
}
