package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private MapView map;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        map.init(
                new MapView.LatLng(39.305, -76.617),
                new MapView.LatLngBounds(
                        new MapView.LatLng(38.305, -77.617),
                        new MapView.LatLng(40.305, -75.617)
                ),
                10
        );
        map.onload(() -> {
            map.fillRect(
                    new MapView.Coords(0, 0),
                    new MapView.Bounds(0.5, 0.5)
            );
            map.setFillPattern(new MapView.ColoredPattern(new Color(255, 0, 0)));
            map.fillRect(
                    new MapView.Coords(0.5, 0.5),
                    new MapView.Bounds(0.5, 0.5)
            );
        });
    }
}
