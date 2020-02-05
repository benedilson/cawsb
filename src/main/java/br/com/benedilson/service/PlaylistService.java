package br.com.benedilson.service;

import br.com.benedilson.domain.Playlist;

import java.util.List;

public interface PlaylistService {
    void salvar(Playlist playlist);
    List<Playlist> recuperar();
    Playlist recuperarPorId(long id);
    void atualizar(Playlist playlist);
    void excluir(long id);
}
