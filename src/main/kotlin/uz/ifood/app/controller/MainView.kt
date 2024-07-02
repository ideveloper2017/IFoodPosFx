package uz.ifood.app.controller

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import uz.ifood.app.manager.LoginManager


class MainView {
    @FXML
    private val logoutButton: Button? = null

    @FXML
    private val sessionLabel: Label? = null

    fun initialize() {}

    fun initSessionID(loginManager: LoginManager, sessionID: String?) {
        sessionLabel?.text=sessionID
        logoutButton?.setOnAction(object : EventHandler<ActionEvent?> {
            override fun handle(event: ActionEvent?) {
                loginManager.logout()
            }
        })
    }
}