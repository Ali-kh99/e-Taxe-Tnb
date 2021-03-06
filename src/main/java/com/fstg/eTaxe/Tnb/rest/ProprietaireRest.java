/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.eTaxe.Tnb.rest;

import com.fstg.eTaxe.Tnb.bean.Categorie;
import com.fstg.eTaxe.Tnb.bean.Proprietaire;
import com.fstg.eTaxe.Tnb.bean.Terrain;
import com.fstg.eTaxe.Tnb.service.ProprietaireService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yassine
 */
@RestController
@RequestMapping("/e-Taxe-Tnb/proprietaire")
public class ProprietaireRest {

    @Autowired // permet d'instensier un objet   // si il troveent beaucoup de class fille erreur 
    private ProprietaireService proprietaireService;

    // already testes
    @PostMapping(value = "/")
    public String save(@RequestBody Proprietaire proprietaire) {
        return proprietaireService.save(proprietaire);
    }

    // tested
    @GetMapping(value = "/nom/{nom}")
    public Proprietaire findByNom(@PathVariable String nom) {
        return proprietaireService.findByNom(nom);
    }

    // tested
    @GetMapping(value = "/prenom/{prenom}")
    public Proprietaire findByPrenom(@PathVariable String prenom) {
        return proprietaireService.findByPrenom(prenom);
    }

    // tested
    @GetMapping(value = "/adresse/{adresse}")
    public Proprietaire findByAdresse(@PathVariable String adresse) {
        return proprietaireService.findByAdresse(adresse);
    }

    // tested
    @GetMapping(value = "/email/{email}")
    public Proprietaire findByEmail(@PathVariable String email) {
        return proprietaireService.findByEmail(email);
    }

    // tested
    @GetMapping("/")
    public List<Proprietaire> findAll() {
        return proprietaireService.findAll();
    }

    // tested
    @DeleteMapping(value = "/id/{id}")
    public void deleteProprietaire(@PathVariable Long id) {
        proprietaireService.deleteProprietaire(id);
    }

    //tested
    @GetMapping(value = "/referance/{referance}")
    public Proprietaire findByReferance(@PathVariable String referance) {
        return proprietaireService.findByReferance(referance);
    }
    // already tested (yassine)
   @GetMapping("/n/{n}/id/{id}")
    public Proprietaire findPersonneNotifier(@PathVariable int n,@PathVariable long id) {
      return proprietaireService.findPersonneNotifier(n, id);
    }
    // already test (yassine)
   @GetMapping("/n/{n}")
    public List<Proprietaire> findPersonneNotifierr(@PathVariable int n) {
        return proprietaireService.findPersonneNotifierr(n);
    }
    

    @PutMapping("/referance/{referance}")
    public String update(@PathVariable String referance, @RequestBody Proprietaire proprietaire) {
        return proprietaireService.update(referance, proprietaire);
    }

    @GetMapping("/exist/referance/{referance}")
    public String exist(@PathVariable String referance) {
        if (proprietaireService.exist(referance)) {
            return "Le proprietaire " + proprietaireService.findByReferance(referance).getNom() + " " + proprietaireService.findByReferance(referance).getPrenom() + " existe";
        } else {
            return "Le proprietaire " + referance + " n'existe pas";
        }
    }

}
