/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.eTaxe.Tnb.service;

import com.fstg.eTaxe.Tnb.bean.Proprietaire;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author yassine
 */
public interface ProprietaireService {

    public String save(Proprietaire proprietaire);

    public Proprietaire findByNom(String nom);

    public Proprietaire findByPrenom(String prenom);

    public Proprietaire findByAdresse(String adresse);

    public Proprietaire findByEmail(String email);

    public List<Proprietaire> findAll();

    public void deleteProprietaire(Long id);

    public Proprietaire findById(Long id);

    public Proprietaire findByReferance(String referance);
    
    public String update(String referance, Proprietaire proprietaire);


    public Boolean exist(String referance);
}
