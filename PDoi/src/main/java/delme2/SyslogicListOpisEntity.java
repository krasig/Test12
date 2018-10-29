
package delme2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for syslogicListOpisEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="syslogicListOpisEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ssp.indexbg.bg/}multilangEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="codeClassifPod" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="codeClassifVod" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="items" type="{http://ssp.indexbg.bg/}syslogicListEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="podText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vodText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "syslogicListOpisEntity", propOrder = {
    "id",
    "codeClassifPod",
    "codeClassifVod",
    "items",
    "podText",
    "vodText"
})
public class SyslogicListOpisEntity
    extends MultilangEntity
{

    protected Long id;
    protected long codeClassifPod;
    protected long codeClassifVod;
    @XmlElement(nillable = true)
    protected List<SyslogicListEntity> items;
    protected String podText;
    protected String vodText;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the codeClassifPod property.
     * 
     */
    public long getCodeClassifPod() {
        return codeClassifPod;
    }

    /**
     * Sets the value of the codeClassifPod property.
     * 
     */
    public void setCodeClassifPod(long value) {
        this.codeClassifPod = value;
    }

    /**
     * Gets the value of the codeClassifVod property.
     * 
     */
    public long getCodeClassifVod() {
        return codeClassifVod;
    }

    /**
     * Sets the value of the codeClassifVod property.
     * 
     */
    public void setCodeClassifVod(long value) {
        this.codeClassifVod = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SyslogicListEntity }
     * 
     * 
     */
    public List<SyslogicListEntity> getItems() {
        if (items == null) {
            items = new ArrayList<SyslogicListEntity>();
        }
        return this.items;
    }

    /**
     * Gets the value of the podText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPodText() {
        return podText;
    }

    /**
     * Sets the value of the podText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPodText(String value) {
        this.podText = value;
    }

    /**
     * Gets the value of the vodText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVodText() {
        return vodText;
    }

    /**
     * Sets the value of the vodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVodText(String value) {
        this.vodText = value;
    }

}
