package sample.view.recipesView;

import sample.model.Constants;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Step {

  int stepIndex;
  String step;

  public Step() {
  }

  public Step(int stepIndex, String step) {
    this.stepIndex = stepIndex;
    this.step = step;
  }

  public int getIndex() {
    return stepIndex;
  }

  public void setIndex(int index) {
    this.stepIndex = index;
  }

  public String getStep() {
    return step;
  }

  public void setStep(String step) {
    this.step = step;
  }

  public ArrayList<Step> processSteps(ResultSet steps) {
    ArrayList<Step> stepsToAdd = new ArrayList<>();
    try {
      while (steps.next()) {
        stepsToAdd.add(new Step(steps.getInt(Constants.COLUMN_STEPS_STEP_INDEX),
            steps.getString(Constants.COLUMN_STEPS_STEP)));
      }

      return stepsToAdd;
    } catch (SQLException e) {
      System.out.println("Couldn't process steps: " + e.getMessage());
      return null;
    }
  }
}
