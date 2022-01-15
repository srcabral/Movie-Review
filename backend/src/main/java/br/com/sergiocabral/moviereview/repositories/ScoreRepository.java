package br.com.sergiocabral.moviereview.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sergiocabral.moviereview.entities.Score;
import br.com.sergiocabral.moviereview.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
}
