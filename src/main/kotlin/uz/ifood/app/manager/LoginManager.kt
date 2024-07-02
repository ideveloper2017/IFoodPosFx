package uz.ifood.app.manager

import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import uz.ifood.app.IFoodApplication
import uz.ifood.app.controller.LoginController
import uz.ifood.app.controller.MainView
import java.io.IOException
import java.util.logging.Level
import java.util.logging.Logger


/** Manages control flow for logins  */
class LoginManager(private val scene: Scene) {
    /**
     * Callback method invoked to notify that a user has been authenticated.
     * Will show the main application screen.
     */
    fun authenticated(sessionID: String) {
        showMainView(sessionID)
    }

    /**
     * Callback method invoked to notify that a user has logged out of the main application.
     * Will show the login application screen.
     */
    fun logout() {
        showLoginScreen()
    }

    fun showLoginScreen() {
        try {

            val loader = FXMLLoader(IFoodApplication::class.java.getResource("fxml/login.fxml")
            )
            scene.root = loader.load() as Parent
            val controller: LoginController =loader.getController<LoginController>()
//            controller.initManager(this)
        } catch (ex: IOException) {
            Logger.getLogger(LoginManager::class.java.name).log(Level.SEVERE, null, ex);
        }
    }

    private fun showMainView(sessionID: String) {
        try {
            val loader = FXMLLoader(
                IFoodApplication::class.java.getResource("fxml/mainview.fxml")
            )
            scene.root = loader.load<Any>() as Parent
            val controller: MainView =
                loader.getController<MainView>()
            controller.initSessionID(this, sessionID)
        } catch (ex: IOException) {
            Logger.getLogger(LoginManager::class.java.name).log(Level.SEVERE, null, ex);
//            Logger.getLogger(LoginManager::class.java.name).log(Level.SEVERE, null, ex)
        }
    }
}