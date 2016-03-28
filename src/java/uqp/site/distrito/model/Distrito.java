/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uqp.site.distrito.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import uqp.site.bairro.model.Bairro;
import uqp.site.provincia.model.Provincia;

/**
 *
 * @author sgauane
 */

@Entity
@Table
public class Distrito {

    @Id
    private Long id;
    private String nome;
    @ManyToOne
    private Provincia provincia;
    @OneToMany
    private Set<Bairro> bairros;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Set<Bairro> getBairros() {
        return bairros;
    }

    public void setBairros(Set<Bairro> bairros) {
        this.bairros = bairros;
    }
    
}
