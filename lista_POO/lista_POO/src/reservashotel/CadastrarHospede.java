package reservashotel;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CadastrarHospede extends JFrame {
    private JTextField txtNome;
    private JTextField txtEmail;
    private JLabel jlNome;
    private JLabel jlEmail;
    private JButton btnCadastro;
    private JPanel painelPrincipal;
    private JPanel painelCadastro;

    public CadastrarHospede() {
        setTitle("Cadastrar Hóspede");
        setSize(550, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // definir painel principal
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout(10, 10));

        painelCadastro = new JPanel();
        painelCadastro.setLayout(new GridLayout(3, 2, 10, 10));

        jlNome = new JLabel("Nome");
        txtNome = new JTextField();
        jlEmail = new JLabel("Email");
        txtEmail = new JTextField();

        btnCadastro = new JButton("Cadastrar");
        painelCadastro.add(jlNome);
        painelCadastro.add(txtNome);
        painelCadastro.add(jlEmail);
        painelCadastro.add(txtEmail);
        painelCadastro.add(btnCadastro);

        painelPrincipal.add(painelCadastro);

        // adicionando no JFrame
        add(painelPrincipal);
        setVisible(true);

        // adicionando evento no botao
        btnCadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrar();
            }
        });
    }

    public void cadastrar() {
        Hospede hospede = new Hospede();
        hospede.setNome(txtNome.getText());
        hospede.setCpf(txtEmail.getText());

    }

    public static void main(String[] args) {
        CadastrarHospede cadastrarHospede = new CadastrarHospede();

    }
}
