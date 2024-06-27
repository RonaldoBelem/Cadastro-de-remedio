package com.cadastro.remedio.remedio.RemedioEntity;

import com.cadastro.remedio.remedio.RemedioAtualizar.RemedioAtualizar;
import com.cadastro.remedio.remedio.RemedioDto.RemedioDto;
import com.cadastro.remedio.remedio.RemedioRepository.RemedioRepository;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
@Data
@Entity
@Table(name = "remedio")
@AllArgsConstructor
@NoArgsConstructor
public class RemedioEntity implements RemedioRepository {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome",length = 50)
    private String nome;
    @Column(name = "fornecedor",length = 50)
    private String fornecedor;
    @Column(name = "validade")
    private LocalDate validade;


    public RemedioEntity(RemedioDto remedio){

            this.nome = remedio.nome();
            this.fornecedor = remedio.fornecedor();
            this.validade = remedio.validade();
    }

    public RemedioEntity(RemedioAtualizar remedio) {
        this.id = remedio.id();
        this.nome = remedio.nome();
        this.fornecedor = remedio.fornecedor();
        this.validade = remedio.validade();
    }


    @Override
    public void flush() {

    }

    @Override
    public <S extends RemedioEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends RemedioEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<RemedioEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public RemedioEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public RemedioEntity getById(Long aLong) {
        return null;
    }

    @Override
    public RemedioEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends RemedioEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends RemedioEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends RemedioEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends RemedioEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends RemedioEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends RemedioEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends RemedioEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends RemedioEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends RemedioEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<RemedioEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<RemedioEntity> findAll() {
        return null;
    }

    @Override
    public List<RemedioEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(RemedioEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends RemedioEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<RemedioEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<RemedioEntity> findAll(Pageable pageable) {
        return null;
    }
}
