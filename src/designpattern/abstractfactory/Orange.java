package sample.designpattern.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/24/13
 * Time: 4:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Orange implements Color {
    @Override
    public void fill() {
        System.out.println("calling Orange::fill() method");
    }
}
