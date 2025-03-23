import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Base64;

public class TextEncodingDecoding {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Text Encoding and Decoding System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        JTextField inputField = new JTextField(20);
        JTextField outputField = new JTextField(20);
        JButton encodeButton = new JButton("Encode");
        JButton decodeButton = new JButton("Decode");

        panel.add(new JLabel("Input Text:"));
        panel.add(inputField);
        panel.add(new JLabel("Output Text:"));
        panel.add(outputField);
        panel.add(encodeButton);
        panel.add(decodeButton);

        encodeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = inputField.getText();
                String encodedText = encodeText(inputText);
                outputField.setText(encodedText);
            }
        });

        decodeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String encodedText = inputField.getText();
                String decodedText = decodeText(encodedText);
                outputField.setText(decodedText);
            }
        });

        frame.setSize(400, 150);
        frame.setVisible(true);
    }

    private static String encodeText(String text) {
        byte[] encodedBytes = Base64.getEncoder().encode(text.getBytes());
        return new String(encodedBytes);
    }

    private static String decodeText(String encodedText) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedText);
        return new String(decodedBytes);
    }
}
