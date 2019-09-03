/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.prn335.junitmockitotests;

/**
 *
 * @author Mauricio
 */
public class AppServiceImpl implements AppService{
      @Override
    public String getAppName() {
        // assume you are reading this from properties file
        String appName = "The Amazing Application";
        return appName;
    }
}
