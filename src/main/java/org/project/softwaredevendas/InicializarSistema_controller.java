package org.project.softwaredevendas;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class InicializarSistema_controller {

    public ProgressBar pb_BarraProgresso;
    public Label lb_Progresso;
    @FXML private ProgressBar progressBar;
    @FXML private Label progressText;
    @FXML private ImageView logoImage;

    // Tarefa para simular o carregamento do sistema
    public Task<Void> carregarSistema = new Task<Void>() {
        @Override
        protected Void call() throws Exception {
            for (int i = 0; i <= 100; i++) {
                updateProgress(i, 100);
                updateMessage("Carregando o Sistema: " + i + "%");
                Thread.sleep(50);  // Simula o tempo de carregamento
            }
            return null;
        }
    };

    @FXML
    public void initialize() {
        // Carregar logo da aplicação
        logoImage.setImage(new Image(getClass().getResourceAsStream("/org/project/softwaredevendas/logo_SellPlus.png")));  // Suponha que você tenha um logo

        // Atualizar progressBar com a tarefa
        progressBar.progressProperty().bind(carregarSistema.progressProperty());

        // Atualizar o texto de progresso com a mensagem
        progressText.textProperty().bind(carregarSistema.messageProperty());

        // Iniciar a tarefa em uma thread separada para não bloquear a interface
        new Thread(carregarSistema).start();
    }
}
