package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Timer;


public class Main {

    public static void main(String[] args) {



        // instanciation des objets
        JFrame window = new JFrame("Quizz Up");
        JPanel accueilPanel = new JPanel();
        JButton commencer = new JButton("Commencer");
        JButton boutonA = new JButton("Reponse A");
        JButton boutonB = new JButton("Reponse B");
        JButton boutonC = new JButton("Reponse C");

        Timer timer = new Timer();

        JLabel displayText = new JLabel("<html><h1>Question : </h1></html>");
        JLabel bienvenueText = new JLabel("<html><h1>Bienvenue sur Quizz Up</h1></html>");


        JLabel questionPanel = new JLabel();


        // variables
        int width = 450;
        int height = 300;
        // Configuration des panel et de la fenetre
        window.setResizable(false);
        accueilPanel.setLayout(null);
        accueilPanel.setBackground(Color.cyan);

        questionPanel.setLayout(null);
        questionPanel.setBackground(Color.cyan);

        // Taille et emplacement des differents elements de l'application
        commencer.setBounds(125, 150, 200, 30);
        boutonA.setBounds(55, 240, 100, 20);
        boutonB.setBounds(180, 240, 100, 20);
        boutonC.setBounds(305, 240, 100, 20);
        displayText.setBounds(180, 20, 480, 30);

        bienvenueText.setBounds(90, 40, 480, 30);


        accueilPanel.setBounds(width/4, height/3, width, 20);



        // Ajout des elements aux panels

        questionPanel.add(boutonA);
        questionPanel.add(boutonB);
        questionPanel.add(boutonC);
        questionPanel.add(displayText);



        accueilPanel.add(commencer);
        accueilPanel.add(bienvenueText);



// Definition de la taille de la fenetre
        window.setSize(width,height);





        // affichage de la fenetre est visible
        window.setContentPane(accueilPanel);
        window.setVisible(true);

        // Changer de panel pour commencer la partie
        commencer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.setContentPane(questionPanel);
                window.invalidate();
                window.validate();
            }
        });


    }



}
