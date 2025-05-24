/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lp3_relacionamentos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author amand
 */
public class LP3_Relacionamentos {

    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UP");
        EntityManager em = emf.createEntityManager();
        
        Pessoa p = new Pessoa();
     //   p.setNome("Amanda");
     //   p.setRg("123564");
        
        
    //    em.getTransaction().begin();
     //   em.persist(p);
      //  em.getTransaction().commit();
        
        
    //    Endereco e = new Endereco();
      //  e.setRua("Rua salime tanure");
      //  e.setBairro("vila mariana");
        
        
      //  em.getTransaction().begin();
   //     em.persist(e);
 //       em.getTransaction().commit();
       
       
        em.close();
        emf.close();
    }
}
