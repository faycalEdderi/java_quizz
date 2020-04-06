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
        JPanel panel = new JPanel();
        JButton boutonA = new JButton("Reponse A");
        JButton boutonB = new JButton("Reponse B");
        JButton boutonC = new JButton("Reponse C");

        Timer timer = new Timer();

        JLabel displayPrice = new JLabel();
        JLabel displayText = new JLabel("<html><h1>Bienvenue sur Quizz Up</h1></html>");



        JPanel validationPanel = new JPanel();
        JLabel verification = new JLabel();




        // variables
        int width = 450;
        int height = 300;
        // Configuration des panel et de la fenetre
        window.setResizable(false);
        panel.setLayout(null);
        panel.setBackground(Color.cyan);
        validationPanel.setLayout(null);
        validationPanel.setBackground(Color.cyan);

        // Taille et emplacement des differents elements de l'application
        boutonA.setBounds(55, 240, 100, 20);
        boutonB.setBounds(180, 240, 100, 20);
        boutonC.setBounds(305, 240, 100, 20);

        displayText.setBounds(90, 40, 480, 30);


        verification.setBounds(width/4, height/3, width, 20);



        // Ajout des elements aux panels
        panel.add(boutonA);
        panel.add(boutonB);
        panel.add(boutonC);
        panel.add(displayPrice);
        panel.add(displayText);



        validationPanel.add(verification);


// Definition de la taille de la fenetre
        window.setSize(width,height);





        // affichage de la fenetre est visible
        window.setContentPane(panel);
        window.setVisible(true);


    }

}
