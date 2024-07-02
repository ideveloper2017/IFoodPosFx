module uz.ifood.app {
    requires MaterialFX;
    requires VirtualizedFX;

    requires jdk.localedata;

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.web;
    requires kotlin.stdlib;

    requires org.controlsfx.controls;
    requires java.desktop;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    //requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.logging;


    opens uz.ifood.app to javafx.fxml,javafx.graphics;
    exports uz.ifood.app;
    exports uz.ifood.app.controller;
}