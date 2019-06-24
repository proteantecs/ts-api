
/*
 * Copyright (c)  2019 proteanTecs Ltd. All rights reserved.
 *
 * NOTICE:  All information contained herein is and remains the sole property of proteanTecs Ltd. ("proteanTecs"),
 * and any unauthorized use of this information is prohibited.  The intellectual property rights contained herein
 * are proprietary and confidential to proteanTecs,  may be covered by patents or patents applications,
 * and are protected by trade secret or copyright law. Dissemination, distribution or reproduction of this information,
 * in any form or by any means, including photocopying, recording, or other electronic or mechanical methods,
 * is strictly forbidden unless prior written permission is expressly obtained from proteanTecs.
 * Nothing contained herein shall be construed as conferring any license or right under any proteanTecs patent,
 * copyright, or trademark.
 */

package com.tableau.generated.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for siteRoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="siteRoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Creator"/>
 *     &lt;enumeration value="Explorer"/>
 *     &lt;enumeration value="ExplorerCanPublish"/>
 *     &lt;enumeration value="Guest"/>
 *     &lt;enumeration value="Interactor"/>
 *     &lt;enumeration value="Publisher"/>
 *     &lt;enumeration value="ReadOnly"/>
 *     &lt;enumeration value="ServerAdministrator"/>
 *     &lt;enumeration value="SiteAdministrator"/>
 *     &lt;enumeration value="SiteAdministratorCreator"/>
 *     &lt;enumeration value="SiteAdministratorExplorer"/>
 *     &lt;enumeration value="Unlicensed"/>
 *     &lt;enumeration value="UnlicensedWithPublish"/>
 *     &lt;enumeration value="Viewer"/>
 *     &lt;enumeration value="ViewerWithPublish"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "siteRoleType", namespace = "http://tableau.com/api")
@XmlEnum
public enum SiteRoleType {

    @XmlEnumValue("Creator")
    CREATOR("Creator"),
    @XmlEnumValue("Explorer")
    EXPLORER("Explorer"),
    @XmlEnumValue("ExplorerCanPublish")
    EXPLORER_CAN_PUBLISH("ExplorerCanPublish"),
    @XmlEnumValue("Guest")
    GUEST("Guest"),
    @XmlEnumValue("Interactor")
    INTERACTOR("Interactor"),
    @XmlEnumValue("Publisher")
    PUBLISHER("Publisher"),
    @XmlEnumValue("ReadOnly")
    READ_ONLY("ReadOnly"),
    @XmlEnumValue("ServerAdministrator")
    SERVER_ADMINISTRATOR("ServerAdministrator"),
    @XmlEnumValue("SiteAdministrator")
    SITE_ADMINISTRATOR("SiteAdministrator"),
    @XmlEnumValue("SiteAdministratorCreator")
    SITE_ADMINISTRATOR_CREATOR("SiteAdministratorCreator"),
    @XmlEnumValue("SiteAdministratorExplorer")
    SITE_ADMINISTRATOR_EXPLORER("SiteAdministratorExplorer"),
    @XmlEnumValue("Unlicensed")
    UNLICENSED("Unlicensed"),
    @XmlEnumValue("UnlicensedWithPublish")
    UNLICENSED_WITH_PUBLISH("UnlicensedWithPublish"),
    @XmlEnumValue("Viewer")
    VIEWER("Viewer"),
    @XmlEnumValue("ViewerWithPublish")
    VIEWER_WITH_PUBLISH("ViewerWithPublish");
    private final String value;

    SiteRoleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SiteRoleType fromValue(String v) {
        for (SiteRoleType c: SiteRoleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
