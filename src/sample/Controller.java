package sample;

import sample.model.DataSource;

public class Controller {

    private DataSource dataSource;


    public void initialize(){
        dataSource = new DataSource();
        if (!dataSource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

    }

}
