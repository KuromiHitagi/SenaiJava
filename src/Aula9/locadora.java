package Aula9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class locadora extends JFrame{
    private JTextField txtFilme, txtGenero, txtValor;
    private JRadioButton rbTxt, rbCsv;
    private JTextArea areaExibicao;
    
    public locadora() {
        setTitle("Mini locadora - Cadastro de Filmes");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel painelFormulario = new JPanel(new GridLayout(4, 2, 5, 5));
        painelFormulario.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        painelFormulario.add(new JLabel("Nome do Filme: "));
        txtFilme = new JTextField();
    }

    public static void locadora(String[] strings) {
    }
}
