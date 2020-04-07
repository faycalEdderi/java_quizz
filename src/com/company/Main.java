package com.company;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.util.Timer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Main {


    public static void main(String[] args)  {


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
                    "La vie c'est comme une boite de chocolat.",
                    "Il faut du courage pour affronter ses ennemis mais il en faut encore plus pour affronter ses amis…",
                    "T’es pas mouru l’âne, t’es pas mouru.",
                    "Barrez-vous cons de mimes !",
                    "Je t’aime plus que trois fois mille.",
                    "Dis-moi pas qu'c'est pas vrai !",
                    "Ouh pinaise !",
                    "Un fil invisible ? C'est comme un homme invisible mais en forme de fil"
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
                {"a.Les Bronzés", "b.OSS 117", "c.La Cité de la peur"},
                {"a.Avenger: Endgame", "b.Aladdin", "c.Titanic"},
                {"a.Astérix Et Obélix", "b.Les visiteurs", "c.H: la serie"},
                {"a.H: la serie", "b.Les Simpson", "c.South Park"},
                {"a.Les Trois Freres", "b.La Tour Montparnasse Infernal", "c. Intouchable"},
        };

        String tableauReponses[] = {"b", "a", "c", "b", "c", "b", "c", "b", "a", "a", "c", "b", "b", "a", "c", "c", "a", "c", "b", "b"};

        // instanciation des objets
        JFrame window = new JFrame("Quizz Up");
        JPanel accueilPanel = new JPanel();
        JButton commencer = new JButton("Lancer le Quizz");

        JLabel question = new JLabel("Les citation vont s'afficher ici");

        JTextField reponse = new JTextField();
        reponse.setEditable(false);
        JButton valider = new JButton("Suivant");
        JButton select = new JButton("Confimer");
        JButton musicStop = new JButton("Music Off");


        JTextArea regles = new JTextArea();
        regles.setEditable(false);

        JLabel propositionA = new JLabel();
        JLabel propositionB = new JLabel();
        JLabel propositionC = new JLabel();


        JLabel displayText = new JLabel("<html><h2>De quelle serie ou film vient cette citation ? : </h2></html>");
        JLabel bienvenueText = new JLabel("<html><h1>Bienvenue sur Quizz Up</h1></html>");


        JLabel questionPanel = new JLabel();


        // variables
        int width = 720;
        int height = 480;
        // Configuration des panel et de la fenetre
        window.setResizable(false);
        accueilPanel.setLayout(null);
        accueilPanel.setBackground(Color.cyan);

        questionPanel.setLayout(null);
        questionPanel.setBackground(Color.cyan);

        // Taille et emplacement des differents elements de l'application
        commencer.setBounds(250, 250, 200, 30);

        regles.setBounds(150, 75, 420, 150);
        regles.setVisible(false);
        reponse.setBounds(180, 240, 100, 20);
        reponse.setVisible(false);
        valider.setBounds(300, 240, 150, 20);
        select.setBounds(300, 240, 150, 20);
        select.setVisible(false);
        musicStop.setBounds(15, 400, 140, 20);


        propositionA.setBounds(100, 120, 200, 20);
        propositionB.setBounds(250, 120, 200, 20);
        propositionC.setBounds(450, 120, 200, 20);

        displayText.setBounds(30, 20, 480, 30);
        question.setBounds(80, 70, 700, 30);

        bienvenueText.setBounds(200, 40, 480, 30);

        accueilPanel.setBounds(width/4, height/3, width, 20);


        // Ajout des elements aux panels

        questionPanel.add(valider);
        questionPanel.add(select);
        questionPanel.add(reponse);

        questionPanel.add(propositionA);
        questionPanel.add(propositionB);
        questionPanel.add(propositionC);

        questionPanel.add(displayText);
        questionPanel.add(question);
        questionPanel.add(regles);
        questionPanel.add(musicStop);


        accueilPanel.add(commencer);
        accueilPanel.add(bienvenueText);



// Definition de la taille de la fenetre
        window.setSize(width,height);

// changement de page
        valider.addActionListener(new ActionListener() {
            int i = 1;
            int f = 0;
            int g = -1;
            int resultat = 0;

            public void actionPerformed(ActionEvent e) {
                valider.setVisible(false);
                select.setVisible(true);
                regles.setText("Veuillez taper la bonne reponse uniquement la lettre 'a' 'b' ou 'c'");
                select.setText("C'est partie !");


                try{
                    File musicPath = new File("music.wav");
                    if(musicPath.exists() ){
                        AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                        Clip clip = AudioSystem.getClip();
                        clip.open(audioInput);
                        clip.start();
                        clip.loop(Clip.LOOP_CONTINUOUSLY);

                        // Fonction pour arreter la musique
                        musicStop.addActionListener(new ActionListener() {

                            public void actionPerformed(ActionEvent e) {
                                clip.stop();
                            }

                        });

                    }

                }catch(Exception ex){

                    ex.printStackTrace();
                }

// debut de la partie
                if(f<= 20) {

                    select.addActionListener(new ActionListener() {

                        public void actionPerformed(ActionEvent e) {
                            select.setText("Confirmer");
                            question.setVisible(true);
                            regles.setVisible(false);
                            displayText.setText("<html><h2>De quelle serie ou film vient cette citation ? : </h2></html>");

                            reponse.setEditable(true);
                            reponse.setVisible(true);

                            question.setText(" \" "+ tableauQuestions[f] + " \" ");
                            for (int j = 0; j < 1; j++) {
                                propositionA.setText(tableauPropositions[f][j]);
                                propositionB.setText(tableauPropositions[f][j + 1]);
                                propositionC.setText(tableauPropositions[f][j + 2]);

                            }
                            String getReponse = reponse.getText();
                            System.out.println("g : "+ g);
                          if(g >= 0 ){
                                String getBonneReponse = tableauReponses[g];
                                System.out.println("Bonne reponse : " + getBonneReponse);
                                System.out.println("reponse choisie: " + getReponse);
                              if ( getBonneReponse.equals(getReponse) ) {
                                  resultat = resultat + i;
                                  System.out.println("resultat : " + resultat);
                              }
                              reponse.setText("");
                            }
                            f += i;
                            g +=1;
                            System.out.println(f);
                            if(f == 20){
                                reponse.setVisible(false);
                                propositionA.setVisible(false);
                                propositionB.setVisible(false);
                                propositionC.setVisible(false);
                                select.setVisible(false);
                                question.setText("<html><h2>FINI !</h2></html>");
                                question.setBounds(200, 50, 100, 15);
                                displayText.setText("<html><h2>Votre score est de : "+ resultat + "/20</h2></html>");
                                displayText.setBounds(180, 150, 300, 150);
                                new java.util.Timer().schedule(
                                        new java.util.TimerTask() {
                                            @Override
                                            public void run() {
                                                window.dispose();
                                            }
                                        },
                                        10000
                                );
                            }
                        }
                    });
                }
                }
        });

        // affichage de la fenetre est visible
        window.setContentPane(accueilPanel);
        window.setVisible(true);

        // Changer de panel pour commencer la partie
        commencer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                regles.setText("Le but du jeu est de trouver a quel film ou serie appartienne les citations \r\n" + "Il n'y a qu'une seule proposition de bonnen sur les 3");
                regles.setVisible(true);
                question.setVisible(false);
                displayText.setText("Lancer la partie ?");
                window.setContentPane(questionPanel);
                window.invalidate();
                window.validate();
            }
        });
    }
}
