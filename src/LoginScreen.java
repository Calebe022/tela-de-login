import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JLabel messageLabel;

    public LoginScreen() {
        // Configurações da janela principal
        setTitle("Tela de Login");
        setSize(350, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        // Altera a cor de fundo da janela para um azul claro
        getContentPane().setBackground(new Color(173, 216, 230)); // Azul claro (light blue)

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Rótulo de título
        JLabel titleLabel = new JLabel("Login", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(titleLabel, gbc);

        gbc.gridwidth = 1;

        // Rótulo e campo de e-mail
        JLabel emailLabel = new JLabel("E-mail:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(emailLabel, gbc);

        emailField = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(emailField, gbc);

        // Rótulo e campo de senha
        JLabel passwordLabel = new JLabel("Senha:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(passwordLabel, gbc);

        passwordField = new JPasswordField(15);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(passwordField, gbc);

        // Botão de login
        JButton loginButton = new JButton("Entrar");
        loginButton.setBackground(new Color(46, 204, 113)); // Cor do botão
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        add(loginButton, gbc);

        // Rótulo para mensagens de erro
        messageLabel = new JLabel("", SwingConstants.CENTER);
        messageLabel.setForeground(Color.RED);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(messageLabel, gbc);

        // Adicionando ação do botão
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                autenticarUsuario();
            }
        });

        setVisible(true);
    }

    private void autenticarUsuario() {
        String email = emailField.getText();
        String senha = new String(passwordField.getPassword());

        // Verificação do e-mail
        if (!email.contains("@") || !email.equals(email.toLowerCase())) {
            messageLabel.setText("E-mail inválido! Verifique o formato.");
            return;
        }

        // Verificação da senha (só permite letras e números)
        if (!senha.matches("[a-zA-Z0-9]+")) {
            messageLabel.setText("Senha inválida! Só são permitidos letras e números.");
            return;
        }

        // Caso ambos sejam válidos, mostra mensagem de sucesso
        JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
        dispose();
    }

    public static void main(String[] args) {
        new LoginScreen();
    }
}