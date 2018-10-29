
package indexbg.pdoi.wsclient.edelivery;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetSentMessagesListPagedResult" type="{http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts}DcPartialListOfDcMessageHR29gRRX" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getSentMessagesListPagedResult"
})
@XmlRootElement(name = "GetSentMessagesListPagedResponse")
public class GetSentMessagesListPagedResponse {

    @XmlElementRef(name = "GetSentMessagesListPagedResult", namespace = "https://edelivery.egov.bg/services/integration", type = JAXBElement.class, required = false)
    protected JAXBElement<DcPartialListOfDcMessageHR29GRRX> getSentMessagesListPagedResult;

    /**
     * Gets the value of the getSentMessagesListPagedResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DcPartialListOfDcMessageHR29GRRX }{@code >}
     *     
     */
    public JAXBElement<DcPartialListOfDcMessageHR29GRRX> getGetSentMessagesListPagedResult() {
        return getSentMessagesListPagedResult;
    }

    /**
     * Sets the value of the getSentMessagesListPagedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DcPartialListOfDcMessageHR29GRRX }{@code >}
     *     
     */
    public void setGetSentMessagesListPagedResult(JAXBElement<DcPartialListOfDcMessageHR29GRRX> value) {
        this.getSentMessagesListPagedResult = value;
    }

}
