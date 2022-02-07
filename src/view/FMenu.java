package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FMenu {
    private JPanel panelMenu;
    private JButton adicionarEmpregadoButton;
    private JButton consultarEmpregadosButton;


    public static void main(String[]args) {
        JFrame frame = new JFrame("Gestão de Funcionarios");
        frame.setContentPane(new FMenu().panelMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public FMenu() {
        adicionarEmpregadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FEmpregado().setVisible(true);
            }
        });

        consultarEmpregadosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FConsulta().setVisible(true);
            }
        });
    }
}
