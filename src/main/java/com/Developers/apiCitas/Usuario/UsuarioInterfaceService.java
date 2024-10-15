package com.Developers.apiCitas.Usuario;

import com.Developers.apiCitas.model.Usuarios;
import com.Developers.apiCitas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

//Servicio del repositorio que nos permite realizar diferemtes metodos como consultar actualizar e

@Service
public class UsuarioInterfaceService implements UsuarioRepository {
    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public void flush() {

    }

    @Override
    public <S extends Usuarios> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Usuarios> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteInBatch(Iterable<Usuarios> entities) {
        UsuarioRepository.super.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Usuarios> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Usuarios getOne(Long aLong) {
        return null;
    }

    @Override
    public Usuarios getById(Long aLong) {
        return null;
    }

    @Override
    public Usuarios getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Usuarios> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Usuarios> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Usuarios> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Usuarios> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Usuarios> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Usuarios> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Usuarios, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Usuarios> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Usuarios> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Usuarios> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Usuarios> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public List<Usuarios> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Usuarios entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Usuarios> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Usuarios> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Usuarios> findAll(Pageable pageable) {
        return null;
    }
}
