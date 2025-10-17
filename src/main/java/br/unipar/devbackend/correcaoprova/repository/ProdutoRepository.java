package br.unipar.devbackend.correcaoprova.repository;

import br.unipar.devbackend.correcaoprova.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}