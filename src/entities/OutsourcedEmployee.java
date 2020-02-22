/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Deivinson
 */
public class OutsourcedEmployee extends Employeer {

    private Double additionlCharge;

    public OutsourcedEmployee() {
       super();
    }

    public OutsourcedEmployee(Double additionlCharge, String name, Integer hours, double valuePerHour) {
        super(name, hours, valuePerHour);
        this.additionlCharge = additionlCharge;
    }

    public Double getAdditionlCharge() {
        return additionlCharge;
    }

    public void setAdditionlCharge(Double additionlCharge) {
        this.additionlCharge = additionlCharge;
    }
    
    @Override
    public double payment() {
        return super.payment() + additionlCharge * 1.1;
    }
    
}
