package miamifx.controllers;

import controladores.exceptions.NonexistentEntityException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelo.Maestro;
import recursos.MaestroResource;

/**
 * FXML Controller class
 *
 * @author Miguel Acosta
 */
public class AdministrarMaestrosController implements Initializable {

    @FXML
    private Button btnRegistrar, btnDetalles, btnEliminar;
    @FXML
    private TableView<Maestro> tablaMaestros;
    @FXML
    private TableColumn columnaNombre, columnaApellidos, columnaCorreo;
    @FXML
    private TextField campoBusqueda;

    private boolean ventanaAbierta = false;

    public void setVentana(boolean ventana) {
        this.ventanaAbierta = ventana;
    }

    @FXML
    private void registrarMaestro(ActionEvent event) throws IOException {
        if (!ventanaAbierta) {
            ventanaAbierta = true;
            Stage registrarMaestro = new Stage();
            registrarMaestro.setOnCloseRequest(Event ->{
                ventanaAbierta = false;
                registrarMaestro.close();
            });
            FXMLLoader cargador = new FXMLLoader(getClass().getClassLoader().getResource("miamifx/interfaces/RegistrarMaestro.fxml"));
            AnchorPane root = cargador.load();
            RegistrarMaestroController control = (RegistrarMaestroController) cargador.getController();
            control.setContro(this);
            Scene escena = new Scene(root);
            registrarMaestro.setScene(escena);
            registrarMaestro.initModality(Modality.WINDOW_MODAL);
            registrarMaestro.initOwner(
            ((Node)event.getSource()).getScene().getWindow() );
            registrarMaestro.setResizable(false);
            registrarMaestro.show();
        }

    }

    @FXML
    private void eliminarRegistro(ActionEvent event) {
        Alert confirmacion = new Alert(Alert.AlertType.CONFIRMATION);
        confirmacion.setContentText("Esta seguro que desea eliminar la seleccion?");
        confirmacion.setTitle("Confirmacion");

        if (confirmacion.showAndWait().get().equals(ButtonType.OK)) {
            try {
                Maestro maestro = tablaMaestros.getSelectionModel().getSelectedItem();
                MaestroResource recurso = new MaestroResource();
                recurso.eliminarMaestro(maestro);
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(AdministrarMaestrosController.class.getName()).log(Level.SEVERE, null, ex);
            }
            setTabla();
        }else{
            confirmacion.close();
        }
    }

    @FXML
    private void buscarMaestro(ActionEvent event) {
        MaestroResource recurso = new MaestroResource();
        List<Maestro> listaResult = new ArrayList<>();

        listaResult = recurso.buscarMaestroNombre(this.campoBusqueda.getText());

        ObservableList lista = FXCollections.observableList(listaResult);
        tablaMaestros.setItems(lista);
    }

    @FXML
    private void verDetalles(ActionEvent event) {
        if (!ventanaAbierta && !tablaMaestros.getSelectionModel().getSelectedItem().equals(null)) {
            ventanaAbierta=true;
            try {
                Stage editarMaestro = new Stage();
                editarMaestro.setOnCloseRequest(Event ->{
                    ventanaAbierta = false;
                });
                Maestro maestro = tablaMaestros.getSelectionModel().getSelectedItem();
                FXMLLoader cargador = new FXMLLoader(getClass().getClassLoader().getResource("miamifx/interfaces/EditarMaestros.fxml"));

                AnchorPane root = cargador.load();

                EditarMaestrosController editarMaestrosController = (EditarMaestrosController) cargador.getController();

                editarMaestrosController.setAdministrar(this);
                editarMaestrosController.setMaestro(maestro);
                cargador.setController(editarMaestrosController);
                editarMaestrosController.setCampos();

                Scene escena = new Scene(root);
                editarMaestro.setScene(escena);
                editarMaestro.initModality(Modality.WINDOW_MODAL);
                editarMaestro.initOwner(
                ((Node)event.getSource()).getScene().getWindow() );
                editarMaestro.setResizable(false);
                editarMaestro.show();
            } catch (IOException ex) {
                Logger.getLogger(AdministrarAlumnosController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void activarBotones() {
        this.btnDetalles.setDisable(false);
        this.btnEliminar.setDisable(false);
    }

    public void setTabla() {
        tablaMaestros.refresh();
        MaestroResource recurso = new MaestroResource();
        ObservableList lista = FXCollections.observableArrayList(recurso.getMaestros());
        columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        columnaApellidos.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
        columnaCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        tablaMaestros.setItems(lista);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setTabla();
        tablaMaestros.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                activarBotones();
            }
        });
        this.campoBusqueda.setPromptText("Ingrese nombre del maestro");
    }

}
