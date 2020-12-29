package sample.view.recipesView;

public class Step {

  int index;
  String step;

  public Step(int index, String step) {
    this.index = index;
    this.step = step;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public String getStep() {
    return step;
  }

  public void setStep(String step) {
    this.step = step;
  }
}
