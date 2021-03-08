package br.com.powerwomen.dataprovider.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.powerwomen.dataprovider.repository.entity.DetalharConteudoEntity;

@Repository
public interface DetalharConteudoRepository extends JpaRepository<DetalharConteudoEntity, Integer>{

	Optional<List<DetalharConteudoEntity>> findByIdMulherOrderByOrdemAsc(String idMulher);
	
}
