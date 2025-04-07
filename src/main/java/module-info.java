module r4m63.demojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens r4m63.demojavafx to javafx.fxml;
    exports r4m63.demojavafx;
}