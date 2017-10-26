/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodata;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author DISA
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button proses;
    @FXML
    private Label label;
    @FXML
    private TextField nama;
    @FXML
    private TextField kelas;
    @FXML
    private TextField absen;
    @FXML
    private TextArea hasil;
    @FXML
    private Button hapus;
    @FXML
    private TextField alamat;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        
        String Nama= nama.getText();
        String Kelas=kelas.getText();
        String Absen=absen.getText();
        String Alamat=alamat.getText();
        
        hasil.setText("\n nama="+Nama+"\n kelas="+Kelas+"\n Absen="+Absen+"\n alamat="+Alamat);
    }

    @FXML
    private void hapus(ActionEvent event) {
       nama.setText("");
       kelas.setText("");
       absen.setText("");
       alamat.setText("");
        
        
    }
    
}
