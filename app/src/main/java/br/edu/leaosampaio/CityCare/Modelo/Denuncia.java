package br.edu.leaosampaio.CityCare.Modelo;

import java.util.Calendar;

/**
 * Created by lenilson on 22/04/17.
 */

public class Denuncia {

    private Long id;
    private String descricao;
    private Categoria categoria;
    private Usuario usuario;
    private String dataHora;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora() {
        Calendar c = Calendar.getInstance();
        dataHora = String.valueOf(c.get(Calendar.DAY_OF_MONTH))+ "/" +
                String.valueOf(c.get(Calendar.MONTH))+ "/" +
                String.valueOf(c.get(Calendar.YEAR))+ "  " +
                String.valueOf(c.get(Calendar.HOUR_OF_DAY))+ ":" +
                String.valueOf(c.get(Calendar.MINUTE));
    }
}