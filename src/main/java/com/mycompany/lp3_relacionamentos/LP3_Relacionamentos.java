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

        PessoaDAO pdao = new PessoaDAO(em);
        EnderecoDAO edao = new EnderecoDAO(em);
        TelefoneDAO tdao = new TelefoneDAO(em);

//        Pessoa p = new Pessoa();
//        p.setNome("Paula");
//        p.setRg("222222");
//        pdao.inserir(p);
        
//        Endereco e = new Endereco();
//        e.setRua("Rua ABC");
//        e.setBairro("Centro");
//        p.setEndereco(e);
        
//        Telefone t1 = new Telefone();
//        Telefone t2 = new Telefone();
//        t1.setDdd("67");
//        t1.setNumero("99999-9999");
//        t2.setDdd("11");
//        t2.setNumero("99555-9998");
//        
//        p.getTelefones().add(t1);
//        p.getTelefones().add(t2);
//        pdao.inserir(p);
        
//        edao.inserir(e);
//        Pessoa p = pdao.consultarPorId(1);
//        Endereco e = edao.consultarPorId(1);
//        p.setEndereco(e);
//        e = edao.consultarPorId(1);
        
//        System.out.println("Nome: " + e.getPessoa().getNome());
//        System.out.println("Nome: " + p.getNome());
//        System.out.println("Rua: " + p.getEndereco().getRua());
//        Pessoa p = pdao.consultarPorId(3);
//        System.out.println("Nome: " + p.getNome());
//        System.out.println("RG: " + p.getRg());
//        System.out.println("Telefones:");
//        for (Telefone telefone : p.getTelefones()) {
//            System.out.print("(" + telefone.getDdd() + ") ");
//            System.out.println(telefone.getNumero());
//        }

        Telefone t = tdao.consultarPorId(2);
        System.out.println("Nome: " + t.getPessoa().getNome());
        em.close();
        emf.close();
    }
}
