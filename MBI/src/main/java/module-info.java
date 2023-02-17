module com.lnnd.mbi {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.lnnd.mbi to javafx.fxml;
    exports com.lnnd.mbi;
}
