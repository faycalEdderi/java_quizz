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
        JLabel displayText = new JLabel("<html><h1>Bienvenue</h1></html>");
        JTextArea displayList = new JTextArea();
        displayList.setEditable(false);

        JPanel validationPanel = new JPanel();
        JLabel verification = new JLabel();

        JButton confirmation = new JButton("Confirmer");
        JButton retour = new JButton("Retour");


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
        boutonA.setBounds(10, 240, 100, 20);
        boutonB.setBounds(130, 240, 100, 20);
        boutonC.setBounds(250, 240, 100, 20);

        displayText.setBounds(100, 40, 480, 20);
        displayList.setBounds(10, 75, 420, 150);
        displayList.setVisible(false);

        verification.setBounds(width/4, height/3, width, 20);

        confirmation.setBounds(width/3, 240, 100, 20);
        retour.setBounds(250, 240, 100, 20);

        // Ajout des elements aux panels
        panel.add(boutonA);
        panel.add(boutonB);
        panel.add(boutonC);
        panel.add(displayPrice);
        panel.add(displayText);
        panel.add(displayList);

        validationPanel.add(confirmation);
        validationPanel.add(verification);
        validationPanel.add(retour);

// Definition de la taille de la fenetre
        window.setSize(width,height);





        // affichage de la fenetre est visible
        window.setContentPane(panel);
        window.setVisible(true);


    }

}
