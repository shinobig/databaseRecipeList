package sample.view.recipesView;

public class Step {

  int stepIndex;
  String step;

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
}
