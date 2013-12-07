/**
 * 
 */
package com.chaminda.model;

import java.io.Serializable;

/**
 * @author chaminda
 *         <p/>
 *         date 05/12/2013
 */

public interface Identifiable<T> extends Serializable{
	T getId();
}
