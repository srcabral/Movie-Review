package br.com.sergiocabral.moviereview.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sergiocabral.moviereview.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
}
