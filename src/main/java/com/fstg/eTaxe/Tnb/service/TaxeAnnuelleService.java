/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.eTaxe.Tnb.service;

import com.fstg.eTaxe.Tnb.bean.Proprietaire;
import com.fstg.eTaxe.Tnb.bean.TaxeAnnuelle;
import com.fstg.eTaxe.Tnb.bean.Terrain;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author yassine
 */
public interface TaxeAnnuelleService {

//    public List<TaxeAnnuelle> taxesNonPayeeByTerrain(Terrain terrain);
//
//    public List<TaxeAnnuelle> taxesNonPayeeByProprietaire(Proprietaire proprietaire);
//
//    public List<TaxeAnnuelle> findTaxesNonPayeeByReferanceTerrain(Terrain terrain);
//
//    public List<Integer> anneestaxesNonPayeeByReferanceTerrain(String referance);
    public String save(TaxeAnnuelle taxeAnnuelle);

    public List<TaxeAnnuelle> findAll();

    public TaxeAnnuelle findByAnneeAndTerrainAndProprietaire(int annee, Terrain Terrain, Proprietaire proprietaire);

    public TaxeAnnuelle findByAnneeAndTerrain(int annee, Terrain Terrain);

//    public TaxeAnnuelle calculeMontant(TaxeAnnuelle taxeAnnuelle);
    public TaxeAnnuelle findById(Long id);

//    public TaxeAnnuelle calculeMontant2(TaxeAnnuelle taxeAnnuelle);
//    public void update(Long id);
//    public void calculeMontantRetard(Long id);
    public Boolean existsByAnneeAndTerrain(int annee, Terrain terrain);

    public BigDecimal totalTaxeTnbByAnnee(int annee);

    public List<TaxeAnnuelle> findByAnnee(int annee);

    public List<TaxeAnnuelle> findByTerrain(Terrain terrain);

    public List<TaxeAnnuelle> findByProprietainre(Proprietaire proprietaire);

    public List<BigDecimal> histoPaiementTerrain(Terrain terrain);

    public List<BigDecimal> histoPaiementProprietaire(Proprietaire proprietaire);

    public String pdfHistoPaiementProprietaire(Proprietaire proprietaire);

    public String pdfHistoPaiementTerrain(Terrain terrain);
}
