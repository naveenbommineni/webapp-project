package in.naveen.webapp;

import org.apache.camel.component.connector.DefaultConnectorComponent;

/**
 * Camel naveen connector
 */
public class naveenComponent extends DefaultConnectorComponent {
    
    public naveenComponent() {
        super("naveen", "in.naveen.webapp.naveenComponent");
    }

    public naveenComponent(String componentScheme) {
        super("naveen", componentScheme, "in.naveen.webapp.naveenComponent");
    }

}
