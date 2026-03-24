package com.example.Pedidos.service;

import com.example.Pedidos.model.PedidoModel;
import com.example.Pedidos.repository.PedidoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public PedidoModel salvar(PedidoModel pedido) {
        return repository.save(pedido);
    }

    public List<PedidoModel> listarTodos() {
        return repository.findAll();
    }

    public Optional<PedidoModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}