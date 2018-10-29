
package delme2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for multilangEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multilangEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ssp.indexbg.bg/}trackableEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tekst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tekstKey" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="translations" type="{http://ssp.indexbg.bg/}multilang" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multilangEntity", propOrder = {
    "tekst",
    "tekstKey",
    "translations"
})
@XmlSeeAlso({
    SystemClassif.class,
    SystemClassifOpis.class,
    SyslogicListOpisEntity.class
})
public abstract class MultilangEntity
    extends TrackableEntity
{

    protected String tekst;
    protected long tekstKey;
    protected List<Multilang> translations;

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
     * Gets the value of the translations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Multilang }
     * 
     * 
     */
    public List<Multilang> getTranslations() {
        if (translations == null) {
            translations = new ArrayList<Multilang>();
        }
        return this.translations;
    }

}
