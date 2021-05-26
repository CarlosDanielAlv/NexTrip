/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.BO.PaisBO;
import br.com.model.PaisModel;
import br.com.model.VotoModel;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlo
 */
@WebServlet(name = "PaisController", urlPatterns = {"/PaisController"})
public class PaisController extends HttpServlet {

    private static String VOTE = "/"; // Variável recebe o caminho para página de votos
    private static String LIST = "/"; // Variável recebe caminho para página que lista os paises
    private ArrayList<PaisModel> listPais = new ArrayList<>(); // Array para armazenar listas de paises
    private PaisBO paisBO = new PaisBO(); // Classe PaisBO

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action"); // Aemazena a ação desejada.
        String forward = ""; // Recebe a página desejada

        //  MOSTRA TODOS OS DADOS
        if (action.equalsIgnoreCase("listPais")) {
            forward = LIST;
            try {
                listPais = paisBO.getAll();
            } catch (Exception e) {
                System.out.println("Erro ao Imprimir todos os Dados: " + e.getMessage());
            }
        }
        //INSERIR VOTOS NO BANCO DE DADOS
        if (action.equalsIgnoreCase("votar")) {
            forward = VOTE;
            try {
                int pais_id = Integer.parseInt(request.getParameter("pais_id"));
                PaisModel paisModel = new PaisModel();
                paisBO.update(paisModel);
            } catch (Exception e) {
                System.out.println("Erro ao votar: " + e.getMessage());
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // INSERT
        VotoModel vm = new VotoModel();
        
        vm.setPaisModel(request.getAttribute(""));
        vm.setQnt_votos(0);        
    }

}
