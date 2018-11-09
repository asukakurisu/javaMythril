/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mythril;

import java.io.File;
import java.util.Map;

/**
 *
 * @author asu
 */
public class mythril {

    public String solv = "None";
    public String solc_args = "None";
    public Boolean dynld = false;
    public Boolean enable_online_lookup = false;
    public String mythirl_dir;
    public String sigs;

    mythril(String solv, String solc_args, Boolean dynld, Boolean enable_online_lookup) {
        this.solv = solv;
        this.solc_args = solc_args;
        this.enable_online_lookup = enable_online_lookup;
        this.dynld = dynld;
        this.mythirl_dir = Init_Mythril_Dir();
        this.sigs = Support.SignatureDb(enable_online_lookup);
        try{
            
        }catch(Exception e){
            
        }
    }

    public String Init_Mythril_Dir() {
         String path;
        try {
             path = System.getenv("mythril");
        } catch (Exception e) {
            path = System.getenv("mythril")+"/.mytrhil";
        }
        File file = new File(path);
        if(!file.exists()){
            System.out.println("create mythril file data");
            file.mkdirs();
        }
        return path;
    }

}
