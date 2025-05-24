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
public class telefoneDAO {
    public class TelefoneDAO {
    private EntityManager em;
    
    public TelefoneDAO(EntityManager em) {
        this.em = em;
    }
    
    public void inserir(Telefone telefone) {
        try {
            em.getTransaction().begin();
            em.persist(telefone);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
    
    public void atualizar(Telefone telefone) {
        try {
            em.getTransaction().begin();
            em.merge(telefone);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
    
    public void remover(Telefone telefone) {
        try {
            em.getTransaction().begin();
            em.remove(telefone);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
    
    public Telefone consultarPorId(int id) {
        Query query = em.createQuery("select p from Telefone p where p.id = :id");
        query.setParameter("id", id);
        return (Telefone) query.getSingleResult();
    }
    
    public List<Telefone> consultarTodos() {
        Query query = em.createQuery("select p from Telefone p");
        return query.getResultList();
    }
    
}

}
