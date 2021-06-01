/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.BO.VotoBO;
import br.com.pesistence.VotoDAO;
import br.com.model.VotoModel;
import br.com.model.VotoModel;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlo
 */
@WebServlet(name = "VotoController", urlPatterns = {"/VotoController"})
public class VotoController extends HttpServlet {

    private static String VOTE = "/paises.html"; // Variável recebe o caminho para página de votos
    private static String LIST = "/votacao.html"; // Variável recebe caminho para página que lista os paises
    private ArrayList<VotoModel> listVoto = new ArrayList<>(); // Array para armazenar listas de paises
    private VotoBO votoBO = new VotoBO(); // Classe VotoBO

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action"); // Armazena a ação desejada.
        String forward = ""; // Recebe a página desejada

        //  MOSTRA TODOS OS DADOS
        if (action.equalsIgnoreCase("votolist")) {
            forward = LIST;
            try {
                Long voto1 = votoBO.getVotosPais1();
                Long voto2 = votoBO.getVotosPais2();
                Long voto3 = votoBO.getVotosPais3();
                Long voto4 = votoBO.getVotosPais4();
                Long voto5 = votoBO.getVotosPais5();
                System.out.println("Quantiade de votos 1: " + voto1);
                System.out.println("Quantiade de votos 2: " + voto2);
                System.out.println("Quantiade de votos 3: " + voto3);
                System.out.println("Quantiade de votos 4: " + voto4);
                System.out.println("Quantiade de votos 5: " + voto5);
            } catch (Exception e) {
                System.out.println("Erro ao Imprimir todos os Dados: " + e.getMessage());
            }
        }
        // VOTAR NO PAIS 1 
        if (action.equalsIgnoreCase("voto1")){
            forward = LIST;
            try {
                VotoModel vm = new VotoModel(1);
                VotoDAO vdao = new VotoDAO();
                vdao.save(vm);
                System.out.println("Voto 1 inserido com sucesso....");
                //votoBO.save(vm);
            } catch (Exception e) {
                System.out.println("Erro ao Votar no pais 1: " + e.getMessage());
            }
        }
        // VOTAR NO PAIS 2 
        else if (action.equalsIgnoreCase("voto2")){
            forward = "";
            try {
                votoBO.save(new VotoModel(2));
            } catch (Exception e) {
                System.out.println("Erro ao Votar no pais 2");
            }
        }
        
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
               
    }

}
