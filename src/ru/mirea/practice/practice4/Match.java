package ru.mirea.practice.practice4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Match extends JFrame {

    JLabel LastScorer = new JLabel(), Result = new JLabel(), Winner = new JLabel();
    int re = 0, mil = 0;
    int end = (int)(Math.random() * 10);

    JButton Re = new JButton(), Mil = new JButton();
    JPanel[] pnl = new JPanel[3];
    JPanel[] pnl2 = new JPanel[3];

    public void updateScore(){
        Result.setText("Result: " + mil + "X" + re);
    }

    public void updateWinner(){
        if (mil > re){
            Winner.setText("Winner: AC Milan");
        } else if (mil == re){
            Winner.setText("Winner: DRAW");
        } else {
            Winner.setText("Winner: Real Madrid");
        }
    }

    public void updateLast(String last){
        LastScorer.setText("Last Scorer " + last);
    }

    Match(){
        super("Real Madrid vs AC Milan");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLayout(new GridLayout(1, 3));

        for(int i = 0 ; i < pnl.length ; i++)
        {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }

        pnl[1].setLayout(new GridLayout(3, 1));

        for(int i = 0 ; i < pnl2.length ; i++)
        {
            pnl2[i] = new JPanel();
            pnl[1].add(pnl2[i]);
        }

        updateScore();
        updateWinner();
        LastScorer.setText("Last Scorer:");

        Mil.setIcon(new ImageIcon("C:\\Users\\eliza\\IdeaProjects\\Practice_4\\.idea\\mil.jpg"));
        Re.setIcon(new ImageIcon("C:\\Users\\eliza\\IdeaProjects\\Practice_4\\.idea\\rel.jpg"));

        Mil.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mil++;
                updateScore();
                updateWinner();
                updateLast("AC Milan");
            }
        });

        Re.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                re++;
                updateScore();
                updateWinner();
                updateLast("Real Madrid");
            }
        });

        Mil.setPreferredSize(new Dimension(900, 600));
        Result.setPreferredSize(new Dimension(900, 200));
        Re.setPreferredSize(new Dimension(900, 600));
        LastScorer.setPreferredSize(new Dimension(900, 200));
        Winner.setPreferredSize(new Dimension(900, 200));

        Font font = new Font("Verdana", Font.PLAIN, 24);

        Result.setVerticalAlignment(JLabel.CENTER);
        Result.setHorizontalAlignment(JLabel.CENTER);
        Winner.setVerticalAlignment(JLabel.CENTER);
        Winner.setHorizontalAlignment(JLabel.CENTER);
        LastScorer.setVerticalAlignment(JLabel.CENTER);
        LastScorer.setHorizontalAlignment(JLabel.CENTER);

        Result.setForeground(Color.BLACK);
        Re.setForeground(Color.BLACK);
        Mil.setForeground(Color.BLACK);
        LastScorer.setForeground(Color.BLACK);
        Winner.setForeground(Color.BLACK);

        Result.setFont(font);
        LastScorer.setFont(font);
        Winner.setFont(font);
        Re.setFont(font);
        Mil.setFont(font);

        pnl[0].add(Mil);
        pnl[2].add(Re);
        pnl2[0].add(Winner);
        pnl2[1].add(Result);
        pnl2[2].add(LastScorer);

        setSize(1200, 640);
    }

    public static void main(String[] args) {
        new Match().setVisible(true);
    }

}
