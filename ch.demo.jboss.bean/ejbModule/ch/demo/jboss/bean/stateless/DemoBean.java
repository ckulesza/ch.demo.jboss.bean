package ch.demo.jboss.bean.stateless;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class DemoBean
 */
@Stateless
public class DemoBean implements DemoBeanRemote, DemoBeanLocal {

    /**
     * Default constructor. 
     */
    public DemoBean() {
        // TODO Auto-generated constructor stub
    }

}
