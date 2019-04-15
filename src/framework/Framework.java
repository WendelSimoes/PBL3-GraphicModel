package framework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.border.EmptyBorder;

public class Framework extends JFrame{

    JButton buttonDesktop, buttonNotbook, buttonTablet, buttonSmarth;
    JTextField fieldParagrafo, fieldLista, fieldLink;
    JTextField fieldParagrafoR, fieldListaR, fieldLinkR;
    ArrayList<Html> htmls = new ArrayList<Html>();
    Html paragrafo;
    Html lista;
    Html link;
    
    public Framework(){
        createView();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(340, 200));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Framework");
    }
    
    public void createView(){
        JPanel panelMain = new JPanel(new BorderLayout());
        panelMain.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.getContentPane().add(panelMain);
        
        //Center
        JPanel panelCenter = new JPanel(new GridBagLayout());
        panelMain.add(panelCenter, BorderLayout.CENTER);
        panelCenter.setBackground(Color.WHITE);
        
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_END;
        
        panelCenter.add(new JLabel("Paragrafo: "), c);
        c.gridy++;
        panelCenter.add(new JLabel("Lista: "), c);
        c.gridy++;
        panelCenter.add(new JLabel("Link: "), c);
        
        c.gridy = 0;
        c.gridx = 1;
        
        panelCenter.add(fieldParagrafo = new JTextField(3), c);
        c.gridy++;
        panelCenter.add(fieldLista = new JTextField(3), c);
        c.gridy++;
        panelCenter.add(fieldLink = new JTextField(3), c);
        
        c.gridy = 0;
        c.gridx = 2;
        
        panelCenter.add(new JLabel(" = "), c);
        c.gridy++;
        panelCenter.add(new JLabel(" = "), c);
        c.gridy++;
        panelCenter.add(new JLabel(" = "), c);
        
        c.gridy = 0;
        c.gridx = 3;
        
        panelCenter.add(fieldParagrafoR = new JTextField(3), c);
        fieldParagrafoR.setEditable(false);
        c.gridy++;
        panelCenter.add(fieldListaR = new JTextField(3), c);
        fieldListaR.setEditable(false);
        c.gridy++;
        panelCenter.add(fieldLinkR = new JTextField(3), c);
        fieldLinkR.setEditable(false);
        //
        
        //South
        JPanel panelSouth = new JPanel();
        panelMain.add(panelSouth, BorderLayout.SOUTH);
        
        buttonDesktop = new JButton();
        buttonDesktop.setPreferredSize(new Dimension(75, 60));
        buttonDesktop.setIcon(new ImageIcon(getClass().getResource("desktop-2692158_960_720.png")));
        panelSouth.add(buttonDesktop);
        
        buttonNotbook = new JButton();
        buttonNotbook.setPreferredSize(new Dimension(75, 60));
        buttonNotbook.setIcon(new ImageIcon(getClass().getResource("ARzU0.png")));
        panelSouth.add(buttonNotbook);
        
        buttonTablet = new JButton();
        buttonTablet.setPreferredSize(new Dimension(75, 60));
        buttonTablet.setIcon(new ImageIcon(getClass().getResource("tablet_PNG8596.png")));
        panelSouth.add(buttonTablet);
        
        buttonSmarth = new JButton();
        buttonSmarth.setPreferredSize(new Dimension(75, 60));
        buttonSmarth.setIcon(new ImageIcon(getClass().getResource("65680.png")));
        panelSouth.add(buttonSmarth);
        //
        
        //ActionListeners
        buttonDesktop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{   
                    if(fieldParagrafo.getText().isEmpty() || fieldLista.getText().isEmpty() || fieldLink.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
                    }else{
                        paragrafo = new Paragrafo(Double.parseDouble(fieldParagrafo.getText()));
                        lista = new Lista(Double.parseDouble(fieldLista.getText()));
                        link = new Link(Double.parseDouble(fieldLink.getText()));                      
                        htmls.add(0, paragrafo);
                        htmls.add(1, lista);
                        htmls.add(2, link);
                        
                        Desktop desktop = new Desktop();
                        desktop.setHtml(htmls);
                        
                        fieldParagrafoR.setText(String.valueOf(desktop.getHtml().get(0).getTamanho()));
                        fieldListaR.setText(String.valueOf(desktop.getHtml().get(1).getTamanho()));
                        fieldLinkR.setText(String.valueOf(desktop.getHtml().get(2).getTamanho()));
                    }
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Insira somente números", "Erro", JOptionPane.ERROR_MESSAGE);                    
                }
            }
        });
        
        buttonNotbook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{   
                    if(fieldParagrafo.getText().isEmpty() || fieldLista.getText().isEmpty() || fieldLink.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
                    }else{
                        paragrafo = new Paragrafo(Double.parseDouble(fieldParagrafo.getText()));
                        lista = new Lista(Double.parseDouble(fieldLista.getText()));
                        link = new Link(Double.parseDouble(fieldLink.getText()));
                        htmls.add(0, paragrafo);
                        htmls.add(1, lista);
                        htmls.add(2, link);
                        
                        Notebook notebook = new Notebook();
                        notebook.setHtml(htmls);
                        
                        fieldParagrafoR.setText(String.valueOf(notebook.getHtml().get(0).getTamanho()));
                        fieldListaR.setText(String.valueOf(notebook.getHtml().get(1).getTamanho()));
                        fieldLinkR.setText(String.valueOf(notebook.getHtml().get(2).getTamanho()));
                    }
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Insira somente números", "Erro", JOptionPane.ERROR_MESSAGE);                    
                }
            }
        });
        
        buttonTablet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{   
                    if(fieldParagrafo.getText().isEmpty() || fieldLista.getText().isEmpty() || fieldLink.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
                    }else{
                        paragrafo = new Paragrafo(Double.parseDouble(fieldParagrafo.getText()));
                        lista = new Lista(Double.parseDouble(fieldLista.getText()));
                        link = new Link(Double.parseDouble(fieldLink.getText()));
                        htmls.add(0, paragrafo);
                        htmls.add(1, lista);
                        htmls.add(2, link);
                        
                        Tablet tablet = new Tablet();
                        tablet.setHtml(htmls);
                        
                        fieldParagrafoR.setText(String.valueOf(tablet.getHtml().get(0).getTamanho()));
                        fieldListaR.setText(String.valueOf(tablet.getHtml().get(1).getTamanho()));
                        fieldLinkR.setText(String.valueOf(tablet.getHtml().get(2).getTamanho()));
                    }
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Insira somente números", "Erro", JOptionPane.ERROR_MESSAGE);                    
                }
            }
        });
        
        buttonSmarth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{   
                    if(fieldParagrafo.getText().isEmpty() || fieldLista.getText().isEmpty() || fieldLink.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
                    }else{
                        paragrafo = new Paragrafo(Double.parseDouble(fieldParagrafo.getText()));
                        lista = new Lista(Double.parseDouble(fieldLista.getText()));
                        link = new Link(Double.parseDouble(fieldLink.getText()));
                        htmls.add(0, paragrafo);
                        htmls.add(1, lista);
                        htmls.add(2, link);
                        
                        Celular celular = new Celular();
                        celular.setHtml(htmls);
                        
                        fieldParagrafoR.setText(String.valueOf(celular.getHtml().get(0).getTamanho()));
                        fieldListaR.setText(String.valueOf(celular.getHtml().get(1).getTamanho()));
                        fieldLinkR.setText(String.valueOf(celular.getHtml().get(2).getTamanho()));
                    }
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Insira somente números", "Erro", JOptionPane.ERROR_MESSAGE);                    
                }
            }
        });
        //
        
        this.validate();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new Framework().setVisible(true);
            }
        });
    }
    
}