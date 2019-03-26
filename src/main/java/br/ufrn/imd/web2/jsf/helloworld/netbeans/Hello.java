/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.imd.web2.jsf.helloworld.netbeans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author kaduardo
 */
@Named(value = "hello")
@RequestScoped
public class Hello {

    private String name;

    /**
     * Creates a new instance of Hello
     */
    public Hello() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getMessage() {
        return "Hello World!";
    }
}
