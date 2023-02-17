module com.lnnd.mbiproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.lnnd.mbiproject to javafx.fxml;
    exports com.lnnd.mbiproject;
}
