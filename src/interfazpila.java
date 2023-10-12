import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfazpila {

    private JTextField textField1;
    private JButton convertirABinarioButton;
    private JPanel ventana;
    private JButton limpiarButton;
    private JTextArea textArea1;
    private PilaEntero pila = new PilaEntero();

    public static void main(String[] args) {
        JFrame frame = new JFrame("interfazpila");
        frame.setContentPane(new interfazpila().ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

public interfazpila() {
    convertirABinarioButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
                int n1=Integer.parseInt(textField1.getText());
                int aux = n1;
                int binario;
                while (aux > 0) {
                    binario = aux% 2;
                    pila.apilarElemento(binario);
                    aux /=2;
                }
                while (pila.tamaño()<8){
                    pila.apilarElemento(0);
                }
                textArea1.setText(pila.toString());









            JOptionPane.showMessageDialog(null, pila.tamaño());
            try {
                JOptionPane.showMessageDialog(null, pila.mirarelementoTop());
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }



        }
    });

    limpiarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            pila.vaciarPila();
            textField1.setText("");
            textArea1.setText("");


        }
    });
}


}
