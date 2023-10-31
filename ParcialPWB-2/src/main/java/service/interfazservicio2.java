package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EntradaVehiculoServiceImpl implements EntradaVehiculoService {

    private final EntradaVehiculoRepository entradaVehiculoRepository;

    @Autowired
    public EntradaVehiculoServiceImpl(EntradaVehiculoRepository entradaVehiculoRepository) {
        this.entradaVehiculoRepository = entradaVehiculoRepository;
    }

    @Override
    public List<EntradaVehiculo> listarEntradas() {
        return entradaVehiculoRepository.findAll();
    }

    @Override
    public void guardarEntrada(EntradaVehiculo entradaVehiculo) {
        entradaVehiculoRepository.save(entradaVehiculo);
    }

    @Override
    public EntradaVehiculo obtenerEntradaPorId(Long id) {
        return entradaVehiculoRepository.findById(id).orElse(null);
    }

    @Override
    public void actualizarEntrada(EntradaVehiculo entradaVehiculo) {
        entradaVehiculoRepository.save(entradaVehiculo);
    }

    @Override
    public void eliminarEntrada(Long id) {
        entradaVehiculoRepository.deleteById(id);
    }
}
