package uz.ifood.app.controller

import javafx.event.EventHandler
import javafx.fxml.FXML

import javafx.scene.control.Button
import javafx.scene.control.TextField
import uz.ifood.app.manager.LoginManager


class LoginController {
    @FXML
    private val user: TextField? = null

    @FXML
    private val password: TextField? = null

    @FXML
    private val loginButton: Button? = null

    fun initialize() {}

    fun initManager(loginManager: LoginManager) {
        loginButton!!.onAction = EventHandler {
            val sessionID = authorize()
            if (sessionID != null) {
                loginManager.authenticated(sessionID)
            }
        }
    }

    /**
     * Check authorization credentials.
     *
     * If accepted, return a sessionID for the authorized session
     * otherwise, return null.
     */
    private fun authorize(): String? {
        return if ("open" == user!!.text && "sesame" == password!!.text)
            generateSessionID()
        else
            null
    }

    private fun generateSessionID(): String {
        sessionID++
        return "xyzzy - session " + sessionID
    }

    companion object {
        private var sessionID = 0
    }
}