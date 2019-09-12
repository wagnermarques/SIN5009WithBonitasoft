
package org.bonitasoft.web.designer.experimental.widgets;

import java.util.HashMap;
import java.util.Map;

public class PbImage {

    private String cssClasses;
    private Boolean hidden = false;
    private PbImage.SrcType srcType = PbImage.SrcType.fromValue("URL");
    private String url;
    private String assetName;
    private String alt;

    /**
     * 
     * @return
     *     The cssClasses
     */
    public String getCssClasses() {
        return cssClasses;
    }

    /**
     * 
     * @param cssClasses
     *     The cssClasses
     */
    public void setCssClasses(String cssClasses) {
        this.cssClasses = cssClasses;
    }

    /**
     * 
     * @return
     *     The hidden
     */
    public Boolean getHidden() {
        return hidden;
    }

    /**
     * 
     * @param hidden
     *     The hidden
     */
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    /**
     * 
     * @return
     *     The srcType
     */
    public PbImage.SrcType getSrcType() {
        return srcType;
    }

    /**
     * 
     * @param srcType
     *     The srcType
     */
    public void setSrcType(PbImage.SrcType srcType) {
        this.srcType = srcType;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The assetName
     */
    public String getAssetName() {
        return assetName;
    }

    /**
     * 
     * @param assetName
     *     The assetName
     */
    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    /**
     * 
     * @return
     *     The alt
     */
    public String getAlt() {
        return alt;
    }

    /**
     * 
     * @param alt
     *     The alt
     */
    public void setAlt(String alt) {
        this.alt = alt;
    }

    public enum SrcType {

        URL("URL"),
        ASSET("Asset");
        private final String value;
        private final static Map<String, PbImage.SrcType> CONSTANTS = new HashMap<String, PbImage.SrcType>();

        static {
            for (PbImage.SrcType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SrcType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static PbImage.SrcType fromValue(String value) {
            PbImage.SrcType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
