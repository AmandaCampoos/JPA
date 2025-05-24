/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lp3_relacionamentos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


/**
 *
 * @author amand
 */
public class EnderecoDAO {
    private EntityManager em;
    
    public EnderecoDAO(EntityManager em) {
        this.em = em;
    }
    
    public void inserir(Endereco endereco) {
        try {
            em.getTransaction().begin();
            em.persist(endereco);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
    
    public void atualizar(Endereco endereco) {
        try {
            em.getTransaction().begin();
            em.merge(endereco);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
    
    public void remover(Endereco endereco) {
        try {
            em.getTransaction().begin();
            em.remove(endereco);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
    
    public Endereco consultarPorId(int id) {
        Query query = em.createQuery("select p from Endereco p where p.id = :id");
        query.setParameter("id", id);
        return (Endereco) query.getSingleResult();
    }
    
    public List<Endereco> consultarTodos() {
        Query query = em.createQuery("select p from Endereco p");
        return query.getResultList();
    }
    
}
