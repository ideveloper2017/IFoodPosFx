
package uz.ifood.app

import io.github.palexdev.materialfx.theming.JavaFXThemes
import io.github.palexdev.materialfx.theming.MaterialFXStylesheets
import io.github.palexdev.materialfx.theming.UserAgentBuilder
import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.layout.StackPane
import javafx.stage.Stage
import uz.ifood.app.manager.LoginManager


class IFoodApplication : Application() {
    override fun start(stage: Stage) {
        UserAgentBuilder.builder()
            .themes(JavaFXThemes.MODENA)
            .themes(MaterialFXStylesheets.forAssemble(true))
            .setDeploy(true)
            .setResolveAssets(true)
            .build()
            .setGlobal();
        //        val fxmlLoader = FXMLLoader(IFoodApplication::class.java.getResource("login.fxml"))
//        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
//        stage.title = "Hello!"
//        stage.scene = scene
//        stage.show()
        val scene = Scene(StackPane())

        val loginManager = LoginManager(scene)
        loginManager.showLoginScreen()
        stage.title = "Hello!"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(IFoodApplication::class.java)
}