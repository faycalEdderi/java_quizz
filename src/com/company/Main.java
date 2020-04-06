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

        // tableaux a instancier ici :
        // TableauQuestion => [
        //     {id: 1, question: "J'ai des mains faites pour l'or et elles sont dans la merde."};
        //     {id: 2, question: "Moi je n'ai confiance qu'en mon manche et ma parole... l'une est de fer et l'autre d'acier !"};
        //     {id: 3, question: "On vous a pas dit qu'il pleuvait des blacks à New-York ?"};
        //     {id: 4, question:"La plupart des gens disent qu'on a besoin d'amour pour vivre. En fait, on a surtout besoin d'oxygène !" };
        //     {id: 5, question: "Si vous parlez à dieu, vous êtes croyant. S'il vous répond c'est que vous êtes schyzo."};
        //     {id: 6, question: "Le coeur d'une femme est un océan de secrets."};
        //     {id: 7, question: "C'est trop calme... j'aime pas trop beaucoup ça... J'préfère quand c'est un peu trop plus moins calme..."};
        //     {id: 8, question: "C'est difficile de mettre une laisse à un chien une fois qu'on lui a posé une couronne sur la tête."};
        //     {id: 9, question: "J'étais prêt à tourner la page, mais c'est la page qui ne veut pas se tourner."};
        //     {id: 10, question: "Mais mélanger amour et boulot ça ne marche jamais…"};
        //     {id: 11, question: "La mort est une journée qui mérite d’être vécue."};
        //     {id: 12, question: "Pas de bras, pas de chocolat."};
        //     {id: 13, question: "Je courrais toujours pour aller partout, mais je ne pensais pas pour autant que ça allait me mener quelque part."};
        //     {id: 14, question: "Il faut du courage pour affronter ses ennemis mais il en faut encore plus pour affronter ses amis…"};
        //     {id: 15, question: "T’es pas mouru l’âne, t’es pas mouru."};
        //     {id: 16, question: "Le rêve semble réel quand on y est, ce n’est que quand on se réveille qu’on se rend compte qu’il avait quelque chose d’étrange…"};
        //     {id: 17, question: "Je t’aime plus que trois fois mille."};
        //     {id: 18, question: "Dis-moi pas qu'c'est pas vrai !"};
        //     {id: 19, question: "Ouh pinaise !"};
        //     {id: 20, question: };
        // ];
        // TableauReponse = [
        //     {id: 1, reponse: "Scarface", idQuestion: }
        //     {id: 2, reponse: "Scarface", idQuestion: }
        //     {id: 3, reponse: "Men In Black" , idQuestion: }
        //     {id: 4, reponse: "Titanic", idQuestion: }
        //     {id: 5, reponse: "Titanic", idQuestion: }
        //     {id: 6, reponse: "Astérix Et Obélix : Mission Cléopâtre", idQuestion: }
        //     {id: 7, reponse: "Game of Thrones", idQuestion: }
        //     {id: 8, reponse: "Grey's Anatomy", idQuestion: }
        //     {id: 9, reponse: "La casa de papel", idQuestion: }
        //     {id: 10, reponse: "Pirates des Caraïbes, jusqu’au bout du monde", idQuestion: }
        //     {id: 11, reponse: "Intouchable", idQuestion: }
        //     {id: 12, reponse: "Forrest Gump", idQuestion: }
        //     {id: 13, reponse: "Harry Potter", idQuestion: }
        //     {id: 14, reponse: "Shrek", idQuestion: }
        //     {id: 15, reponse: "Inception", idQuestion: }
        //     {id: 16, reponse: "Avenger: Endgame", idQuestion: }
        //     {id: 17, reponse: "H", idQuestion: }
        //     {id: 18, reponse: "Les Simpson", idQuestion: }
        //     {id: 19, reponse: , idQuestion: }
        //     {id: 20, reponse: , idQuestion: }
        // ];


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
