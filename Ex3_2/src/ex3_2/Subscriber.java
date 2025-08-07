/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3_2;

import java.beans.*;

/**
 *
 * @author punpu
 */

public class Subscriber implements PropertyChangeListener {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("scoreLine".equals(evt.getPropertyName())) {
            System.out.println(name + ": " + evt.getNewValue());
        }
    }
}
