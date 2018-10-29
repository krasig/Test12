
package delme2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for multilang complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multilang"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lang" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="tekst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tekstKey" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="tekstopi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multilang", propOrder = {
    "lang",
    "tekst",
    "tekstKey",
    "tekstopi"
})
public class Multilang {

    protected long lang;
    protected String tekst;
    protected long tekstKey;
    protected String tekstopi;

    /**
     * Gets the value of the lang property.
     * 
     */
    public long getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     */
    public void setLang(long value) {
        this.lang = value;
    }

    /**
     * Gets the value of the tekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTekst() {
        return tekst;
    }

    /**
     * Sets the value of the tekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTekst(String value) {
        this.tekst = value;
    }

    /**
     * Gets the value of the tekstKey property.
     * 
     */
    public long getTekstKey() {
        return tekstKey;
    }

    /**
     * Sets the value of the tekstKey property.
     * 
     */
    public void setTekstKey(long value) {
        this.tekstKey = value;
    }

    /**
     * Gets the value of the tekstopi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTekstopi() {
        return tekstopi;
    }

    /**
     * Sets the value of the tekstopi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTekstopi(String value) {
        this.tekstopi = value;
    }

}
