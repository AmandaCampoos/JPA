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
public class PessoaDAO {
    private EntityManager em;
    
    
    public PessoaDAO(EntityManager em){
        this.em = em;
    }
    
    public void inserir(Pessoa pessoa){
        try {
            
            em.getTransaction().begin();
            em.persist(pessoa);
            em.getTransaction().commit();
            
                
        }  catch (Exception e) {
            
            em.getTransaction().rollback();
        }
      
    }
    
      public void remover(Pessoa pessoa){
        try {
            
            em.getTransaction().begin();
            em.remove(pessoa);
            em.getTransaction().commit();
            
                
        }  catch (Exception e) {
            
            em.getTransaction().rollback();
        }
      
    }
      
        public void atualizar (Pessoa pessoa){
        try {
            
            em.getTransaction().begin();
            em.merge(pessoa);
            em.getTransaction().commit();
            
                
        }  catch (Exception e) {
            
            em.getTransaction().rollback();
        }
      
    }
        public Pessoa consultarPorId(int id){
            Query query = em.createQuery("select p from Pessoa p where p.id = :id");
              query.setParameter("id",id );
              
              return (Pessoa) query.getSingleResult();
        }
          
        public List<Pessoa> consultarTodos(){
            Query query = em.createNamedQuery("select p from Pessoa p");
            return query.getResultList();
            
        }
}
