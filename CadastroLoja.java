import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CadastroLoja extends JFrame implements ActionListener {
    private JTextField nomeField, enderecoField, telefoneField;
    private JButton cadastrarButton;

    public CadastroLoja() {
        setTitle("Cadastro de Cliente");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField(20);
        panel.add(nomeLabel);
        panel.add(nomeField);

        JLabel enderecoLabel = new JLabel("Endereço:");
        enderecoField = new JTextField(20);
        panel.add(enderecoLabel);
        panel.add(enderecoField);

        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneField = new JTextField(20);
        panel.add(telefoneLabel);
        panel.add(telefoneField);

        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(this);
        panel.add(cadastrarButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cadastrarButton) {
            cadastrarCliente();
        }
    }

    private void cadastrarCliente() {
        String nome = nomeField.getText();
        String endereco = enderecoField.getText();
        String telefone = telefoneField.getText();

        // Aqui você pode fazer algo com os dados, como salvar em um banco de dados
        // ou exibir em uma mensagem de confirmação
        JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso:\nNome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone);

        // Limpar os campos após o cadastro
        nomeField.setText("");
        enderecoField.setText("");
        telefoneField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CadastroLoja();
            }
        });
    }
}
