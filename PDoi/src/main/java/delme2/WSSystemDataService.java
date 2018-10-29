package delme2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4-jbossorg-1
 * 2018-07-23T17:42:49.623+03:00
 * Generated source version: 3.2.4-jbossorg-1
 *
 */
@WebServiceClient(name = "WSSystemDataService",
                  wsdlLocation = "http://10.29.1.165:8080/CAdmin/WSSystemDataService?wsdl",
                  targetNamespace = "http://ssp.indexbg.bg/")
public class WSSystemDataService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ssp.indexbg.bg/", "WSSystemDataService");
    public final static QName WsWSSystemDataPort = new QName("http://ssp.indexbg.bg/", "ws.WSSystemDataPort");
    static {
        URL url = null;
        try {
            url = new URL("http://10.29.1.165:8080/CAdmin/WSSystemDataService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WSSystemDataService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://10.29.1.165:8080/CAdmin/WSSystemDataService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WSSystemDataService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WSSystemDataService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSSystemDataService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public WSSystemDataService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WSSystemDataService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WSSystemDataService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns WSSystemData
     */
    @WebEndpoint(name = "ws.WSSystemDataPort")
    public WSSystemData getWsWSSystemDataPort() {
        return super.getPort(WsWSSystemDataPort, WSSystemData.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSSystemData
     */
    @WebEndpoint(name = "ws.WSSystemDataPort")
    public WSSystemData getWsWSSystemDataPort(WebServiceFeature... features) {
        return super.getPort(WsWSSystemDataPort, WSSystemData.class, features);
    }

}
