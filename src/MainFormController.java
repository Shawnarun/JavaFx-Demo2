import javafx.collections.FXCollections;

import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;


public class MainFormController{


    public PieChart chart;

    public void initialize() {
        ObservableList<PieChart.Data> data = FXCollections.observableArrayList();
        data.addAll(
                new PieChart.Data("Java",50),
                new PieChart.Data("PHP",30),
                new PieChart.Data("C#",20)
        );
        chart.setData(data);
    }



}