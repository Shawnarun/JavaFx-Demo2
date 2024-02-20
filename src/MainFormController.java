import javafx.collections.FXCollections;

import javafx.collections.ObservableList;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;


public class MainFormController{

    NumberAxis xAxis = new NumberAxis(1,7,1);
    NumberAxis yAxis = new NumberAxis(10,500,10);

    public AreaChart<Number,Number> chart = new AreaChart<>(xAxis,yAxis);

    public void initialize() {


        xAxis.setLabel("count");
        yAxis.setLabel("Days");

        XYChart.Series javaStudent = new XYChart.Series();
        javaStudent.setName("Java");
        javaStudent.getData().add(new XYChart.Data<>(1,50));
        javaStudent.getData().add(new XYChart.Data<>(2,150));
        javaStudent.getData().add(new XYChart.Data<>(3,500));
        javaStudent.getData().add(new XYChart.Data<>(4,65));
        javaStudent.getData().add(new XYChart.Data<>(5,200));
        javaStudent.getData().add(new XYChart.Data<>(6,0));
        javaStudent.getData().add(new XYChart.Data<>(7,125));


        XYChart.Series phpStudents = new XYChart.Series();
        phpStudents.setName("PHP");
        phpStudents.getData().add(new XYChart.Data<>(1,150));
        phpStudents.getData().add(new XYChart.Data<>(2,10));
        phpStudents.getData().add(new XYChart.Data<>(3,120));
        phpStudents.getData().add(new XYChart.Data<>(4,50));
        phpStudents.getData().add(new XYChart.Data<>(5,250));
        phpStudents.getData().add(new XYChart.Data<>(6,500));
        phpStudents.getData().add(new XYChart.Data<>(7,25));


        chart.getData().addAll(javaStudent,phpStudents);


    }



}