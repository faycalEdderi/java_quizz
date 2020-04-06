package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.util.Timer;





public class Main {


    public static void main(String[] args) {


        // tableaux a de questions et reponses :
        String tableauQuestions[] =
                {
                        "J'ai des mains faites pour l'or et elles sont dans la merde.",
                        "Moi je n'ai confiance qu'en mon manche et ma parole... l'une est de fer et l'autre d'acier !",
                        "On vous a pas dit qu'il pleuvait des blacks à New-York ?",
                        "La plupart des gens disent qu'on a besoin d'amour pour vivre. En fait, on a surtout besoin d'oxygène !" ,
                        "Si vous parlez à dieu, vous êtes croyant. S'il vous répond c'est que vous êtes schyzo.",
                        "Le coeur d'une femme est un océan de secrets.",
                        "C'est trop calme... j'aime pas trop beaucoup ça... J'préfère quand c'est un peu trop plus moins calme...",
                        "C'est difficile de mettre une laisse à un chien une fois qu'on lui a posé une couronne sur la tête.",
                        "J'étais prêt à tourner la page, mais c'est la page qui ne veut pas se tourner.",
                        "Mais mélanger amour et boulot ça ne marche jamais…",
                        "La mort est une journée qui mérite d’être vécue.",
                        "Pas de bras, pas de chocolat.",
                        "Je courrais toujours pour aller partout, mais je ne pensais pas pour autant que ça allait me mener quelque part.",
                        "Il faut du courage pour affronter ses ennemis mais il en faut encore plus pour affronter ses amis…",
                        "T’es pas mouru l’âne, t’es pas mouru.",
                        "Le rêve semble réel quand on y est, ce n’est que quand on se réveille qu’on se rend compte qu’il avait quelque chose d’étrange…",
                        "Je t’aime plus que trois fois mille.",
                        "Dis-moi pas qu'c'est pas vrai !",
                        "Ouh pinaise !"
                };



        String tableauPropositions[][] = {
                {"a.Le Parrain", "b.Scarface", "c.Jacque mesrine"},
                {"a.Scarface", "b.American Gangster", "c.L'impasse"},
                {"a.Bad Boys", "b.Hancock", "c.Men In Black"},
                {"a.Grey's Anatomy", "b.Docteur House", "c.Mentalist"},
                {"a.Prison Break", "b.Grey's Anatomy", "c.Docteur House"},
                {"a.Roméo et Juliette", "b.Titanic", "c.Aladdin"},
                {"a.Suicide Squad", "b.Star Wars", "c.Astérix Et Obélix"},
                {"a.The Last Kingdom", "b.Game of Thrones", "c.Vikings"},
                {"a.Grey's Anatomy", "b.Docteur House", "c.Gossip Girl"},
                {"a.La casa de papel", "b.Prison Break", "c.El.Chapo"},
                {"a.Game of Thrones", "b.Suicide Squad", "c.Pirates des Caraïbes"},
                {"a.H: la serie", "b.Intouchable", "c.Les Simpson"},
                {"a.Titanic", "b.Forrest Gump", "c.La ligne verte"},
                {"a.Harry Potter", "b.300", "c.Le roi lion"},
                {"a.Les Simpson", "b.Le roi lion", "c.Shrek"},
                {"a.Matrix", "b.Hancock", "c.Inception"},
                {"a.Avenger: Endgame", "b.Aladdin", "c.Titanic"},
                {"a.Astérix Et Obélix", "b.Les visiteurs", "c.H: la serie"},
                {"a.H: la serie", "b.Les Simpson", "c.South Park"},
        };


        String tableauReponses[] = {"b", "a", "c", "b", "c", "b", "c", "b", "a", "a", "c", "b", "b", "a", "c", "c", "a", "c", "b"};



        // instanciation des objets
        JFrame window = new JFrame("Quizz Up");
        JPanel accueilPanel = new JPanel();
        JButton commencer = new JButton("Commencer");
        JButton boutonA = new JButton("Reponse A");
        JButton boutonB = new JButton("Reponse B");
        JButton boutonC = new JButton("Reponse C");
        JButton stopMusic = new JButton("Stop Music");

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
        stopMusic.setBounds(0, 240, 100, 20);
        displayText.setBounds(180, 20, 480, 30);

        bienvenueText.setBounds(90, 40, 480, 30);


        accueilPanel.setBounds(width/4, height/3, width, 20);



        // Ajout des elements aux panels

        questionPanel.add(boutonA);
        questionPanel.add(boutonB);
        questionPanel.add(boutonC);
        questionPanel.add(displayText);



        accueilPanel.add(commencer);
        accueilPanel.add(stopMusic);
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
        // Changer de panel pour commencer la partie
        stopMusic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }


}
