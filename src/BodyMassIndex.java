public class BodyMassIndex {
    public double calculate(double weight, double height) {
    double scale = height * height / 100 / 100;
    double bmi = weight / scale ;
    return bmi;
    }
}
