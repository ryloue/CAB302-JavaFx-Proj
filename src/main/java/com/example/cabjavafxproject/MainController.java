package com.example.cabjavafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

public class MainController {
    @FXML
    private ListView<Contact> contactsListView;
    private IContactDAO contactDAO;
    public MainController() {
        contactDAO = new MockContactDAO();
    }

    /**
     * Renders a cell in the contacts list view by setting the text to the contact's full name.
     * @param contactListView The list view to render the cell for.
     * @return The rendered cell.
     */
    private ListCell<Contact> renderCell(ListView<Contact> contactListView) {
        return new ListCell<>() {
            /**
             * Updates the item in the cell by setting the text to the contact's full name.
             * @param contact The contact to update the cell with.
             * @param empty Whether the cell is empty.
             */
            @Override
            protected void updateItem(Contact contact, boolean empty) {
                super.updateItem(contact, empty);
                // If the cell is empty, set the text to null, otherwise set it to the contact's full name
                if (empty || contact == null || contact.getFullName() == null) {
                    setText(null);
                } else {
                    setText(contact.getFullName());
                }
            }
        };
    }

    @FXML
    public void initialize() {
        contactsListView.setCellFactory(this::renderCell);
        contactsListView.getItems().addAll(contactDAO.getAllContacts());
    }
}