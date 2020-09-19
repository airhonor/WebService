
package com.honorzhang.web.service.client.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>people complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="people">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updateTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "people", propOrder = {
        "address",
        "createTime",
        "id",
        "name",
        "updateTime"
})
public class People {

    protected String address;
    protected Long createTime;
    protected Integer id;
    protected String name;
    protected Long updateTime;

    /**
     * 获取address属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * 获取createTime属性的值。
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 设置createTime属性的值。
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setCreateTime(Long value) {
        this.createTime = value;
    }

    /**
     * 获取id属性的值。
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * 获取name属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取updateTime属性的值。
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置updateTime属性的值。
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setUpdateTime(Long value) {
        this.updateTime = value;
    }

}
