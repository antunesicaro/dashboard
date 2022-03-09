
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela LOJA
* @generated
*/
@Entity
@Table(name = "\"LOJA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Loja")
public class Loja implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id;


    /**
    * @generated
    */
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;


    /**
    * @generated
    */
    @Column(name = "vendas", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String vendas;


    /**
    * @generated
    */
    @Column(name = "cliente", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cliente;


    /**
    * @generated
    */
    @Column(name = "estado", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String estado;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "mesvenda", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date mesvenda;


    /**
    * Construtor
    * @generated
    */
    public Loja(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.Integer getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Loja setId(java.lang.Integer id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    public java.lang.String getNome() {
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Loja setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }
    /**
    * Obtém vendas
    * return vendas
    * @generated
    */
    public java.lang.String getVendas() {
        return this.vendas;
    }

    /**
    * Define vendas
    * @param vendas vendas
    * @generated
    */
    public Loja setVendas(java.lang.String vendas) {
        this.vendas = vendas;
        return this;
    }
    /**
    * Obtém cliente
    * return cliente
    * @generated
    */
    public java.lang.String getCliente() {
        return this.cliente;
    }

    /**
    * Define cliente
    * @param cliente cliente
    * @generated
    */
    public Loja setCliente(java.lang.String cliente) {
        this.cliente = cliente;
        return this;
    }
    /**
    * Obtém estado
    * return estado
    * @generated
    */
    public java.lang.String getEstado() {
        return this.estado;
    }

    /**
    * Define estado
    * @param estado estado
    * @generated
    */
    public Loja setEstado(java.lang.String estado) {
        this.estado = estado;
        return this;
    }
    /**
    * Obtém mesvenda
    * return mesvenda
    * @generated
    */
    public java.util.Date getMesvenda() {
        return this.mesvenda;
    }

    /**
    * Define mesvenda
    * @param mesvenda mesvenda
    * @generated
    */
    public Loja setMesvenda(java.util.Date mesvenda) {
        this.mesvenda = mesvenda;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Loja object = (Loja)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}