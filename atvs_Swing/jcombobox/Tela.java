import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class Tela extends JFrame {
    private JTextField txtNome;


    private JPanel painelPrincipal;
    private JPanel painelCadastro;
    private JComboBox jComboBox;

    public Tela() {
        setTitle("Teste JComboBox");
        setSize(550, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // definir painel principal
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout(10, 10));

        painelCadastro = new JPanel();
        painelCadastro.setLayout(new GridLayout(3, 2, 10, 10));

        HashSet<String> linguagens = new HashSet<String>();
        // linguagens.add("Java");
        // linguagens.add("Python");
        // linguagens.add("C++");
        // linguagens.add("JavaScript");

        JComboBox<String> jComboBox = new JComboBox<>();
        for (String string : linguagens) {
            jComboBox.addItem(string);
        }

        txtNome = new JTextField();

        painelCadastro.add(jComboBox);
        painelCadastro.add(txtNome);

        painelPrincipal.add(painelCadastro);
        actionsListeners(jComboBox, txtNome, linguagens);

        // adicionando no JFrame
        add(painelPrincipal);
        setVisible(true);

    }

    public void actionsListeners(JComboBox jComboBox, JTextField txtNome, HashSet linguagens) {
        txtNome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aux = txtNome.getText().trim();
                if (!aux.isEmpty()) {

                    if (!linguagens.contains(aux.toLowerCase())) {
                        linguagens.add(aux.toLowerCase());
                        jComboBox.addItem(aux);
                        jComboBox.setSelectedItem(aux);
                        System.out.println("Linguagem " + aux + " foi adicionada ao JComboBox");
                    } else {
                        System.out.println("Linguagem " + aux + " ja foi adicionada ao JComboBox");
                    }

                    txtNome.setText("");

                }
            }
        });

        jComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selecionado = (String) jComboBox.getSelectedItem();
                System.out.println("Linguagem escolhida: " + selecionado);
            }
        });
    }

    public static void main(String[] args) {
        Tela tela = new Tela();
    }
}
/*INPUTS

JAVA
PYTHON
C
C++
C#
R
JAVASCRIPT
RUBY
COBALTO  
BANANA
LAVA
MINECRAFT
*/

/*
java.lang.Object
    java.awt.Component
        java.awt.Container
            javax.swing.JComponent
                javax.swing.JComboBox<E> 
*/