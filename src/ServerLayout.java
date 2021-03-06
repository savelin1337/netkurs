import javax.swing.*;
import java.awt.*;

public class ServerLayout extends JPanel {

    public ServerLayout() {
        Server.button = new JButton("Listen");
        Server.button.setPreferredSize(new Dimension(90, 22));
        Server.button.setEnabled(true);
        JLabel portLabel = new JLabel("Port:");
        Server.portField = new JTextField("4444", 5);
        setLayout(new GridBagLayout());

        JPanel paneTop = new JPanel(new GridBagLayout());
        JPanel paneMid = new JPanel(new GridBagLayout());
        JPanel paneBot = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(2, 2, 2, 2);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // TOP
        gbc.anchor = GridBagConstraints.NORTH;
        paneTop.add(portLabel, gbc);
        gbc.gridx++;
        paneTop.add(Server.portField, gbc);
        gbc.gridx++;
        paneTop.add(Server.button, gbc);
        gbc.gridx = 0;
        add(paneTop, gbc);

        // MID
        gbc.anchor = GridBagConstraints.CENTER;
        Server.table = new JTable(5, 5);
        paneMid.add(Server.table, gbc);
        gbc.gridy++;
        add(paneMid, gbc);

        //BOT
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.SOUTH;
        Server.log = new JTextArea(8, 80);
        JScrollPane scrollPane = new JScrollPane(Server.log);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        paneBot.add(scrollPane, gbc);
        JTextField consoleField = new JTextField();
        gbc.gridy++;
        paneBot.add(consoleField, gbc);
        gbc.gridy = 2;
        add(paneBot, gbc);
    }
}