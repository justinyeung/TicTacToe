import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TicTacToeViews implements ActionListener{
  //properties
  JFrame theframe;
  JPanel thepanel;
  JButton thebutton1;
  JButton thebutton2;
  JButton thebutton3;
  JButton thebutton4;
  JButton thebutton5;
  JButton thebutton6;
  JButton thebutton7;
  JButton thebutton8;
  JButton thebutton9;
  JButton thebutton10;
  JLabel thelabel;
  JLabel thelabel2;
  JLabel message;
  TicTacToeModel tttmodel;
  
  //method
  //local methods for the GUI View
  public void disableButton(){
    thebutton1.setEnabled(false);
    thebutton2.setEnabled(false);
    thebutton3.setEnabled(false);
    thebutton4.setEnabled(false);
    thebutton5.setEnabled(false);
    thebutton6.setEnabled(false);
    thebutton7.setEnabled(false);
    thebutton8.setEnabled(false);
    thebutton9.setEnabled(false);
  }
  
  //Controller methods that link the view to the model
  public void actionPerformed(ActionEvent evt){
    if(evt.getSource() == thebutton1){
      thebutton1.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(0,0);
      thebutton1.setEnabled(false);
      String strWinner = tttmodel.checkWin();
      if(strWinner.equals("X")){
        message.setText("P1 Wins");
        thelabel.setText("P1: "+tttmodel.getP1Wins());
        disableButton();
      }else if(strWinner.equals("O")){
        message.setText("P2 Wins");
        thelabel2.setText("P2: "+tttmodel.getP2Wins());
        disableButton();
      }else if(strWinner.equals("C")){
        message.setText("Cat's Game");
        disableButton();
      }
    }else if(evt.getSource() == thebutton2){
      thebutton2.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(0,1);
      thebutton2.setEnabled(false);
      String strWinner = tttmodel.checkWin();
      if(strWinner.equals("X")){
        message.setText("P1 Wins");
        thelabel.setText("P1: "+tttmodel.getP1Wins());
        disableButton();
      }else if(strWinner.equals("O")){
        message.setText("P2 Wins");
        thelabel2.setText("P2: "+tttmodel.getP2Wins());
        disableButton();
      }else if(strWinner.equals("C")){
        message.setText("Cat's Game");
        disableButton();
      }
    }else if(evt.getSource() == thebutton3){
      thebutton3.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(0,2);
      thebutton3.setEnabled(false);
      String strWinner = tttmodel.checkWin();
      if(strWinner.equals("X")){
        message.setText("P1 Wins");
        thelabel.setText("P1: "+tttmodel.getP1Wins());
        disableButton();
      }else if(strWinner.equals("O")){
        message.setText("P2 Wins");
        thelabel2.setText("P2: "+tttmodel.getP2Wins());
        disableButton();
      }else if(strWinner.equals("C")){
        message.setText("Cat's Game");
        disableButton();
      }
    }else if(evt.getSource() == thebutton4){
      thebutton4.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(1,0);
      thebutton4.setEnabled(false);
      String strWinner = tttmodel.checkWin();
      if(strWinner.equals("X")){
        message.setText("P1 Wins");
        thelabel.setText("P1: "+tttmodel.getP1Wins());
        disableButton();
      }else if(strWinner.equals("O")){
        message.setText("P2 Wins");
        thelabel2.setText("P2: "+tttmodel.getP2Wins());
        disableButton();
      }else if(strWinner.equals("C")){
        message.setText("Cat's Game");
        disableButton();
      }
    }else if(evt.getSource() == thebutton5){
      thebutton5.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(1,1);
      thebutton5.setEnabled(false);
      String strWinner = tttmodel.checkWin();
      if(strWinner.equals("X")){
        message.setText("P1 Wins");
        thelabel.setText("P1: "+tttmodel.getP1Wins());
        disableButton();
      }else if(strWinner.equals("O")){
        message.setText("P2 Wins");
        thelabel2.setText("P2: "+tttmodel.getP2Wins());
        disableButton();
      }else if(strWinner.equals("C")){
        message.setText("Cat's Game");
        disableButton();
      }
    }else if(evt.getSource() == thebutton6){
      thebutton6.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(1,2);
      thebutton6.setEnabled(false);
      String strWinner = tttmodel.checkWin();
      if(strWinner.equals("X")){
        message.setText("P1 Wins");
        thelabel.setText("P1: "+tttmodel.getP1Wins());
        disableButton();
      }else if(strWinner.equals("O")){
        message.setText("P2 Wins");
        thelabel2.setText("P2: "+tttmodel.getP2Wins());
        disableButton();
      }else if(strWinner.equals("C")){
        message.setText("Cat's Game");
        disableButton();
      }
    }else if(evt.getSource() == thebutton7){
      thebutton7.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(2,0);
      thebutton7.setEnabled(false);
      String strWinner = tttmodel.checkWin();
      if(strWinner.equals("X")){
        message.setText("P1 Wins");
        thelabel.setText("P1: "+tttmodel.getP1Wins());
        disableButton();
      }else if(strWinner.equals("O")){
        message.setText("P2 Wins");
        thelabel2.setText("P2: "+tttmodel.getP2Wins());
        disableButton();
      }else if(strWinner.equals("C")){
        message.setText("Cat's Game");
        disableButton();
      }
    }else if(evt.getSource() == thebutton8){
      thebutton8.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(2,1);
      thebutton8.setEnabled(false);
      String strWinner = tttmodel.checkWin();
      if(strWinner.equals("X")){
        message.setText("P1 Wins");
        thelabel.setText("P1: "+tttmodel.getP1Wins());
        disableButton();
      }else if(strWinner.equals("O")){
        message.setText("P2 Wins");
        thelabel2.setText("P2: "+tttmodel.getP2Wins());
        disableButton();
      }else if(strWinner.equals("C")){
        message.setText("Cat's Game");
        disableButton();
      }
    }else if(evt.getSource() == thebutton9){
      thebutton9.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(2,2);
      thebutton9.setEnabled(false);
      String strWinner = tttmodel.checkWin();
      if(strWinner.equals("X")){
        message.setText("P1 Wins");
        thelabel.setText("P1: "+tttmodel.getP1Wins());
        disableButton();
      }else if(strWinner.equals("O")){
        message.setText("P2 Wins");
        thelabel2.setText("P2: "+tttmodel.getP2Wins());
        disableButton();
      }else if(strWinner.equals("C")){
        message.setText("Cat's Game");
        disableButton();
      }
    }else if(evt.getSource() == thebutton10){
      tttmodel.resetBoard();
      thebutton1.setEnabled(true);
      thebutton2.setEnabled(true);
      thebutton3.setEnabled(true);
      thebutton4.setEnabled(true);
      thebutton5.setEnabled(true);
      thebutton6.setEnabled(true);
      thebutton7.setEnabled(true);
      thebutton8.setEnabled(true);
      thebutton9.setEnabled(true);
      
      thebutton1.setText("");
      thebutton2.setText("");
      thebutton3.setText("");
      thebutton4.setText("");
      thebutton5.setText("");
      thebutton6.setText("");
      thebutton7.setText("");
      thebutton8.setText("");
      thebutton9.setText("");
      message.setText("Let's Play");
    }
    
  }
  
  
  //constructor
  public TicTacToeViews(){
    
    tttmodel = new TicTacToeModel();
    tttmodel.resetBoard();
    
    thepanel = new JPanel();
    thepanel.setPreferredSize(new Dimension (600, 1200));
    thepanel.setLayout(null);
    
    thebutton1 = new JButton("");
    thebutton1.setSize(200, 200);
    thebutton1.setLocation(0, 0);
    thebutton1.addActionListener(this);
    thepanel.add(thebutton1);
    
    thebutton2 = new JButton("");
    thebutton2.setSize(200, 200);
    thebutton2.setLocation(200, 0);
    thebutton2.addActionListener(this);
    thepanel.add(thebutton2);
    
    thebutton3 = new JButton("");
    thebutton3.setSize(200, 200);
    thebutton3.setLocation(400, 0);
    thebutton3.addActionListener(this);
    thepanel.add(thebutton3);
    
    thebutton4 = new JButton("");
    thebutton4.setSize(200, 200);
    thebutton4.setLocation(0, 200);
    thebutton4.addActionListener(this);
    thepanel.add(thebutton4);
    
    thebutton5 = new JButton("");
    thebutton5.setSize(200, 200);
    thebutton5.setLocation(200, 200);
    thebutton5.addActionListener(this);
    thepanel.add(thebutton5);
    
    thebutton6 = new JButton("");
    thebutton6.setSize(200, 200);
    thebutton6.setLocation(400, 200);
    thebutton6.addActionListener(this);
    thepanel.add(thebutton6);
    
    thebutton7 = new JButton("");
    thebutton7.setSize(200, 200);
    thebutton7.setLocation(0, 400);
    thebutton7.addActionListener(this);
    thepanel.add(thebutton7);
    
    thebutton8 = new JButton("");
    thebutton8.setSize(200, 200);
    thebutton8.setLocation(200, 400);
    thebutton8.addActionListener(this);
    thepanel.add(thebutton8);
    
    thebutton9 = new JButton("");
    thebutton9.setSize(200, 200);
    thebutton9.setLocation(400, 400);
    thebutton9.addActionListener(this);
    thepanel.add(thebutton9);
    
    thebutton10 = new JButton("Play again");
    thebutton10.setSize(200, 50);
    thebutton10.setLocation(200, 600);
    thebutton10.addActionListener(this);
    thepanel.add(thebutton10);
    
    thelabel = new JLabel("P1");
    thelabel.setSize(200, 100);
    thelabel.setLocation(0, 600);
    thelabel.setHorizontalAlignment(JLabel.CENTER);
    thepanel.add(thelabel);
    
    thelabel2 = new JLabel("P2");
    thelabel2.setSize(200, 100);
    thelabel2.setLocation(400, 600);
    thelabel2.setHorizontalAlignment(JLabel.CENTER);
    thepanel.add(thelabel2);
    
    message = new JLabel("Let's Play");
    message.setSize(200, 50);
    message.setLocation(200, 650);
    message.setHorizontalAlignment(JLabel.CENTER);
    thepanel.add(message);
    
    theframe = new JFrame("Tic Tac Toe");
    theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theframe.setContentPane(thepanel);
    theframe.pack();
    theframe.setVisible(true);
  }
  
  
  //main program
  public static void main(String[] args){
    
    TicTacToeViews game = new TicTacToeViews();
  }
}
  
  

