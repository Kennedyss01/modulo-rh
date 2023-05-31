/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.modulorh.avaliacaoperformance.service;

import br.com.ifba.modulorh.avaliacaoperformance.model.AvaliacaoPerformance;
import java.util.List;

/**
 *
 * @author Kaio
 */
public interface IServiceAvaliacaoPerformance {

    public AvaliacaoPerformance saveAvaliacaoPerformance(AvaliacaoPerformance avaliacaoPerformance);
    public AvaliacaoPerformance updateAvaliacaoPerformance(AvaliacaoPerformance avaliacaoPerformance);
    public void deleteAvaliacaoPerformance(AvaliacaoPerformance avaliacaoPerformance);
    public List<AvaliacaoPerformance> getAllAvaliacaoPerformance();
    public AvaliacaoPerformance findById(Long id);
    
}
