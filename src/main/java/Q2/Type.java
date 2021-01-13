package Q2;

public enum Type{

  OPEN(1), CLOSED(-1);

  private int value;

  Type(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

}