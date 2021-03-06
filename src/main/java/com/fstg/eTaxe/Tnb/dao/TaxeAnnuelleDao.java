/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.eTaxe.Tnb.dao;

import com.fstg.eTaxe.Tnb.bean.Proprietaire;
import com.fstg.eTaxe.Tnb.bean.TaxeAnnuelle;
import com.fstg.eTaxe.Tnb.bean.Terrain;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author yassine
 */
@Repository
public interface TaxeAnnuelleDao  extends   JpaRepository<TaxeAnnuelle, Long>{
    
  public TaxeAnnuelle findByAnneeAndTerrainAndProprietaire(int annee, Terrain Terrain, Proprietaire proprietaire);
    
//  @Query("select t from Terrain t where t.annee = ?1 and t.id = ?2.id")
  public TaxeAnnuelle findByAnneeAndTerrain(int annee, Terrain Terrain);
  
  public Boolean existsByAnneeAndTerrain(int annee, Terrain terrain);
  
   public List<TaxeAnnuelle> findByAnnee(int annee);
   
   public List<TaxeAnnuelle> findByTerrain(Terrain terrain);
  
   public List<TaxeAnnuelle> findByProprietaire(Proprietaire proprietaire);
    
}
