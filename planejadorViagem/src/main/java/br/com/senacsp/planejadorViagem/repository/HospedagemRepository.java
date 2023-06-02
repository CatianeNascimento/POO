package br.com.senacsp.planejadorViagem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senacsp.planejadorViagem.model.Hospedagem;

public interface HospedagemRepository extends JpaRepository<Hospedagem, Long>{

}
