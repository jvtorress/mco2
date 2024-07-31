import javax.swing.*;
import java.awt.*;

public class UpdateHotelAttributesView extends JFrame {
    private final JButton changeHotelNameButton;
    private final JButton addRoomsButton;
    private final JButton removeRoomsButton;
    private final JButton updateBasePriceButton;
    private final JButton removeReservationButton;
    private final JButton removeHotelButton;
    private final JButton setDatePriceModifierButton; // New button
    private final JButton backToSelectionButton;
    private final JButton backToMainMenuButton;

    public UpdateHotelAttributesView(String hotelName) {
        setTitle("Update Hotel Attributes");
        setSize(850, 480); // Adjusted size to accommodate the new button
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        // Create components
        String asciiArt = """
                <html>\
                <pre>\
                ██╗   ██╗██████╗ ██████╗  █████╗ ████████╗███████╗    ██╗  ██╗ ██████╗ ████████╗███████╗██╗    \s
                ██║   ██║██╔══██╗██╔══██╗██╔══██╗╚══██╔══╝██╔════╝    ██║  ██║██╔═══██╗╚══██╔══╝██╔════╝██║    \s
                ██║   ██║██████╔╝██║  ██║███████║   ██║   █████╗      ███████║██║   ██║   ██║   █████╗  ██║    \s
                ██║   ██║██╔═══╝ ██║  ██║██╔══██║   ██║   ██╔══╝      ██╔══██║██║   ██║   ██║   ██╔══╝  ██║    \s
                ╚██████╔╝██║     ██████╔╝██║  ██║   ██║   ███████╗    ██║  ██║╚██████╔╝   ██║   ███████╗███████╗
                 ╚═════╝ ╚═╝     ╚═════╝ ╚═╝  ╚═╝   ╚═╝   ╚══════╝    ╚═╝  ╚═╝ ╚═════╝    ╚═╝   ╚══════╝╚══════╝\
                </pre>\
                </html>""";

        JLabel asciiLabel = new JLabel(asciiArt, SwingConstants.CENTER);
        JLabel hotelNameLabel = new JLabel("<html>The hotel being managed is hotel " + hotelName + ".<br><br> <center>Select an option to update:</center></html>", SwingConstants.CENTER);

        // Initialize the message label
        // New JLabel for displaying messages
        JLabel messageLabel = new JLabel("", SwingConstants.CENTER);
        messageLabel.setForeground(Color.RED); // Set color for the message

        // Create buttons
        changeHotelNameButton = new JButton("Change Hotel Name");
        addRoomsButton = new JButton("Add Rooms");
        removeRoomsButton = new JButton("Remove Rooms");
        updateBasePriceButton = new JButton("Update Base Price");
        removeReservationButton = new JButton("Remove Reservation");
        removeHotelButton = new JButton("Remove Hotel");
        setDatePriceModifierButton = new JButton("Set Date Price Modifier"); // New button
        backToSelectionButton = new JButton("Back to Hotel Selection");
        backToMainMenuButton = new JButton("Back to Main Menu");

        // Set fixed size for update buttons
        Dimension updateButtonSize = new Dimension(200, 40); // Fixed size for update buttons
        changeHotelNameButton.setPreferredSize(updateButtonSize);
        addRoomsButton.setPreferredSize(updateButtonSize);
        removeRoomsButton.setPreferredSize(updateButtonSize);
        updateBasePriceButton.setPreferredSize(updateButtonSize);
        removeReservationButton.setPreferredSize(updateButtonSize);
        removeHotelButton.setPreferredSize(updateButtonSize);
        setDatePriceModifierButton.setPreferredSize(updateButtonSize); // Set size for new button

        // Set fixed size for menu buttons (slightly smaller)
        Dimension menuButtonSize = new Dimension(190, 30); // Slightly smaller size for menu buttons
        backToSelectionButton.setPreferredSize(menuButtonSize);
        backToMainMenuButton.setPreferredSize(menuButtonSize);

        // Set layout and add components
        setLayout(new BorderLayout());

        // Create a panel for text components
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BorderLayout());
        textPanel.add(asciiLabel, BorderLayout.NORTH);
        textPanel.add(hotelNameLabel, BorderLayout.CENTER);
        textPanel.add(messageLabel, BorderLayout.SOUTH); // Add message label to the text panel
        add(textPanel, BorderLayout.NORTH);

        // Create a panel for the button layout
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10); // Margin for each component

        // Add buttons to the button panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(changeHotelNameButton, gbc);

        gbc.gridx = 1;
        buttonPanel.add(addRoomsButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        buttonPanel.add(removeRoomsButton, gbc);

        gbc.gridx = 1;
        buttonPanel.add(updateBasePriceButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        buttonPanel.add(removeReservationButton, gbc);

        gbc.gridx = 1;
        buttonPanel.add(removeHotelButton, gbc);

        gbc.gridx = 0; // Reset to first column for new button
        gbc.gridy = 3; // New row for the new button
        buttonPanel.add(setDatePriceModifierButton, gbc); // Add the new button

        // Add the button panel to the center
        add(buttonPanel, BorderLayout.CENTER); // Changed to add the button panel to the center

        // Create a panel for back buttons
        JPanel lastRowPanel = new JPanel();
        lastRowPanel.add(backToSelectionButton);
        lastRowPanel.add(backToMainMenuButton);
        add(lastRowPanel, BorderLayout.SOUTH); // Add back buttons at the bottom
    }

    public JButton getChangeHotelNameButton() {
        return changeHotelNameButton;
    }

    public JButton getAddRoomsButton() {
        return addRoomsButton;
    }

    public JButton getRemoveRoomButton() {
        return removeRoomsButton;
    }

    public JButton getUpdateBasePriceButton() {
        return updateBasePriceButton;
    }

    public JButton getRemoveReservationButton() {
        return removeReservationButton;
    }

    public JButton getRemoveHotelButton() {
        return removeHotelButton;
    }

    public JButton getSetDatePriceModifierButton() { // New getter method for the new button
        return setDatePriceModifierButton;
    }

    public JButton getBackToSelectionButton() {
        return backToSelectionButton;
    }

    public JButton getBackToMainMenuButton() {
        return backToMainMenuButton;
    }
}
