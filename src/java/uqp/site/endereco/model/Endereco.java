/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uqp.site.endereco.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import uqp.site.bairro.model.Bairro;
import uqp.site.estabelecimento.model.Estabelecimento;
import uqp.site.fornecedor.model.Fornecedor;

/**
 *
 * @author sgauane
 */

@Entity
@Table
public class Endereco {

    @Id
    private Long id;
    private Float latitude,
                  longetude;
    @OneToOne
    private Fornecedor fornecedor;
    @OneToOne
    private Estabelecimento estabelecimento;
    @ManyToOne
    private Bairro bairro;
    private String numero,
                   numero_casa,
                   rua_av,
                   celula;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
