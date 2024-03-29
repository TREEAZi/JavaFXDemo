module org.javafxdemo.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens org.javafxdemo.javafxdemo to javafx.fxml;
    exports org.javafxdemo.javafxdemo;
}