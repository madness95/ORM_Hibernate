/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontroller;

import java.util.List;
import models.Country;

/**
 *
 * @author sofia
 */
public interface ICountryController {

    public List<Country> getAll();

    public Country getById(String id);
    
    //    public List<Country> search();
}
