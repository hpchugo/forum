package br.com.hugo.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hugo.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
	Curso findByNome(String nome);
}
