/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Flor {
    
    private Double tamanhos;
    private Double tamanhop;
    private String nomec;
    private String nomep;
    private int ano;
    private int codigo;  

    public Double getTamanhos() {
        return tamanhos;
    }

    public void setTamanhos(Double tamanhos) {
        this.tamanhos = tamanhos;
    }

    public Double getTamanhop() {
        return tamanhop;
    }

    public void setTamanhop(Double tamanhop) {
        this.tamanhop = tamanhop;
    }

    public String getNomec() {
        return nomec;
    }

    public void setNomec(String nomec) {
        this.nomec = nomec;
    }

    public String getNomep() {
        return nomep;
    }

    public void setNomep(String nomep) {
        this.nomep = nomep;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return nomep;
    }
    
    
    
}
