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
public class MathUtils {
    public int add(int x, int y) {
		return x + y;
	}

	public boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	public long squareLong(long l) {
		return l*l;
	}
    
}
