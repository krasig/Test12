
package delme2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemClassifOpis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemClassifOpis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ssp.indexbg.bg/}multilangEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abcSort" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="aisId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="cacheStartup" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="dynamic" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="dynamicMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="external" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="items" type="{http://ssp.indexbg.bg/}systemClassif" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="levelExpand" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="linear" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="logical" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="logicalSourceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="numCodeExt" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="userEditable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemClassifOpis", propOrder = {
    "abcSort",
    "aisId",
    "cacheStartup",
    "dynamic",
    "dynamicMethod",
    "external",
    "id",
    "items",
    "levelExpand",
    "linear",
    "logical",
    "logicalSourceId",
    "numCodeExt",
    "userEditable"
})
public class SystemClassifOpis
    extends MultilangEntity
{

    protected boolean abcSort;
    protected Long aisId;
    protected boolean cacheStartup;
    protected boolean dynamic;
    protected String dynamicMethod;
    protected boolean external;
    protected Long id;
    protected List<SystemClassif> items;
    protected int levelExpand;
    protected boolean linear;
    protected boolean logical;
    protected Long logicalSourceId;
    protected boolean numCodeExt;
    protected boolean userEditable;

    /**
     * Gets the value of the abcSort property.
     * 
     */
    public boolean isAbcSort() {
        return abcSort;
    }

    /**
     * Sets the value of the abcSort property.
     * 
     */
    public void setAbcSort(boolean value) {
        this.abcSort = value;
    }

    /**
     * Gets the value of the aisId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAisId() {
        return aisId;
    }

    /**
     * Sets the value of the aisId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAisId(Long value) {
        this.aisId = value;
    }

    /**
     * Gets the value of the cacheStartup property.
     * 
     */
    public boolean isCacheStartup() {
        return cacheStartup;
    }

    /**
     * Sets the value of the cacheStartup property.
     * 
     */
    public void setCacheStartup(boolean value) {
        this.cacheStartup = value;
    }

    /**
     * Gets the value of the dynamic property.
     * 
     */
    public boolean isDynamic() {
        return dynamic;
    }

    /**
     * Sets the value of the dynamic property.
     * 
     */
    public void setDynamic(boolean value) {
        this.dynamic = value;
    }

    /**
     * Gets the value of the dynamicMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicMethod() {
        return dynamicMethod;
    }

    /**
     * Sets the value of the dynamicMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicMethod(String value) {
        this.dynamicMethod = value;
    }

    /**
     * Gets the value of the external property.
     * 
     */
    public boolean isExternal() {
        return external;
    }

    /**
     * Sets the value of the external property.
     * 
     */
    public void setExternal(boolean value) {
        this.external = value;
    }

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
     * {@link SystemClassif }
     * 
     * 
     */
    public List<SystemClassif> getItems() {
        if (items == null) {
            items = new ArrayList<SystemClassif>();
        }
        return this.items;
    }

    /**
     * Gets the value of the levelExpand property.
     * 
     */
    public int getLevelExpand() {
        return levelExpand;
    }

    /**
     * Sets the value of the levelExpand property.
     * 
     */
    public void setLevelExpand(int value) {
        this.levelExpand = value;
    }

    /**
     * Gets the value of the linear property.
     * 
     */
    public boolean isLinear() {
        return linear;
    }

    /**
     * Sets the value of the linear property.
     * 
     */
    public void setLinear(boolean value) {
        this.linear = value;
    }

    /**
     * Gets the value of the logical property.
     * 
     */
    public boolean isLogical() {
        return logical;
    }

    /**
     * Sets the value of the logical property.
     * 
     */
    public void setLogical(boolean value) {
        this.logical = value;
    }

    /**
     * Gets the value of the logicalSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLogicalSourceId() {
        return logicalSourceId;
    }

    /**
     * Sets the value of the logicalSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLogicalSourceId(Long value) {
        this.logicalSourceId = value;
    }

    /**
     * Gets the value of the numCodeExt property.
     * 
     */
    public boolean isNumCodeExt() {
        return numCodeExt;
    }

    /**
     * Sets the value of the numCodeExt property.
     * 
     */
    public void setNumCodeExt(boolean value) {
        this.numCodeExt = value;
    }

    /**
     * Gets the value of the userEditable property.
     * 
     */
    public boolean isUserEditable() {
        return userEditable;
    }

    /**
     * Sets the value of the userEditable property.
     * 
     */
    public void setUserEditable(boolean value) {
        this.userEditable = value;
    }

}
