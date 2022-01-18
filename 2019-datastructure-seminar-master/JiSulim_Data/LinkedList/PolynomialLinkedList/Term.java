package Chapter03.PolynomialLinkedList;

public class Term extends Data{

  public double coef;
  public int degree;

  public Term(){

  }

  public Term(double coef, int degree){
    this.coef = coef;
    this.degree = degree;
  }

}
