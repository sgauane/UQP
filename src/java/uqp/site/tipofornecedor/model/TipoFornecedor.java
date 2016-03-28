/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uqp.site.tipofornecedor.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import uqp.site.fornecedor.model.Fornecedor;

/**
 * @descriptio Classe que cria o tipo de fornecedor dependendo da sua area de
 * accao
 * @date 29/02/2016
 * @version 1.0
 * @author sgauane
 */
@Entity
@Table
public class TipoFornecedor {

    @Id
    private Long id;
    private String tipo;
    @OneToMany
    private Set<Fornecedor> funcionarios;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Set<Fornecedor> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Set<Fornecedor> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
