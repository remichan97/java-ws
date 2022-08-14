
package ServiceClient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SinhVienService", targetNamespace = "http://services/", wsdlLocation = "http://localhost:8080/Lab1_server/SinhVienService?wsdl")
public class SinhVienService_Service
    extends Service
{

    private final static URL SINHVIENSERVICE_WSDL_LOCATION;
    private final static WebServiceException SINHVIENSERVICE_EXCEPTION;
    private final static QName SINHVIENSERVICE_QNAME = new QName("http://services/", "SinhVienService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Lab1_server/SinhVienService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SINHVIENSERVICE_WSDL_LOCATION = url;
        SINHVIENSERVICE_EXCEPTION = e;
    }

    public SinhVienService_Service() {
        super(__getWsdlLocation(), SINHVIENSERVICE_QNAME);
    }

    public SinhVienService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SINHVIENSERVICE_QNAME, features);
    }

    public SinhVienService_Service(URL wsdlLocation) {
        super(wsdlLocation, SINHVIENSERVICE_QNAME);
    }

    public SinhVienService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SINHVIENSERVICE_QNAME, features);
    }

    public SinhVienService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SinhVienService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SinhVienService
     */
    @WebEndpoint(name = "SinhVienServicePort")
    public SinhVienService getSinhVienServicePort() {
        return super.getPort(new QName("http://services/", "SinhVienServicePort"), SinhVienService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SinhVienService
     */
    @WebEndpoint(name = "SinhVienServicePort")
    public SinhVienService getSinhVienServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "SinhVienServicePort"), SinhVienService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SINHVIENSERVICE_EXCEPTION!= null) {
            throw SINHVIENSERVICE_EXCEPTION;
        }
        return SINHVIENSERVICE_WSDL_LOCATION;
    }

}
